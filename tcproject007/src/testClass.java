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
		testClass obj = new testClass("Micl", 130);
		System.out.println(obj.getNme() + " " + obj.getAge());
	}
}
