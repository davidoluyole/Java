//package classworks;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class SchoolTest {
//    School newSchool;
//    Course course1;
//    Course course2;
//    Student student1;
//    Student student2;
//    Student student3;
//
//    @BeforeEach
//    void setUp() {
//        newSchool = new School("Semicolon Institute", "Yaba");
//        course1 = new Course("Java", "JAV101", 3);
//        course2 = new Course("Database", "DBS101", 3);
//        student1 = new Student("Babatunde", "001");
//        student2 = new Student("David", "002");
//        student3 = new Student("tofunmi", "010");
//    }
//
//    @Test
//    public void schoolCanBeCreated(){
//        assertNotNull(newSchool);
//    }
//
//    @Test
//    public void schoolCanAdmitStudents(){
//        newSchool.admitStudent(student1);
//
//        assertEquals(student1, newSchool.getStudent(0));
//    }
//
//    @Test
//    public void schoolCanCreateCourse(){
//        newSchool.createCourse(course1);
//
//        assertEquals(course1, newSchool.getCourse(0));
//    }
//    @Test
//    public void courseCanBeDeleted(){
//        student1.addCourse(course1);
//        student1.addCourse(course2);
//        student1.deleteCourse(0);
//        assertNotNull(student1.getCourse(0));
//    }
//}