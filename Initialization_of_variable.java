public class Initialization_of_variable
 {

      static int s;
      int a;
       public static void main(String[] args) 
       {
        Initialization_of_variable obj = new Initialization_of_variable();
           
   
        //not mendatory to initialize the instance variable : it gives default value according to datatypes
   
               System.out.println("Instance variable a : "+obj.a);  // 0
   
               System.out.println("instance variable s = "+s); //0   :not mendatory to intialize the static variable
   
              // int num;
              // System.out.println("local variable"+num);// error   : mendatory to initialize the local variable
   
           
       }
       

    }
    

