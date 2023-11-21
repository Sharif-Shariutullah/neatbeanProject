/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author B-5
 */
public class Inheritance08nov {

    public static void main(String[] args) {
        //outer loop   

        for (int i = 1; i <= 4; i++) {
          
            //inner loop  
            for (int j = 1; j <= 3; j++)
            {
                if (i == 2 && j == 2) {
//                    //using break statement inside the inner loop  
//                    break;
                    
continue;
                }
                System.out.println(i + " " + j); 

//            System.out.println(" result of       I   -----" + i);  
//            
//            System.out.println(" result of       j                 -----" + j);


        }
    }
}
}
