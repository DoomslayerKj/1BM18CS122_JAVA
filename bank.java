import java.util.*;
class account
{   Scanner sc=new Scanner(System.in);
    String name,acc_no,type;
    double balance=0;

}


class curr_act extends account
{ 
 
  void deposit()
  {    
      
       System.out.println(" \nEnter the amount to be deposited \n");
       double amt=sc.nextDouble();
       balance+=amt;
  
}//void deposit_curr_act


void withdraw()
{ System.out.println(" \n Enter amount to withdraw \n");
  double widamt=sc.nextDouble();
  if(widamt>balance)
  {
      System.out.println("\nInsufficient funds\n");
  }
 else if(widamt<balance)
     {   if(balance<100)
         {
             balance-=(0.05*balance);
         }
         balance=balance-widamt;
         System.out.println("\nAmount withdrew-"+widamt);
     }

}//withdraw cuurecnt
void display()
{
    System.out.println("\n Balance ="+balance);
}
}//class curr_act
class sav_acc extends account
{ double ci=0;
  
  void deposit()
  {    
       System.out.println(" \nEnter the amount to be deposited \n");
       double amt=sc.nextDouble();
       balance+=amt;
  }
  void compute(int t)
  {
     
  }
  void withdraw()
{ 
  System.out.println(" \n Enter amount to withdraw \n");
  double widamt=sc.nextDouble();
  if(widamt>balance)
  {
      System.out.println("\nInsufficient funds\n");
  }
 else if(widamt<balance)
     {   
         balance=balance-widamt;
         System.out.println("\nAmount withdrew-"+widamt);
     }

}
void display()
{
    System.out.println("\n Balance ="+balance);
}
}//class sav


class bank
{   
    public static void bankmain(String args[])
    {Scanner sc=new Scanner(System.in);
        int ch1,ch2;
        System.out.println("\nEnter 1 for Saving account and 2 for Current account\n ");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1: sav_acc s=new sav_acc();
                    System.out.println("\nEnter name and Acc no\n");
                    s.name=sc.next();
                    s.acc_no=sc.next();
                    do
                    {
                        System.out.println("Enter 1 to deposit 2 to Wihdraw 3 to Exit");
                         ch1=sc.nextInt();
                        if(ch1==1)
                        {
                            s.deposit();
                        }
                        if(ch1==2)
                        {
                            s.withdraw();
                        }
                        if(ch1==3)
                        {
                            System.exit(0);
                        }
                        else 
                        {
                            System.out.println("\nWrong choice.\n");
                        }
                    }while(ch1>=1&&ch1<=3);
                    break;

            case 2:   curr_act cr=new curr_act();
                      System.out.println("\nEnter name and Acc no\n");
                      cr.name=sc.next();
                      cr.acc_no=sc.next();  
                      do
                      {
                        System.out.println("Enter 1 to deposit 2 to Wihdraw 3 to Exit");
                         ch2=sc.nextInt();
                        if(ch2==1)
                        {
                            cr.deposit();
                        }
                        if(ch2==2)
                        {
                            cr.withdraw();
                        }
                        if(ch2==3)
                        {
                            System.exit(0);
                        }
                        else 
                        {
                            System.out.println("\nWrong choice.\n");
                        }
                    }while(ch2>=1&&ch2<=3);
                    break;

            default:System.out.println("\n WRONG CHOICE...EXITING \n");System.exit(0);
                }

                      
        }

    }
