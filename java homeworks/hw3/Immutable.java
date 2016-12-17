class Immutable
{
public static void main(String args[])
{
  String s = "hello";
  s.concat("classes");
  System.out.println(s);
  String s2 = s.concat("World");
  System.out.println(s2);
}
}