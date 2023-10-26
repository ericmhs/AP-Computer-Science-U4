import java.util.Scanner;

public class answerDriver
{
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Palindrome: ");
    String str = input.nextLine();
    boolean reponse = answer.Palindrome(str);
    System.out.println(reponse);
    
    System.out.println();
    System.out.println("Pig Latin Translator");
    String str1 = input.nextLine();
    String result = answer.chopSentence(str1);
    System.out.println(result);
    }   
}
