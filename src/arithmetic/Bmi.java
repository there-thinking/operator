package arithmetic;

import java.util.Scanner;


public class Bmi {
	public static void main(String[] args) {
		System.out.println("�����������ߣ���m��");
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		System.out.println("������������أ���kg��");
		double b = s.nextDouble();
		Double bmi = b/(a*a);
		System.out.println("BMIֵ��"+bmi);
	}

}
