package classworks;

import java.util.Scanner;

public class SchoolManagementSystem {
    private static School newSchool = new School("Semicolon Institute", "Yaba");
    private static Student newStudent;
    private static Course newCourse;

    private static int userOption;
    private static int studentId;
    private static int courseId;

    private static final Scanner entry = new Scanner(System.in);
    public static void main(String[] args) {

        appIntro();
    }

    private static void appIntro() {
        System.out.println("""
                Welcome to Semicolon. What would you like to do?
                1. Admit Student
                2. Get Student Information
                3. Add Course
                4. Get Course Information
                5. Expel Student
                6. Delete Course
                7. Check All Courses
                8. Show All Admitted Students
                0. Exit
                """);
        userOption = entry.nextInt();
        entry.nextLine();

        switch (userOption) {
            case 1 -> studentAdmission();
            case 2 -> studentDetails();
            case 3 -> courseCreation();
            case 4 -> courseDetails();
            case 5 -> expelStudent();
            case 6 -> deleteCourse();
            case 7 -> courseDetails();
            case 8 -> studentDetails();
            case 0 -> System.exit(0);
            default -> {
                System.out.println("Invalid input. Try again.");
                appIntro();
            }
        }
    }

    private static void studentAdmission() {
        System.out.println("Enter student's full name: ");
        String studentName = entry.nextLine();

        System.out.println("How many courses is the student offering.");
        int numOfCourses = entry.nextInt();

        int courseCount = 0;

        while (courseCount < numOfCourses) {
            System.out.println("Enter a Course ID: ");
            int courseNum = entry.nextInt();

            newStudent.addCourse(newStudent.getCourse(courseNum - 1));
            courseCount++;
        }

        newStudent = new Student(studentName, studentId + 1);

        appIntro();
    }

    private static void studentDetails() {
        System.out.println("1. View a student's details\n2. View all students");
        userOption = entry.nextInt();

        if (userOption == 1) {
            System.out.println("Enter student ID: ");
            int studentNum = entry.nextInt();

            System.out.println(newSchool.getStudent(studentNum - 1));
        }
        else if (userOption == 2) {
            newSchool.getAllStudents();
        } else {
            System.out.println("Invalid input.");
            studentDetails();
        }

        appIntro();
    }

    private static void courseCreation() {
        System.out.println("Enter the course title: ");
        String courseName = entry.nextLine();

        System.out.println("Enter the course code: ");
        String courseCode = entry.nextLine();

        System.out.println("Enter the course units: ");
        int courseUnit = entry.nextInt();

        newCourse = new Course(courseId + 1, courseName, courseCode, courseUnit);

        newSchool.createCourse(newCourse);
        courseId++;
        appIntro();
    }

    private static void courseDetails() {
        System.out.println("1. View a course's details\n2. View all courses");
        userOption = entry.nextInt();

        if (userOption == 1) {
            System.out.println("Enter course ID: ");
            int courseNum = entry.nextInt();

            System.out.println(newSchool.getCourse(courseNum - 1));
        }
        else if (userOption == 2) {
            newSchool.getAllCourses();
        } else {
            System.out.println("Invalid input.");
            courseDetails();
        }

        appIntro();
    }

    private static void deleteCourse() {
        System.out.println("Enter course ID: ");
        int courseNum = entry.nextInt();
        String courseName = newSchool.getCourse(courseNum - 1).getCourseTitle();

        newSchool.deleteStudent(courseNum - 1);

        System.out.printf("%s has been successfully expelled.%n", courseName);

        appIntro();
    }

    private static void expelStudent() {
        System.out.println("Enter student ID: ");
        int studentNum = entry.nextInt();
        String studentName = newSchool.getStudent(studentNum - 1).getStudentName();

        newSchool.deleteStudent(studentNum - 1);

        System.out.printf("%s has been successfully expelled.%n", studentName);

        appIntro();
    }

}
