package ice4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Rishabh
 */
public class Ice4 {
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        System.out.println("Enter a string ");
        String w= n.nextLine();
        checkforchar(w);
        /***********************/
        compares();
        /************************/
        Scanner wrd= new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sen= wrd.nextLine();
        System.out.print("Enter the word to be searched for (case sensitive): ");
        String word= wrd.nextLine();
        checkword(sen, word);
    }
    public static void checkforchar(String w){
        
        int count=0;
        for (int i = 0; i < w.length(); i++) {
            if(w.charAt(i)== 'b'){
                count++;
            }
        }
        System.out.println("No. of occurence= "+ count);
    }
    public static void compares(){
        char[] s= new char[]{'a', 'b', 'c', 'd', 'e'};
        char greater= 'a';
        for (int i = 0; i < s.length; i++) {
            if(s[i]>greater){
                greater=s[i];
            }
        }
        System.out.println("Biggest character is "+ greater);
    }
    public static void checkword(String sen, String word){
        boolean verify = false;
        if(sen.contains(word)){
            verify= true;
            System.out.println("Word exists in the sentence");
        }
        else{
            verify=false;
            System.out.println("Word does not exist in the sentence");
        }
    }
}
