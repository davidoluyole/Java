package tdd;

import java.util.Scanner;

public class SchoolMain {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        School school = new School();

        System.out.println("what is the subject 1 code");
        String subjectOneName = entry.next();
        school.addSubject(subjectOneName);

        System.out.println("what is the subject 2 code");
        String subjectTwoName = entry.next();
        school.addSubject(subjectTwoName);

        System.out.println("what is the subject 3 code");
        String subjectThreeName = entry.next();
        school.addSubject(subjectThreeName);

        for (int counter = 0; counter < 3; counter++) {
            System.out.println("what is the student's name?");
            String studentName = entry.next();
            school.addStudent(studentName);

            System.out.println("what did " +studentName+  " score in "+subjectOneName+"?");
            int score = entry.nextInt();
            school.addSubjectOneScore(score);

            System.out.println("what did " +studentName+ " score in "+subjectTwoName+"?");
            score = entry.nextInt();
            school.addSubjectTwoScore(score);

            System.out.println("what did " +studentName+ " score in "+subjectThreeName+"?");
            score = entry.nextInt();
            school.addSubjectThreeScore(score);
        }//season 1:20-30, 2:30-50
        System.out.println("============================================================");
        String header = "STUDENT     "+subjectOneName+"    "+subjectTwoName+"    "+subjectThreeName+"   TOT     AVE     POS";
        System.out.println(header);
        System.out.println("============================================================");

        System.out.printf("%s           %.0f    %.0f    %.0f    %.0f    %.2f\n",
                school.studentNames().get(0), school.subjectOneScores().get(0),
                school.subjectTwoScores().get(0), school.subjectThreeScores().get(0),
                school.totalStudentOneScore(), school.totalStudentOneScoreAverage());
        System.out.printf("%s           %.0f    %.0f    %.0f    %.0f    %.2f\n",
                school.studentNames().get(1), school.subjectOneScores().get(1),
                school.subjectTwoScores().get(1), school.subjectThreeScores().get(1),
                school.totalStudentTwoScore(), school.totalStudentTwoScoreAverage());
        System.out.printf("%s           %.0f    %.0f    %.0f    %.0f    %.2f\n",
                school.studentNames().get(2), school.subjectOneScores().get(2),
                school.subjectTwoScores().get(2), school.subjectThreeScores().get(2),
                school.totalStudentThreeScore(), school.totalStudentThreeScoreAverage());
        System.out.println("============================================================");
        System.out.println("SUBJECT SUMMARY");
        System.out.println(subjectOneName);
        System.out.printf("Highest scoring student is: %s scoring %.0f\n", school.studentNames().get(school.highestSubjectOneScoreIndex()),school.highestSubjectOneScore());
        System.out.printf("Lowest scoring student is: %s scoring %.0f\n",school.studentNames().get(school.lowestSubjectOneScoreIndex()),school.lowestSubjectOneScore());
        System.out.printf("Total Score is: %.0f\n", school.getSubjectOneTotal());
        System.out.printf("Average Score is : %.2f\n", school.getSubjectOneAverage());
        System.out.printf("Number of passes: %.0f\n", school.getSubjectOnePasses());
        System.out.printf("Number of fails: %.0f\n", school.getSubjectOneFails());
        System.out.println(subjectTwoName);
        System.out.printf("Highest scoring student is: %s scoring %.0f\n",school.studentNames().get(school.highestSubjectTwoScoreIndex()),school.highestSubjectTwoScore());
        System.out.printf("Lowest scoring student is: %s scoring %.0f\n",school.studentNames().get(school.lowestSubjectTwoScoreIndex()),school.lowestSubjectTwoScore());
        System.out.printf("Total Score is: %.0f\n", school.getSubjectTwoTotal());
        System.out.printf("Average Score is : %.2f\n", school.getSubjectTwoAverage());
        System.out.printf("Number of passes: %.0f\n", school.getSubjectTwoPasses());
        System.out.printf("Number of fails: %.0f\n", school.getSubjectTwoFails());
        System.out.println(subjectThreeName);
        System.out.printf("Highest scoring student is: %s scoring %.0f\n", school.studentNames().get(school.highestSubjectThreeScoreIndex()),school.highestSubjectThreeScore());
        System.out.printf("Lowest scoring student is: %s scoring %.0f\n", school.studentNames().get(school.lowestSubjectThreeScoreIndex()),school.lowestSubjectThreeScore());
        System.out.printf("Total Score is: %.0f\n", school.getSubjectThreeTotal());
        System.out.printf("Average Score is : %.2f\n", school.getSubjectThreeAverage());
        System.out.printf("Number of passes: %.0f\n", school.getSubjectThreePasses());
        System.out.printf("Number of fails: %.0f\n", school.getSubjectThreeFails());
        System.out.println("============================================================");
        System.out.printf("The hardest subject is %s with %.0f failures\n", school.getSubject(school.hardestSubjectIndex()),school.hardestSubjectFails());
        System.out.printf("The easiest subject is %s with %.0f passes\n", school.getSubject(school.easiestSubjectIndex()),school.easiestSubjectPasses());
        System.out.printf("The overall Highest score is scored by %s in %s scoring %.0f\n",school.getLowestScoringStudent(), school.getLowestScoreSubject(),school.getOverallHighestScore());
        System.out.printf("The overall Lowest score is scored by %s in %s scoring %.0f\n", school.getLowestScoringStudent(), school.getLowestScoreSubject(),school.getOverallLowestScore());
        System.out.println("============================================================");
        System.out.println();
        System.out.println("CLASS SUMMARY");
        System.out.println("============================================================");
        System.out.printf("Best Graduating Student is: %s scoring %.0f\n", school.studentNames().get(school.bestGraduatingStudentScoreIndex()),
                school.bestGraduatingStudentScore());
        System.out.println("============================================================");
        System.out.println();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.printf("Worst Graduating student is: %s scoring %.0f\n", school.studentNames().get(school.worstGraduatingStudentScoreIndex()),
                school.worstGraduatingStudentScore());
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println();
        System.out.println("============================================================");
        System.out.printf("Class Total score is: %.0f\n", school.classTotalScore());
        System.out.printf("Class Average score is: %.2f\n", school.classAverageScore());
        System.out.println("============================================================");
    }
}