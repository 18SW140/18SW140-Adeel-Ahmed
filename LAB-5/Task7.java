import java.io.*; 
 class Test 
{ 
    public static void main(String args[]) 
    {
    System.out.println("student1");
    String Str = new String("Adeel,18,BE-Software;Aisha,19,BE-Electronics");  
    String st[]=Str.split(";") ;
    st[0]="Adeel,18,BE-Software";
    st[1]="Aisha,18,BE-Electronics";
    String st1[]=st[0].split(",");
    String st2[]=st[1].split(",");
    System.out.println("name:"+st1[0]);
    System.out.println("Age"+st1[1]);
      System.out.println("program:"+st1[2]);
      System.out.println();
      System.out.println("Student2");
System.out.println("Name:"+st2[0]);
    System.out.println("Age:"+st2[1]);
      System.out.println("Program:"+st2[2]);


} 
} 