package Diary;

import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;

        import java.util.Date;


        import static org.junit.jupiter.api.Assertions.assertEquals;
        import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryTest {
    @BeforeEach void clear(){
        Diary.setUid(0);
    }
    @Test void testDairyId(){
        Diary diary = new Diary("myDiary");
        int id = diary.getId();
        assertEquals(id,1);

        diary = new Diary("myD");
        id = diary.getId();
        assertEquals(id,2);

        diary = new Diary("myD");
        id = diary.getId();
        assertEquals(id,3);
    }

    @Test void testThatDiaryCanBECreated(){
        Diary diary = new Diary("myDiary");
        assertEquals(diary.getName(), "myDiary");
    }
    @Test void testThatDiaryWeCanGetDAteCreated(){
        Diary diary = new Diary("myDiary");
        Date date = new Date();
        assertEquals(date,diary.getDate());
    }
    @Test void testThatWeHaveAnArrayListOfEntry(){
        Entry entry= new Entry("myFirst","java no go kill me");
        Diary diary = new Diary("myDiary");
        diary.addEntry(entry);

        assertNotNull(diary.getEntry(1));
    }
    @Test void testThatWeCanGetAParticularEntry(){
        Entry entry= new Entry("myFirst","java no go kill me");
        Diary diary = new Diary("myDiary");
        diary.addEntry(entry);

        entry= new Entry("mySecond","python sweet");
        diary.addEntry(entry);

        System.out.println(diary.getEntry(1));
    }
    @Test void testThatWeCanGetAllEntries(){
        Entry entry= new Entry("myFirst","java no go kill me");
        Diary diary = new Diary("myDiary");
        diary.addEntry(entry);

        entry= new Entry("mySecond","python sweet");
        diary.addEntry(entry);

        System.out.println(diary.getAllEntries());
    }
    @Test void testThatWeCanEditEntry(){
        Entry entry= new Entry("myFirst","java no go kill me");
        Diary diary = new Diary("myDiary");
        diary.addEntry(entry);

        entry= new Entry("mySecond","python sweet");
        diary.addEntry(entry);
        System.out.println(diary.getAllEntries());

        System.out.println("AFTER EDIT");

        diary.editEntry(1,"myEdit","new Body");

        System.out.println(diary.getAllEntries());
    }
    @Test void testThatWeCanDeleteEntry(){
        Entry entry= new Entry("myFirst","java no go kill me");
        Diary diary = new Diary("myDiary");
        diary.addEntry(entry);

        entry= new Entry("mySecond","python sweet");
        diary.addEntry(entry);
        System.out.println(diary.getAllEntries());

        System.out.println("AFTER DELETE");

        diary.deleteEntry(1);

        System.out.println(diary.getAllEntries());
    }

}