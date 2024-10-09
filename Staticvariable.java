public class Staticvariable
 {
    static int a =20;
    int num= 30;

void show()
{
 //static int b =10;//error
 

    int b =10;
    System.out.println("value of b = "+b);
    int c =a;
    System.out.println("value of static variable c inside show function  = "+c);
} 
   public static void main(String[] args)
    {
        //  static int a =20;  //error

        System.out.println("static variable a : "+a);


        Staticvariable obj = new Staticvariable();
        obj.show();
       // System.out.println("instance variable num = "+num);//error
        System.out.println("instance variable num = "+obj.num); //30



        
    }
}
