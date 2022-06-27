package tdd;

public class PracticeTest {
    public static void main(String[] args) {


        Practice something = new Practice();

        something.setCourseName("Maths");
        something.setCourseCode("MAT101");
        something.setTestScore(85);

        System.out.println("I did "+ something.getCourseName()+" with course code " + something.getCourseCode()+ " and I scored "+ something.getTestScore());
        //System.out.printf("I did %s with course code %s and I scored %d")
    }
}
