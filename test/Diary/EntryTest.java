package Diary;

import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;

        import java.util.Date;

        import static org.junit.jupiter.api.Assertions.assertEquals;

class EntryTest {
    Entry entry;
    Date date;
    @BeforeEach void setUp(){
        entry = new Entry("book","programming hard");
        date = new Date();
        Entry.setUid(0);
    }
    @Test void testThatIDIsUnique(){
        int id = entry.getID();
        assertEquals(1,id);
        System.out.println(id);
    }
    @Test void testThatWeCanGetTitle(){
        assertEquals(entry.getTitle(),"book");
    }
    @Test void testThatWeCanGetBody(){
        assertEquals(entry.getBody(),"programming hard");
    }
    @Test void testThatWeCanGetDateCreated(){
        assertEquals(date,entry.getDateCreated());
    }

    @Test void testThatEntryCanBeEdited(){

        entry.editEntry("dog","bark");
        assertEquals(entry.getTitle(),"dog");
        assertEquals(entry.getBody(),"bark");
    }
}