public class Parenthesis {
    public static void isValid(String input) {
        String y = "";
        int x = input.length();
        String z = input;
        while (x>=1) {
            y += input.substring(x-1,x);
            x--;
        }
        for (int a = 0; a<1;a--) {
            if (z.length() == 0||z.length()==1) {
                a=3;
            }
            else if (z.substring(0,1).equals("(")) {
                if (y.indexOf(")")>=0) {
                    z = z.substring(0, z.length()-(y.indexOf(")")+1)) + z.substring(z.length()-(y.indexOf(")")));
                    y = y.substring(0,y.indexOf(")")) + y.substring(y.indexOf(")")+1);
                    z = z.substring(1);
                    y = y.substring(0, y.length()-1);
                }
                else {
                    a=3;
                }
            }
            else if (z.substring(0,1).equals("[")) {
                if (y.indexOf("]")>=0) {
                    z = z.substring(0, z.length()-(y.indexOf("]")+1)) + z.substring(z.length()-(y.indexOf("]")));
                    y = y.substring(0,y.indexOf("]")) + y.substring(y.indexOf("]")+1);
                    z = z.substring(1);
                    y = y.substring(0, y.length()-1);
                }
                else {
                    a=3;
                }
            }
            else if (z.substring(0,1).equals("{")) {
                if (y.indexOf("}")>=0) {
                    z = z.substring(0, z.length()-(y.indexOf("}")+1)) + z.substring(z.length()-(y.indexOf("}")));
                    y = y.substring(0,y.indexOf("}")) + y.substring(y.indexOf("}")+1);
                    z = z.substring(1);
                    y = y.substring(0, y.length()-1);
                }
                else {
                    a=3;
                }
            }
        }
        if (z.length()==0) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
    public static void main(String[] args) {
    isValid("({{]})");
    }
}
