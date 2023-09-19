import java.util.Scanner;
//import java.lang.*;
class Sort{
void ss(int a[],int n){  //method
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
   for(int i=0;i<n;i++)
   {
     System.out.println(a[i]);
   }
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
   System.out.println("sorted array : ");
  Sort so=new Sort();
  so.ss(a,n);
  for(int i=0;i<n;i++)
   {
     System.out.println(a[i]);
   }
 }
 }
 
 
