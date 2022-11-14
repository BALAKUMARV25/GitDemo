package week3.assignement.day1;

public class Desktop extends Computer {

	public double desktopSize() {

		double size = 15.6;
		System.out.println(size);
		return size;
	}

	public static void main(String[] args) {

		Desktop d = new Desktop();

		d.computerModel();
		d.desktopSize();

	}

}
