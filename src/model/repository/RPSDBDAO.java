package model.repository;

import model.entity.RockPaperScissors;

import java.util.Random;

public class RPSDBDAO implements RPSDBDAOWrite, RPSDBDAORead {
    Random rand;

    @Override
    public void whoWin(RockPaperScissors rockPaperScissors) {
        int userNumber = rockPaperScissors.getNumber();
        rand = new Random();
        int rootNumber = rand.nextInt(3) + 1;

        // 1 == rock     2 == paper 3 == scissors

        if ((userNumber == 1 && rootNumber == 3) ||
                (userNumber == 2 && rootNumber == 1) ||
                (userNumber == 3 && rootNumber == 2)) {
            rockPaperScissors.setUserRate(rockPaperScissors.getRootRate() + 1);
            System.out.println("user ^-^");
            System.out.println("computer");
        }
        if ((userNumber == 1 && rootNumber == 2) ||
                (userNumber == 3 && rootNumber == 1) ||
                (userNumber == 2 && rootNumber == 3)) {
            rockPaperScissors.setRootRate(rockPaperScissors.getRootRate() + 1);
            System.out.println("user ");
            System.out.println("computer ^-^");
        }
        System.out.println("your rate\t" + "rateUser");
        System.out.println(rockPaperScissors.getUserRate() + "\t\t\t" + rockPaperScissors.getRootRate());
    }

    @Override
    public void show(RockPaperScissors rockPaperScissors) {
        System.out.println("finally : \n");
        System.out.println("your rate\t" + "rateUser");
        System.out.println(rockPaperScissors.getUserRate() + "\t\t\t" + rockPaperScissors.getRootRate());
        if (rockPaperScissors.getRootRate() > rockPaperScissors.getUserRate())
            System.out.println("computer is winner");
        else if (rockPaperScissors.getUserRate() > rockPaperScissors.getRootRate())
            System.out.println("you are winner");
        else System.out.println("draw");
    }
}