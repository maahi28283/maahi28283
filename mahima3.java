public class voco
{
    public static void main(String args[])
    {
        char ch = '4';
        
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'   ||   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        System.out.println(ch + "is vowel");
        else if((ch>='a' && ch<='z') || (ch>='A'&&ch<='Z'))
        System.out.println(ch + "is consonant");
        else
        System.out.println("invalid");
    }
}
