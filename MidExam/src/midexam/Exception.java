/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midexam;

/**
 *
 * @author B-5
 */
public class Exception {

    public static void main(String[] args) {

        try {

            
            
            
            
            mathArr();
            stringNull();
            normalArray();

            
            
            
        } catch (ArithmeticException e) {
            System.out.println("  math  " + e);

        } catch (NullPointerException e) {
            System.out.println("  text  " + e);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("  array  " + e);

        } finally {
            System.out.println("Continue Execution");

        }
    }

    ;
        
    
        public static void mathArr() {
        int x = 10;
        int y = 0;
        int result = x / y;

        System.out.println("Division result--------" + result);
    }

    public static void normalArray() {
        int[] d = {2, 5, 1, 15, 25};

        System.out.println("Division result--------" + d[8]);

    }

    public static void stringNull() {
        String n = null;

        System.out.println("Division result--------" + n.length());

    }
}
