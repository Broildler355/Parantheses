public class Parenthesis {
    //Fouad Kadry
    //11/12/25
    //This is a program that determines if all parenthesis types are properly closed based on an input
    //The input must be a string made entirely of the following characters: (){}[]
    public static void isValid(String input) {
        String y = "";
        int x = input.length();
        String z = input;
        //This will make a reverse string of the input known as y
        //we will use the reverse to ensure we search for the last and closing parenthesis values
        while (x>=1) {
            y += input.substring(x-1,x);
            x--;
        }
        //This following code will use the input and the reverse to search through and ensure they are completed
        for (int a = 0; a<1;a--) {
            //This check ensures the code ends if it runs out of pairs
            if (z.length() == 0||z.length()==1) {
                a=3;
            }
            //This will check for the () values and make sure they are closed, and it goes through by removing pairs of them
            else if (z.substring(0,1).equals("(")) {
                if (y.indexOf(")")>=0) {
                    z = z.substring(0, z.length()-(y.indexOf(")")+1)) + z.substring(z.length()-(y.indexOf(")")));
                    y = y.substring(0,y.indexOf(")")) + y.substring(y.indexOf(")")+1);
                    z = z.substring(1);
                    y = y.substring(0, y.length()-1);
                }
                //This ensures that if the pair doesn't exist the code will still work and invalidate it
                else {
                    a=3;
                }
            }
                        //This will check for the [] values and make sure they are closed, and it goes through by removing pairs of them
            else if (z.substring(0,1).equals("[")) {
                if (y.indexOf("]")>=0) {
                    z = z.substring(0, z.length()-(y.indexOf("]")+1)) + z.substring(z.length()-(y.indexOf("]")));
                    y = y.substring(0,y.indexOf("]")) + y.substring(y.indexOf("]")+1);
                    z = z.substring(1);
                    y = y.substring(0, y.length()-1);
                }
                //This ensures that if the pair doesn't exist the code will still work and invalidate it
                else {
                    a=3;
                }
            }
           //This will check for the {} values and make sure they are closed, and it goes through by removing pairs of them
            else if (z.substring(0,1).equals("{")) {
                if (y.indexOf("}")>=0) {
                    z = z.substring(0, z.length()-(y.indexOf("}")+1)) + z.substring(z.length()-(y.indexOf("}")));
                    y = y.substring(0,y.indexOf("}")) + y.substring(y.indexOf("}")+1);
                    z = z.substring(1);
                    y = y.substring(0, y.length()-1);
                }
                //This ensures that if the pair doesn't exist the code will still work and invalidate it
                else {
                    a=3;
                }
            }
            //This ensures that if we end up on a closing value we can just invalidate it and continue
            else {
                a = 3;
            }
        }
        //This checks if we removed all the pairs and if we did it validates it, otherwise it invalidates it
        if (z.length()==0) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
    public static void main(String[] args) {
    isValid("({{]})");
    isValid("[({)}]");
    isValid("[{()}]");
    isValid("[)({)]}");
    }
}
