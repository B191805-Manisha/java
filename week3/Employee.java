import java.util.*;
//import java.util.Scanner;
class emp
{
  int id,age;
  String name,gender,designation,address;
  double salary;
  emp(int id,int age,String name,String gender,String designation,String address)
 {
    this.id=id;
    this.age=age;
    this.name=name;
    this.gender=gender;
    this.designation=designation;
    this.address=address;
 }
 void idp()
 {
   System.out.println("id : "+id);
   System.out.println("age : "+age);
   System.out.println("name : "+name);
   System.out.println("gender : "+gender);
   System.out.println("designation : "+designation);
   System.out.println("address : "+address);
 }
}

 class Employee
{
  public static void main(String args[])
  {
     emp e[]=new emp[3];
     Scanner sc=new Scanner(System.in);   //CAN TAKE INPUT FROM USER ALSO
      e[0]=new emp(1,23,"manu","f","manager","hyd");
     e[1]=new emp(2,21,"john","m","software engineer","nzb");
      e[2]=new emp(3,27,"sarah","f","hr","hyd");
      System.out.println("enter id : ");
      int I=sc.nextInt();
       for(int i=0;i<3;i++)
        {
          if(e[i].id==I)
          e[i].idp();
        }
  }
}


