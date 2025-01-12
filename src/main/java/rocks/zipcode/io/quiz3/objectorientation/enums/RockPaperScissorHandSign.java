package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    PAPER,
    SCISSOR;


        public RockPaperScissorHandSign getWinner () {
            RockPaperScissorHandSign win = null;

            switch (this) {
                case PAPER:
                    win = SCISSOR;
                    break;
                case ROCK:
                    win = PAPER;
                    break;
                case SCISSOR:
                    win = ROCK;
                    break;
            }
            return win;
        }

            public RockPaperScissorHandSign getLoser () {

            return this.getWinner().getWinner();
        }
}