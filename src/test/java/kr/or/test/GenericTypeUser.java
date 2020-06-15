package kr.or.test;

import java.util.HashMap;
import java.util.Map;

//제네릭 타입 클래스 생성
class Container<T>{
	private T t;
	public void set(T t){
		this.t = t;
	}
	public T get() {
		return t;
	}
}
class ContainerKV<K,V>{
	private K key;
	private V value;
	
	public void set(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}

public class GenericTypeUser {
	public static void main(String[] args) {
		ContainerKV<String,String> containerKV1 = 
				new ContainerKV<String,String>();
		containerKV1.set("name","홍길동");
		String nameKey = containerKV1.getKey();
		String nameValue = containerKV1.getValue(); 
		System.out.println("입력된 ContainerKV변수의 키: "+ nameKey);
		System.out.println("입력된 ContainerKV변수의 값: "+ nameValue);
		
		Map<String,String> tableKV = new HashMap<String, String>();
		tableKV.put("userid", "user02");
		tableKV.put("userpw", "1234");
		tableKV.put("username", "가로쉬");
		System.out.println("----------------------");
		System.out.println("아이디는:[" + tableKV.get("userid") + "]입니다.");
		System.out.println("암호는:[" + tableKV.get("userpw") + "]입니다.");
		System.out.println("이름은:[" + tableKV.get("username") + "]입니다.");
		System.out.println("----------------------");
/*		Map<String,Integer> ageKV = new HashMap<String, Integer>();
		ageKV.put("age",3);
		System.out.println("나이는:[" + ageKV.get("age") + "]세 입니다.");*/
		
				
		Container<String> container01 = new Container<String>();
		container01.set("홍길동");//container01 t변수: String 홍길동
		String str = container01.get();
		
		Container<Integer> container02 = new Container<Integer>();
		container02.set(6);//container02 변수: tInteger(정수형) 6
		int age = container02.get();
		System.out.println("이름은:[" + str + "]님 입니다.");
		System.out.println("나이는:[" + age + "]세 입니다.");
	}

}
