package day;

public class day {
       public  static void main(String[] args) {
    	   Cat c=new Cat();
           c.setName("¹í¹í");
           int a=c.add(1);
           int d=c.add(1,2);
           System.out.println(d);
        		   c.move();
       
          float h=c.add(1f,2f);
          System.out.println(h);
         
      
       Thread t1=new thread1();
       Thread t2=new thread2();
       Runnable r=new Thread3();
       Thread t3=new Thread(r);
       t1.start();
       t2.start();
       t3.start();
       
       }
}
