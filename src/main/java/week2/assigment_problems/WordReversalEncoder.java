import java.util.Scanner;
public class WordReversalEncoder {
 static String reverseEachWord(String sentence) { String[] words=sentence.split(" "); StringBuilder result=new StringBuilder(); for(int i=0;i<words.length;i++){result.append(new StringBuilder(words[i]).reverse());if(i<words.length-1)result.append(" ");}return result.toString(); }
 public static void main(String[] args) { Scanner sc=new Scanner(System.in); System.out.print("Enter a sentence: "); String sentence=sc.nextLine(); System.out.println(reverseEachWord(sentence)); sc.close(); }
}