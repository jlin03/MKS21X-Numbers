public class Driver {
	public static void main(String[] args) {
		RealNumber real0 = new RealNumber(4.41151);
		RealNumber real1 = new RealNumber(2.15131);

		System.out.println(real0.add(real1));
		System.out.println(real0.subtract(real1));
		System.out.println(real0.multiply(real1));
		System.out.println(real0.divide(real1));


		RationalNumber rational0 = new RationalNumber(22,90);
		RationalNumber rational1 = new RationalNumber(6,29);

		System.out.println(rational0.add(rational1));
		System.out.println(rational0.subtract(rational1));
		System.out.println(rational0.multiply(rational1));
		System.out.println(rational0.divide(rational1));







	}

}
