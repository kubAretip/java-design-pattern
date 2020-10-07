package pl.pitera.chainOfResponsibility.example.message;

import pl.pitera.chainOfResponsibility.example.officer.OfficerRank;

public class Message {

    private final String content;
    private int code;
    private OfficerRank officerRank;

    public Message(String content, int code, OfficerRank officerRank) {
        this.content = content;
        this.code = code;
        this.officerRank = officerRank;
    }

    public String getContent() {
        return content;
    }


    public int getCode() {
        return code;
    }

    public OfficerRank getOfficerRank() {
        return officerRank;
    }
}
