public class Phone{
	String name;


	void call(){
	System.out.print("Your Phone is" +name);
	}


	public static void main(String[]args){
	Phone obj = new Phone();
	obj.name = "Samsung";
	obj.call();
	}
}