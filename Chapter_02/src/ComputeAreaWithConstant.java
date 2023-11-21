/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B-5
 */
public class ComputeAreaWithConstant {

    public static void main(String args[]) {
//   try{  
//      //code that may raise exception  
//      int data=100/0;  
//   }catch(ArithmeticException e){System.out.println(e);}  
        //rest code of the program   
//   System.out.println("rest of the code...");  

//        try {
//            int data = 100/0;
//        } catch (Exception e) {
//            System.out.println( e);        }
//        
//         System.out.println("rest of the code...");  
        try {
            int a[] = new int[5];
            a[10] = 30 ;
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (AssertionError e) {
                        System.out.println(e);

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }

}
}
