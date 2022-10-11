class Constructor{
	 String name;

	 Constructor(){
	 name = "Constructor";
	 System.out.println("This is a constructor");
	 }

	 public void meth(){
	 System.out.println("This is a normal method");
	 }

	 public static void main(String [] args){

	 Constructor obj = new Constructor();
	 obj.meth();
	 System.out.println(obj.name);

	 }
}