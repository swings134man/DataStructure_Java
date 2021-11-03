package constructorTest;

public class Student {

	//멤버변수(인스턴스변수)
	String name;
	int age;
	
	// 생성자.
	public Student() {
//		super();//부모 호출 Object 생성자. 지워도 자바는 자동으로 해줌.
	} 
	
	// 파라메터 있는 생성자.
	public Student(String name, int age) {
//		super(); // 부모에 있는건 무조건 호출하게 되어있음. 
		// 생략가능, 명시적으로 써준다면 무조건 첫 줄에 써주어야 함.
		this.name = name;
		this.age = age;
	}
	
	public void study() {
		System.out.println("공부하다.");
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	// toString
	
	
}//class
