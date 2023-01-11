public class recursion {
    static int addingofnumbers(int p){
        if(p>0){
            return p+ addingofnumbers(p-1) ;
        }
        else{
            return 0;
        }
    }

    static int manualaddtion(){
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int i;
        int sum = 0;
            for( i=0; i<a.length;i++){
                 sum = sum + a[i]; 
                 
    }
             return sum;
}

        public static void main(String args[]){
        int result = addingofnumbers(10);
        System.out.println(result);
        System.out.println(manualaddtion());

        }
   
}

