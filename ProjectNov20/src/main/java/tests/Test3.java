package tests;

public class Test3 {

	static String str = "ab";

	public static void main(String[] args) {
		str = "steve";
		//System.out.println(str);
		display();
	}

	public static void display() {
		System.out.println("Display value: "+str);
	}

}
