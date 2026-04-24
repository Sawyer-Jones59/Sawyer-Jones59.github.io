public class methodunitthing {

	public static void main(String[] args) {
		printReceipt("Apple", 0.99, 5);

	}

	//parameter
	public static void printReceipt(String item, double price, int quantity) {
		double subtotal = price * quantity;
		double tax = subtotal * 0.07; //taxes oh no!
		double total = subtotal + tax;

		System.out.println("\n--- SHOPPING RECEIPT ---");
		System.out.println("Product:  " + item);
		System.out.println("Price:    $" + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("Subtotal: $" + subtotal);
		System.out.println("Tax:      $" + tax);
		System.out.println("TOTAL:    $" + total);
		System.out.println("------------------------");
	}

	//returns
	public static String checkPassingGrade(int score) {
		String result;
		if (score >= 70) {
			result = "PASSING: Nice work lad.";
		} else if (score >= 60) {
			result = "WARNING: You are on the brick of a bad grade.";
		} else {
			result = "FAILING: Study well lad.";
		} //I hope you appreciate my good ol' sayings ;-;
		return result;
	}

	//math, of course :\
	public static void calculateHypotenuse(double a, double b) {
		//Hypotenuse is the longest side of a right-angle triangle
		double aSquared = Math.pow(a, 2);
		double bSquared = Math.pow(b, 2);
		double hypotenuse = Math.sqrt(aSquared + bSquared);

		System.out.println("\n GEOMETRY CALCULATION ");
		System.out.println("For sides " + a + " and " + b + ", the hypotenuse is: " + hypotenuse);
	}

	//random (magic!)
	public static void monsterEncounter() {

		int roll = (int)(Math.random() * 3) + 1;

		System.out.println("\n RPG ADVENTURE ");
		if (roll == 1) {
			System.out.println("A wild Goblin appears! You should run.");
		} else if (roll == 2) {
			System.out.println("You found a steak on the ground.");
		} else {
			System.out.println("The forest is quiet. Nothing happens.");
		}
	}
}