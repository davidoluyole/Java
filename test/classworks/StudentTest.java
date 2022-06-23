//package classworks;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class StudentTest {
//    School semicolon;
//    Course java;
//    Student student1;
//    Student student2;
//
//    @BeforeEach
//    void setUp() {
//        java = new Course("Java", "JAV101", 3);
//        student1 = new Student("Babatunde", 1);
//        student2 = new Student("David", 2);
//    }
//    @Test
//    public void studentCanBeCreated(){
//        assertNotNull(student1);
//        assertNotNull(student2);
//    }
//    @Test
//    public void studentDetailsCanBeChanged(){
//        student1.setStudentName("Tunde");
//        student1.setStudentId(3);
//        assertEquals("Tunde", student1.getStudentName());
//        assertEquals(3, student1.getStudentId());
//    }
//    @Test
//    public void courseCanBeSelected(){
//        student1.addCourse(java);
//        assertNotNull(student1.getCourse(0));
//    }
//    @Test
//    public void courseCanBeDropped(){
//        student1.addCourse(java);
//        student1.addCourse(java);
//        student1.deleteCourse(0);
//        assertNotNull(student1.getCourse(0));
//    }
//    @Test
//    public void studentCanWithdraw(){
//
//    }
//}