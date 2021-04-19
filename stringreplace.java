import java.util.Scanner;
public class StringReplace{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the source term:");
String source = sc.nextLine();
System.out.println("enter the replace term:");
String replace = sc.nextLine();
String result = source.replace(source,replace);
System.out.println("result="+result);
sc.close();
}
}
