//child class
class priya{
    void tell(){
        System.out.println("hi loga");
    }
}
class vaish extends priya{
    void speak(){
        System.out.println("hi kaushik");
    }
}

class last extends vaish{
    void close(){
        System.out.println("bye bye");
    }
}

//main class and method
public class polymorphism extends last {
    public static void main(String args[]){
        //polymorphism
        polymorphism myobj = new polymorphism();
        myobj.close();
        myobj.speak();
        myobj.tell();
    }
}
