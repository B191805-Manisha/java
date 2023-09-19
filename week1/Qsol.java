import java.util.Scanner;
import static java.lang.Math.*;
class Qsol{
 public static void main(String args[]){
  System.out.println("enter a,b,c value");
  Scanner s=new Scanner(System.in);
  int a,b,c;
  a=s.nextInt();
  b=s.nextInt();
  c=s.nextInt();
  double d,r;
  d=(b*b)-(4*a*c);
  r=-b/(2*a);
  if(d>0)
  {
  double x=r+(sqrt(abs(d))/2*a);
  double y=r-(sqrt(abs(d))/2*a);
  System.out.println("roots are distinct "+x+" "+y);
 }
 else if(d==0)
 {
  System.out.println("roots are real and equal "+r);
 }
 else
 {
 System.out.println("roots are imaginary "+r+"+i and "+r+"-i");
 
 }
 }
 }
 
