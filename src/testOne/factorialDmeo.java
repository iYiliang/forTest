package testOne;
import java.util.Scanner;

public class factorialDmeo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("请输入一个“0--20”的自然数：");
			try {
				long num = Long.parseLong(input.nextLine());
				if (num < 0 || num > 20) {
					throw new Exception("输入有误! 请正确输入");
				}
				System.out.println(num + "! = " + factorial(num));
				input.close();
				break;
			} catch (Exception e) {
				System.out.println("输入有误! 请正确输入");
			} finally {
				System.out.println("--------------------------");
			}
		}
	}

	public static long factorial(long num) {
		if (num == 1 || num == 0) {
			return 1;
		}
		return factorial(num - 1) * num;
	}
}
