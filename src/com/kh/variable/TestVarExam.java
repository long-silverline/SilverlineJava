package com.kh.variable;

public class TestVarExam {
	public static void main(String[] args) {
		//1. �ڷ����� ������ ����� -> int num, char,moonja,boolean,result,
		//2
		
		int iNum = 100; //����� �ʱ�ȭ�� ���� �ϰ� ����
		long lNum = 9999000000000l;
		float fNum = 486.520f;
		double dNum = 567.890123;
		char fChar = 'A';
		String fStr = "Hello World";
		boolean result = false;
		
		System.out.println("������ �� : "+iNum);
		System.out.println("������ �� (9999��) : "+lNum);
		System.out.println("�Ǽ��� �� : "+fNum);
		System.out.println("�Ǽ��� �� : "+dNum);
		System.out.println("������ �� : "+fChar);
		System.out.println("���ڿ��� �� : "+fStr);
		System.out.println("���� �� : "+result);
		
		System.out.println(1+1);
		System.out.println(1.1+1.1);
		System.out.println('1'+'1');
		System.out.println('1'+'7');
		System.out.println("2"+"1");
		System.out.println("3"+"1");
		
		System.out.println("Hello"+'q'); //Helloq
		System.out.println("Hello"+3.14); //Hello3.14
		System.out.println(10+20+"Hello"); //30Hello
		System.out.println(10+"Hello"+20); //10Hello20
		System.out.println("Hello"+10); //Hello10
		System.out.println(10+"Hello"); //10Hello
		System.out.println(10+(20+"Hello")); //1020Hello
		
		int a = 10;
		int b = 20;
		int c = 30;
				
		System.out.println(a++);
		System.out.println(b=(--a)+b);
		System.out.println(c=(a++)+(--b));
		
		int x = 100;
		int y = 33;
		int z = 0;
		
		System.out.println(x--);
		System.out.println(z = x-- + --y);
		System.out.println(x = 99 + x++ +x);
		System.out.println(y = y-- + y + ++ y);

	}
}