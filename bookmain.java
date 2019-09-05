import java.util.*;
class book
 {
  String name,author;int nop;double price;
  
  book()
    {
     this.name="";
     this.author="";
     this.nop=0;
     this.price=0.0;
    }
    
    
    void get()
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter name , author ,number of pages , price of the book");
     name=sc.next();
     author=sc.next();
     nop=sc.nextInt();
     price=sc.nextInt();
    }
    
    
    void put()
    {
     System.out.println("Name = "+name);
     System.out.println("Author ="+author);
     System.out.println("Number of pages ="+nop);
     System.out.println("Price ="+price);
    }
    
    public String  tostring()
    {
     return(name+""+author+""+Integer.toString(nop)+""+Double.toString(price));
    }
   }//class book
   
   class bookmain
   {
    public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
     int n;
     System.out.println("Enter number of books");
     n=sc.nextInt();
     book b[]=new book[n];
     for(int i=0;i<n;i++)
     {
      
      b[i]=new book();
      b[i].get();
      b[i].put();
      b[i].tostring();
      }//for
     }//main
    }//bookmain
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
