import java.util.Scanner;
// import java.util.ArrayList;
public class ascending {

  

    public static void main(String args[]){
        //returing an array
        Scanner sc = new Scanner(System.in);
        int totalnumber = sc.nextInt();
        System.out.println("Enter the elements in the array");
        int[] listofinteger = new int[totalnumber];
        for(int i=0;i<totalnumber;i++){            
                listofinteger[i] =sc.nextInt();
        }
        System.out.println("the elements entered are");
        for(int i=0;i<totalnumber;i++){            
            System.out.println(listofinteger[i]);
        }


        //ascending order logic
        
        int temp = 0;
        int i,j;
        for( i=0;i<totalnumber;i++){
            for(j=i+1;j<totalnumber;j++){
                if(listofinteger[i]>listofinteger[j]){
                     temp = listofinteger[i];
                    listofinteger[i] =listofinteger[j];
                    listofinteger[j] =temp;
                }
            }
            
        }
            System.out.println("Result in ascending order");
            for( i=0;i<totalnumber;i++){
            System.out.println(listofinteger[i]);
        }
    }
}


// static array

// public class ascending{
//     static int length;
 
    // public static void printArray(int[] array)
    // {
    
    //     for (int i = 0; i < length; i++) {
    //         System.out.print(array[i] + " ");
    //     }
    // }
//     public static void main(String args[]){
//         int temp = 0;
//         int[] array = new int[] {5,2,3,9,4};
//          length = array.length;
//         for(int i=0;i<length;i++){
//             for(int j=i+1;j<length;j++){
//                 if (array[i] > array[j]) {
//                     temp = array[i];
//                     array[i] = array[j];
//                     array[j] = temp;
//                 }
//             }
//         }
//         for(int i=0;i<length;i++){
//             System.out.print(array[i]);
//         }
//     }
// }
