package com.EricNorrwing.Scanner;

import java.util.Scanner;

//break "breaks" current loop, return; breaks all loops
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student benny = new Student();



        boolean isPlaying = true;

        System.out.println("Please insert a number: ");

        do {

            System.out.println("Input Number: ");

            benny.age = scanner.nextInt();

            System.out.println("Insert bennys name");
            benny.name = scanner.next();


            System.out.println(benny.name + "s age is: " + benny.age);
            isPlaying = false;

        }while(isPlaying);



        /*while (isPlaying)
        {

            int result = scannerInt();

            if (result > 1000) {
                isPlaying = false;
            }

            for (int i = 0; i < result; i++) {
                System.out.println(i+1);
                System.out.println("looping...");

            if (i == result -1){
                System.out.println("Ending the loop");
                isPlaying = false;
            }
            }


        }
    }

    public static String scannerText() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert data");
        return sc.nextLine();
    }

    public static int scannerInt() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert data");
        return sc.nextInt(); */
    }
}
