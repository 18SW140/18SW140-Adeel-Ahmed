import java.util.Scanner;
class Marksheet{
	
	public void get(int sub1,int sub2,int sub3){
		int total=300;
		int obtained=sub1+sub2+sub3;
		int perc=obtained*100/total;
		System.out.println("his total marks is"+(obtained));
		System.out.println("his percentage is "+perc);
		if(perc>80){
			System.out.println("he got A1 grade");
		}
		else if(perc<80 || perc>70){
			System.out.println("he got A grade");
		}
		else if(perc<70 || perc>60){
			System.out.println("he got B grade");
		}
		else if(perc<60 || perc>50){
			System.out.println("he got C grade");
		}
		else if(perc<50 || perc>40){
			System.out.println("he got D grade");
		}
		else if(perc<40){
			System.out.println("Fail");
		}
	}
}
class Task5{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int sub1,sub2,sub3;
	System.out.println("enter marks in sub1");
	sub1=in.nextInt();
	System.out.println("enter marks in sub2");
	sub2=in.nextInt();
	System.out.println("enter marks in sub3");
	sub3=in.nextInt();
	Marksheet m1=new Marksheet();
	m1.get(sub1,sub2,sub3);
	}
}