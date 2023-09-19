import java.util.Scanner;
class declare5{
 public static void main(String args[]){
  int min=100000,max=0;
  int a[]=new int[] {2,5,6,3,1};
  for(int i=0;i<a.length;i++)
  {
    if(min>a[i])
     min=a[i];
    if(max<a[i])
     max=a[i]; 
  }
  System.out.println("largest is = "+max+"\n smallest is = "+min);
 }
}
