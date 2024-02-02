package lt.gerasimovas.projectmanagementtoolsAPI.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TeamDTO {
    private Long id;
    private String name;
    private List<AssigneeDTO> assigneeDTOList;
}
