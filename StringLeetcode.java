import java.util.ArrayList;
import java.util.List;

public class StringLeetcode {

// Q.3110   You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.
//
//    Return the score of s.

//    public static void main(String[] args) {
//        String s= "zaz";
//        int score=0;
//        for (int i = 1; i < s.length(); i++) {
//
//            int dif= (int) s.charAt(i-1)-(int) s.charAt(i);
//            if(dif<0){
//                dif= -dif;
//            }
//            score += dif;
//
//        }
//        System.out.println(score);
//
//    }
//    Q.2000 . Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
//
//    For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
//    Return the resulting string.
//public static void main(String[] args) {
//    String word= "abcdefd";
//    char ch='d';
//
//    int chindex=word.indexOf(ch)+1;
//    for (int i = 0; i < chindex/2; i++) {
//
//        char first= word.charAt(i);
//        char last= word.charAt(chindex-i-1);
//        char[] wordArray = word.toCharArray();
//
//        char temp = first;
//        wordArray[i]= last;
//        wordArray[chindex-1-i]= temp;
//        word = String.valueOf(wordArray);
//    }
//    System.out.println(word);
//}
//    Q.771 .You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
//
//    Letters are case sensitive, so "a" is considered a different type of stone from "A".

//    public static void main(String[] args) {
//        String jewels= "aA";
//        String stones ="aAAbbbb";
//        int c=0;
//
//        for(char ch: stones.toCharArray()){
//            if(jewels.indexOf(ch)>=0){
//                c++;
//            }
//        }
//        System.out.println(c);
//    }
//      Q.2942. Find Words Containing Character
//You are given a 0-indexed array of strings words and a character x.
//
//    Return an array of indices representing the words that contain the character x.
//
//    Note that the returned array may be in any order.

//    public static void main(String[] args) {
//        String [] word= {"abc","bcd","aaaa","cbc"};
//        char x='a';
//
//
//        List<Integer> l= new ArrayList<Integer>();
//
//        for (int i = 0; i < word.length ; i++) {
//            if(word[i].indexOf(x)!=-1){
//                l.add(i);
//            }
//
//        }
//        System.out.println(l);
//    }

}
