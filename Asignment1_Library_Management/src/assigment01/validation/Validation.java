/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment01.validation;
import java.util.Scanner;
/**
 *
 * @author nghin
 */
public class Validation {
    private final static Scanner sc = new Scanner(System.in);

    public static int getInputInteger(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                int result = Integer.parseInt(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input integer");
            }
        }
    }

    public static double getInputDouble(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                double price = Double.parseDouble(sc.nextLine());
                return price;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
            }
        }

    }

    public static String getString(String msg) {
        String result;
        while (true) {

            System.out.print(msg);
            result = sc.nextLine();
            if (!result.trim().isEmpty()) {
                break;
            } else {
                System.err.println("String must not emty");
            }

        }
        return result;
    }

    public static int getIntLimit(String msg, int min, int max) {
        while (true) {
            int result = getInputInteger(msg);
            if (result >= min && result <= max) {
                return result;
            } else {
                System.err.println("Must be input in range[" + min + ", " + max + "]");
            }
        }
    }

    public static int getPostiveInt(String msg) {
        while (true) {
            int result = getInputInteger(msg);
            if (result < 0) {
                System.out.println("Must be input postive Integer");
            } else {
                return result;
            }
        }

    }

    public static double getPrice(String msg) {
        while (true) {
            double result = getInputDouble(msg);
            if (result > 0) {
                return result;
            }else{
                System.out.println("Must be input postive Number");
            }
        }
    }
}
