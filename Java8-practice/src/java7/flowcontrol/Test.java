package java7.flowcontrol;

public class Test {
	public static void main(String[] args) {
	/*
		int i =0;
		for(System.out.println("are you sleeping !!!"); i< 3 ; i++) {
			System.out.println("No Boss you only sleeping");
		}
	*/
	/*
		final int a=10, b=20;
		for(int i=0; a<b;i++) {
			System.out.println("hello");
		}
		//System.out.println("Hi");   //unreachable statement
		 
	*/
		l1:
			for(int i=0;i<3;i++) {
				for(int j=0; j<3 ; j++) {
					if(i == j) {
						break;
					}
					System.out.println(i +"  .... "+ j);
				}
			}
	}

}
