package com.company;

public class Main {

    public static void main(String[] args) {
        Shop sp = new Shop(1003, 553, 223);
        System.out.println("Кількість товару в магазині: " +sp.cum());
        sp.number();
        System.out.println("________________________________________");
        System.out.println(               "Товарний склад"           );
        Storage sg = new Storage(250, 500, 16);
        sg.info();
        System.out.println("Якісний товар: " +sg.retor());
        System.out.println("Залишок місця на складі: " +sg.remainder());

        System.out.println("________________________________________");
        PayOffice po = new PayOffice(457668, 15000, 7000);
        po.info();
        System.out.println("Чистий прибуток: " +po.zp());


    }
}
