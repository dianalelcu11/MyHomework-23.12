package com.Sales;

/**
 * @author: Diana;
 * @param: nrOfSales, valueOfSales, totalValue;
 * @see: the bubble sort method;
 * @return: swapped values in descending order;
 */

public class SalesRepCorect {
    private int nrOfSales;
    private int valueOfSales;
    public int totalValue;

    public SalesRepCorect(int nrOfSales, int valueOfSales) {
        this.nrOfSales = nrOfSales;
        this.valueOfSales = valueOfSales;
        this.totalValue = nrOfSales * valueOfSales;
    }

    public static void main(String[] args) {
        SalesRepCorect[] SalesRep = new SalesRepCorect[5];

        SalesRep[0] = new SalesRepCorect(10, 500);
        SalesRep[1] = new SalesRepCorect(7, 800);
        SalesRep[2] = new SalesRepCorect(9, 1000);
        SalesRep[3] = new SalesRepCorect(11, 200);
        SalesRep[4] = new SalesRepCorect(6, 600);


        for (SalesRepCorect salesRepCorect: SalesRep){
            System.out.println(salesRepCorect);
        }
        SalesRep = SalesRep[0].bubbleSort(SalesRep);
        for (SalesRepCorect salesRepCorect: SalesRep){
            System.out.println(salesRepCorect);
        }

    }

    SalesRepCorect[] bubbleSort(SalesRepCorect[] SalesRep) {
        int n = SalesRep.length;
        int flag;
        SalesRepCorect item;
        for (int i = 0; i < n - 1; i++) {
            flag = 0;
            for (int j = 0; j < n-i-1; j++) {
                if (SalesRep[j].totalValue < SalesRep[j + 1].totalValue) {
                    item = SalesRep[j];
                    SalesRep[j] = SalesRep[j + 1];
                    SalesRep[j + 1] = item;

                }
            }
        }
        return SalesRep;
    }

    @Override
    public String toString() {
        return "" + this.totalValue;
    }
}

