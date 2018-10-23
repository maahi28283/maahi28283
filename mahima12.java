public class paindrome{
public static void main(String args[]){
int num=121, reverse = 0, original ,remainder;
original = num;
while(num !=0){
remainder = num % 10;
reverse = reverse * 10 + remainder;
num /= 10;
}
if(original == reverse)
System.out.println(num + " is a paindrome");
else 
System.out.println(num + " is not a palindrome");
}
}
