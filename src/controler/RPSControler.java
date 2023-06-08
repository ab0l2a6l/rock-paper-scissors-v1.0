package controler;

import model.entity.RockPaperScissors;
import model.service.RPSSerivceRead;
import model.service.RPSService;
import model.service.RPSServiceWrite;

public class RPSControler {
    RPSServiceWrite write = new RPSService();
    RPSSerivceRead read = new RPSService();


    public void whoWin(RockPaperScissors rockPaperScissors) {
        write.whoWin(rockPaperScissors);
    }

    public void show(RockPaperScissors rockPaperScissors) {
        read.show(rockPaperScissors);
    }

}
