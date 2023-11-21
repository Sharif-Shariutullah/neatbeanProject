/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midexam;

import java.util.ArrayList;

/**
 *
 * @author B-5
 */
public class ArrayListinForEach {



   
    public static void main(String[] args) {
        ArrayList<String> intArr = new ArrayList<String>();
        intArr.add("abc@gmail.com");
        intArr.add("xyzgmail.com");
        intArr.add("sharif@gamil.com");
        intArr.add("aaaa@gmailcom");
        intArr.add("AAAACCCCC@addf.com");
        intArr.add("ASDad@gmailcom");
        intArr.add("Addfodfasd");
        intArr.add("sharif.sah@gmail.com");
        intArr.add("accc@gmail.com");

        for (String email : intArr) {
            if (email.contains("@") && email.contains(".")) {
                System.out.println("True---------" + email);
            } else {
                System.out.println("False--" + email);
            }
        }
    }
}
 

