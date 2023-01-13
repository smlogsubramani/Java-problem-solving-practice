
class outer{
    int x=9;
    class inside{
        int y=10;
    }
}
//mainmethod

public class innerclass {
    public static void main(String args[]){
        outer myobj = new outer();
        System.out.println(myobj.x);
        outer.inside newobj = myobj.new inside();
        System.out.println(newobj.y);
    }
}


