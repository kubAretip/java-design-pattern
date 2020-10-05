package pl.pitera.singleton;

class Main {

    public static void main(String[] args) {

        GameEngine gameEngine = GameEngine.getInstance();

        GameEngine gameEngine2 = GameEngine.getInstance();

        System.out.println(gameEngine == gameEngine2);

    }


}


