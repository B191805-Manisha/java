import java.util.Scanner;
class primefactor{
public static void main(String args[]){
System.out.println("enter number ");
int a,f;
Scanner s=new Scanner(System.in);
a=s.nextInt();
System.out.println(" prime factors ");
for(int i=2;i<=a;i++)
{
  if(a%i==0)
  { f=0;
    for(int x=2;x<i;x++)
    {
      if(i%x==0&&i!=x)
       {f=1;
       break;
       }
    }
    if(f==0)
    System.out.println(i+" ");
  }
}

}
}
