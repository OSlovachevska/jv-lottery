package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Lottery firstBall = new Lottery();
        Lottery secondBall = new Lottery();
        Lottery thirdBall = new Lottery();
        Lottery[] lotteries = {firstBall, secondBall, thirdBall};
        for (Lottery lottery : lotteries) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
