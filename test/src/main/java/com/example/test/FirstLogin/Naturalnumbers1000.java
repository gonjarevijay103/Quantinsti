package com.example.test.FirstLogin;

public class Naturalnumbers1000 {

	public static void main(String[] args) {

		System.out.println("The sum of the Common Factors : " + getCommonFactorSum());

	}

	private static int getCommonFactorSum() 
	{
		int sum = 0;
		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0  || i % 5 == 0) {
				sum += i;
				System.out.println(i);

			}

		}
		return sum;
	}
}
