package pl.pitera.singleton;

public enum GameEngineEnum {

    INSTANCE("Duke");

    private int hp = 100;
    private String characterName = "";

    GameEngineEnum(String characterName) {
        this.characterName = characterName;
    }

    public void run() {
        while (true) {
            //czekamy na imput gracza
            // ...
            // ...
        }
    }

}
