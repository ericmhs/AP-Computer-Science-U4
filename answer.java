
/**
 * Write a description of class answer here.
 *
 * @author Eric Shen
 * @version Oct 23
 */
public class answer
{   
    //QUESTION--------1---------QUESTION----------1------------QUESTION----------
    public static boolean Palindrome(String str) {
        str=str.toLowerCase();
        if (str.length()<3) return false;
        String f="";
        String b="";
        int len = str.length()-1;
        String nonLetters = ",.:;()[]{}!?@#$%^&*";
        for(int i=0;i<str.length();i++){
            String letter = str.substring(i,i+1);
            String letterB = str.substring(len,len+1);
            if(!nonLetters.contains(letter)) {
                f += letter;
            }
            if(!nonLetters.contains(letterB)) {
                b += letterB;
            }
            len--;
            //System.out.println(f);
            //System.out.println(b);
        }
        if(f.equals(b)) return true;
        return false;
    }
    //QUESTION--------2---------QUESTION----------2------------QUESTION----------
    public static void chopSentence(String str) {
        while(str.length()>0) {
            int space = str.indexOf(" ");
            if (space<0) {
                System.out.print(PigLatinTranslator(str));
                str="";
            }else{
                String word = str.substring(0, space);
                System.out.println(PigLatinTranslator(word)+" ");
                str = str.substring(space+1);
            }
        }
    }

    public static String PigLatinTranslator(String input) {
        if(input.length()<2)return input;
        String output="";
        output += input.substring(1) + input.charAt(0) + "ay";
        return output;
    }
    //QUESTION--------3---------QUESTION----------3------------QUESTION----------
    public static int StrictlyAscendingNumbers(int min, int max) {
        int count=0;
        for (int i = min; i<max+1;i++) {
            if(check(i)) {
                count++;
                System.out.println(i);
            }
        }
        return count;
    }

    public static boolean check (int num) {
        int lastDigit = num%10;
        num=num/10;
        while(num>0) {
            int nowDigit=num%10;
            if(nowDigit>=lastDigit) return false;
            lastDigit = nowDigit;
            num/=10;
        }
        return true;
    }
    //QUESTION--------4---------QUESTION----------4------------QUESTION----------
    public static void timesTable(int n) {
        for (int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }


}