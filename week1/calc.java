import java.util.Scanner;
class calc{
public static void main(String args[]){
 System.out.println("enter numbers to perform add,sub,mul,div ");
 Scanner s=new Scanner(System.in);
 double a,b,c;
 a=s.nextInt();
 b=s.nextInt();
/* System.out.println("addition = "+(a+b));
 System.out.println("substraction = "+(a-b));
  System.out.println("multiplication = "+(a*b));
   System.out.println("division = "+(a/b));
  System.out.println("square of "+a+"= "+(a*a));  
   System.out.println("square of "+b+"= "+(b*b));  */
   char ch;
  // Scanner sc=new Scanner(System.in);
   System.out.println("enter operation to be perform ");
   ch=s.next().charAt(0);
   switch(ch){
   case '+':
    System.out.println("addition = "+(a+b));
    break;
   case '-':
    System.out.println("substraction = "+(a-b));
    break;
   case '*':
    System.out.println("multiplication = "+(a*b));
    break;
   case '/':
   System.out.println("division = "+(a/b));
   break;
   }
}
}
