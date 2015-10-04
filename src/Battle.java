import com.roudique.lbw.units.*;

public class Battle {
	public static void main(String[] args) {
		Warrior warrior = new Warrior();
		Wizard wizard = new Wizard();
		
		try {
			warrior.attack(wizard);
		} catch (NoHitPointsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(warrior);
		System.out.println(wizard);
	}
}
