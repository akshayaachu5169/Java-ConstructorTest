package blocksTest;

public class BlockTest1 {
	
	//static block
	static {
		System.out.println("static block");
	}
	//constructor block
 BlockTest1() {
	System.out.println("constructor block");	

	}
	
 //normal block
 {
	System.out.println("normal block"); 
 }
 //functional block
 
 public static void add() {
	System.out.println("fuctional block"); 
 }
	
public static void main(String[] args) {
	add();
	
	BlockTest1 a = new BlockTest1();
	
}
}
