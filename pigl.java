import java.util.*;
class pigl
{
 public static void main(String args[])
  { Scanner sc=new Scanner(System.in);
   String str1,str2="",str3;
   System.out.println("Enter A word");
   str1=sc.nextLine();
   str1=str1.toLowerCase();
   int n=str1.length();
   for(int i=0;i<n;i++)
   { char c=str1.charAt(i);
     if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
     {
      str2=str2+str1.substring(i,n)+str1.substring(0,i)+"ay";
     break;}
    }
    System.out.println("Pig LaTin WoRd = "+str2);
    }//main
    }//class
