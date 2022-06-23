package Chapter14;

import java.util.Arrays;
public class MyString {
    private char[] charArray;
    public MyString(String s){
        this.charArray = s.toCharArray(); //    MyString s = new MyString("ehis");
    }
    public int indexOf(String substring, boolean ignoreCase) {
        int lengthOfSubstring = substring.length();
        char[] subStringCharArray = substring.toCharArray();
        char[] subArray = new char[lengthOfSubstring];
        for (int i = 0; i <= charArray.length-lengthOfSubstring; i++) {
            for (int j = 0; j < lengthOfSubstring; j++) {
                subArray[j] = charArray[j + i];
            }
            int j = 0;
            while (j < subArray.length) {
                if (ignoreCase){
                    if (!String.valueOf(subArray[j]).equalsIgnoreCase(String.valueOf(subStringCharArray[j]))) {
                        break;
                    }
                } else if (!String.valueOf(subArray[j]).equalsIgnoreCase(String
                        .valueOf(subStringCharArray))) {
                    break;
                }
                j++;
            }
            if (j == subArray.length) {
                return i;
            }
        }
            return -1;
    }
    public static void main(String[] args) {
        MyString s = new MyString("Ehis");
        int value = s.indexOf("Hi", true);
        System.out.println(value);
    }
}
