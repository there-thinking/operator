package arithmetic;

import java.util.Scanner;


public class Bmi {
	public static void main(String[] args) {
		System.out.println("请输入你的身高：（m）");
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		System.out.println("请输入你的体重：（kg）");
		double b = s.nextDouble();
		Double bmi = b/(a*a);
		System.out.println("BMI值："+bmi);
	}

}
