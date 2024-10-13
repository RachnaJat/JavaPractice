public class Twodiffclassforstaticm 
{

    static void display()
    {
System.out.println("display method ");
     // show();// error
     Two.show(); // in diff. class 
     play(); //  in same class
    }

 static void play()
{
    System.out.println("play method");
}
    public static void main(String[] args) 
    {    
      //show(); //error
     // Two.show();
      display();
    }
    
}

class Two
{

   static void show()
    {

        System.out.println("show method");
    }
}

/*  if static and main method both are in same class then
    we can directly access static method.


    But if static method and main method both are in diff 
    class then we cann't  directly access static method
    in this situation static method is called  by a class name
   
  Ek static method uss static method ko call kr rhi ho jo dusri class m h to 
  usko call krne k liye  class name ka use krenge

  yadi dono static methods same class m ho to directly method name likh k call kr skte h
 */