package abstract_classes.farm;
import java.util.ArrayList;

public class Farm {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		Cow job = new Cow();
		Raccoon billay = new Raccoon();
		Raccoon bob = new Raccoon();
		Bear jerry = new Bear();
		Pig brown = new Pig();
		Pig belly = new Pig();
		animals.add(job);
		animals.add(billay);
		animals.add(bob);
		animals.add(jerry);
		animals.add(brown);
		animals.add(belly);
		
		for(int i = 0; i < animals.size(); i++) {
			
			System.out.println(animals.get(i).makeNoise());
			System.out.println(animals.get(i).eatSomeFood());
			
		}
	}

}
