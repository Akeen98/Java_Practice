public class Static{
	String x;
	static String y; //static variable

	void meth1(){
	System.out.println("This is not static method "+x);

	}
	static void meth2(){
	System.out.println("This is not static method ");//static method

	}
	public static void main(String[]args){
		y="This is static variable";
		meth2();
	 	Static obj =new Static();
	 	obj.x = "This is not Static method";
	 	obj.meth1();

	}
}