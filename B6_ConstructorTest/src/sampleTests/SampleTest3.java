package sampleTests;

public class SampleTest3 {
public static int i;
public static int j;
public static String a;

//constructor
public SampleTest3(int i, int j, String a) {
	this.i=i;
	this.j=j;
	this.a=a;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k =i+j;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println("--------------");
		//object creation
		
		SampleTest3 b = new SampleTest3(50, 60, "Akshaya");
		
		int x= i+j;
		System.out.println(i);
		System.out.println(j);
		System.out.println(x);
		System.out.println(a);
		
	}

}
