public class calculator{

    //methods

    //add
    static int addition(int x, int y){
        return x+y;
    }

    //sub
    static int subtraction(int x, int y){
        return x-y;
    }

    //multiply
    static int multiply(int x, int y){
        return x*y;
    }

    //divide
    static int divide(int x , int y ){
        return x/y;
    }

    public static void main(String args[]){
    int a = addition(1,1);
    int b =  subtraction(5,2);
    int c =    multiply(2,2);
    int d = divide(10, 5);

    //multidimensional array

    int [][] array={{a,b},{c,d}};
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.println(array[i][j]);
            }
        }


    // int array[]= {a,b,c,d};
    // int i;
    // for(i=0;i<array.length;i++){
    //     System.out.println(array[i]);
    // }

    // for(int i : array){
    //     System.out.println(i);
    // }

    //    System.out.println(a);
    //    System.out.println(b);
    //    System.out.println(c);
    //    System.out.println(d);

    
    }
}