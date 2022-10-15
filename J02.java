import java.lang.Math;
class J02
{
   public static void main(String[] args)
   {
      J02 obj = new J02();
      obj.add2Num();
   }

   public void add2Num()
   {
      double x = 20;
      double y = 3;
      double z; 
      z = x + y;
      System.out.println("Addition: " + z); 
      z = x - y;
      System.out.println("Sub: " + z); 
      z = x * y;
      System.out.println("Mul: " +z); 
      z = x / y;
      System.out.println("Div: " +z); 
      z = x % y;
      System.out.println("Remainder: " +z); 
      z = Math.pow(x, y);
      System.out.println("Power: " +z); 
   }
}