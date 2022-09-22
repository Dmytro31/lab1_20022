package com.company;

public class PayOffice {
    double profit; //заробіток
    double costs;  //Витрати
    double salary;  //зп

    public PayOffice(int profit, int salary, int costs){
        super();
        this.salary = salary;
        this.profit = profit;
        this.costs = costs;
    }
    void info(){
        System.out.println("Заробіто за місяць: " +profit);
        System.out.println("Витрати на замовлення: " +costs);
        System.out.println("Заробітна плата: " +salary);
    }
    double zp(){
        double x;
        double c;
        c = costs+salary;
        x = profit-c;
        return x;
    }

}
