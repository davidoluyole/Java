//package classworks;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class CourseTest {
//    Course course;
//    Student student;
//    Student tunde;
//    Student david;
//    Student elom;
//    Student samuel;
//    @BeforeEach
//    public void SetUp(){
//        course = new Course("Java", "JAV101", 3);
//        student = new Student("student", 200);
//        tunde = new Student("tunde", 210);
//        david = new Student("dave", 212);
//        elom = new Student("musk", 7);
//        samuel = new Student("tofunmi", 10);
//    }
//    @Test
//    public void canCourseBeCreated(){
//        assertNotNull(course);
//    }
//    @Test
//    public void checkThatCourseDetailsCanBeChanged(){
//        course.setCourseTitle("Database");
//        assertEquals("Database", course.getCourseTitle());
//        course.setCourseCode("DB101");
//        assertEquals("DB101", course.getCourseCode());
//        course.setCourseUnit(6);
//        assertEquals(6, course.getCourseUnit());
//    }
//    @Test
//    public void studentCanBeAdded(){
//        course.addStudent(student);
//        course.addStudent(student);
////        assertEquals(student, course.getStudent(0));
//        assertNotNull(course.getStudent(1));
//    }
//    @Test
//    public void studentCanBeDeleted(){
//        course.addStudent(student);
//        course.addStudent(tunde);
//        course.addStudent(david);
//        course.deleteStudent(1);
//        assertNotNull(course.getStudent(0));
//        assertEquals(david, course.getStudent(1));
//        assertEquals(student, course.getStudent(0));
//    }
//}
