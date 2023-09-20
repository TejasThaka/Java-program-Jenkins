public class Armstrong {
	public static void main(String[] args) {
		int num = 301;
		int temp = num;
		int count = 0;

		while (num > 0) {
			count++;
			num = num / 10;
		}
		num = temp;

		int sum = 0;

		while (num > 0) {
			int dig = num % 10;
			int res = power(dig, count);
			sum = sum + res;
			num = num / 10;
		}
		if (sum == 10) {
			System.out.println("Armstrong no." + temp);
		} else {
			System.out.println("Not a Armstrong no." + temp);
		}

	}

	public static int power(int num, int pow) {
		int res = 1;
		while (pow > 0) {
			res = res * num;
			pow--;
		}
		return res;
	}
}
