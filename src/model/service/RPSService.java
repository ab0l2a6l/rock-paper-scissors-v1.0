package model.service;

import model.entity.RockPaperScissors;
import model.repository.RPSDBDAO;
import model.repository.RPSDBDAORead;
import model.repository.RPSDBDAOWrite;

public class RPSService implements RPSServiceWrite, RPSSerivceRead {
    RPSDBDAOWrite write = new RPSDBDAO();
    RPSDBDAORead read = new RPSDBDAO();

    @Override
    public void whoWin(RockPaperScissors rockPaperScissors) {
        write.whoWin(rockPaperScissors);
    }

    @Override
    public void show() {
        read.show();
    }
}
