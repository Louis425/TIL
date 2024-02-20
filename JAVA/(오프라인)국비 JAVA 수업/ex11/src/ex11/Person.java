package ex11;

public class Person {
	
	String name;
	String phone;
	String gender;
	String remark;
	int age;
	
//	public Person() {
//		
//	}
	// 기본 생성자를 선언하게 되면 기본생성자 생략 불가능하다.
	public Person(String name, String phone, String gender, String remark, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.remark = remark;
		this.age = age;
	}
	
	public void initValue(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// java 에서 제공하는 주소값이 아니라 바로 글자 보이게 하는 함수 toString()
//	public String toString() {
//		return "test";
//	}
	
	// 메서드
	// name, phone, gender, remark 설정 하는 메서드
//	public void setPerson(String name, String phone, String gender, String remark) {
//		// this -> 이클립스 안에 있는 변수명 가리키는 예약어
//		this.name = name;
//		this.phone = phone;
//		this.gender = gender;
//		this.remark = remark;
//	}
//	
//	
////	// toString() 메서드
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", phone=" + phone + ", gender=" + gender + ", remark=" + remark + "]";
//	}
////	
////	//생성자
////	//생성자는 생략가능
//	public Person() {
//		super();
//	//	System.out.println("기본생성자");
//		// TODO Auto-generated constructor stub
//	}
	

}
