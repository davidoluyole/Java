package Diary;

import java.time.LocalDate;
import java.util.ArrayList;

public class Diary {
    private int diaryId;
    private static int uid;
    private String name;
    private final LocalDate date = LocalDate.now();
    private ArrayList<Entry> entries;

    public Diary(String name) {
        this.name = name;
        entries = new ArrayList<>();
        diaryId = ++uid;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void addEntry(Entry newEntry) {
        entries.add(newEntry);
    }

    public Entry getEntry(int id) {
        return entries.get(id - 1);
    }

    public ArrayList<Entry> getAllEntries() {
        return entries;
    }

    public void editEntry(int id, String newTitle, String newBody) {
        Entry entry = entries.get(id - 1);
        entry.editEntry(newTitle, newBody);
    }

    public void deleteEntry(int id) {
        entries.remove(id - 1);
    }

    public int getId() {
        return diaryId;
    }

    public static void setUid(int uid) {
        Diary.uid = uid;
    }

    @Override
    public String toString() {
        return """
                Diary id -> %d
                Diary name -> %s
                date created -> %s
                """.formatted(getId(),getName(),getDate());
    }
}