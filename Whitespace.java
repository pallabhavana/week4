public class Whitespace{
public static void main(String args[]){
String sentance = "i am a angel.";
System.out.println("original sentance:"+sentance);
sentance = sentance.replaceAll("\\s"," ");
System.out.println("after replacement:"+sentance);
}
}

