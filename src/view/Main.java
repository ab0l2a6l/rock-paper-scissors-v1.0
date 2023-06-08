package view;

import common.StaticScanner;
import controler.RPSControler;
import model.entity.RockPaperScissors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = StaticScanner.getData();

        RPSControler controler = new RPSControler();
        RockPaperScissors rockPaperScissors = new RockPaperScissors();

        System.out.println("help game: " +
                "press 1 for rock\n" +
                "press 2 for paper\n " +
                "press 3 for scissors\n");
        System.out.print("how many times wants to play: ");
        int numberOfPlay = input.nextInt();
        System.out.println("Rock Paper Scissors");
        for (int i = 0; i < numberOfPlay; i++) {
            System.out.print("which: ");
            rockPaperScissors.setNumber(input.nextInt());
            controler.whoWin(rockPaperScissors);
        }
        controler.show(rockPaperScissors);
    }
}
