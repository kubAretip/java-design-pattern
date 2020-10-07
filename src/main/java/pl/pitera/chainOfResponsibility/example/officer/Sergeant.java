package pl.pitera.chainOfResponsibility.example.officer;

import pl.pitera.chainOfResponsibility.example.message.Message;

public class Sergeant extends Officer {

    private static final int CODE = 10;
    public static final String NAME = "Sr. Kowalski";

    @Override
    public void processMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.SERGEANT) && message.getCode() == CODE) {
            System.out.println(NAME + " otrzymał wiadomość: " + message.getContent());
        } else {
            getSuperiorOfficer().processMessage(message);
        }
    }


}
