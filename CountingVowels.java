import java.util.*;
public class CountingVowels
{
public static void main(String args[]){
System.out.println("enter the sentance");
Scanner sc = new Scanner(System.in);
String sentance = sc.nextLine();
int i,count=0;
for(i=0;i<sentance.length();i++){
char ch = sentance.charAt(i);
if(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch =='u'){
count++;
}
}
System.out.println("no of vowels in the given word is=" +count);
}
}