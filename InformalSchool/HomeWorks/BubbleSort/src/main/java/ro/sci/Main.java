package ro.sci;

/**
 * Created by sirb on 11/11/2017.
 */
public class Main {

    public static void main(String[] args) {

        SalesRepresentative [] reps = buildRepsList();

        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();
        SalesRepresentative [] sortedReps = sortingAlgorithm.bubbleSort(reps);

        for (SalesRepresentative rep : sortedReps) {
            System.out.println(rep.getName() + ", total sales worth: " + rep.getSalesWorth());
        }
    }


    private static SalesRepresentative[] buildRepsList() {

        SalesRepresentative rep1 = new SalesRepresentative("Radu", 7, 600);
        SalesRepresentative rep2 = new SalesRepresentative("Vasile", 8, 500);
        SalesRepresentative rep3 = new SalesRepresentative("Gica", 3, 1400);
        SalesRepresentative rep4 = new SalesRepresentative("Denisa", 12, 400);
        SalesRepresentative rep5 = new SalesRepresentative("Ligia", 0, 0);
        SalesRepresentative rep6 = new SalesRepresentative("Andra", 9, 300);
        SalesRepresentative rep7 = new SalesRepresentative("Florin", 7, 500);
        SalesRepresentative rep8 = new SalesRepresentative("Radu", 8, 500);
        SalesRepresentative [] reps = {rep1, rep2, rep3, rep4, rep5, rep6, rep7, rep8};
        return reps;

    }
}