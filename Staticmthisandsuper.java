public class Staticmthisandsuper 
{
    int i = 10;
   static void diplay()
    {
     // System.out.println(this.i);//error
     // System.out.println(super.i);//error
System.out.println("A static method cannot refers to 'this' and 'super' keyword");
    }  
      public static void main(String[] args)
    {

     diplay();

    }
    
}
//A static method cannot refer to "this" or "super" keyword in anyway