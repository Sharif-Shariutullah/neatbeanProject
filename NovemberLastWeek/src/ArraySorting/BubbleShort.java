package ArraySorting;

public class BubbleShort {
     public int arr[] = {7, 8, 1, 3, 2};

    public static void main(String[] args) {



        BubbleShort.BubbleShor__01();

        BubbleShort.BubbleShor__02();
//
//        BubbleShort.printArray(arr);
    }

    ;
 
     // bubble short no 02
    public static void BubbleShor__01() {
        int arr[] = {7, 8, 1, 3, 2};

        // for loop no 01
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
             
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("    -------------way 01");
    }

    ;
    
   
    
    // bubble short no 02
    public static void BubbleShor__02() {

        int arr[] = {7, 8, 1, 3, 2};

        // for loop no 02  
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                   arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
 for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("    -------------way 02");
    }
    
    
    
    // printing array
   /*
    
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
    }
*/
}
