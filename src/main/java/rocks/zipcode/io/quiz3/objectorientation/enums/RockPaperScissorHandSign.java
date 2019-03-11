package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    PAPER,
    SCISSOR,

    ADD_ENUMERATIONS_HERE;

    public RockPaperScissorHandSign getWinner() {
        return  ROCK ;
    }

    public RockPaperScissorHandSign getLoser() {
        return SCISSOR;
    }
}
