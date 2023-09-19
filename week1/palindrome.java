import java.util.Scanner;
class palindrome{
 public static void main(String args[]){
  System.out.println("enter number ");
  int x,sum=0,rem;
  Scanner s=new Scanner(System.in);
  x=s.nextInt();
  int y=x;
  while(x>0)
  {
   rem=x%10;
   x=x/10;
   sum=sum*10+rem;
  }
  if(sum==y)
  System.out.println("palindrome");
  else
  System.out.println("not palindrome");
 }
}
