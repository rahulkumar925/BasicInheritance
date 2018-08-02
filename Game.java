//create interface "Game" , have an abstract method "play()". from this interface define "Cricket" , "FootBall" and "Tennis".
//Now Define one more class 
//public class Demo
//In this class have a method "perform" which will take interface reference as parameter.inside "perform()" see to it that any child object passed ,
//its "play()" method should be invoked.

public interface Game {

	abstract void play();

}

class Cricket implements Game {

	public void play() {
		System.out.println("Play Cricket.");
	}
}

class Football implements Game {

	public void play() {
		System.out.println("Play Football.");
	}
}

class Tennis implements Game {

	public void play() {
		System.out.println("Play Tennis.");
	}
}

class Demo {

	void perform(Game game) {

		game.play();
		
	}

	public static void main(String args[]) {

		Demo demo = new Demo();
		
		Cricket cricket = new Cricket();
		Football football = new Football();
		Tennis tennis = new Tennis();
		
		demo.perform(cricket);
		demo.perform(football);
		demo.perform(tennis);
	}

}
