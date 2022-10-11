public class NewPhone extends OldPhone{ //child class of old phone
	String name;

	void browseInternet(){
	System.out.println("This is New phone Browse Internet method");
	}
	public static void main(String[] args){
		NewPhone obj1 = new NewPhone();
		obj1.browseInternet();
		obj1.call();


	}

}