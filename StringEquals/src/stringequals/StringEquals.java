
package stringequals;

public class StringEquals {

    public static void main(String[] args) {
      String strVar1 = "Andy";
      String strVar2 = "Andy";
      
      if(strVar1 == strVar2 )
      {
      System.out.println("strVar1 and strVar2 are same reference");
      }
      
      else
      {
      System.out.println("strVar1 and strVar2 are different reference");
      }
      
      if(strVar1.equals(strVar2))
      {
       System.out.println("strVar1 and strVar2 are same string");
      }
      
      String strVar3 = new String("Andy");
      String strVar4 = new String("Andy");
      
      if(strVar3==strVar4)
      {
       System.out.println("strVar1 and strVar2 are same reference");
      }
      else
      {
       System.out.println("strVar1 and strVar2 are different reference");
      }
      
      if(strVar3.equals(strVar4))
      {
       System.out.println("strVar1 and strVar2 are same string");
      }
    }
    
}
