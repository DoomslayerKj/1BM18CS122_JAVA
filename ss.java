import java.util.*;
abstract class shape
{
    
    
  
   
}
class rect extends shape
{   int b;

    void printarea(int p,int r)
    { int a=p,b=r;
      System.out.println("AREA OF RECTANGLE="+(a*b)); 
    }
}
class tri extends shape
{ int tt;

  void printarea(int t,int ts)
  { int tt=t;int a=ts;
    System.out.println("AREA OF triangle="+(a*tt*0.5));
  }
}

class circle extends shape
{
 void printarea(int rr)
 { int a=rr;
    System.out.println("AREA OF circle="+(3.142*a
    *a));
 }
}
class ss
{
    public static void main(String args[])
    {   Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter 1 for Rectangle 2 for Triangle 3 for Circle , Anthing else for Exit!!\n");
        int ch=sc.nextInt();
        
        switch(ch)
        {
         case 1:   System.out.println("ENTER TWO VALUES :\n");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    
                    rect r1=new rect();
                    r1.printarea(a,b);
                    break;
         case 2:   System.out.println("Enter Two values: \n");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    
                    tri t1=new tri();
                    t1.printarea(a,b);
                    break;
        case 3:    System.out.println("Enter radius: \n");
                   a=sc.nextInt();
                   
                   circle c1=new circle();
                   c1.printarea(a);break;
        default:   System.out.println("EXiting... \n");System.exit(0);
                   
        }
        
    }
}