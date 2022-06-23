package Diary;

import java.time.LocalDate;

public class Entry {
    private final LocalDate date = LocalDate.now();
    private int id;

    public static void setUid(int uid) {
        Entry.uid = uid;
    }

    private static int uid = 0;
    private String title;
    private String body;
    public Entry (String title, String body){
        uid++;
        id = uid;
        this.title=title;
        this.body=body;
    }


    public int getID() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public LocalDate getDateCreated() {
        return date;
    }

    public void editEntry(String title, String body) {
        this.title=title;
        this.body=body;
    }
    @Override
    public String toString(){
        String data = """
                id -> %d
                Title -> %s
                Body  -> %s
                Date -> %s
                """;
        return data.formatted(getID(),getTitle(),getBody(),getDateCreated());
    }
}