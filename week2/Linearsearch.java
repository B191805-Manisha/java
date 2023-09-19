import java.util.Scanner;
class Linearsearch{
 public static void main(String args[]){
  Scanner s=new Scanner(System.in);
  System.out.println("enter size :");
  int n=s.nextInt();
  System.out.println("enter numbers :");
  int a[]=new int[n];
  for(int i=0;i<n;i++){
  a[i]=s.nextInt();
  }
  System.out.println("enter number to search :");
  int x=s.nextInt();
  int f=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]==x)
    {
     f=1;
      System.out.println(x+" is found at "+i);
    }
  }
  if(f==0)
   System.out.println(x+" is not found");
 }
}
