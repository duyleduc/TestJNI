package main;

public class SquaredWrapper {
	static {
		System.loadLibrary("testjni");
	}
	
	private native int square(int number);
	
	public int to4(int number) {
		return square(number)*square(number);
	}
}
