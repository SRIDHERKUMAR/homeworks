class AccessModifiers
{
  private int a = 20;
  public void access()
  {
    System.out.println("hi");
  }

   protected void module()
  {
    System.out.println("hello");
  }

}

public class Access
{
  public static void main(String args [])
  {
     int a = 30;
     AccessModifiers am = new AccessModifiers();
System.out.println(a);
  }
}