package com.kh.operator;

public class Exam_Comparision {
	public static void main(String [] args ) {
		System.out.println("�񱳿����� ����");
		//�񱳿����ڴ� : �� ���� ���ϴ� ������, ���迬����
		//�񱳿����ڴ� ������ �����ϸ� true, �ƴϸ� false�� ��ȯ��
		
		int a = 50;
		int b = 30;
		boolean result = a < b;
		System.out.println("( a < b )�� ��� :" +result);
		result = a > b;
		System.out.println("( a > b )�� ��� :" +result);
		result = a == b; // a : 30, b : 30 -> true  (== <-����)
		System.out.println("( a == b )�� ��� :" +result);
		result = a != b; // a : 30, b : 50 -> true  (!= <-�����ʴ�)
		System.out.println("( a != b )�� ��� :" +result);
		
		//¦�� Ȧ�� �Ǻ� ���α׷�
		
		int num = 2;
		result = (num / 2 == 1); 
		System.out.println("¦���ΰ�? : " +result);
	}
	
}
