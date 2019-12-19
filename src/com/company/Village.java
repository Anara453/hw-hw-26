package com.company;

 abstract public class Village {
    private String name;
    private int citizen;
    private String supervisor;

     public Village(String name, int sitizen, String supervisor) {
         this.name = name;
         this.citizen = sitizen;
         this.supervisor = supervisor;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getCitizen() {
         return citizen;
     }

     public void setCitizen(int citizen) {
         this.citizen = citizen;
     }

     public String getSupervisor() {
         return supervisor;
     }

     public void setSupervisor(String supervisor) {
         this.supervisor = supervisor;
     }
 }
