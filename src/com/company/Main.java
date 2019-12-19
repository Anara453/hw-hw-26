package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Start");
//        multiplication();
//        System.out.println("END");
        // write your code here
//        Random random = new Random();
//        int matrix [] [] = new int  [4] [4];
//        int max = 10,min = 99;
//        int [] a = matrix[1];
//        int maxI = 0,maxJ = 0;
//        for (int i = 0; i < matrix.length; i++){
//            for ( int j = 0; j < matrix[i].length;j ++){
//                matrix [i] [j] = random.nextInt((max-min)+1)+min;
//                System.out.println(matrix[i] [j] + "");
//            }
//            System.out.println();
//        }
//        int  maxElement = Integer.MIN_VALUE;
//        int  minElement = Integer.MAX_VALUE;
//    static void multiplication(){
//        for ( int i = 1;i <=10;i++){
//            System.out.println(1*i);
        Scanner sc = new Scanner(System.in);
        String operator;
        operator = sc.nextLine();
        Bishkek bishkek = new Bishkek(500,"Бишкек","Пойма","Суракматов Азиз");
        if (operator.equals("Бишкек")){
            System.out.print(bishkek.getSupervisor());
            bishkek.areaName();
            bishkek.lives();
            bishkek.name();
        }
        KaraKol karaKol = new KaraKol(20000,"Кара - Кол","Гоголя 11","Ильяз Марсович");
        if (operator.equals("Каракол")){
            System.out.println("Руководитель города - "+karaKol.getSupervisor());
            karaKol.name();
            karaKol.areaName();
            karaKol.lives();
        }
        Toktogul toktogul = new Toktogul(19200,"Токтогул","Шопокова","Болот Болгонбаев");
        if (operator.equals("Токтогул")){
            System.out.println("Руководитель города - "+toktogul.getSupervisor());
            toktogul.name();
            toktogul.lives();
            toktogul.areaName();
        }
    }
}

