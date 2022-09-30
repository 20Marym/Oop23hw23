import java.util.Scanner;

public class Ex6_h6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter any word ");
        String word = in.next();
        for (int i= word.length()-1; i>=0;i-- );{
            System.out.print(word.charAt(1));
        }
    }
}