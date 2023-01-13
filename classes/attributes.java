public class attributes {
    int x;
    int y = 10; // attribute
    final int z = 20;  //final keyword is used when the value of an attribute is final and cannot be changed
    public static void main(String args[]){
        attributes myobj = new attributes();
        System.out.println(myobj.y);
        myobj.x = 5; //declaring through obj
        System.out.println(myobj.x);
        System.out.println(myobj.z);
    }
}
