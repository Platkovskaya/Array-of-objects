package by.htp.flowers.model;

public class Gardener {
	public String name;

	public Gardener(String name) {
		this.name = name;
		System.out.println(name);
	}

	public void informAboutFlowersState(Flowers flowers) {
		if (flowers != null) {
			System.out.println("Flowers title: " + flowers.title);
			System.out.println("Flowers color: " + flowers.color);
			if (flowers.petal != null) {
				this.informAboutFlowersPetals(flowers.petal);
			}
		}
	}

	public void informAboutBudState(Bud bud) {

		System.out.println("Bud size: " + bud.size2);
		System.out.println("Bud color: " + bud.color2);

	}

	public void informAboutFlowersPetals(Petal[] petals) {
		System.out.println("Flowers petal count: " + getPetalsCount(petals));

		for (Petal petal : petals) {
			if (petal != null) {

				System.out.println(" petal size: " + petal.size);
				System.out.println(" petal shape: " + petal.shape);
				System.out.println(" petal color: " + petal.color);
				System.out.println("____________________________");
			}
		}
	}

	public int getPetalsCount(Petal[] petals) {
		int count = 0;
		for (Petal petal : petals) {
			count++;
		}

		return count;

	}
}
