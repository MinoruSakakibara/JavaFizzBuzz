package mypkg;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		System.out.println("java��FizzBuzz");
		System.out.println("0�`100�܂ł̐�����3�Ŋ���؂�鎞�́uFizz�v�A5�Ŋ���؂�鎞�́uBuzz�v�A3��5�̌��{���Ŋ���؂�鎞�́uFizzBuzz�v�ƕ\�����܂�");
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
