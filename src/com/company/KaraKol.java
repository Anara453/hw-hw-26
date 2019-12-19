package com.company;

public class KaraKol extends Locality {


    public KaraKol(int livesCount, String nameofCity, String area, String supervisor) {
        super(livesCount, nameofCity, area, supervisor);
    }

    @Override
    void lives() {
        System.out.println("Кол-во жителей - " + getLivesCount());
    }

    @Override
    void name() {
        System.out.println("\nНазвание города - "+ getNameofCity());
    }

    @Override
    void areaName() {
        System.out.println("\nРайон - "+ getArea());
    }

    @Override
    void supervis() {
        System.out.println("Руководитель города - "+getSupervisor());
    }

    @Override
    public void living() {
        System.out.println();
    }
}
