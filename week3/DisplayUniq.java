

import java.util.ArrayList;

import java.util.Scanner;

public class DisplayUniq
{
   public static void main(String[] args) 
   {
     Scanner in = new Scanner(System.in);
     ArrayList <Integer> list=new ArrayList<Integer>();
     int num;
      System.out.print("Enter an integer between 10 and 100:"); 
     for (int i = 0; i < 5; ++i) 
     {
        num = in.nextInt();
        if (!list.contains(num))
         {
           list.add(num);
           for(int j=0;j<=i;j++)
           System.out.print(list.get(j)+" ");      
           System.out.println();
          }
      }
    for (int i = 0; i < list.size(); i++)
    {
      System.out.println("Unique Value " + (i+1) + " is " + list.get(i));
     }
  }

}


/*class is
{
  boolean isT(int a[],int n)
  {
    int f=0;
    if(a[n]<=100 && a[n]>=10)
    {
      for(int i=0;i<n;i++)
       {
         if(a[i]==a[n])
          {
             f=1;
             break;
          }
       }
       if(f==0)
        return true;
        else
        return false;
    }
    else
     return false;
  }
  void displayU(int a[],int n)
  {
    for(int i=0;i<=n;i++)
    {  int f=0;
       for(int j=i+1;j<=n;j++)
       {
         if(a[i]==a[j])
          {f=1;
          break;}
       }
       if(f==0)
       System.out.print(a[i]+" ");
    }
  }
}



class DisplayUniq
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int u[]=new int[5];
    is t=new is();
    System.out.println("enter numbers between 10 and 100\n");
    for(int i=0;i<5;i++)
     {
       u[i]=s.nextInt();
       if(t.isT(u,i))
       {
        //for(int j=0;j<=i;j++)
        //System.out.print(u[j]+" ");
        t.displayU(u,i);
       }
       else
       {  
         System.out.print("duplicate\n");
         t.displayU(u,i);
       }
    }
  } 
}*/
























