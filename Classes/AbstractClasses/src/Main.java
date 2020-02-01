public class Main {

    public static void main(String[] args) {
        GameController[] gameControllers = new GameController[]{
                new WomanGameController(),
                new ManGameController(),
                new KidGameController()
        };
        for (GameController controller : gameControllers){
            controller.calculate();
            controller.gameOver();
        }
    }
}
