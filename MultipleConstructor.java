class MultipleConstructor{
	 int ruppes;

	 MultipleConstructor(){
	 System.out.println("This is a constructor");
	 }
	 MultipleConstructor(int x){
	 	
	 	System.out.println(x);
	 }
	 MultipleConstructor(int x,int y){
	 	
	 	System.out.println(x+ " "+y);
	 }

	 public static void main(String [] args){

	 MultipleConstructor obj = new MultipleConstructor();
	MultipleConstructor obj1 = new MultipleConstructor(10);
	MultipleConstructor obj2 = new MultipleConstructor(10,20);
	 

	 }
}