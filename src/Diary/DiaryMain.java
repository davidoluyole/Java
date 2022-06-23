package Diary;

import java.util.ArrayList;
import java.util.Scanner;

public class DiaryMain {
    public static Scanner scanner = new Scanner(System.in);
    public static Diary diary;
    public static User user;
    public static String userName;

    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        userName = scanner.next();
        user = new User();

        int sentinel = 0;
        while (sentinel != -2) {
            System.out.println("""
                    Enter 1 to create diary
                    Enter 2 to view diary
                    Enter 3 to view all diaries
                    Enter 4 to edit diary
                    Enter 5 to delete diary
                    Enter 0 to exit
                    """);
            int choice = scanner.nextInt();
            if (choice == 0) {
                sentinel = -2;
            }
            switch (choice) {
                case 1 -> {
                    diary();
                    user.createDiary(diary);
                }
                case 2 -> viewSingle();
                case 3 -> viewAll();
                case 4 -> editDiary();
                case 5 -> deleteDiary();
            }
        }
    }

    public static void viewSingle() {
        System.out.println("enter Diary id");
        int id = scanner.nextInt();
        Diary diary = user.viewDiary(id);
        System.out.println(diary);
    }
    public static void viewAll() {
        ArrayList<Diary> diaries = user.viewAllDiaries();
        for(Diary diary : diaries){
            System.out.println(diary);
        }
    }
    public static void editDiary() {
        System.out.println("Enter Diary id");
        int id = scanner.nextInt();
        System.out.println("Enter new Diary name");
        String name = scanner.next();
        user.editDiary(id,name);
        System.out.println("Diary successfully Edited");
    }
    public static void deleteDiary() {
        System.out.println("Enter Diary id");
        int id = scanner.nextInt();
        user.deleteDiary(id);
        System.out.println("Diary successfully deleted");
    }


    private static void diary() {
        System.out.print("Enter Your Diary Name: ");
        String name = scanner.next();
        diary = new Diary(name);

        int sentinel = 0;
        while (sentinel != -1) {
            System.out.println(userName + """
                    , Welcome to your new Diary %s
                    Press 1 to add Entry
                    press 2 to view Entry
                    press 3 to view all Entries
                    press 4 to  edit Diary
                    press 5 to delete diary
                    press 0 to exit
                    """.formatted(name));
            int choice = scanner.nextInt();
            if (choice == 0) {
                sentinel = -1;
            }
            switch (choice) {
                case 1 -> addEntry();
                case 2 -> viewEntry();
                case 3 -> viewAllEntries();
                case 4 -> editEntry();
                case 5 -> deleteEntry();
            }
        }
    }

    public static void addEntry() {
        System.out.println("Enter title:");
        String title = scanner.next();
        System.out.println("Enter Body: ");
        String body = scanner.next();
        Entry entry = new Entry(title, body);
        diary.addEntry(entry);
        System.out.println("entry created successfully");
    }

    public static void viewEntry() {
        System.out.println("Enter Entry id");
        int id = scanner.nextInt();
        Entry entry = diary.getEntry(id);
        System.out.println(entry);
    }

    public static void viewAllEntries() {
        ArrayList<Entry> entries = diary.getAllEntries();
        for (Entry entry : entries) {
            System.out.println(entry);
        }
    }

    public static void editEntry() {
        System.out.println("enter id");
        int id = scanner.nextInt();
        System.out.println("enter new title");
        String title = scanner.next();
        System.out.println("enter new Body");
        String body = scanner.next();
        diary.editEntry(id, title, body);
        System.out.println("Entry successfully Edited");
    }

    public static void deleteEntry() {
        System.out.println("enter id");
        int id = scanner.nextInt();

        diary.deleteEntry(id);
        System.out.println("Entry successfully Deleted");
    }

}