class Student{
	private String name;int age;String clas;int rollno;
	Student(String n,int a,String c,int r){
		name=n;
		age=a;
		clas=c;
		rollno=r;
	}
	public void get(){
	System.out.println("student name is "+name);
	System.out.println("student name is "+age);
	System.out.println("student class is "+clas);
	System.out.println("student rollno is "+rollno);
	}
	
}
class Task4{
	public static void main(String[] args) {
		Student s1=new Student("Adeel",19,"first year",140);
		s1.get();
	}
}