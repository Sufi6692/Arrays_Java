import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int [5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;
        // [23, 45, 233, 543, 3]
//        System.out.println(arr[3]);

        //Input using for loops

        System.out.println("Enter the Numbers : ");
        for(int i = 0; i < arr.length; i++){

            arr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(arr));

//        System.out.println("Display the Numbers : ");
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//
//        }

//        for (int num : arr){ //for every element in array, print the element
//            System.out.println(num + " ");// here num represent element of the array
//        }

//        System.out.println(arr[5]); // Index out of bound error


    }
}
