package model.repository;

import model.entity.RockPaperScissors;

import java.util.Random;

public class RPSDBDAO implements RPSDBDAOWrite, RPSDBDAORead {
    Random rand;
    private int rateUser = 0;
    private int rateRoot = 0;

    @Override
    public void whoWin(RockPaperScissors rockPaperScissors) {
        int userNumber = rockPaperScissors.getNumber();
        rand = new Random();
        int rootNumber = rand.nextInt(3) + 1;

        // 1 == rock     2 == paper 3 == scissors

        if ((userNumber == 1 && rootNumber == 3) ||
                (userNumber == 2 && rootNumber == 1) ||
                (userNumber == 3 && rootNumber == 2)) {
            rateUser++;
            System.out.println("user ^-^");
            System.out.println("computer");
        }
        if ((userNumber == 1 && rootNumber == 2) ||
                (userNumber == 3 && rootNumber == 1) ||
                (userNumber == 2 && rootNumber == 3)) {
            rateRoot++;
            System.out.println("user ");
            System.out.println("computer ^-^");
        }
        System.out.println("your rate\t" + "rateUser");
        System.out.println(rateUser + "\t\t\t" + rateRoot);
    }

    @Override
    public void show() {
        if (rateRoot > rateUser)
            System.out.println("computer is winner");
        else if (rateUser > rateRoot)
            System.out.println("you are winner");
        else System.out.println("draw");
    }
}