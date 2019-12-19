package com.company;

public class Bishkek extends Locality{


    public Bishkek(int livesCount, String nameofCity, String area, String supervisor) {
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
        System.out.println("\nРайон - "+ getArea());
    }

    @Override
    void supervis() {
        System.out.println("\nРуководитель города бишкек - "+getSupervisor());
    }

    @Override
    public void living() {
        System.out.println(toString());
    }
}

