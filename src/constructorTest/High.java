package constructorTest;

public class High extends Student {

	// 묵시적으로 인스턴스 변수 2개 
	// 일반 메서드 2개 가지고 있음. 
	int hour;
	String location;
	
	// 부모생성자, 자식생성자 같이 생성함. -> 자동완성. 
	public High(String name, int age, int hour, String location) {
		super(name, age); //파라메터있는 부모의 생성자 호출은 생략 불가능.
		// 파라메터있는 부모의 생성자 호출은 명시적으로 해야한다.
		this.hour = hour;
		this.location = location;
	}

	// 부모의 메서드 오버라이드.
	@Override
	public void study() {
		System.out.println("입시공부하다.(오버라이드)");
	}
	
	// 자식클래스 메서드.
	public void nightSelfStudy() {
		System.out.println("야간자율학습.");
	}
	public void go(String location2) {
		System.out.println(location2 + "에 가다.");
	}

	
	//toString
	@Override
	public String toString() {
		return "High [hour=" + hour + ", location=" + location + ", name=" + name + ", age=" + age + "]";
	}
	
	
	

	
	
	
	
	
	
	
} //class
