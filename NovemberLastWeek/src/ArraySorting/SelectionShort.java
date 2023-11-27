package ArraySorting;

public class SelectionShort {

    public static void main(String[] args) {
        int arr[] = {7, 8, 1, 3, 2};

        // for loop no 01
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        };
        
        
        
//        array printing by loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        
        
        
        //        array printing by METHOD

        
//        printArray(arr);
    }

    
    
    
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
    }

}
