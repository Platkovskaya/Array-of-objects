package by.htp.flowers.model;

public class Bud {
	public String color2;
	public int size2;

	public Bud(String color, int size) {
		this.color2 = color;
		this.size2 = size;

	}

	public void littleFadeBud() {
		this.color2 = "burgundy";
		this.size2 = 8;
		System.out.println("Bud color: " + color2);
		System.out.println("Bud size: " + size2);
	}

	public void totalFadeBud() {
		this.color2 = "grey";
		this.size2 = 6;
		System.out.println("Bud color: " + color2);
		System.out.println("Bud size: " + size2);
	}

}
