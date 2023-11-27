/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nov25.test;

/**
 *
 * @author B-5
 */
public class MCQTest {

    int a;
    int b;

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

class Output {

    public static void main(String args[]) {
        Test obj = new Test();
        int a = 10;
        int b = 20;
        obj.meth(a, b);
        System.out.println(a + " " + b);
    }

}
