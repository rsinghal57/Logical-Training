package com.training.oop;

/**
 * 
 * @author rohit.singhal <br>
 *         This is a Singleton class.
 */
public class SingletonExample {
	private static SingletonExample instance = null;
	private int uid;

	private SingletonExample() {

	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public static SingletonExample getInstance() {
		if (instance == null) {
			instance = new SingletonExample();
		}
		return instance;
	}

}
