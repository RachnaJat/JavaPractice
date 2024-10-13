public class Static_method {
    int x= 25;
    static int y=30;
    void show()
    {
    int a =20;
    System.out.println("access of instance variable  inside a non static method x : "+x);
    System.out.println("access of static variable  inside a non static method y : "+y);
    System.out.println("value of local variable a :"+a);
    
    }

    static void show1()
    {
     int b =10;
     System.out.println("static method is called");
    System.out.println("variable of static method b = "+b);
    
    /* 1) A Static method can access only static data.
       2) It cannot access non static data  i.e. instance data
    */ 

    //System.out.println("access of instance variable  inside a static method x : "+x);//error
    System.out.println("access of static variable  inside a static method y : "+y);
    }
    
public static void main(String[] args) 
{
    
    Static_method  obj = new Static_method();
    obj.show();

    // There are 2 ways of calling a static method 


    Static_method.show1();// 1) by using class name
    show1(); // 2) directly called without creating object of a class



}
}
