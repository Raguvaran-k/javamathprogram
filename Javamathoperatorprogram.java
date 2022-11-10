package Data;

import java.util.Scanner;

public class Javamathoperatorprogram {

	public static void main(String[] args) {
		
//Java Math Operators		
		int a,b;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter two int number");
		 a=sc.nextInt();
		 b=sc.nextInt();

		 System.out.println(" Math.add =" +(a+b));
		 System.out.println(" Math.sub =" +(a-b)); 
		 System.out.println(" Math.mul =" +(a*b)); 
		 System.out.println(" Math.div =" +(a/b)); 
		 System.out.println(" Math.modu =" +(a%b)); 
		 System.out.println("java math precedence="+(a*b-b+a/b));
//Java Integer Math	 
		 System.out.println("Java Integer Math	 ");
	byte x,y;
	System.out.println("enter your two byte number");
	x=sc.nextByte();
	 y=sc.nextByte();
	 System.out.println("math.byte="+(x+y));
	 Short r,v;
	 System.out.println("enter your two short number");
	 r=sc.nextShort();
	 v=sc.nextShort();
	 System.out.println("math.short="+(r*v));
	 Long n,m;
	 System.out.println("enter your two long number");
	 n=sc.nextLong();
	 m=sc.nextLong();
	 System.out.println("math.Long="+(n*m));
	 System.out.println("math.int="+(a/b));
//Java Floating Point Math
	 System.out.println("Java Floating Point Math");
	 float d,k;
	 System.out.println("enter your two floating number");
	 d=sc.nextFloat();
	 k=sc.nextFloat();
	 System.out.println("math.float="+(d*k));
	 double j,l;
	 System.out.println("enter your two double number");
	 j=sc.nextDouble();
	 l=sc.nextDouble();
	 System.out.println("math.double="+(j+l));
//Basic Math Functions 
	 System.out.println("Basic Math Functions ");
	 System.out.println("Math.max ="+Math.max(a, b));
	 System.out.println("Math.min ="+Math.min(a, b));
	System.out.println("Math.abs int ="+Math.abs(a));
     System.out.println("Math.abs int ="+Math.abs(b));
     System.out.println("Math.abs long ="+Math.abs(n));  
     System.out.println("Math.abs long ="+Math.abs(m));  
     System.out.println(Math.abs(Long.MIN_VALUE)); 
     System.out.println("Math.ceil double="+Math.ceil(a+b)); 
     System.out.println("Math.floor double="+Math.floor(a+b));  
     System.out.println("Math.floorDiv int ="+Math.floorDiv(a, b)); 
     System.out.println("Math.round ="+Math.round(a+b));   
    a = (int) Math.random();  
      b = (int) Math.random();     
     System.out.println(a);  
     System.out.println(b);
 //Exponential and Logarithmic Math Functions
     System.out.println("Exponential and Logarithmic Math Functions   ");
     System.out.println("Math.exp="+Math.exp(j+l));  
     System.out.println("Math.log ="+Math.log(j+l));  
     System.out.println("Math.log10 ="+Math.log10(j+l)); 
     System.out.println("Math.pow ="+Math.pow(j, l));  
     System.out.println("Math.sqrt ="+Math.sqrt(j+l));
 //Trigonometric Math Functions
     System.out.println("Trigonometric Math Functions");
     double k1,w;
     System.out.println("enter your two double value");
	 k1=sc.nextDouble();
	 w=sc.nextDouble();
	 System.out.println("math.double="+(k1+w));
     
     System.out.println("enter your double value");
     System.out.println();
      l = Math.toRadians(k1);  
     System.out.println("Math.sin ="+Math.sin(w));
      l = Math.toRadians(k1);  
     System.out.println("Math.cos ="+Math.cos(w));  
     l= Math.toRadians(k1);  
     System.out.println("Math.tan ="+Math.tan(w)); 
     System.out.println("Math.asin ="+Math.asin(k1)); 
     System.out.println("Math.acos ="+Math.acos(w));  
     System.out.println("Math.atan ="+Math.atan(w+k1));  
     double ragu = Math.atan2(j, l);
      System.out.println("Math.atan2 ="+ragu);
      System.out.println("Math.sinh ="+Math.sinh(k1));  
      System.out.println("Math.cosh ="+Math.cosh(k1-w));    
      System.out.println("Math.tanh ="+Math.tanh(k1/w));
      System.out.println("Math.toDegrees ="+Math.toDegrees(k1/w));
      System.out.println("Math.toRadians ="+Math.toRadians(k1+w));
      System.out.println("math.pi="+Math.PI);
}
	
}