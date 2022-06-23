package Diary;

import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;

        import java.util.ArrayList;

public class UserTest {
    @BeforeEach void setUp(){
        User.setUid(0);
    }
    @Test void testThatWeCanHaveUSer(){
        User user = new User();
    }
    @Test void testThatUserCanHaveADiary(){
        User user = new User();
        Diary diary= new Diary("myDiary");
        user.createDiary(diary);

        Diary diary1 = user.viewDiary(1);
        System.out.println(diary1);

    }
    @Test void testThatUserCanViewDiary(){
        User user = new User();
        Diary diary= new Diary("myDiary");
        user.createDiary(diary);
        Diary result = user.viewDiary(1);
        System.out.println(result);

    }
    @Test void testThatUserCanViewAllDiaries(){
        User user = new User();
        Diary diary= new Diary("myDiary");
        user.createDiary(diary);
        diary = new Diary("myFreshDiary");
        user.createDiary(diary);
        ArrayList<Diary> diaries = user.viewAllDiaries();
        for(Diary dir :diaries){
            System.out.println(dir);
        }

    }
    @Test void testThatUserCanViewAParticularDiary(){
        User user = new User();
        Diary diary= new Diary("myDiary");
        user.createDiary(diary);

        diary = new Diary("myFreshDiary");
        user.createDiary(diary);

        Diary result = user.viewDiary(1);
        System.out.println(result);

    }
    @Test void testThatUserCanEditDiary(){
        User user = new User();
        Diary diary= new Diary("myDiary");
        user.createDiary(diary);

        diary = new Diary("myFreshDiary");
        user.createDiary(diary);

        user.editDiary(1,"myEditedDiary");


        ArrayList<Diary> diaries = user.viewAllDiaries();
        for(Diary dir :diaries){
            System.out.println(dir);
        }

    }
    @Test void testThatUserCanDeleteDiary(){
        User user = new User();
        Diary diary= new Diary("myDiary");
        user.createDiary(diary);

        diary = new Diary("myFreshDiary");
        user.createDiary(diary);

        user.deleteDiary(1);

        ArrayList<Diary> diaries = user.viewAllDiaries();
        for(Diary dir :diaries){
            System.out.println(dir);
        }

    }

}