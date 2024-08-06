
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* this is for array primitives  */
        //int [] arr = new int [6];

        // input arr-1
        // arr[0] = 23;
        // arr[1] = 24;
        // arr[2] = 27;
        // arr[3] = 235;
        // arr[4] = 45;
        // arr[5] = 67;
        // /* [ 23,24,27,235,45,67]*/ System.out.println(arr[3]);


        // //input arr-2 (input using for loop)
        // System.out.println("enter data in array: ");
        // for(int i=0 ; i<arr.length ; i++){
        //     arr[i] = in.nextInt();
        // }
        /*---------------------------------------INPUT FINISHED---------------------------------------- */

        
        // // ouput arr - 1 using for-loop
        // System.out.print("output of simple for loop: ");
        // for(int i=0 ; i<arr.length ; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();


        // //output arr - 2 (print output in same for loop that is enhanced for loop)
        // System.out.print("output of enhanced for loop: ");
        // for(int num : arr ){
        //     System.out.print(num + " "); // here num represent elemnt of array
        // }
        // System.out.println();


        // // output arr - 3 (using to string method)
        // System.out.println("output of to string method: ");
        // System.out.println(Arrays.toString(arr));
        
        /*------------------------------------------OUTPUT FINISHED----------------------------------------------- */

        /* this is for non primitive array */

        String[] str = new String[4];
        for(int i=0 ; i<str.length ; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
    
}
