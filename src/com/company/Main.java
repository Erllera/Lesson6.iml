package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss(1000,150);
        boss.weapon.setTip("Автомат");
        boss.weapon.setModel("АК47");

        System.out.println(boss.printInfo());

        Skeleton sk1 = new Skeleton(50, 10, 5);
        Skeleton sk2 = new Skeleton(60, 15, 3);
        sk1.weapon.setTip("Огненные");
        sk2.weapon.setTip("Ледяные");
        sk1.weapon.setModel("Стрелы");
        sk2.weapon.setModel("Стрелы");


        System.out.println("Инфо о ск1 "+ sk1.printInfo()+" Инфо о ск2 "+sk2.printInfo());

    }
}
