package by.htp.flowers.runner;

import by.htp.flowers.model.Bud;
import by.htp.flowers.model.Flowers;
import by.htp.flowers.model.Gardener;

public class MainApp {

	public static void main(String[] args) {
		Gardener gardener = new Gardener("John");
		Flowers fl = new Flowers("Rose", "Red");
		Bud bud = new Bud("Pink", 10);

		gardener.informAboutFlowersState(fl);
		gardener.informAboutBudState(bud);
		fl.bloom(3);

		gardener.informAboutFlowersState(fl);

		fl.litleFade();
		bud.littleFadeBud();

		gardener.informAboutFlowersState(fl);
		fl.totalFade();

		gardener.informAboutFlowersState(fl);
		bud.totalFadeBud();

	}

}
