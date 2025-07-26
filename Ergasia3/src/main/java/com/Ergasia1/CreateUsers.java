package com.Ergasia1;

import java.util.Scanner;
import java.io.*;
public class CreateUsers {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner("students.txt");
            File file = new File(scan.nextLine());
            scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                System.out.println(line);
            }
            scan.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //Ξ”Ξ·ΞΌΞΉΞΏΟ…Ο�Ξ³Ξ―Ξ± Ξ±Ξ½Ο„ΞΉΞΊΞµΞΉΞΌΞ­Ξ½Ο‰Ξ½ Ξ³ΞΉΞ± Ο„ΞΏ users//
        Users usr = new Users("" + "Username:", "Name:", "Surname:", "Department:"
        );
        System.out.println(usr);
        //Ξ“ΞΉΞ± Ο„ΞΏ students//
        Students students = new Students("hliaskostor", "Hlias:", "Kostorrizos:", "Department:", 4, 21,
                "Email", "Born Date:", 12345, 20111, 2001, "ADT:");
        System.out.println(students);
        //Ξ“ΞΉΞ± Ο„ΞΏ professors//
        Professors prof = new Professors("Username", "Name", "Surname", "Department",
                "Address", 1, 210, 10 - 2);
        System.out.println(prof);
        //Ξ“ΞΉΞ± Ο„ΞΏ Secretaries//
        Secretaries secr = new Secretaries(0, "Make User", "Make User", "Make User", "Username", "Name",
                "Surname", "Department", 1, "Members", 210,
                10 - 2, "Monday-Friday", 0);
        System.out.println(secr);
        System.out.println("Choose one of three options");
        System.out.println("1. Students");
        System.out.println("2.Professors");
        System.out.println("3.Secretary");
        int menu = scan.nextInt();
        if (menu == 1) {
            System.out.println(" Enter Students");
            Students();
        }
        if (menu == 2) {
            System.out.println("Professors");
            Professors();
        }
        if (menu == 3) {
            System.out.println("Secretaries");
            Secretaries();
        }
    }
    public static void Students() {
        File file = new File("students.txt");
        Students student = new Students();
        System.out.println("1.Student registration");
        System.out.println("2.View grades");
        //Ξ”Ξ·ΞΌΞΉΞΏΟ…Ο�Ξ³Ξ―Ξ± ΞµΞ³Ξ³Ο�Ξ±Ο†Ξ®Ο‚ Ο†ΞΏΞΉΟ„Ξ·Ο„Ξ®//
        int menust = scan.nextInt();
        if (menust == 1) {
            while (true) {
                try {
                    System.out.println("Enter  name: ");
                    student.setName(scan.next());
                    Integer.parseInt(student.getName());
                    System.out.println("Please only name");
                } catch (Exception e) {
                    break;
                }
            }
            while (true) {
                try {
                    System.out.println("Enter surname: ");
                    student.setSurname(scan.next());
                    Integer.parseInt(student.getSurname());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            while (true) {
                try {
                    System.out.println("Enter  Department: ");
                    student.setDepartment(scan.next());
                    Integer.parseInt(student.getDepartment());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            System.out.println("Enter Examino: ");
            while (true) {
                try {
                    student.setExamino(Integer.parseInt(scan.next()));
                    break;
                } catch (Exception e) {
                    System.out.println("Please try again");
                }
            }
            System.out.println("Enter  age: ");
            while (true) {
                try {
                    student.setAge(Integer.parseInt(scan.next()));
                    break;
                } catch (Exception e) {
                    System.out.println("Please try again");
                }
            }
            while (true) {
                try {
                    System.out.println("Enter Email: ");
                    student.setEmail(scan.next());
                    Integer.parseInt(student.getEmail());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            while (true) {
                try {
                    System.out.println("Enter  Born Date: ");
                    student.setBornDate(scan.next());
                    Integer.parseInt(student.getBornDate());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            System.out.println("Enter Registration Number");
            while (true) {
                try {
                    student.registrationNumber = Integer.parseInt(scan.next());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Only number please.");
                }
            }
            System.out.println("Enter ADT: ");
            student.setADT(scan.next());
            System.out.println("The registration was completed");
        }
//Ξ Ο�ΞΏΞ²ΞΏΞ»Ξ® Ξ²Ξ±ΞΈΞΌΞΏΞ»ΞΏΞ³Ξ―Ξ±Ο‚ Ο†ΞΏΞΉΟ„Ξ·Ο„Ξ®//
        if (menust == 2) {
            while (true) {
                try {
                    System.out.println("Enter  name: ");
                    student.setName(scan.next());
                    Integer.parseInt(student.getName());
                    System.out.println("Please only name");
                } catch (Exception e) {
                    break;
                }
            }
            while (true) {
                try {
                    System.out.println("Enter surname: ");
                    student.setSurname(scan.next());
                    Integer.parseInt(student.getSurname());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            while (true) {
                try {
                    System.out.println("Enter  Department: ");
                    student.setDepartment(scan.next());
                    Integer.parseInt(student.getDepartment());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            System.out.println("Enter Registration Number");
            while (true) {
                try {
                    student.registrationNumber = Integer.parseInt(scan.next());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Only number please.");
                }
            }
            while (true) {
                try {
                    System.out.println("Enter  Course: ");
                    student.setDepartment(scan.next());
                    Integer.parseInt(student.getDepartment());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
                System.out.println(" The grade is:");
            }
        }
    }

    public static void Professors() {
        Professors professors = new Professors();

        System.out.println("1.Set grades");
        System.out.println("2.View grades");
        int menuprof = scan.nextInt();
        //Ξ’Ξ±ΞΈΞΌΞΏΞ»Ο�Ξ³Ξ·ΟƒΞ· Ο†ΞΏΞΉΟ„Ξ·Ο„Ο�Ξ½//
        if (menuprof == 1) {
            while (true) {
                try {
                    System.out.println("Enter student name: ");
                    professors.setName(scan.next());
                    Integer.parseInt(professors.getName());
                    System.out.println("Please only name");
                } catch (Exception e) {
                    break;
                }
            }
            while (true) {
                try {
                    System.out.println("Enter student surname: ");
                    professors.setSurname(scan.next());
                    Integer.parseInt(professors.getSurname());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            while (true) {
                try {
                    System.out.println("Enter  Department: ");
                    professors.setDepartment(scan.next());
                    Integer.parseInt(professors.getDepartment());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            System.out.println("Enter student Registration Number");
            while (true) {
                try {
                    professors.registrationNumber = Integer.parseInt(scan.next());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Only number please.");
                }
            }
            while (true) {
                try {
                    System.out.println("Enter Course: ");
                    professors.setCourse(scan.next());
                    Integer.parseInt(professors.getCourse());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            System.out.println("Enter grade");
            while (true) {
                try {
                    professors.setGrade(Integer.parseInt(scan.next()));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Only number please.");
                }
                System.out.println("The grading was completed ");
            }
        }
        //Ξ Ο�ΞΏΞ²ΞΏΞ»Ξ® Ξ²Ξ±ΞΈΞΌΞΏΞ»ΞΏΞ³Ξ―Ξ±Ο‚ Ο†ΞΏΞΉΟ„Ξ·Ο„Ξ®//
        if (menuprof == 2) {
            while (true) {
                try {
                    System.out.println("Enter student name: ");
                    professors.setName(scan.next());
                    Integer.parseInt(professors.getName());
                    System.out.println("Please only name");
                } catch (Exception e) {
                    break;
                }
            }
            while (true) {
                try {
                    System.out.println("Enter student surname: ");
                    professors.setSurname(scan.next());
                    Integer.parseInt(professors.getSurname());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            while (true) {
                try {
                    System.out.println("Enter  Department: ");
                    professors.setDepartment(scan.next());
                    Integer.parseInt(professors.getDepartment());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            System.out.println("Enter student Registration Number");
            while (true) {
                try {
                    professors.registrationNumber = Integer.parseInt(scan.next());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Only number please.");
                }
            }
            while (true) {
                try {
                    System.out.println("Enter Course: ");
                    professors.setCourse(scan.next());
                    Integer.parseInt(professors.getCourse());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            System.out.println("The grade is:");
        }
    }

    public static void Secretaries() {
        Secretaries secretaries = new Secretaries();
//Ξ”Ξ·ΞΌΞΉΞΏΟ…Ο�Ξ³Ξ―Ξ± ΞµΞ³Ξ³Ο�Ξ±Ο†Ο�Ξ½ ΞΊΞ±ΞΈΞ·Ξ³Ξ·Ο„Ο�Ξ½ Ξ±Ο€Ο� Ο„Ξ·Ξ½ Ξ³Ο�Ξ±ΞΌΞΌΞ±Ο„ΞµΞ―Ξ±//
        System.out.println("1.Professor registration");
        //Ξ”Ξ·ΞΌΞΉΞΏΟ…Ο�Ξ³Ξ―Ξ± ΞµΞ³Ξ³Ο�Ξ±Ο†Ο�Ξ½ Ο†ΞΏΞΉΟ„Ξ·Ο„Ο�Ξ½ Ξ±Ο€Ο� Ο„Ξ·Ξ½ Ξ³Ο�Ξ±ΞΌΞΌΞ±Ο„ΞµΞ―Ξ±//
        System.out.println("2.Student registration");
        //Ξ”Ξ·ΞΌΞΉΞΏΟ…Ο�Ξ³Ξ―Ξ± ΞµΞ³Ξ³Ο�Ξ±Ο†Ο�Ξ½ ΞΌΞ±ΞΈΞ·ΞΌΞ¬Ο„Ο‰Ξ½ Ξ±Ο€Ο� Ο„Ξ·Ξ½ Ξ³Ο�Ξ±ΞΌΞΌΞ±Ο„ΞµΞ―Ξ±//
        System.out.println("3.Courses registration");
        //Ξ‘Ξ½Ξ¬ΞΈΞµΟƒΞ· ΞΌΞ±ΞΈΞ·ΞΌΞ¬Ο„Ο‰Ξ½ ΟƒΟ„ΞΏΟ…Ο‚ ΞΊΞ±ΞΈΞ·Ξ³Ξ·Ο„Ξ­Ο‚//
        System.out.println("4.Assigning courses to professors");
        //Ξ’Ξ±ΞΈΞΌΞΏΞ»Ο�Ξ³Ξ·ΟƒΞ· Ο†ΞΏΞΉΟ„Ξ·Ο„Ο�Ξ½//
        System.out.println("5.Student grading");
        int menusec = scan.nextInt();
        //Ξ•Ξ³Ξ³Ο�Ξ±Ο†Ξ· ΞΊΞ±ΞΈΞ·Ξ³Ξ·Ο„Ο�Ξ½//
        if (menusec == 1) {
            while (true) {
                try {
                    System.out.println("Enter  name: ");
                    secretaries.setName(scan.next());
                    Integer.parseInt(secretaries.getName());
                    System.out.println("Please only name");
                } catch (Exception e) {
                    break;
                }
            }
            while (true) {
                try {
                    System.out.println("Enter surname: ");
                    secretaries.setSurname(scan.next());
                    Integer.parseInt(secretaries.getSurname());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            while (true) {
                try {
                    System.out.println("Enter  Department: ");
                    secretaries.setDepartment(scan.next());
                    Integer.parseInt(secretaries.getDepartment());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            while (true) {
                try {
                    System.out.println("Enter  courses you teach: ");
                    secretaries.setDepartment(scan.next());
                    Integer.parseInt(secretaries.getDepartment());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            System.out.println("The registration was completed");
        }
        //Ξ•Ξ³Ξ³Ο�Ξ±Ο†Ξ® Ο†ΞΏΞΉΟ„Ξ·Ο„Ο�Ξ½//
        if (menusec == 2) {
            System.out.println("Record Students ");
            while (true) {
                try {
                    System.out.println("Enter  name: ");
                    secretaries.setName(scan.next());
                    Integer.parseInt(secretaries.getName());
                    System.out.println("Please only name");
                } catch (Exception e) {
                    break;
                }
            }
            while (true) {
                try {
                    System.out.println("Enter surname: ");
                    secretaries.setSurname(scan.next());
                    Integer.parseInt(secretaries.getSurname());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            while (true) {
                try {
                    System.out.println("Enter  Department: ");
                    secretaries.setDepartment(scan.next());
                    Integer.parseInt(secretaries.getDepartment());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
                System.out.println("The registration was completed");
            }

            System.out.println("Enter Registration Number");
            while (true) {
                try {
                    secretaries.registrationNumber = Integer.parseInt(scan.next());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Only number please.");
                }
            }
            System.out.println("The registration was completed");
        }
        // Ξ•Ξ³Ξ³Ο�Ξ±Ο†Ξ® ΞΌΞ±ΞΈΞ·ΞΌΞ¬Ο„Ο‰Ξ½
        if (menusec == 3) {
            System.out.println("Courses registration");
            while (true) {
                try {
                    System.out.println("Enter  name: ");
                    secretaries.setName(scan.next());
                    Integer.parseInt(secretaries.getName());
                    System.out.println("Please only name");
                } catch (Exception e) {
                    break;
                }
            }
            while (true) {
                try {
                    System.out.println("Enter surname: ");
                    secretaries.setSurname(scan.next());
                    Integer.parseInt(secretaries.getSurname());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            while (true) {
                try {
                    System.out.println("Enter  Department: ");
                    secretaries.setDepartment(scan.next());
                    Integer.parseInt(secretaries.getDepartment());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            System.out.println("Enter registration number");
            while (true) {
                try {
                    secretaries.registrationNumber = Integer.parseInt(scan.next());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Only number please.");
                }
            }
            while (true) {
                try {
                    System.out.println("Enter Course: ");
                    secretaries.setCourse(scan.next());
                    Integer.parseInt(secretaries.getSurname());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            System.out.println("The registration was completed");
        }
        //Ξ‘Ξ½Ξ¬ΞΈΞµΟƒΞ· ΞΌΞ±ΞΈΞ·ΞΌΞ¬Ο„Ο‰Ξ½ ΟƒΟ„ΞΏΟ…Ο‚ ΞΊΞ±ΞΈΞ·Ξ³Ξ·Ο„Ξ­Ο‚//
        if (menusec == 4) {
            while (true) {
                try {
                    System.out.println("Enter  name: ");
                    secretaries.setName(scan.next());
                    Integer.parseInt(secretaries.getName());
                    System.out.println("Please only name");
                } catch (Exception e) {
                    break;
                }
            }
            while (true) {
                try {
                    System.out.println("Enter surname: ");
                    secretaries.setSurname(scan.next());
                    Integer.parseInt(secretaries.getSurname());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            while (true) {
                try {
                    System.out.println("Enter department: ");
                    secretaries.setDepartment(scan.next());
                    Integer.parseInt(secretaries.getDepartment());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            while (true) {
                try {
                    System.out.println("Enter Course: ");
                    secretaries.setCourse(scan.next());
                    Integer.parseInt(secretaries.getCourse());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
                System.out.println("The assigning was completed");
            }
        }
        //Ξ’Ξ±ΞΈΞΌΞΏΞ»Ο�Ξ³Ξ·ΟƒΞ· Ο†ΞΏΞΉΟ„Ξ·Ο„Ο�Ξ½//
        if (menusec == 5) {
            while (true) {
                try {
                    System.out.println("Enter  name: ");
                    secretaries.setName(scan.next());
                    Integer.parseInt(secretaries.getName());
                    System.out.println("Please only name");
                } catch (Exception e) {
                    break;
                }
            }
            while (true) {
                try {
                    System.out.println("Enter surname: ");
                    secretaries.setSurname(scan.next());
                    Integer.parseInt(secretaries.getSurname());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            while (true) {
                try {
                    System.out.println("Enter department: ");
                    secretaries.setDepartment(scan.next());
                    Integer.parseInt(secretaries.getDepartment());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            while (true) {
                try {
                    System.out.println("Enter Course: ");
                    secretaries.setCourse(scan.next());
                    Integer.parseInt(secretaries.getCourse());
                    System.out.println("Please try again");
                } catch (Exception e) {
                    break;
                }
            }
            System.out.println("Enter registration number");
            while (true) {
                try {
                    secretaries.registrationNumber = Integer.parseInt(scan.next());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Only number please.");
                }
            }
            System.out.println(("Enter course grade"));
            while (true) {
                try {
                    secretaries.Grades = Integer.parseInt(scan.next());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Only number please");
                }
                System.out.println("The grading was completed");
            }
        }
    }
}


















