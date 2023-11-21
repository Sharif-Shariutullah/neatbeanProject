
package tuesday25;


public class array {

    public static void main(String[] args) {
        
        double[] myList = {10.3, 20.4, 41.41, 00.9, 11.13};
       
        double max = myList[0];
        int indexOfMax = 0;
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
                indexOfMax = i;
            }
        }

    }
;


//    public static double MaxMin(double[] myList, String val) {
//
//        double output = myList[0];
//        if (val.toUpperCase().equals("MIN")) {
//            for (int i = 1; i < myList.length; i++) {
//                if (output > myList[i]) {
//                    output = myList[i];
//
//                    return output;
//                }
//            }
//            else{
//            for (int i = 1; i < myList.length; i++) {
//                if (output > myList[i]) {
//                    output = myList[i];
//
//                    return output;
//                }
//            }
//        }
//        }
};
