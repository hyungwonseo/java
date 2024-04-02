package Java0402Collection.sec02_set.EX02_HashSetMachanism;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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

public class HashSetMachanism {
	public static void main(String[] args) {
		
		//#1. 어떤것도 오버라이딩 하지 않음
		Set<A> hashSet1 = new HashSet<>();
		A a1 = new A(3);
		A a2 = new A(3);
		System.out.println(a1==a2); //false
		System.out.println(a1.equals(a2)); //false
		System.out.println(a1.hashCode() + ", " + a2.hashCode());
		hashSet1.add(a1);
		hashSet1.add(a2);
		System.out.println(hashSet1.size()); //2
		System.out.println();
		
		
		//#2. equals 메서드만 오버라이딩
		Set<B> hashSet2 = new HashSet<>();
		B b1 = new B(3);
		B b2 = new B(3);
		System.out.println(b1==b2); //false
		System.out.println(b1.equals(b2)); //true
		System.out.println(b1.hashCode() + ", " + b2.hashCode());
		hashSet2.add(b1);
		hashSet2.add(b2);
		System.out.println(hashSet2.size()); //2
		System.out.println();
		
		//#2. equals + hashCode 메서드 오버라이딩
		Set<C> hashSet3 = new HashSet<>();
		C c1 = new C(3);
		C c2 = new C(3);
		System.out.println(c1==c2); //false
		System.out.println(c1.equals(c2)); //true
		System.out.println(c1.hashCode() + ", " + c2.hashCode());
		hashSet3.add(c1);
		hashSet3.add(c2);
		System.out.println(hashSet3.size()); //1
		
	}
}
