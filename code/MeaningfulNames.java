public class MeaningfulNames {

    public static void main(String[] args) {
        /*
            Bad Code
        */

        int d; // elapsed time in days

        /*
            Good Code
        */
        int elapsedTimeInDays;
        int daysSinceCreation;
        int daysSinceModification;
        int fileAgeInDays;

    }

    /*
        Bad Code
    */
    public List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<int[]>();

        for(int[] x : theList) {
            if(x[0] == 4) {
                list1.add(x);
            }
        }

        return list1;
    }

    /*
        Good Code
    */
    public List<int[]> getFlaggedCells() {
        List<int[]> flaggedCells = new ArrayList<int[]>();

        for(int[] cell : gameBoard) {
            if(x[STATUS_VALUE] == FLAGGED) {
                flaggedCells.add(cell);
            }
        }

        return flaggedCells;
    }
}