package com.test.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

enum Singleton {
	INSTANCE;
}
/*class Singleton {

	public static Singleton soleInstance = null;
	
	private Singleton() {
		System.out.println("Object created....");
	}
	
	public static Singleton getInstance() {
		if(soleInstance == null) {
			synchronized (Singleton.class) {
				if(soleInstance == null) {
					soleInstance = new Singleton();
				}
			}
		}
		return soleInstance;
		//return Holder.INSTANCE;
	}
	
	static class Holder {
		static final Singleton INSTANCE = new Singleton();
	}

}*/

public class SingletonTest {
	
	public static void main(String args[]) throws Exception {
		
		/*Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());*/
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(SingletonTest::useSingleTon);
		service.submit(SingletonTest::useSingleTon);
		service.shutdown();
		
		
		
		/*Class clazz = Class.forName("com.test.singleton.Singleton");
		Constructor<Singleton> ctor = clazz.getDeclaredConstructor();
		ctor.setAccessible(true);
		Singleton s3 = ctor.newInstance();
		
		System.out.println(s3.hashCode());*/
		
	}
	
	static void useSingleTon() {
		Singleton singleton = Singleton.INSTANCE;
		System.out.println(singleton.hashCode());
	}
	
}
