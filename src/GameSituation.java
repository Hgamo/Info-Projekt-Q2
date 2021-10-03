/** Represents a game situation.
 * @author Gareth
 * @version 1.0
*/

package src;

public class GameSituation {

    /**
     * Represents the current matchfield
     */

    public Matchfield matchfield;

    /**
     * Represents the next player
     */

    public NextPlayer nextPlayer;

    /**
     * Represents the won player
     */
    public WonPlayer wonPlayer;

    /**
     * Gets the current matchfiel
     * 
     * @return The current matchfield
     */

    public Matchfield getMatchfiel() {
        return matchfield;
    }

    /**
     * Gets a field of the current matchfield
     * 
     * @param row    The row you are looking for; varies from 1 to 7
     * @param column The column you are looking for; varies from 1 to 7
     * @return Represents the fild
     */

    public FieldStatus getRowColumn(int row, int column) {
        MatchfieldRow mRow = getRow(row);
        switch (column) {
            case 1:
                return mRow.field1;
            case 2:
                return mRow.field2;
            case 3:
                return mRow.field3;
            case 4:
                return mRow.field4;
            case 5:
                return mRow.field5;
            case 6:
                return mRow.field6;
            case 7:
                return mRow.field7;

            default:
                return null;
        }
    }

    /**
     * Gets a row of the matchfield
     * 
     * @param row The row you are looking for; varies from 1 to 7
     * @return The representing Row
     */

    public MatchfieldRow getRow(int row) {
        switch (row) {
            case 1:
                return matchfield.row1;

            case 2:
                return matchfield.row2;

            case 3:
                return matchfield.row3;

            case 4:
                return matchfield.row4;

            case 5:
                return matchfield.row5;

            case 6:
                return matchfield.row6;

            case 7:
                return matchfield.row7;

            default:
                return null;
        }
    }

    public class Matchfield {
        public MatchfieldRow row1;
        public MatchfieldRow row2;
        public MatchfieldRow row3;
        public MatchfieldRow row4;
        public MatchfieldRow row5;
        public MatchfieldRow row6;
        public MatchfieldRow row7;

    }

    public class MatchfieldRow {
        public FieldStatus field1;
        public FieldStatus field2;
        public FieldStatus field3;
        public FieldStatus field4;
        public FieldStatus field5;
        public FieldStatus field6;
        public FieldStatus field7;

    }

    public enum NextPlayer {
        ONE, TWO
    }

    public enum WonPlayer {
        ONE, TWO, NOONE
    }

    public enum FieldStatus {
        ONE, TWO, NOONE,
    }
}