package com.company;

public class Toktogul extends Locality {

    public Toktogul(int livesCount, String nameofCity, String area, String supervisor) {
        super(livesCount, nameofCity, area, supervisor);
    }

    @Override
    void lives() {
        System.out.println("Кол-во Жителей - "+getLivesCount() + "тыс");
    }

    @Override
    void name() {
        System.out.println("Название города - "+ getNameofCity());

    }

    @Override
    void areaName() {
        System.out.println("Район - "+ getArea());

    }

    @Override
    void supervis() {
        System.out.println();

    }

    @Override
    public void living() {
        System.out.println();
    }
}
