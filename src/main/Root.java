package main;

public class Root {
	
	static{
		System.loadLibrary("root");
	}
	public static native double root(int number);
}
