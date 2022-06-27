package mypkg;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("javaでFizzBuzz");
		System.out.println("0～100までの整数で3で割り切れる時は「Fizz」、5で割り切れる時は「Buzz」、3と5の公倍数で割り切れる時は「FizzBuzz」と表示します");
		for (int i = 0; i < 101; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if(i % 3 == 0) {
				System.out.println("Fizz");
			} else if(i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

}
