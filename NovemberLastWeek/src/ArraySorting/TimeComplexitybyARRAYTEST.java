package ArraySorting;

public class TimeComplexitybyARRAYTEST {

    public static void main(String[] args) {
        int arr[] = {7, 8, 1, 3, 2};
        ArrayPara(arr, 1);
    }

    public static void ArrayPara(int arr[], int id) {
        boolean status = false;

        for (int i : arr) {
            if (i == id) {
                System.out.println(" \" " + i + " \" " + " it's available");
                status = true;
                break;
            }

//            else{
//                System.out.println(" not found ");}
        } 
        if (!status) {
            System.out.println("not found");
        }
        }

    }
