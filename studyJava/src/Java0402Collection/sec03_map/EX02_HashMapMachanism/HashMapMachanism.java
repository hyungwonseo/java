package Java0402Collection.sec03_map.EX02_HashMapMachanism;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class A {
	int data;
	public A(int data) {
		this.data = data;
	}
}

class B {
	int data;
	public B(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof B) {
			this.data = ((B)obj).data;
			return true;
		}
		return false;
	}
}

class C {
	int data;
	public C(int data) {
		this.data = data;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C) {
			this.data = ((C)obj).data;
			return true;
		}
		return false;
	}	
	@Override
	public int hashCode() {		
		return Objects.hash(data);		
	}
}

public class HashMapMachanism {
	public static void main(String[] args) {
		
		//#1. 어떤것도 오버라이딩 하지 않음
		Map<A, String> hashMap1 = new HashMap<>();
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1==a2); //false
		System.out.println(a1.equals(a2)); //false
		System.out.println(a1.hashCode() + ", " + a2.hashCode());
		hashMap1.put(a1, "첫번째");
		hashMap1.put(a2, "두번째");
		System.out.println(hashMap1.size()); //2
		System.out.println();
		
		
		//#2. equals 메서드만 오버라이딩
		Map<B, String> hashMap2 = new HashMap<>();
		B b1 = new B(3);
		B b2 = new B(3);
		System.out.println(b1==b2); //false
		System.out.println(b1.equals(b2)); //true
		System.out.println(b1.hashCode() + ", " + b2.hashCode());
		hashMap2.put(b1, "첫번째");
		hashMap2.put(b2, "두번째");
		System.out.println(hashMap2.size()); //2
		System.out.println();
		
		//#2. equals + hashCode 메서드 오버라이딩
		Map<C, String> hashMap3 = new HashMap<>();
		C c1 = new C(3);
		C c2 = new C(3);
		System.out.println(c1==c2); //false
		System.out.println(c1.equals(c2)); //true
		System.out.println(c1.hashCode() + ", " + c2.hashCode());
		hashMap3.put(c1, "첫번째");
		hashMap3.put(c2, "두번째");
		System.out.println(hashMap3.size()); //1
		
	}
}
