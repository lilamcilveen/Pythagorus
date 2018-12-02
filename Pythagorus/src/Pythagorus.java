import java.util.Scanner;
import java.lang.Math;

public class Pythagorus {

    /* Purpose : determine if a,b,c form a Pythagorean Triple*
     *            where c is the hypotenuse                  *
     * Input   : a,b,c are each non-negative integers        *
     * Output  : output true if c^2 = a^2 + b^2              *
     *           output false if not                         */

    public static boolean isPythagorusInt(int a, int b, int c) {
        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
            return true;
        return false;
    }


    /* Purpose : determine if a,b,c satisfy Pythagorus' Theorem up to epsilon    *
     *           where c is the hypotenuse                                       *
     * Input   : a,b,c are each non-negative doubles                             *
     *           epsilon is a non-negative doubles                               *
     * Output  : - outputs true if a,b,c satisfy Pyhtagorus' Theorem             *
     *             up to the given epsilon                                       *
     *           - outputs false if not                                          */
    public static boolean isPythagorusDouble(double a, double b, double c, double epsilon) {
        double absValue = Math.abs(Math.pow(c, 2) - (Math.pow(a, 2) + Math.pow(b, 2)));
        if (absValue < epsilon)
            return true;
        return false;
    }


    public static void main(String[] args) {

        String userChoice;
        //System.out.print("Enter int, float, or quit : ");


        while (true) {
            System.out.print("Enter int, float, or quit : ");
            Scanner sc = new Scanner(System.in);
            userChoice = sc.nextLine();
            if (userChoice.equals("int")) {
                System.out.print("Enter triple: ");
                String input = sc.nextLine();
                String noSpaces = input.replace(" ", "");    //Removes blank space, if it exists in user input

                int a = Integer.parseInt(noSpaces.split(",")[0]);
                int b = Integer.parseInt(noSpaces.split(",")[1]);
                int c = Integer.parseInt(noSpaces.split(",")[2]);

                boolean output = isPythagorusInt(a, b, c);
                System.out.println(output);


            } else if (userChoice.equals("float")) {
                System.out.print("Enter triple: ");
                String input = sc.nextLine();
                String noSpaces = input.replace(" ", "");
                double a = Double.parseDouble(noSpaces.split(",")[0]);
                double b = Double.parseDouble(noSpaces.split(",")[1]);
                double c = Double.parseDouble(noSpaces.split(",")[2]);
                double ep = Double.parseDouble(noSpaces.split(",")[3]);
                boolean output = isPythagorusDouble(a, b, c, ep);
                System.out.println(output);
            } else if (userChoice.equals("quit")) {
                System.out.println("good-bye");
                break;
            } else {
                System.out.println("Invalid input");
            }

        }
    }
}
