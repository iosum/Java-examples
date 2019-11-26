import java.util.Scanner;

public class Sales {
    private double[][] sales = new double[5][4];
    private double[] salesPersonTotal = new double[5];

    public void setSales(double[][] sales) {
        this.sales = sales;
    }

    public double[][] getSales() {
        return sales;
    }

    public void setSalesPersonTotal(double[] salesPersonTotal) {
        this.salesPersonTotal = salesPersonTotal;
    }

    public double[] getSalesPersonTotal() {
        return salesPersonTotal;
    }

    public void calculateSales() {
        Scanner input = new Scanner(System.in);

        System.out.println("enter sales person number: ");

        int person = input.nextInt();

        while(person != -1) {
            System.out.println("product num: ");
            int product = input.nextInt();
            System.out.println("sales amount: ");
            double amount = input.nextDouble();

            if(person >= 1 && person < 5 && product >= 1 && product < 6 && amount >= 0) {
                // because the array starts at [0][0]
                sales[product-1][person-1] += amount;
            }
            else {
                System.out.println("invalid input.");
            }

            System.out.println("enter sales person number: ");
            person = input.nextInt();
        }
    }

    public void personSales (){
        for(int i = 0; i < sales.length; i++) {
            for(int j = 0; j < sales[i].length; j++) {
                salesPersonTotal[i] += sales[i][j];
            }
        }
        for(int i = 0; i < salesPersonTotal.length; i++){
            System.out.println(salesPersonTotal[i]);
        }
    }
}
