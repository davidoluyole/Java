package Diary;

import java.util.ArrayList;

public class User {
    private int userId;
    private static int uid;

    public static void setUid(int uid) {
        User.uid = uid;
    }

    ArrayList<Diary> diaries = new ArrayList<>();

    public User() {
        userId= ++uid;
    }

    public void createDiary(Diary newDiary) {
        diaries.add(newDiary);
    }

    public Diary viewDiary(int diaryId) {
        return diaries.get(diaryId-1);
    }

    public ArrayList<Diary> viewAllDiaries() {

        return diaries;
    }

    public void editDiary(int diaryId, String newDiaryName) {
        for (Diary diary : diaries) {
            if (diary.getId() == diaryId) {
                diary.setName(newDiaryName);
            }

        }

    }

    public void deleteDiary(int diaryId) {
        for (int i = 0; i < diaries.size(); i++) {
            Diary diary = diaries.get(i);
            if (diary.getId() == diaryId) {
                diaries.remove(i);
                break;
            }
        }
    }
}