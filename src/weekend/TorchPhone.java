package weekend;

import java.util.Scanner;

public class TorchPhone {

    public static void main(String... args) {
        System.out.println("List of menu functions");

        String options = """
                    1. Phone book
                    2. Messages
                    3. Chat
                    4. Call register
                    5. Tones
                    6. Settings
                    7. Call divert
                    8. Games
                    9. Calculator
                    10. Reminders
                    11. Clock
                    12. Profiles
                    13. SIM services
                """;

        System.out.println(options);

        Scanner option = new Scanner(System.in);
        int choice = option.nextInt();

        switch (choice){
            case 1:
                phoneBook(option);
            case 2:
                messages(option);
            case 3:{
                System.out.println("3. Chat");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) main();
            }
            case 4:
                callRegister(option);
            case 5:
                Tones(option);
            case 6:
                Settings(option);
            case 7:{
                System.out.println("7. Call divert");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) main();
            }
            case 8:{
                System.out.println("8. Games");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) main();
            }
            case 9:{
                System.out.println("9. Calculator");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) main();
            }
            case 10:{
                System.out.println("10. Reminders");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) main();
            }
            case 11:
                clock(option);
            case 12:{
                System.out.println("12. Profiles");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) main();
            }
            case 13: {
                System.out.println("13. SIM services");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) main();
            }
        }

    }

    private static void clock(Scanner option) {
        System.out.println("11. Clock");
        String clock = """
                        1. Alarm clock
                        2. Clock settings
                        3. Date setting
                        4. Stopwatch
                        5. Countdown timer
                        6. Auto update of date and time
                        0. Back
                    """;
        System.out.println(clock);
        int choice = option.nextInt();
        switch (choice){
            case 1: {
                System.out.println("1. Alarm clock");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) clock(option);
            }
            case 2: {
                System.out.println("2. Clock settings");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) clock(option);
            }
            case 3: {
                System.out.println("3. Date setting");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) clock(option);
            }
            case 4: {
                System.out.println("4. Stopwatch");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) clock(option);
            }
            case 5: {
                System.out.println("5. Countdown timer");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) clock(option);
            }
            case 6: {
                System.out.println("6. Auto update of date and time");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) clock(option);
            }
            case 0: main();
        }
    }

    private static void Settings(Scanner option) {
        System.out.println("6. Settings");
        String settings = """
                    1. Call setting
                    2. Phone
                    3. Security Settings
                    4. Restore factory settings
                    0. Back
                """;
        System.out.println(settings);
        int choice = option.nextInt();
        switch (choice){
            case 1: callSettings(option);
            case 2: PhoneSettings(option);
            case 3: SecuritySettings(option);
            case 4: {
                System.out.println("4. Reset Factory Settings");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Settings(option);
            }
            case 0: main();
        }

    }

    private static void SecuritySettings(Scanner option) {
        System.out.println("3. Security Settings");
        String securitySettings= """
                        1. PIN cade request
                        2. Call barring service
                        3. Fixed dialling
                        4. Closed user group
                        5. Phone security
                        6. Change access codes
                        0. Back
                    """;
        System.out.println(securitySettings);
        int choice = option.nextInt();
        switch (choice){
            case 1: {
                System.out.println("1. PIN cade request");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Settings(option);
            }
            case 2: {
                System.out.println("2. Call barring service");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Settings(option);
            }
            case 3: {
                System.out.println("3. Fixed dialling");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Settings(option);
            }
            case 4: {
                System.out.println("4. Closed user group");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Settings(option);
            }
            case 5: {
                System.out.println("5. Phone security");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Settings(option);
            }
            case 6: {
                System.out.println("6. Change access codes");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Settings(option);
            }
            case 0: main();
        }
    }

    private static void PhoneSettings(Scanner option) {
        System.out.println("2. Phone Settings");
        String phoneSettings = """
                        1. Language
                        2. Cell info display
                        3. Welcome note
                        4. Network selection
                        5. Lights
                        6. Confirm SIM service actions
                        0. Back
                    """;
        System.out.println(phoneSettings);
        int choice = option.nextInt();
        switch (choice){
            case 1: {
                System.out.println("1. Language");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Settings(option);
            }
            case 2: {
                System.out.println("2. Cell info display");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Settings(option);
            }
            case 3: {
                System.out.println("3. Welcome note");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Settings(option);
            }
            case 4: {
                System.out.println("4. Stopwatch");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Settings(option);
            }
            case 5: {
                System.out.println("5. Lights");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Settings(option);
            }
            case 6: {
                System.out.println("6. Confirm SIM service actions");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Settings(option);
            }
            case 0: main();
        }
    }

    private static void callSettings(Scanner option) {
        System.out.println("1. Call Settings");
        String callSettings = """
                        1. Automatic Redial
                        2. Speed dialling
                        3. Call waiting options
                        4. Own Number sending
                        5. Phone line in use
                        6. Automatic answer
                        0. Back
                    """;
        System.out.println(callSettings);
        int choice = option.nextInt();
        switch (choice){
            case 1: {
                System.out.println("1. Automatic Redial");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Settings(option);
            }
            case 2: {
                System.out.println("2. Speed dialling");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Settings(option);
            }
            case 3: {
                System.out.println("3. Call waiting options");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Settings(option);
            }
            case 4: {
                System.out.println("4. Own Number sending");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Settings(option);
            }
            case 5: {
                System.out.println("5. Phone line in use");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Settings(option);
            }
            case 6: {
                System.out.println("6. Automatic answer");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Settings(option);
            }
            case 0: main();
        }
    }


    private static void Tones(Scanner option) {
        System.out.println("5. Tones");
        String tones = """
                    1. Ringing tone
                    2. Ringing volume
                    3. Incoming call alert
                    4. Composer
                    5. Message alert tone
                    6. Keypad tons
                    7. Warning and game tomes
                    8. vibrating alert
                    9. Screen saver
                    0. Back
                """;
        System.out.println(tones);
        int choice = option.nextInt();
        switch (choice){
            case 1: {
                System.out.println("1. Ringing tone");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Tones(option);
            }
            case 2: {
                System.out.println("2. Ringing volume");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Tones(option);
            }
            case 3: {
                System.out.println("3. Incoming call alert");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Tones(option);
            }
            case 4: {
                System.out.println("4. Composer");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Tones(option);
            }
            case 5: {
                System.out.println("5. Message alert tone");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Tones(option);
            }
            case 6: {
                System.out.println("6. Keypad tons");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Tones(option);
            }
            case 7: {
                System.out.println("7. Warning and game tomes");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Tones(option);
            }
            case 8: {
                System.out.println("8. Vibrating alert");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Tones(option);
            }
            case 9: {
                System.out.println("9. Screen saver");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Tones(option);
            }
            case 0: main();
        }
    }

    private static void callRegister(Scanner option) {
        System.out.println("4. Call register");
        String callRegister = """
                    1. Missed calls
                    2. Received calls
                    3. Dialed numbers
                    4. Erase recent call list
                    5. Show call duration
                    6. Show call cost
                    7. call cost settings
                    8.Prepaid credit
                """;
        System.out.println(callRegister);
        int choice = option.nextInt();
        switch (choice){
            case 1:{
                System.out.println("1. Missed calls");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) callRegister(option);
            }
            case 2:{
                System.out.println("2. Received calls");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) callRegister(option);
            }
            case 3:{
                System.out.println("3. Dialled numbers");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) callRegister(option);
            }
            case 4:{
                System.out.println("4. Erase recent calls list");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) callRegister(option);
            }
            case 5:
                showCallDuration(option);
            case 6:
                showCallCosts(option);
            case 7:
                callCostSettings(option);
            case 8:{
                System.out.println("8. Prepaid credit");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) callRegister(option);
            }
            case 0: main();
        }
    }

    private static void callCostSettings(Scanner option) {
        System.out.println("7. Call Cost Settings");
        String callCostSettings = """
                    1. Call cost limit
                    2. Show costs in
                    0. Back
                """;
        System.out.println(callCostSettings);
        int choice = option.nextInt();
        switch (choice){
            case 1:{
                System.out.println("1. Call cost limit");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) callCostSettings(option);
            }
            case 2:{
                System.out.println("2. Show costs in");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) callCostSettings(option);
            }
            case 0: callRegister(option);
        }
    }

    private static void showCallCosts(Scanner option) {
        System.out.println("6. Show Call Costs");
        String showCallCosts = """
                    1. Last call cost
                    2. All calls' cost
                    3. Clear counters
                    0. Back
                """;
        System.out.println(showCallCosts);
        int choice = option.nextInt();
        switch (choice){
            case 1:{
                System.out.println("1. Last call cost");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) showCallCosts(option);
            }
            case 2:{
                System.out.println("2. All calls' cost");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) showCallCosts(option);
            }
            case 3:{
                System.out.println("3. Clear counters");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) showCallCosts(option);
            }
            case 0: callRegister(option);
        }
    }

    private static void showCallDuration(Scanner option) {
        System.out.println("5. Show call duration");
        String showCallDuration = """
                    1. Last call cost
                    2. All calls' duration
                    3. Received call' duration
                    4. Dialled calls' duration
                    5. Clear timers
                    0. Back
                """;
        System.out.println(showCallDuration);
        int choice = option.nextInt();
        switch (choice){
            case 1:{
                System.out.println("1. Last call cost");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) showCallDuration(option);
            }
            case 2:{
                System.out.println("2. All calls' duration");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) showCallDuration(option);
            }
            case 3:{
                System.out.println("3. Received call' duration");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) showCallDuration(option);
            }
            case 4:{
                System.out.println("4. Dialled calls' duration");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) showCallDuration(option);
            }
            case 5:{
                System.out.println("5. Clear timers");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) showCallDuration(option);
            }
            case 0: callRegister(option);
        }
    }

    private static void messages(Scanner option) {
        System.out.println("2. Messages");
        String messages = """
                    1. Write messages
                    2. Inbox
                    3. Outbox
                    4. Picture messages
                    5. Templates
                    6. Smileys
                    7. Message settings
                    8. Info service
                    9. Voice mailbox number
                    10. Service command editor
                """;
        System.out.println(messages);
        int choice = option.nextInt();
        switch (choice){
            case 1:{
                System.out.println("1. Write messages");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) messages(option);
            }
            case 2:{
                System.out.println("2. Inbox");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) messages(option);
            }
            case 3:{
                System.out.println("3. Outbox");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) messages(option);
            }
            case 4:{
                System.out.println("4. Picture messages");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) messages(option);
            }
            case 5:{
                System.out.println("5. Templates");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) messages(option);
            }
            case 6:{
                System.out.println("6. Smileys");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) messages(option);
            }
            case 7:
                messageSettings(option);
            case 8:{
                System.out.println("8. Info Service");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) messages(option);
            }
            case 9:{
                System.out.println("9. Voice mailbox number");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) messages(option);
            }
            case 10:{
                System.out.println("10. Service command editor");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) messages(option);
            }
            case 0: main();
        }
    }

    private static void messageSettings(Scanner option) {
        System.out.println("7. Message settings");
        String messageSettings = """
                    1. Set 1
                    2. Common
                    0. Back
                """;
        System.out.println(messageSettings);
        int choice = option.nextInt();
        switch (choice){
            case 1:
                Set(option);
            case 2:
                Common(option);
            case 0:
                messages(option);
        }
    }

    private static void Common(Scanner option) {
        System.out.println("2. Common");
        String common = """
                    1. Delivery reports
                    2. Reply via same centre
                    3. Character support
                    0. Back
                """;
        System.out.println(common);
        int choice = option.nextInt();
        switch (choice){
            case 1:{
                System.out.println("1. Delivery reports");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Common(option);
            }
            case 2:{
                System.out.println("2. Reply via same centre");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Common(option);
            }
            case 3:{
                System.out.println("3. Character support");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Common(option);
            }
            case 0: messageSettings(option);
        }
    }

    private static void Set(Scanner option) {
        System.out.println("1. set 1");
        String set = """
                    1. Message centre number
                    2. Messages sent as
                    3. Message validity
                    0. Back
                """;
        System.out.println(set);
        int choice = option.nextInt();
        switch (choice){
            case 1:{
                System.out.println("1. Message centre number");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Set(option);
            }
            case 2:{
                System.out.println("2. Messages sent as");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Set(option);
            }
            case 3:{
                System.out.println("3. Message validity");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Set(option);
            }
            case 0: messageSettings(option);
        }
    }

    private static void phoneBook(Scanner option) {
        System.out.println("1. Phone book");
        String phoneBookOptions = """
                    1. Search
                    2. Service Nos
                    3. Add name
                    4. Erase
                    5. Edit
                    6. Assign tone
                    7. Send b'card
                    8. Options
                    9. Speed dials
                    10. Voice tags
                    0. Back
                """;
        System.out.println(phoneBookOptions);
        int choice = option.nextInt();

        switch (choice){
            case 1:{
                System.out.println("1. Search");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) phoneBook(option);
            }
            case 2:{
                System.out.println("2. Service Nos");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) phoneBook(option);
            }
            case 3:{
                System.out.println("3. Add name");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) phoneBook(option);
            }
            case 4:{
                System.out.println("4. Erase");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) phoneBook(option);
            }
            case 5:{
                System.out.println("5. Edit");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) phoneBook(option);
            }
            case 6:{
                System.out.println("6. Assign tone");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) phoneBook(option);
            }
            case 7:{
                System.out.println("7. Send b'card");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) phoneBook(option);
            }
            case 8:
                Options(option);
            case 9:{
                System.out.println("9. Speed dials");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) phoneBook(option);
            }
            case 10:{
                System.out.println("10. Voice tags");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) phoneBook(option);
            }
            case 0: main();
        }
    }

    private static void Options(Scanner option) {
        System.out.println("8. Options");
        System.out.printf("    %s%n    %s%n    %s%n%n",
                "1. Type of view", "2. Memory status", "0. Back");
        int choice = option.nextInt();
        switch (choice){
            case 1:{
                System.out.println("1. Type of view");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Options(option);
            }
            case 2:{
                System.out.println("2. Memory Status");
                System.out.println("    0: Back");
                choice = option.nextInt();
                if (choice == 0) Options(option);
            }
            case 0: phoneBook(option);
        }
    }
}
