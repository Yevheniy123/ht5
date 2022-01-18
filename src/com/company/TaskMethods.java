package com.company;
import java.util.Scanner;
public class TaskMethods {
    private Student[] studArray;
    Scanner sc = new Scanner(System.in);

    public void createStudents() {

        System.out.println("Enter number of students");
        int n = sc.nextInt();
        studArray = new Student[n];
        System.out.println("Enter information of students ");
        System.out.println("id\tlast name\tfirst name\tpatronymic\tbirthday\taddress\tphone number\tfaculty" +
                "\tcourse\tgroup");
        sc.nextLine();
        String enterStrStudent;
        for (int i = 0; i < studArray.length; i++) {
            enterStrStudent = sc.nextLine();
            String[] words = enterStrStudent.split(" ");
            studArray[i] = new Student(Integer.parseInt(words[0]), words[1], words[2],
                    words[3], Integer.parseInt(words[4]),
                    words[5], words[6], words[7], Integer.parseInt(words[8]), Integer.parseInt(words[9]));


        }
    }

    public void showStudentsInfo() {
        for (Student stu : studArray) {
            System.out.println(stu);
        }
    }

    public void listOfFaculty() {
        System.out.println("Enter faculty");
        String faculty = sc.next();
        for (Student stu : studArray) {
            if (stu.getFaculty().equals(faculty))
                System.out.println(stu);


        }
    }
    public void listOfFacultyAndGroup() {
        System.out.println("Enter faculty");
        String faculty = sc.next();
        System.out.println("Enter number of group");
        int group = sc.nextInt();
        for (Student stu : studArray) {
            if (stu.getFaculty().equals(faculty) && stu.getGroup() == group)
                System.out.println(stu);


        }
    }
    public void listOfBirthday() {
        System.out.println("Enter date of birthday");
        int birthday = sc.nextInt();
        for (Student stu : studArray) {
            if (stu.getBirthday() > birthday) {
                System.out.println(stu);
            }

        }
    }

    public void listOfGroup() {
        System.out.println("Enter number of group");
        int group = sc.nextInt();
        for (Student stu : studArray) {
            if (stu.getGroup() == group) {
                System.out.println(stu);
            }

        }
    }
}