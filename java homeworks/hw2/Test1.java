class Test1
{
  int x = 10;
    double y = 20.0;
    byte b = 'a';

  public static void main(String [] args)
  {

    char c = 2;
    short s = 21;
    float f = 3424.65f;

     int week = 7;
     String day;
     switch(week)
     {
      case 1:day = "sunday";
      break;
      case 2:day = "Monday";
      break;
      case 3:day =  "tuesday";
      break;
      case 4:day = "wednesday";
      break;
      case 5:day =  "thursday";
      break;
      case 6:day =  "Friday";
      break;
      case 7:day = "saturday";
      break;
      default:day =  "sunday";
      break;

     }
     System.out.println(day);

     System.out.println ("start loop:");
            for (int n = 0; n < 7; ++n)
            {
                System.out.println ("in loop: " + n);
                if (n == 2) {
                   System.out.println ("skip the loop by continue");
                    continue;

                }
                System.out.println ("Reached first loop");
                if (n == 3) {
                    break;
                }
                System.out.println ("Reached second loop");

            }
System.out.println ("Break the loop by  break");

  }
}