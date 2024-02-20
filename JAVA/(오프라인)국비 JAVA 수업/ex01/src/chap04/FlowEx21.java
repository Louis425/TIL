package chap04;

class FlowEx21 {
	
	// i랑 j랑 같을 때 출력해라
	// i랑 j랑 다를때는 5칸 띄워라
	
	public static void main(String[] args) { 
		for(int i=1;i<=5;i++) { 
			for(int j=1;j<=5;j++) {
				if(i==j) {
					System.out.printf("[%d,%d]", i, j);			
				} else {
					System.out.printf("%5c", ' ');			
				}
			}
			System.out.println();
		}
	}
}
