package lt.gerasimovas.projectmanagementtoolsAPI.enumes;

public enum TicketStatus {
    BACK_LOG ("BACK LOG"),
    TO_DO("TO DO"),
    DOING("DOING"),
    DONE("DONE");

    private String description;
    TicketStatus(String description) {
        this.description = description;
    }

    

}
