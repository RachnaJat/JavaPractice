public class Staticmethodcallsonlystaticmethod
 {
    static void show()
    {
        System.out.println("show method");
        //  play();//error
        play2();
    }
    //void play() 
    static void play2()
    {
        System.out.println("play method");
    }
    public static void main(String[] args) 
    {
         show();
        
    }
    
}

// A static method can call only other static method and cannot call a non- static method 


// non static method can call both the methods static as well as non-static method.