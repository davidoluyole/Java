package classworks;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        String s = "abcdabcdabca";
        int distinct = 0;
//            for (int i = 0; i < s.length(); i++) {
//                if (s.charAt(1) == s.charAt(i)){
//                    distinct++;
//                }
//            }
//            System.out.println("The number of \""+s.charAt(1)+"\" in "
//                    +s+ " is " +distinct);
//            distinct = 0;
//
//
////Abdulrahman
////.length for array it's a property, for strings it is a method'
//        char[] charArray = s.toCharArray();
//        for (int i = 0; i < charArray.length; i++) {
//            if(charArray[1] == charArray[i]){
//                distinct++;
//            }
//        }
//        System.out.println("The number of \""+s.charAt(1)+"\" in "
//                +s+ " is " +distinct);


////Enhanced for loop
        char[] charArray = s.toCharArray();
        for (char character: charArray) {
            if (character == 'a'){
                distinct++;
            }
        }
        System.out.println("The count of the number of \""+ s.charAt(1)+ "\" is: "+ distinct);

//Automate
//        System.out.println("Enter a word: ");
//        Scanner entry = new Scanner(System.in);
//        String s = entry.nextLine();
//        System.out.println("Enter an alphabet in the word who's occurrence you want to get: ");
//        String d = entry.next();
//        distinct = 0;
//        char[] charArray = s.toCharArray();
//        for (int k = 0; k < s.length(); k++) {
//            if (d.equals(charArray[k]+ "")){
////            if (d.equals(String.valueOf(s.charAt(k)))){
//                System.out.println("decision");
//                distinct++;
            }
        }
//        System.out.println("The number of \""+d+"\" in "
//                +s+ " is " +distinct);
//    }
//}
//        == by compares reference (deep)
//        .= by compares content (shallow)
//        (in js== shallow, ===is deep)
// for int compareTo(String) to work, the class must implement interface comparable
// s ="abc";
//s.compareTo("abd") or this.compareTo("abd"); strings are integers from unicode...
// the value abc is less than abd
//s.equalsIgnoreCase("A") for a vs A ignores case
//overloaded methods can have the same name but different signatures(name, no of parameters return types of the parameters)
//static belongs to the entire class, this cannot be used for static but this can be used for object not for static.
//nameOne = Nifemi, nameTwo = OluwaNifemi
// nameOne.regionMatches(2, nameTwo, 3, 4) false Nife!=wani
// nameOne.regionMatches(True, 0, nameTwo, 5, 6) true, bool reps ignore case... Nifemi = nifemi
//// nameOne.regionMatches(False, 0, nameTwo, 5, 6) false, bool reps ignore case... Nifemi != nifemi due to case