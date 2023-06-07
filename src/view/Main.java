package view;

import common.StaticScanner;
import controler.RPSControler;
import model.entity.RockPaperScissors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = StaticScanner.getData();
        RPSControler controler = new RPSControler();

        System.out.print("how many times wants to play: ");
        int numberOfPlay = input.nextInt();
        System.out.println("Rock Paper Scissors");
        for (int i = 0; i < numberOfPlay; i++) {
            RockPaperScissors rockPaperScissors = new RockPaperScissors();
            System.out.print("which: ");
            rockPaperScissors.setNumber(input.nextInt());
            controler.whoWin(rockPaperScissors);
        }
        controler.show();
    }
}
