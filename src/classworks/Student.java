package classworks;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private int studentId;
    private int score;
    private ArrayList<Course> newCourse;

    public Student(String name , int studentID) {
        studentName = name;
        this.studentId = studentID;
        newCourse = new ArrayList<>();
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentId(int studentID) {
        this.studentId = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void addCourse(Course course) {
        newCourse.add(course);
    }

    public Course getCourse(int index) {
        return newCourse.get(index);
    }

    public void getAllCourses() {
        for(Course course: newCourse) {
            System.out.println(course);
        }
    }

    public void deleteCourse(int index) {
        newCourse.remove(index);
    }

    public int totalCoursesOfferedByStudent() {
        return newCourse.size();
    }

    @Override
    public String toString() {
        return String.format("Student ID: %d%nStudent Name: %s%n%n",
                studentId, studentName);
    }
}
