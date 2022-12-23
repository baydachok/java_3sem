import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        Pattern pattern = Pattern.compile("\\s");
        String[] splitted = pattern.split(text);
        System.out.println(Arrays.toString(splitted));
    }
}
