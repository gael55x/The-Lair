package main.java.com.thelair.guardian;

public class CathyGuardian extends Guardian {
	public CathyGuardian() {
        super("Ma'am Cathy", 1, 500, 300, 10, 200);
	}

	public String getIntro() {
        return "Stage 1 – The Hall of Flame: 'You dare to begin the trials? Prove it.'";
	}
}
