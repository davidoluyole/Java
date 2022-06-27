package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchoolTest {
    School school;

    @BeforeEach
    void setup() {
        school = new School();
    }
    @Test
    void addStudent() {
        school.addStudent("david");
        assertEquals(1,school.studentNames().size());
        school.addStudent("mofe duncan");
        assertEquals(2,school.studentNames().size());
    }
    @Test
    void getStudentNames() {
        school.addStudent("david");
        assertEquals("david", school.studentNames().get(0));
        school.addStudent("mofe Duncan");
        assertEquals("mofe Duncan", school.studentNames().get(1));
    }
    @Test
    void addSubjectOneScore() {
        school.addSubjectOneScore(97);
        assertEquals(1, school.subjectOneScores().size());
        school.addSubjectOneScore(27);
        assertEquals(2, school.subjectOneScores().size());
    }
    @Test
    void getSubjectOneScores() {
        school.addSubjectOneScore(97);
        assertEquals(97,school.subjectOneScores().get(0));
        school.addSubjectOneScore(27);
        assertEquals(27,school.subjectOneScores().get(1));
    }
    @Test
    void addSubjectTwoScore() {
        school.addSubjectTwoScore(50);
        assertEquals(1, school.subjectTwoScores().size());
        school.addSubjectTwoScore(10);
        assertEquals(2,school.subjectTwoScores().size());
    }

    @Test
    void getSubjectTwoScores() {
        school.addSubjectTwoScore(50);
        assertEquals(50, school.subjectTwoScores().get(0));
        school.addSubjectTwoScore(10);
        assertEquals(10,school.subjectTwoScores().get(1));
    }

    @Test
    void addSubjectThreeScores() {
        school.addSubjectThreeScore(70);
        assertEquals(1, school.subjectThreeScores().size());
        school.addSubjectThreeScore(30);
        assertEquals(2,school.subjectThreeScores().size());
    }

    @Test
    void getSubjectThreeScores() {
        school.addSubjectThreeScore(70);
        assertEquals(70, school.subjectThreeScores().get(0));
        school.addSubjectThreeScore(30);
        assertEquals(30,school.subjectThreeScores().get(1));
    }

    @Test
    void getSubjectOnePasses() {
        school.addSubjectOneScore(41);
        assertEquals(1, school.getSubjectOnePasses());
        school.addSubjectOneScore(30);
        assertEquals(1, school.getSubjectOnePasses());
        school.addSubjectOneScore(40);
        assertEquals(2, school.getSubjectOnePasses());
    }

    @Test
    void getSubjectOneFails() {
        school.addSubjectOneScore(20);
        assertEquals(1, school.getSubjectOneFails());
        school.addSubjectOneScore(40);
        assertEquals(1, school.getSubjectOneFails());
        school.addSubjectOneScore(25);
        assertEquals(2, school.getSubjectOneFails());
    }

    @Test
    void getSubjectTwoPasses() {
        school.addSubjectTwoScore(41);
        assertEquals(1, school.getSubjectTwoPasses());
        school.addSubjectTwoScore(30);
        assertEquals(1, school.getSubjectTwoPasses());
        school.addSubjectTwoScore(40);
        assertEquals(2, school.getSubjectTwoPasses());
    }

    @Test
    void getSubjectTwoFails() {
        school.addSubjectTwoScore(20);
        assertEquals(1, school.getSubjectTwoFails());
        school.addSubjectTwoScore(40);
        assertEquals(1, school.getSubjectTwoFails());
        school.addSubjectTwoScore(25);
        assertEquals(2, school.getSubjectTwoFails());
    }

    @Test
    void getSubjectThreePasses() {
        school.addSubjectThreeScore(41);
        assertEquals(1, school.getSubjectThreePasses());
        school.addSubjectThreeScore(30);
        assertEquals(1, school.getSubjectThreePasses());
        school.addSubjectThreeScore(40);
        assertEquals(2, school.getSubjectThreePasses());
    }

    @Test
    void getSubjectThreeFails() {
        school.addSubjectThreeScore(20);
        assertEquals(1, school.getSubjectThreeFails());
        school.addSubjectThreeScore(40);
        assertEquals(1, school.getSubjectThreeFails());
        school.addSubjectThreeScore(25);
        assertEquals(2, school.getSubjectThreeFails());
    }

    @Test
    void highestSubjectOneScore() {
        school.addSubjectOneScore(97);
        school.addSubjectOneScore(27);
        school.addSubjectOneScore(47);
        assertEquals(97, school.highestSubjectOneScore());
    }

    @Test
    void lowestSubjectOneScore() {
        school.addSubjectOneScore(97);
        school.addSubjectOneScore(27);
        school.addSubjectOneScore(47);
        assertEquals(27, school.lowestSubjectOneScore());
    }

    @Test
    void highestSubjectOneScoreIndex() {
        school.addSubjectOneScore(97);
        school.addSubjectOneScore(27);
        school.addSubjectOneScore(98);
        assertEquals(2, school.highestSubjectOneScoreIndex());
    }

    @Test
    void lowestSubjectOneScoreIndex() {
        school.addSubjectOneScore(97);
        school.addSubjectOneScore(27);
        school.addSubjectOneScore(47);
        assertEquals(1, school.lowestSubjectOneScoreIndex());
    }

    @Test
    void highestSubjectTwoScore() {
        school.addSubjectTwoScore(97);
        school.addSubjectTwoScore(27);
        school.addSubjectTwoScore(47);
        assertEquals(97, school.highestSubjectTwoScore());
    }

    @Test
    void highestSubjectTwoScoreIndex() {
        school.addSubjectTwoScore(97);
        school.addSubjectTwoScore(27);
        school.addSubjectTwoScore(98);
        assertEquals(2, school.highestSubjectTwoScoreIndex());
    }

    @Test
    void lowestSubjectTwoScore() {
        school.addSubjectTwoScore(97);
        school.addSubjectTwoScore(27);
        school.addSubjectTwoScore(47);
        assertEquals(27, school.lowestSubjectTwoScore());
    }

    @Test
    void lowestSubjectTwoScoreIndex() {
        school.addSubjectTwoScore(97);
        school.addSubjectTwoScore(27);
        school.addSubjectTwoScore(47);
        assertEquals(1, school.lowestSubjectTwoScoreIndex());
    }

    @Test
    void highestSubjectThreeScore() {
        school.addSubjectThreeScore(97);
        school.addSubjectThreeScore(27);
        school.addSubjectThreeScore(47);
        assertEquals(97, school.highestSubjectThreeScore());
    }

    @Test
    void highestSubjectThreeScoreIndex() {
        school.addSubjectThreeScore(97);
        school.addSubjectThreeScore(27);
        school.addSubjectThreeScore(98);
        assertEquals(2, school.highestSubjectThreeScoreIndex());
    }

    @Test
    void lowestSubjectThreeScore() {
        school.addSubjectThreeScore(97);
        school.addSubjectThreeScore(27);
        school.addSubjectThreeScore(47);
        assertEquals(27, school.lowestSubjectThreeScore());
    }

    @Test
    void lowestSubjectThreeScoreIndex() {
        school.addSubjectThreeScore(97);
        school.addSubjectThreeScore(27);
        school.addSubjectThreeScore(47);
        assertEquals(1, school.lowestSubjectThreeScoreIndex());
    }

    @Test
    void bestGraduatingStudentScore() {
    }

    @Test
    void bestGraduatingStudentScoreIndex() {
    }

    @Test
    void worstGraduatingStudentScore() {
    }

    @Test
    void worstGraduatingStudentScoreIndex() {
    }
}
