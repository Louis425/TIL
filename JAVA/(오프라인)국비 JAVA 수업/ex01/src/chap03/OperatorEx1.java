package chap03;

class OperatorEx1 {
	public static void main(String args[]) {
		int i=5;
		i++;	// i=i+1와 같음. 후위증가
		System.out.println(i);

		i=5;		 
		++i;	// 선위증가
		System.out.println(i);
	}
}
