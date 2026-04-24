import java.util.Scanner;

public class AwManMath {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int choice = 0;


		while (choice != 4) {
			System.out.println("\n --- MATH MENU ---");
			System.out.println("1. Multiplication Table");
			System.out.println("2. Number Triangle");
			System.out.println("3. Powers of a Number");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");

			choice = reader.nextInt();


			if (choice == 1) {

				for (int i = 1; i <= 5; i++) {

					for (int j = 1; j <= 5; j++) {
						int product = i * j;
						System.out.print(product);
						System.out.print("\t");
					}
					System.out.println();
				}
			}


			else if (choice == 2) {
				System.out.print("Enter size: ");
				int size = reader.nextInt();

				for (int i = 1; i <= size; i++) {
					for (int j = 1; j <= i; j++) {
						System.out.print(i);
						System.out.print(" ");
					}
					System.out.println();
				}
			}


			else if (choice == 3) {
				System.out.print("Enter base number: ");
				int baseNum = reader.nextInt();
				int currentTotal = 1;


				for (int i = 1; i <= 10; i++) {
					currentTotal = currentTotal * baseNum;
					System.out.print(currentTotal);
					System.out.print(" ");
				}
				System.out.println();
			}
		}

		System.out.println("Program finished.");
	}
}