package tdd;

import java.util.ArrayList;
import java.util.Arrays;

public class School {
    private ArrayList<String> studentNames;
    private ArrayList<Double> subjectOneScores;
    private ArrayList<Double> subjectTwoScores;
    private ArrayList<Double> subjectThreeScores;
    private double[] totalScore;
    private String[] subjectNames;
    private double[] subject;
    private double[] overallScores;
    double totalStudentOneScore;
    double totalStudentTwoScore;
    double totalStudentThreeScore;
    //    int counter = 0;
//
//    public int getCounter() {
//        return counter;
//    }





    public School(){
        studentNames = new ArrayList<>();
        subjectOneScores = new ArrayList<>();
        subjectTwoScores = new ArrayList<>();
        subjectThreeScores = new ArrayList<>();
        totalScore = new double[3];
        subject = new double[3];
        overallScores = new double[9];
        subjectNames = new String[3];
    }




    public void addSubject(String subjectName){
        for (int i = 0; i < subjectNames.length; i++) {
            if(subjectNames[1]== null){
                subjectNames[i] = subjectName;
            }
        }
    }
    public String getSubject(int index){
        return subjectNames[index];
    }





    public void addStudent(String studentName){
        studentNames.add(studentName);
    }
    public ArrayList<String> studentNames(){
        return studentNames;
    }





    public void addSubjectOneScore(double score){
        subjectOneScores.add(score);
    }
    public ArrayList<Double> subjectOneScores(){
        return subjectOneScores;
    }
    public double getSubjectOneTotal(){
        double subjectOneTotal = subjectOneScores().get(0) +
                subjectOneScores().get(1) + subjectOneScores().get(2);
        return subjectOneTotal;
    }
    public double getSubjectOneAverage() {
        double subjectOneAverage = getSubjectOneTotal() / 3;
        return subjectOneAverage;
    }
    public double getSubjectOnePasses(){
        double subjectOnePasses = 0;
        for (int i = 0; i < subjectOneScores().size(); i++) {
            if(subjectOneScores().get(i) >= 40){
                subjectOnePasses +=1;
            }
        }
        return subjectOnePasses;
    }
    public double getSubjectOneFails(){
        double subjectOneFails = 0;
        for (int i = 0; i < subjectOneScores().size(); i++) {
            if(subjectOneScores().get(i) < 40){
                subjectOneFails +=1;
            }
        }
        return subjectOneFails;
    }
    public double highestSubjectOneScore(){
        double highestSubjectOneScore = 0;
        for (int i = 0; i < subjectOneScores().size(); i++) {
            if(subjectOneScores().get(i) > highestSubjectOneScore){
                highestSubjectOneScore = subjectOneScores().get(i);
            }
        }
        return highestSubjectOneScore;
    }
    public int highestSubjectOneScoreIndex(){
        double highestSubjectOneScore=0;
        int highestSubjectOneScoreIndex = 0;
        for (int i = 0; i < subjectOneScores().size(); i++) {
            if(subjectOneScores().get(i) > highestSubjectOneScore){
                highestSubjectOneScore = subjectOneScores().get(i);
                highestSubjectOneScoreIndex = i;
            }
        }
        return highestSubjectOneScoreIndex;
    }
    public double lowestSubjectOneScore(){
        double lowestSubjectOneScore=100;
        for (int i = 0; i < subjectOneScores().size(); i++) {
            if(subjectOneScores().get(i) < lowestSubjectOneScore){
                lowestSubjectOneScore = subjectOneScores().get(i);
            }
        }
        return lowestSubjectOneScore;
    }
    public int lowestSubjectOneScoreIndex(){
        double lowestSubjectOneScore=100;
        int lowestSubjectOneScoreIndex = 0;
        for (int i = 0; i < subjectOneScores().size(); i++) {
            if(subjectOneScores().get(i) < lowestSubjectOneScore){
                lowestSubjectOneScore = subjectOneScores().get(i);
                lowestSubjectOneScoreIndex = i;
            }
        }
        return lowestSubjectOneScoreIndex;
    }





    public void addSubjectTwoScore(double score) {
        subjectTwoScores.add(score);
    }
    public ArrayList<Double> subjectTwoScores() {
        return subjectTwoScores;
    }
    public double getSubjectTwoTotal(){
        double subjectTwoTotal = subjectTwoScores().get(0) +
                subjectTwoScores().get(1) + subjectTwoScores().get(2);
        return subjectTwoTotal;
    }
    public double getSubjectTwoAverage(){
        double subjectTwoAverage = getSubjectTwoTotal() / 3;
        return subjectTwoAverage;
    }
    public double getSubjectTwoPasses(){
        double subjectTwoPasses = 0;
        for (int i = 0; i < subjectTwoScores().size(); i++) {
            if(subjectTwoScores().get(i) >= 40){
                subjectTwoPasses +=1;
            }
        }
        return subjectTwoPasses;
    }
    public double getSubjectTwoFails(){
        double subjectTwoFails = 0;
        for (int i = 0; i < subjectTwoScores().size(); i++) {
            if(subjectTwoScores().get(i) < 40){
                subjectTwoFails +=1;
            }
        }
        return subjectTwoFails;
    }
    public double highestSubjectTwoScore(){
        double highestSubjectTwoScore = 0;
        for (int i = 0; i < subjectTwoScores().size(); i++) {
            if(subjectTwoScores().get(i) > highestSubjectTwoScore){
                highestSubjectTwoScore = subjectTwoScores().get(i);
            }
        }
        return highestSubjectTwoScore;
    }
    public int highestSubjectTwoScoreIndex(){
        double highestSubjectTwoScore=0;
        int highestSubjectTwoScoreIndex = 0;
        for (int i = 0; i < subjectTwoScores().size(); i++) {
            if(subjectTwoScores().get(i) > highestSubjectTwoScore){
                highestSubjectTwoScore = subjectTwoScores().get(i);
                highestSubjectTwoScoreIndex = i;
            }
        }
        return highestSubjectTwoScoreIndex;
    }
    public double lowestSubjectTwoScore(){
        double lowestSubjectTwoScore=100;
        for (int i = 0; i < subjectTwoScores().size(); i++) {
            if(subjectTwoScores().get(i) < lowestSubjectTwoScore){
                lowestSubjectTwoScore = subjectTwoScores().get(i);
            }
        }
        return lowestSubjectTwoScore;
    }
    public int lowestSubjectTwoScoreIndex(){
        double lowestSubjectTwoScore=100;
        int lowestSubjectTwoScoreIndex = 0;
        for (int i = 0; i < subjectTwoScores().size(); i++) {
            if(subjectTwoScores().get(i) < lowestSubjectTwoScore){
                lowestSubjectTwoScore = subjectTwoScores().get(i);
                lowestSubjectTwoScoreIndex = i;
            }
        }
        return lowestSubjectTwoScoreIndex;
    }





    public void addSubjectThreeScore(double score){
        subjectThreeScores.add(score);
    }
    public ArrayList<Double> subjectThreeScores(){
        return subjectThreeScores;
    }
    public double getSubjectThreeTotal(){
        double subjectThreeTotal = subjectThreeScores().get(0) +
                subjectThreeScores().get(1) + subjectThreeScores().get(2);
        return subjectThreeTotal;
    }
    public double getSubjectThreeAverage(){
        double subjectThreeAverage = getSubjectThreeTotal() / 3;
        return subjectThreeAverage;
    }
    public double getSubjectThreePasses(){
        double subjectThreePasses = 0;
        for (int i = 0; i < subjectThreeScores().size(); i++) {
            if(subjectThreeScores().get(i) >= 40){
                subjectThreePasses +=1;
            }
        }
        return subjectThreePasses;
    }
    public double getSubjectThreeFails(){
        double subjectThreeFails = 0;
        for (int i = 0; i < subjectThreeScores().size(); i++) {
            if(subjectThreeScores().get(i) < 40){
                subjectThreeFails +=1;
            }
        }
        return subjectThreeFails;
    }
    public double highestSubjectThreeScore(){
        double highestSubjectThreeScore = 0;
        for (int i = 0; i < subjectThreeScores().size(); i++) {
            if(subjectThreeScores().get(i) > highestSubjectThreeScore){
                highestSubjectThreeScore = subjectThreeScores().get(i);
            }
        }
        return highestSubjectThreeScore;
    }
    public int highestSubjectThreeScoreIndex(){
        double highestSubjectThreeScore=0;
        int highestSubjectThreeScoreIndex = 0;
        for (int i = 0; i < subjectThreeScores().size(); i++) {
            if(subjectThreeScores().get(i) > highestSubjectThreeScore){
                highestSubjectThreeScore = subjectThreeScores().get(i);
                highestSubjectThreeScoreIndex = i;
            }
        }
        return highestSubjectThreeScoreIndex;
    }
    public double lowestSubjectThreeScore(){
        double lowestSubjectThreeScore=100;
        for (int i = 0; i < subjectThreeScores().size(); i++) {
            if(subjectThreeScores().get(i) < lowestSubjectThreeScore){
                lowestSubjectThreeScore = subjectThreeScores().get(i);
            }
        }
        return lowestSubjectThreeScore;
    }
    public int lowestSubjectThreeScoreIndex(){
        double lowestSubjectThreeScore=100;
        int lowestSubjectThreeScoreIndex = 0;
        for (int i = 0; i < subjectThreeScores().size(); i++) {
            if(subjectThreeScores().get(i) < lowestSubjectThreeScore){
                lowestSubjectThreeScore = subjectThreeScores().get(i);
                lowestSubjectThreeScoreIndex = i;
            }
        }
        return lowestSubjectThreeScoreIndex;
    }





    public double totalStudentOneScore() {
        totalStudentOneScore = subjectOneScores.get(0) + subjectTwoScores.get(0) + subjectThreeScores.get(0);
        return totalStudentOneScore;
    }
    public double totalStudentOneScoreAverage(){
        double totalStudentOneScoreAverage = totalStudentOneScore / 3;
        return totalStudentOneScoreAverage;
    }
    public String studentOneSummary() {
        String studentOneSummary = ""+ studentNames().get(0)+ "    "
            + subjectOneScores().get(0) + "   "
            + subjectTwoScores().get(0) + "   "
            + subjectThreeScores().get(0) + "     "
            + totalStudentOneScore() + "   "
            + totalStudentOneScoreAverage() + "  ";
        return studentOneSummary;
    }





    public double totalStudentTwoScore() {
        totalStudentTwoScore = subjectOneScores.get(1) + subjectTwoScores.get(1) + subjectThreeScores.get(1);
        return totalStudentTwoScore;
    }
    public double totalStudentTwoScoreAverage(){
        double totalStudentTwoScoreAverage = totalStudentTwoScore / 3;
        return totalStudentTwoScoreAverage;
    }
    public String studentTwoSummary() {
        String studentTwoSummary = ""+ studentNames().get(1)+ "    "
            + subjectOneScores().get(1) + "   "
            + subjectTwoScores().get(1) + "   "
            + subjectThreeScores().get(1) + "     "
            + totalStudentTwoScore() + "   "
            + totalStudentTwoScoreAverage() + "  ";
        return studentTwoSummary;
    }





    public double totalStudentThreeScore() {
        totalStudentThreeScore = subjectOneScores.get(2) + subjectTwoScores.get(2) + subjectThreeScores.get(2);
        return totalStudentThreeScore;
    }
    public double totalStudentThreeScoreAverage(){
        double totalStudentThreeScoreAverage = totalStudentThreeScore / 3;
        return totalStudentThreeScoreAverage;
    }
    public String studentThreeSummary() {
        String studentThreeSummary = ""+ studentNames().get(2)+ "    "
            + subjectOneScores().get(2) + "   "
            + subjectTwoScores().get(2) + "   "
            + subjectThreeScores().get(2) + "     "
            + totalStudentThreeScore() + "   "
            + totalStudentThreeScoreAverage() + "  ";
        return studentThreeSummary;
    }





//    hardest easiest subject, if statement
    public double[]getSubject(){
        subject[0]= getSubjectOneTotal();
        subject[1]= getSubjectTwoTotal();
        subject[2]= getSubjectThreeTotal();
        return subject;
    }





    public double hardestSubjectScore(){
        double hardestSubjectScore = 300;
        for (int i = 0; i < subject.length; i++) {
            if (subject[i]<hardestSubjectScore){
                hardestSubjectScore=subject[i];
            }
        }
        return hardestSubjectScore;
    }
    public int hardestSubjectIndex(){
        int hardestSubjectIndex = 0;
        if (hardestSubjectScore()==getSubjectOneTotal()){
            hardestSubjectIndex = 0;
        } else if (hardestSubjectScore()==getSubjectTwoTotal()) {
            hardestSubjectIndex = 1;
        } else if (hardestSubjectScore()==getSubjectThreeTotal()) {
            hardestSubjectIndex = 2;
        }
        return hardestSubjectIndex;
    }
    public double hardestSubjectFails(){
        double hardestSubjectFails = 0;
        if(hardestSubjectIndex()==0){
            hardestSubjectFails = getSubjectOneFails();
        }else if (hardestSubjectIndex()==1){
            hardestSubjectFails = getSubjectTwoFails();
        } else if (hardestSubjectIndex()==2) {
            hardestSubjectFails = getSubjectThreeFails();
        }
        return hardestSubjectFails;
    }






    public double easiestSubjectScore(){
        double easiestSubjectScore = 0;
        for (int i = 0; i < subject.length; i++) {
            if (subject[i]>easiestSubjectScore){
                easiestSubjectScore=subject[i];
            }
        }
        return easiestSubjectScore;
    }
    public int easiestSubjectIndex(){
        int easiestSubjectIndex = 0;
        if (easiestSubjectScore()==getSubjectOneTotal()){
            easiestSubjectIndex = 0;
        } else if (easiestSubjectScore()==getSubjectTwoTotal()) {
            easiestSubjectIndex = 1;
        } else if (easiestSubjectScore()==getSubjectThreeTotal()) {
            easiestSubjectIndex = 2;
        }
        return easiestSubjectIndex;
    }
    public double easiestSubjectPasses(){
        double easiestSubjectPasses= 0;
        if(easiestSubjectIndex()==0){
            easiestSubjectPasses = getSubjectOnePasses();
        }else if (easiestSubjectIndex()==1){
            easiestSubjectPasses = getSubjectTwoPasses();
        } else if (easiestSubjectIndex()==2) {
            easiestSubjectPasses = getSubjectThreePasses();
        }
        return easiestSubjectPasses;
    }





//    overall highest and lowest score, nested for
    public double[] getOverallScores(){
        overallScores[0]= subjectOneScores().get(0);
        overallScores[1]= subjectOneScores().get(1);
        overallScores[2]= subjectOneScores().get(2);
        overallScores[3]= subjectTwoScores().get(0);
        overallScores[4]= subjectTwoScores().get(1);
        overallScores[5]= subjectTwoScores().get(2);
        overallScores[6]= subjectThreeScores().get(0);
        overallScores[7]= subjectThreeScores().get(1);
        overallScores[8]= subjectThreeScores().get(2);
        return overallScores;
    }
    public double getOverallHighestScore(){
        double overallHighestScore = 0;
        for (int i = 0; i < overallScores.length; i++) {
            if(overallScores[i]>overallHighestScore){
                overallHighestScore = overallScores[i];
            }
        }
        return overallHighestScore;
    }
    public int getHighestScoreIndex(){
        int index = 0;
        for (int i = 0; i < overallScores.length; i++) {
            if(overallScores[i]==getOverallHighestScore()){
                index=i;
            }
        }
        return index;
    }
    public String getHighestScoreSubject(){
        String highestScoreSubject = null;
        if (getHighestScoreIndex()<=2){
            highestScoreSubject = subjectNames[0];
        } else if (getHighestScoreIndex()>2 && getHighestScoreIndex()<=5) {
            highestScoreSubject = subjectNames[1];
        } else if (getHighestScoreIndex()>5) {
            highestScoreSubject = subjectNames[2];
        }
        return highestScoreSubject;
    }
    public String getHighestScoringStudent(){
        String highestScoringStudent = null;
        for (int i = 0; i < overallScores.length; i++) {
            if(getHighestScoreIndex()==0 || getHighestScoreIndex() == 3 || getHighestScoreIndex() ==6){
                highestScoringStudent = studentNames().get(0);
            }
            if(getHighestScoreIndex()==1 || getHighestScoreIndex() == 4 || getHighestScoreIndex() ==7){
                highestScoringStudent = studentNames().get(1);
            }
            if(getHighestScoreIndex()==2 || getHighestScoreIndex() == 5 || getHighestScoreIndex() ==8){
                highestScoringStudent = studentNames().get(2);
            }
        }
        return highestScoringStudent;
    }
    public double getOverallLowestScore(){
        double overallLowestScore = 100;
        for (int i = 0; i < overallScores.length; i++) {
            if(overallScores[i]<overallLowestScore){
                overallLowestScore = overallScores[i];
            }
        }
        return overallLowestScore;
    }
    public int getLowestScoreIndex(){
        int index = 0;
        for (int i = 0; i < overallScores.length; i++) {
            if(overallScores[i]==getOverallLowestScore()){
                index=i;
            }
        }
        return index;
    }
    public String getLowestScoreSubject(){
        String LowestScoreSubject = null;
        if (getLowestScoreIndex()<=2){
            LowestScoreSubject = subjectNames[0];
        } else if (getLowestScoreIndex()>2 && getLowestScoreIndex()<=5) {
            LowestScoreSubject = subjectNames[1];
        } else if (getLowestScoreIndex()>5) {
            LowestScoreSubject = subjectNames[2];
        }
        return LowestScoreSubject;
    }
    public String getLowestScoringStudent(){
        String lowestScoringStudent = null;
        for (int i = 0; i < overallScores.length; i++) {
            if(getLowestScoreIndex()==0 || getLowestScoreIndex() == 3 || getLowestScoreIndex() ==6){
                lowestScoringStudent = studentNames().get(0);
            }
            if(getLowestScoreIndex()==1 || getLowestScoreIndex() == 4 || getLowestScoreIndex() ==7){
                lowestScoringStudent = studentNames().get(1);
            }
            if(getLowestScoreIndex()==2 || getLowestScoreIndex() == 5 || getLowestScoreIndex() ==8){
                lowestScoringStudent = studentNames().get(2);
            }
        }
        return lowestScoringStudent;
    }





    public double[] getTotalScore() {
        totalScore[0] = totalStudentOneScore();
        totalScore[1] = totalStudentTwoScore();
        totalScore[2] = totalStudentThreeScore();
        return totalScore;
    }
    public double bestGraduatingStudentScore(){
        totalScore = getTotalScore();
        double bestGraduatingStudentScore = 0;
        for (int i = 0; i < totalScore.length; i++) {
            if (totalScore[i] > bestGraduatingStudentScore){
                bestGraduatingStudentScore = totalScore[i];
            }
        }
        return bestGraduatingStudentScore;
    }
    public int bestGraduatingStudentScoreIndex(){
        totalScore = getTotalScore();
        double bestGraduatingStudentScore = 0;
        int bestGraduatingStudentScoreIndex = 0;
        for (int i = 0; i < totalScore.length; i++) {
            if (totalScore[i] > bestGraduatingStudentScore){
                bestGraduatingStudentScore = totalScore[i];
                bestGraduatingStudentScoreIndex = i;
            }
        }
        return bestGraduatingStudentScoreIndex;
    }
    public double worstGraduatingStudentScore(){
        totalScore = getTotalScore();
        double worstGraduatingStudentScore = 300;
        for (int i = 0; i < totalScore.length; i++) {
            if (totalScore[i] < worstGraduatingStudentScore){
                worstGraduatingStudentScore = totalScore[i];
            }
        }
        return worstGraduatingStudentScore;
    }
    public int worstGraduatingStudentScoreIndex(){
        totalScore = getTotalScore();
        int worstGraduatingStudentScoreIndex = 0;
        double worstGraduatingStudentScore = 300;
        for (int i = 0; i < totalScore.length; i++) {
            if (totalScore[i] < worstGraduatingStudentScore){
                worstGraduatingStudentScore = totalScore[i];
                worstGraduatingStudentScoreIndex = i;
            }
        }
        return worstGraduatingStudentScoreIndex;
    }






    public double classTotalScore() {
        double classTotalScore = totalStudentOneScore() + totalStudentTwoScore() + totalStudentThreeScore();
        return classTotalScore;
    }
    public double classAverageScore(){
        double classAverageScore = totalStudentOneScoreAverage() + totalStudentTwoScoreAverage() + totalStudentThreeScoreAverage();
        return classAverageScore;
    }
}





//    favour to find and be found,
//    wisdom to do the right thing so as not to lose is,
//    light to know areas of life and characters to adjust
//    power to dismantle every spell of limitation
//    revelation to unveils every hidden demonic mystery
//    spiritual sensitivity to know and recognise the right person...
//    as many as are led by the spirit of God, they are the sons of God
//    every human being was created by God to be fruitful, fruitfulness is a mandate of creation
//    the blessing of fruitfulness precedes the curse of bareness/fruitlessness
//    God can suspend any protocol to produce the miracle of fruitfulness
//    God is the giver of children



