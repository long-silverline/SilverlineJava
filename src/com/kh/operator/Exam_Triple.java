package com.kh.operator;

import java.util.Scanner;

public class Exam_Triple {
	public static void main(String [] args) {
		/*
		* ���׿�����
		* �׸��� 3��
		* (���ǽ�)? ���� �� : �����϶�
		* if�� ����
		* ture or false
		*
		*
		*
		*
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� �Է� : ");
		int num = sc.nextInt();//��ĳ�� ����� �����ͼ� �����غ�
		//+, -, *, /, %
		//4 / 2 == 2
		//4 % 2 == 0	
		String resultStr;
		resultStr = num % 2 == 0 ? "¦��" : "Ȧ��";
		System.out.println(num + "��/��" + resultStr +"�Դϴ�.");
		
	}

}
