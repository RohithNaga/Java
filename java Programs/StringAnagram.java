package practisePrograms;
import java.util.*;
///anagram is
public class StringAnagram {
    static void isAnagram(String s1, String s2) {
        String str1 = s1.replaceAll("\\s", "");
        String str2 = s2.replaceAll("\\s", "");
        boolean status = true;
        if(str1.length() != str2.length()) {
            status = false;
        } else {
            char[] arrays1 = str1.toLowerCase().toCharArray();                                 
            char[] arrays2 = str2.toLowerCase().toCharArray();
            Arrays.sort(arrays1);
            Arrays.sort(arrays2);
            status = Arrays.equals(arrays1, arrays2);
        }
        if(status) {
            System.out.println("the Strings " + str1 + " and " + str2 + " are anagrams");
        }  else {
            System.out.println("the strings " + str1 + " and " + str2 + " are not anagrams");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        isAnagram(s1, s2);

    }
}
