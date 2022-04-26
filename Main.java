package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        for (int i = 1; i <=2 ; i++) {
            for (int j = 1; j <=3 ; j++) {
                System.out.println(i+", "+j);

            }
        }

         */
        /*
        int sum=0;
        for (int i = 0; i <=3 ; i++) {
            sum=sum+i;

        }
        System.out.println("Summa ir vienāda ar "+sum);

         */
        /*
        int sum=0;
        for (int i = 10; i <=100 ; i=i+10) {
            sum=sum+i;

        }
        System.out.println("Summa ir vienāda ar "+sum);

         */
        /*
        int count=0;
        while(count>2){
            System.out.println("Wlcome to Java");
            count++;
        }

         */
        /*
        int x =0;
        do{
            System.out.println("Welcome to Java!");

        } while (x!=0);


         */
        /*
        int a=1234;

        while(a>0){
            int vieni=a%10;
            a=a/10;

            System.out.println(vieni);
        }

         */
        /*
        Scanner sk=new Scanner(System.in);
        int n=sk.nextInt();
        int m=1;
        int f=1;
        while(m!=n){
            f=f*m;
            m++;
        }
        System.out.println(f);

         */
        for (int i = 0; i <=5 ; i++) {
            int x = (int)((Math.random()) * 99)+1;
            System.out.println("Skaitļi " + x + " ");



            if (x % 10 == 7) {
                System.out.println("Skaitļa pedējais cipars ir 7");
                int k=0;
                k++;
            }
        }
    }

}
