package sampleTests;

public class SampleTest2 {
public static int i;
public static int j;
public static String a;

public SampleTest2() {
	i=10;
	j=20;
	 a ="vcentry";
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int k =i+j;
System.out.println(k);//default value
System.out.println(a);
System.out.println("-------------");
//object creation
SampleTest2 b = new SampleTest2();
int z =i+j;
System.out.println(a);
System.out.println(i);
System.out.println(j);
System.out.println(z);




	}

}
