package chap04;

class FlowEx23 {
	public static void main(String[] args) { 
		int i= 5;

		while(i--!=0) {
			System.out.println(i + " - I can do it.");
		}
		
		i =5;
		while(i!=0) {
			System.out.println(i-- + " - I can do it.");
		}
		
		for(int j=5; j!=0; j--) {
			System.out.println(j);
		}
	} 
}
