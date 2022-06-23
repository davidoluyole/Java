package classworks;

import java.util.ArrayList;

public class School {

    private final String schoolName;
    private String schoolLocation;
    private ArrayList<Student> newStudents;
    private ArrayList<Course> newCourses;
    public School(String name, String location) {
        schoolName = name;
        schoolLocation = location;
        newStudents = new ArrayList<>();
        newCourses = new ArrayList<>();
    }

    public void setSchoolLocation(String location) {
        schoolLocation = location;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getSchoolLocation() {
        return schoolLocation;
    }

    public void admitStudent(Student student) {
        newStudents.add(student);
    }

    public Student getStudent(int index) {
        return newStudents.get(index);
    }

    public void createCourse(Course course) {
        newCourses.add(course);
    }

    public Course getCourse(int index) {
        return newCourses.get(index);
    }

    public void getAllStudents() {
        for(Student student: newStudents) {
            System.out.println(student);
        }
    }

    public void getAllCourses() {
        for(Course course: newCourses) {
            System.out.println(course);
        }
    }

    public void deleteCourse(int index) {
        newCourses.remove(index);
    }

    public void deleteStudent(int index) {
        newStudents.remove(index);
    }
    public int totalCourses() {
        return newCourses.size();
    }

    public int totalStudents() {
        return newStudents.size();
    }
}
