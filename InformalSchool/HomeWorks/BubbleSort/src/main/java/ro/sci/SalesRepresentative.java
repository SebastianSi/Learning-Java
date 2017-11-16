package ro.sci;


class SalesRepresentative {
    private String name;
    private int numOfSales;
    private int quota;
    private int salesWorth;

    SalesRepresentative(String name, int numOfSales, int quota) {
        this.name = name;
        this.numOfSales = numOfSales;
        this.quota = quota;
        this.salesWorth = numOfSales*quota;
    }

    String getName() {
        return this.name;
    }

    int getSalesWorth() {
        return this.salesWorth;
    }

    int getQuota() {return this.quota;}

    int getNumOfSales() {
        return this.numOfSales;
    }
}