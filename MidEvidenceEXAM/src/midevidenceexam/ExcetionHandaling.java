package midevidenceexam;

public class ExcetionHandaling {

    public static void main(String[] args) {


     
        
        try {
            //Caling method
            
            
//            ArrithmaticEXP();
//            StringEXP();
            ArrayEXP();
            
            
        } catch (ArithmeticException a) {
            System.out.println(a);
        } catch (NullPointerException n) {
            System.out.println(n);
        } catch (ArrayIndexOutOfBoundsException arr) {
            System.out.println(arr);
        }
    }

    public static void ArrithmaticEXP() {

        int x = 5;
        int y = 0;
        int result = x / y;
        System.out.println("Arrithmatic Exceptions;  " + result);

    }

    public static void StringEXP() {

        String a = null;
        System.out.println("The length of a String  " + a.length());

    }

    ;
    
    public static void ArrayEXP() {

        int[] a = {2, 5, 4, 8, 7};
        System.out.println("Arrray Calling;  " + a[9]);

    }
;

}
