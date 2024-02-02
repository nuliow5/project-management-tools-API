package lt.gerasimovas.projectmanagementtoolsAPI.converters;

import lt.gerasimovas.projectmanagementtoolsAPI.dto.AssigneeDTO;
import lt.gerasimovas.projectmanagementtoolsAPI.dto.TeamDTO;
import lt.gerasimovas.projectmanagementtoolsAPI.entities.Assignee;
import lt.gerasimovas.projectmanagementtoolsAPI.entities.Team;

import java.util.ArrayList;
import java.util.List;


public class TeamMapper {

    public static Team fromDtoToEntity(TeamDTO teamDTO){
        Team team = null;
        if (teamDTO != null){
            team = new Team();
            team.setId(teamDTO.getId());
            team.setName(team.getName());
            //todo
        }

        return team;
    }


    public static TeamDTO fromEntityToDTO (Team team){
        TeamDTO teamDTO = null;
        if (team != null){
            teamDTO = new TeamDTO();
            teamDTO.setId(team.getId());
            teamDTO.setName(team.getName());
        }

        if (!team.getAssignees().isEmpty()){
            teamDTO.setAssigneeDTOList(convertAssigneesListToDTO(team.getAssignees()));
        }

        return teamDTO;
    }



    public static List<AssigneeDTO> convertAssigneesListToDTO (List<Assignee> assignees){
        List<AssigneeDTO> assigneeDTOList = null;
        if (assignees != null && !assignees.isEmpty()){
            assigneeDTOList = new ArrayList<>();

            for (Assignee a : assignees){
                assigneeDTOList.add(AssigneeMapper.fromEntityToDTO(a));
            }
        }

        return assigneeDTOList;
    }


}
