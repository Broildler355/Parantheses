//"([]"
public class Parenthesis {
    public static boolean isValid(String input) {
        string y = "";
        int x = input.length();
        string z = "";
        while (x>=1) {
            y += input.substring(x,x-1);
            x--;
        }
    }
}
