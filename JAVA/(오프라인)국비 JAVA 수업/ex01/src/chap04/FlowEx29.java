package chap04;

class FlowEx29 {
	public static void main(String[] args) { 
		for(int i=1;i<=100;i++) {
			System.out.printf("i=%d ", i);

			int tmp = i;  // 1

			do {
				if(tmp%10%3==0 && tmp%10!=0) {
					System.out.print("¦");
				}
				tmp = tmp / 10;
				System.out.println("temp : " + tmp);
				
			} while(tmp!=0); 

			System.out.println();
		}
	} 
}
