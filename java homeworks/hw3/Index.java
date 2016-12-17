public class Index {
   public int passed(int a)
     {
      a = a + 8;
      return a;
     }
  public static void main(String[] args) {
         Index i = new Index();
         int b = 3;
         i.passed(b);
         System.out.println("the value of passed is:" + b);
        System.out.print("the value of passed after manipulaton is:" + i.passed(b));
  }

}