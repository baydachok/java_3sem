import java.util.Scanner;
import java.util.regex.Pattern;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        System.out.println(Pattern.matches( "^(0[1-9]|[12]\\d|3[01])/([0][1-9]|1[0-2])/((?:1[9]|[2-9]\\d)\\d{2})$", text));
    }
}
