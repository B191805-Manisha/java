import java.util.*;

class Binarysearch{
  void sort(int a[],int n){
   for(int i=0;i<n;i++)
   {
     for(int j=0;j<n-i-1;j++)
     {
       if(a[j+1]<a[j])
       {
         int t=a[j];
         a[j]=a[j+1];
         a[j+1]=t;
       }
     }
   }
   }
  int bino(int a[],int f,int l,int x){
  while(f<=l&&l<=a.length)
  {
    int m=(l+f)/2;
      if(a[m]<x)
       return bino(a,m+1,l,x); 
    else  if(a[m]==x)
       return m+1;
      else
         return bino(a,0,m-1,x);
   }
    return -1;
  } 
  public static void main(String args[]){
   Scanner s=new Scanner(System.in);
   System.out.println("enter size of list  ");
   int n=s.nextInt();
   int a[]=new int[n];
   System.out.println("enter numbers : ");
   for(int i=0;i<n;i++)
   {
     a[i]=s.nextInt();
   }
  Binarysearch bs=new Binarysearch();
  bs.sort(a,n);
   System.out.println("enter number to search :");
  int x=s.nextInt();
  int p=bs.bino(a,0,n-1,x);
  if(p==-1)
  System.out.println("element not found ");
  else
   System.out.println("element found at "+p);
  }
}
