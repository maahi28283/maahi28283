public class leap
{
    public static void main(String args[])
    {
        int year=2016;
        if(((year%4==0) && (year % 100!=0)) || (year%400==0))
        System.out.println(year +" yes,  leap year");
        else
        System.out.println(year + " no,not a leap year");
    }
}
