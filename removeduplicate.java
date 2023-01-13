import java.util.Scanner;
public class removeduplicate {

    public static void main(String args[]){
        //Declaring the length of the array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int len = sc.nextInt();
        System.out.println("the number of elements present in the array is =" + len);

        //enter the elements of the array
        // int [] array1 = new int[len];
        int[] array = new int[len];
        System.out.println("Enter the array of elements");
        for(int i=0;i<len;i++){
            array[i] =sc.nextInt();
        }
         System.out.println("After No Duplicates");
        for(int i=0;i<len;i++){
            int a=1;
            for(int j=0;j<len;j++){
                if(array[i]==array[j]){
                    a--;
                }
            }
            if(a==0){
                System.out.println(array[i]);
            }
        }
        }
    }