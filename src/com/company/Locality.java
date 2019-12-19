package com.company;

import java.util.Scanner;

abstract public class Locality {
    private int livesCount;
    private String nameofCity;
    private String area;
    private String supervisor;
    public Locality(int livesCount, String nameofCity, String area, String supervisor) {
        this.livesCount = livesCount;
        this.nameofCity = nameofCity;
        this.area = area;
        this.supervisor = supervisor;
    }

    public int getLivesCount() {
        return livesCount;
    }

    public void setLivesCount(int livesCount) {
        this.livesCount = livesCount;
    }

    public String getNameofCity() {
        return nameofCity;
    }

    public void setNameofCity(String nameofCity) {
        this.nameofCity = nameofCity;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;

    }

    abstract void lives();

    abstract void name();

    abstract void areaName();

    abstract void supervis();

    public void living() {
        System.out.println(nameofCity);
        lives();
        name();
        areaName();
        supervis();
    }
}


