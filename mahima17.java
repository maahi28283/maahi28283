public class armstrong{
public static void main(String args[]){
  int num=371, rem, n=0,result=0,original;
  original=num;
 while(num>0)   {
     rem=original % 10;
     num=num/10;
     result += Math.pow(rem,n);
    }
    if(original==result)
    System.out.println(original + " is a armstrong");
    
    else
    System.out.println(original + " is not a armstrong");

}
}
