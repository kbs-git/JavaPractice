package com.qapitol.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        Student student=new Student();
        Teacher teacher=new Teacher();
        Scanner scanner=new Scanner(System.in);

        List<Student> listStudent=new ArrayList<Student>();
        List<Teacher> listTeacher=new ArrayList<Teacher>();
        int choice;
        do{
            System.out.println("Please Select and enter the number to perform action");
            System.out.println("1 -> Add the sudent Details");
            System.out.println("2 -> Add teacher Details");
            System.out.println("3 -> exit");
            choice=scanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Enter a Student Name");
                    String sname = scanner.next();
                    System.out.println("Enter a Student age");
                    int age = scanner.nextInt();
                    System.out.println("Enter a Student Cource");
                    String scource = scanner.next();
                    System.out.println("Enter a Student Id");
                    int sid = scanner.nextInt();
                    System.out.println("Enter a student marks");
                    int smarks = scanner.nextInt();
                    student.setName(sname);
                    student.setMarks(smarks);
                    student.setAge(age);
                    student.setId(sid);
                    student.setCource(scource);
                    listStudent.add(student);
                    student.displayDetails();
                    student.caluculatorGrade();
                    break;
                case 2:
                    System.out.println("Enter a teacher Name");
                    String tname = scanner.next();
                    System.out.println("Enter a teacher age");
                    int tage = scanner.nextInt();
                    System.out.println("Enter a teacher id");
                    int tid = scanner.nextInt();
                    System.out.println("Enter a teacher subject");
                    String subject = scanner.next();
                    System.out.println("Enter a teacher salary");
                    long salary = scanner.nextInt();
                    teacher.setName(tname);
                    teacher.setAge(tage);
                    teacher.setId(tid);
                    teacher.setSubjectTeacher(subject);
                    teacher.setSalary(salary);
                    listTeacher.add(teacher);
                    teacher.displayDetails();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Please enter the valid number to perform action");
            }
        }while(choice!=3);

    }
}
