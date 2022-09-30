import java.util.Scanner;
public class Ex1_h6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter any word ");
        String word = in.next();
        for (int i=10; i> word.length(); i++);
        {
            System.out.println(word.charAt(1));
    }
}}