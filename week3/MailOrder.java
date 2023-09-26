
import java.util.Scanner;

class Pro
{
  int id;
  double qty,price;
  Pro(int id,double qty,double price)
  {
     this.id=id;
     this.qty=qty;
     this.price=price;
  }
 void show()
  {
    System.out.println("id : "+id+"\nprice : "+price+"\nqty : "+qty);
  }
  double getPrice()
  {
    return (price*qty);
  }
}

class MailOrder
{
  public static void main(String args[])
  {
    Pro p[]=new Pro[5];
    Scanner s=new Scanner(System.in);
    p[0]=new Pro(1,2,99.90);
    p[1]=new Pro(2,3,20.20);
    p[2]=new Pro(3,5,6.87);
    p[3]=new Pro(4,1,45.50);
    p[4]=new Pro(5,2,40.49);
    System.out.println("enter your choice 1 to 5 products");
    int I=s.nextInt();
    switch(I)
    {
      case 1:
         p[I-1].show();
         break;
      case 2:
         p[I-1].show();
         break;
      case 3:
         p[I-1].show();
         break;
      case 4:
         p[I-1].show();
         break; 
      case 5:
         p[I-1].show();
         break; 
    }
    double k=0;
    for(int i=0;i<5;i++)
    k=k+p[i].getPrice();
    
    System.out.println("total retail price of all sold products = "+k);
    
  }
}




