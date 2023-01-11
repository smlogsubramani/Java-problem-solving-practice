public class methodoverloading {
    static int test(int x, int y){
        return x+y;
    }

    static double test(double x, double y){
        return x+y;
    }

    public static void main(String args[]){
        int try1 = test(1,2);
        double try2 = test(1.1,2.2);
        System.out.println(try1);
        System.out.println(try2);
    }
}