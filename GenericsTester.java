import java.io.*;
public class GenericsTester {
    public static void main(String[] args) {
       Box<Integer, String> box = new Box<Integer, String>();
       Integer a=(int)10.5;
       box.add(a,"Hello World");
       System.out.printf("Integer Value :%d\n", box.getFirst());
       System.out.printf("String Value :%s\n", box.getSecond());
 
       Box<String, String> box1 = new Box<String, String>();
       box1.add("Message","Hello World");
       System.out.printf("String Value :%s\n", box1.getFirst());
       System.out.printf("String Value :%s\n", box1.getSecond());
       Box<Integer,String> b1 =new Box<Integer,String>();
       Integer b=111;
       String str="Hi";
       b1.add(b, str);
       System.out.println("second object values = \n "+b1.getFirst());
       System.out.println(b1.getSecond());
    }
 }
 
 class Box<T, S> {
     T t;
     S s;
 
    
    
     void add(T t, S s) {
       this.t = t;
       this.s = s;
    }
 
     T getFirst() {
       return t;
    } 
 
     S getSecond() {
       return s;
    } 
 }
