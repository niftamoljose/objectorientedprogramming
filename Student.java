import java.util.Scanner;
public class Student
{
public static void main(String[] args)
{
int n,percentage,total=0;
Scanner s=new Scanner(System.in);
System.out.print("enter the number of subjects:");
n=s.nextInt();
int marks[]=new int[n];
System.out.println("enter the marks:");
for(int i=0;i<n;i++)
{
marks[i]=s.nextInt();
total=total+marks[i];
}
percentage=total/n;
System.out.println("total:" +total);
System.out.println("percentage:" +percentage);
}
}
