package basics_neetcode;

public class dynamicArrayMain {

	public static void main(String[] args) {
		dynamicArrayDesign dArray = new dynamicArrayDesign(5);
		dArray.pushback(10);
		int k = dArray.getCapacity();
		System.out.println(k);		
		//dArray.popback();
		dArray.pushback(20);
		dArray.pushback(30);
		dArray.pushback(40);
		dArray.pushback(50);
		int n = dArray.getSize();
		System.out.println(n);
		dArray.pushback(60); //should resize()
		k=dArray.getCapacity();
		System.out.println(k);
		int j= dArray.get(2);
		System.out.println(j);
		dArray.set(100, 23);
	}
}
