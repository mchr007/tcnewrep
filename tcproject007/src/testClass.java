public class testClass {
	
	private String name;
	private int age;
	
	public testClass(String nameIn, int ageIn){
		name = nameIn;
		age = ageIn;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}

	
	public static void main(String args[]){
		testClass obj = new testClass("Ksenofon", 111);
		System.out.println(obj.getName() + " " + objgetAge());
	}
}
