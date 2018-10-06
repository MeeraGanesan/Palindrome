import java.util.*;
class palindrome
{
    public void main()
    {
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter a string");
        String S=SC.nextLine();
        String S2="";
        int length=S.length();
        for (int i=0;i<length;i++)
        {
          char ch=S.charAt(i);
          S2=ch+S2;
        }

        if (S.equals(S2))
        {
           System.out.println("It is a palyndrome");
        }
        else
        {
            System.out.println("It is not a palyndrome");
        }
    }
}