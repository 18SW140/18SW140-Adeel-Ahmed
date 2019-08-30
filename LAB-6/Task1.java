class Author{
	private String name;private String email;private char gender;
	public Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public String getname(){
		return name;
	}
	public void setemail(String email){
		this.email=email;
	}
	public String getemail(){
		return email;
	}

	public char getgender(){
		return gender;
	}
	public void tostring(){
		System.out.println("Author[name="+name+",email="+email+",gender="+gender+"]");
	}
}
class Task1{
	public static void main(String[] args) {
		Author a=new Author("Adeel","adeelahmedabbasi22@gmail.com",'m');
		a.setemail("sheeraz2gmail.com");
		a.getname();
		a.setemail("adeelahmedabbasi22@gmail.com");
		System.out.println( a.getemail());
		a.getgender();
		a.tostring();
	}
}