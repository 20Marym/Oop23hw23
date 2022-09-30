import java.util.Scanner;
public class Ex5_h6{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String:");
        String vowels = "bcdfghjklmnpqrstvwxyz";
        String text = scan.nextLine();
        text = text.toLowerCase();
        String newText = "";
        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if (vowels.indexOf(c) == -1){
                newText += c;
            }
        }
        System.out.println(newText);
    }
}

