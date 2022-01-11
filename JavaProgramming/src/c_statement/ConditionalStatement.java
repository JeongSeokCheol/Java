package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * 조건문
		 * - if문
		 * - switch문
		 * 
		 * if문
		 * - if(조건식){} : 조건식의 결과가 true이면 블럭안의 문장을 수행한다.
		 * - else if(조건식){} : 다수의 조건이 필요할때 if 뒤에 추가한다.
		 * - else{} : 조건식 이외의 경우를 위해 추가한다.
		 */
		
		int a = 2;
		
		if(a == 1) {
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}
		
		if(a == 1) {
			System.out.println("a == 1");
		}else if(a == 2) {
			System.out.println("a == 2");
		}else if(a == 3) {
			System.out.println("a == 3");
		}else {
			System.out.println("else");
		}
		
		if(a < 10) {
			System.out.println("a가 10보다 작다.");
		}else if(a < 20) {
			System.out.println("a가 20보다 작다.");
		}
		
		//점수가 60점이상이면 합격 그렇지 않으면불합격
		int score = 70;
		
		if(60 <= score) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
		
		//점수에 등급을 부여
		score = 80;
		String grade = null; //null: 참조형 탑입의 기본값
		                     //기본값 : 내가 저장하지 않았을때 자동으로 저장되는 값
		                     //기본형 타입은 기본값이 0
		                     //boolean : false
		
		if(90 <= score && score <= 100) {
			grade = "A";
		}
		else if(80 <= score && score < 90) {
			grade = "B";
		}
		else if(70 <= score) {
			grade = "C";
		}
		else if(60 <= score) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		System.out.println(score + " : " + grade);
		
		score = 90;
		grade = null;
		//ctrl + shift + f
		if (90 <= score && score <= 100) {
			grade = "A";
			if (97 <= score) {
				grade += "+";
			} else if (score <= 93) {
				grade += "-";
			}
		} else if (80 <= score) {
			grade = "B";
			if (87 <= score) {
				grade += "+";
			} else if (score <= 83) {
				grade += "-";
			}
		} else if (70 <= score) {
			grade = "C";
			if (77 <= score) {
				grade += "+";
			} else if (score <= 73) {
				grade += "-";
			}
		} else if (60 <= score) {
			grade = "D";
			if (67 <= score) {
				grade += "+";
			} else if (score <= 63) {
				grade += "-";
			}

		} else {
			grade = "F";
		}
		System.out.println(score + " : " + grade);
		
		/*
		 * switch문
		 * - switch(int/Strin){case 1: break;}
		 * - 조건식의 결과는 정수와 문자열만 (JDK1.7부터 문자열 허용)허용한다.
		 * - 조건식과 일치하는 case문 이후 문장을 수행한다.
		 */
		
		a = 10;

		switch (a) {
		case 10:
			System.out.println("a == 10");
			break;
		case 20:
			System.out.println("a == 20");
			break;
		default:
			System.out.println("default");
		}
		
		//월에 해당하는 계절을 출력
		int month = 1;
		String season = null;
		switch (month) {
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		}
		System.out.println(month + "월은" +season);
		
		switch(score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		}
		System.out.println(score + " : " + grade);
		
		//숫자를 입력받아 그 숫자가 0인지 0이 아닌지를 출력해 주세요.
		Scanner s = new Scanner(System.in);
		
//		System.out.print("숫자를 입력하세요> ");
//		int zero =  Integer.parseInt(s.nextLine());
//		
//		if(zero == 0) {
//			System.out.println("0입니다.");
//		}
//		else {
//			System.out.println("0이 아닙니다.");
//		}
		
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
//		System.out.print("숫자를 입력하세요> ");
//		int num =  Integer.parseInt(s.nextLine());
//		if(num % 2 == 0) {
//			System.out.println("짝수입니다.");
//		}
//		else if(num % 2 == 1 ) {
//			System.out.println("홀수 입니다.");
//		}
		//점수 3개를입력받아 합계, 평균, 등급을 출려해주세요
//		System.out.print("첫번쨰 점수를 입력하세요> ");
//		int num1 =  Integer.parseInt(s.nextLine());
//		System.out.print("두번쨰 점수를 입력하세요> ");
//		int num2 =  Integer.parseInt(s.nextLine());
//		System.out.print("세번쨰 점수를 입력하세요> ");
//		int num3 =  Integer.parseInt(s.nextLine());
//		
//		int sum  = num1 + num2 + num3;
//		double avr =  Math.round(sum / 3.0 * 10) / 10.0;
//		String grd = null;
//		
//		if(90 <= avr && avr <=100) {
//			grd = "A";
//			if(97 <= avr ) {
//				grd += "+";
//			}
//			else if(avr <= 93) {
//				grd += "-";
//			}
//		}
//		else if(80 <= avr) {
//			grd = "B";
//			if(87 <= avr ) {
//				grd += "+";
//			}
//			else if(avr <= 83) {
//				grd += "-";
//			}
//		}
//		else if(70 <= avr) {
//			grd = "C";
//			if(77 <= avr ) {
//				grd += "+";
//			}
//			else if(avr <= 73) {
//				grd += "-";
//			}
//		}
//		else if(60 <= avr) {
//			grd = "D";
//			if(67 <= avr ) {
//				grd += "+";
//			}
//			else if(avr <= 63) {
//				grd += "-";
//			}
//		}
//		else {
//			grd = "f";
//		}
//		System.out.println("합계: " + sum + "\n평균: " + avr + "\n등급: " +grd );
		
		//1~100 사이의 랜덤한 수를 3개 발생시키고 오름차순으로 출력해주세요.
		int num1 = (int)(Math.random()*100)+1;
		int num2 = (int)(Math.random()*100)+1;
		int num3 = (int)(Math.random()*100)+1;
		
		if(num1 > num2 && num1 > num3 && num2 > num3) {
			System.out.println("1. " + num3 + "\n2. "+ num2 + "\n3. " + num1);
		}
		else if(num1 > num2 && num1 > num3 && num2 < num3) {
			System.out.println("1. " + num2 + "\n2. "+ num3 + "\n3. " + num1);
		}
		else if(num1 < num2 && num1 > num3 && num2 > num3) {
			System.out.println("1. " + num3 + "\n2. "+ num1 + "\n3. " + num2);
		}
		else if(num1 < num2 && num1 < num3 && num2 > num3) {
			System.out.println("1. " + num1 + "\n2. "+ num3 + "\n3. " + num2);
		}
		else if(num1 > num2 && num1 < num3 && num2 < num3) {
			System.out.println("1. " + num2 + "\n2. "+ num1 + "\n3. " + num3);
		}
		else if(num1 < num2 && num1 < num3 && num2 < num3) {
			System.out.println("1. " + num1 + "\n2. "+ num2 + "\n3. " + num3);
		}
		
		
		if(num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num1 > num3) {
			int temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if(num2 > num3) {
			int temp = num2;
			num2 = num3;
			num3 = temp;
		}
		System.out.println("1. " + num1 + "\n2. "+ num2 + "\n3. " + num3);
		
	  }
	}














