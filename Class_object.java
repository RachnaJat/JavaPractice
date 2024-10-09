public class Class_object //class
 {
    int a =20;        // instance variable
    static int  b=30; //static variable 

    public static void main(String[] args)
     {
         int c=40;  //local variable

       Class_object obj= new Class_object(); //object 
        System.out.println("instance variable a = "+obj.a);
        System.out.println("static variable b = "+b);
        System.out.println("local variable c = "+c);
    }

    
}
