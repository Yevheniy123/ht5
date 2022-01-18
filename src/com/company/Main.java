package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TaskMethods ht = new TaskMethods();
        Scanner sc = new Scanner(System.in);
        System.out.println("1-Create Students\t2-Show Students Info\t3-List of faculty\t" +
                "4-List of faculty and group\t5-List student who born after year\t6-List of group\t" +
                "7-End program");
        System.out.println("First, enter student details (enter 1) to unlock features 2 to 6");
        byte k = 0;
        while (true) {
            System.out.print("Enter number :: ");
            byte i = sc.nextByte();
            if (i == 1) {
                k=1;
                ht.createStudents();
            }
            if (k == 1) {
                if (i == 2) {
                    ht.showStudentsInfo();
                } else if (i == 3) {
                    ht.listOfFaculty();
                } else if (i == 4) {
                    ht.listOfFacultyAndGroup();
                } else if (i == 5) {
                    ht.listOfBirthday();
                } else if (i == 6) {
                    ht.listOfGroup();
                }
            } if (i == 7) {
                System.out.println("Exit");
                break;
            }

        }


    }
}
