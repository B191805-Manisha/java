import java.util.*;

class Matrixadd{
 
  public static void main(String args[]){
      
      Scanner s=new Scanner(System.in);
      int n1,n2,m1,m2;
      System.out.println("enter sizes of 1st matrices ");
      n1=s.nextInt();
      m1=s.nextInt();
      int a[][]=new int[n1][m1];
        int sum[][]=new int[n1][m1];
        System.out.println("enter matrix numbers : ");
         for(int i=0;i<n1;i++){
          for(int j=0;j<m1;j++){
            a[i][j]=s.nextInt();
            }
           } 
       System.out.println("enter sizes of 2nd matrices ");
      n2=s.nextInt();
      m2=s.nextInt();
        int b[][]=new int[n2][m2];
     System.out.println("enter matrix numbers : ");
        for(int i=0;i<n2;i++){
         for(int j=0;j<m2;j++){
         b[i][j]=s.nextInt();
         }
        } 
     if(n1==n2 && m1==m2)
     {
       for(int i=0;i<n1;i++){
         for(int j=0;j<m1;j++){
           sum[i][j]=a[i][j]+b[i][j];
         }
       }
      System.out.println("\tadded matrix  \n ");  
       for(int i=0;i<n1;i++){
         for(int j=0;j<m1;j++){
           System.out.print(sum[i][j]+"\t");  
           }
         System.out.println();    
     } 
     }
    else
     System.out.println("size is not same ");
  }

}
