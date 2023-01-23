package org.example;

import java.util.Objects;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello There!");
    }

	private int k = 0;

	public int getK(){
		return k;
	}

	public void setK(int k){
		if(k < 0)
			throw new IllegalArgumentException();
		this.k =k;
	}

	public static int add (int a, int b){
		return a + b;
	}

	public static boolean odd(int a){
		if (a % 2 ==1){
			return true;
		}
		else
			return false;
	}
}
