
package sorting;

import java.util.Arrays;


public class Insertion__AshiqBro {
  
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {11, 55, 44, 22, 33, 441, 1, 2, 5, 77, 88};
        selectSort(arr);
        bubbleSort(arr);
        insertSort(arr);
        System.out.println(Arrays.toString(arr));

    }



    public static void selectSort(int[] arr) {
        int d = 0;
        for (int i = 0; i < arr.length; i++) {
            int minIndx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndx] > arr[j]) {
                    minIndx = j;
                }
                d++;
            }
            int temp = arr[minIndx];
            arr[minIndx] = arr[i];
            arr[i] = temp;
        }
        System.out.println(d);
    }




    public static void bubbleSort(int[] arr) {
        int d = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean check = true;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    check = false;
                }
                d++;
            }

            if (check) {
                break;
            }

        }
        System.out.println(d);
    }




    public static void insertSort(int[] arr) {
        int d = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
                d++;
                System.out.println(Arrays.toString(arr));
            }
        }
        System.out.println(d);
    }

    
}
