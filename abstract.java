import java.util.Scanner;
abstract class dog
{
    

    public void bark()
    {
        System.out.println("BARK!");
    }
    public abstract void poop();
}
class chihuahua extends dog
{
   public void poop()
   {
    System.out.println("DOG POOPED");
   }
}
public class abstract
{
    public static void main(String args[])
    chihuahua c=new chihuahua();
    c.bark();
   c.poop();
}