package ro.sci;


class SortingAlgorithm {

    SalesRepresentative [] bubbleSort(SalesRepresentative reps[]) {

        String tempName;
        int tempNumOfSales;
        int tempQuota;

        for (int i = 0; i < reps.length; i++) {
            for (int j = 1; j < (reps.length - i); j++) {

                if (reps[j - 1].getSalesWorth() < reps[j].getSalesWorth()) {
                    tempName = reps[j - 1].getName();
                    tempNumOfSales = reps[j - 1].getNumOfSales();
                    tempQuota = reps[j - 1].getQuota();
                    reps[j - 1] = reps[j];
                    reps[j] = new SalesRepresentative(tempName, tempNumOfSales, tempQuota);
                }
            }
        }

        return reps;
    }
}