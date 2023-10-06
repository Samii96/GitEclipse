import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		String name = "Sami";
		String guess;
		int attempts = 0;
		boolean correctGuess = false;
		boolean userWantsToQuit = false;
		
		System.out.println("Arvauspeli!");
		System.out.println("Arvaa nimi. Jos haluat lopettaa arvailun, kirjoita 'loppu'.");
		while (!correctGuess && !userWantsToQuit)
		{
			System.out.println("Tee arvaus.");
			guess = in.nextLine();
			if (guess.equals (""))
			{
				System.out.println("ERROR.");
			}
			else 
			{
				attempts++;
			}	
			if (guess.equalsIgnoreCase(name))
			{
				correctGuess = true;
				System.out.println("Oikein!");
				System.out.println("Yrityksiä " + attempts);
	}
		
}
		
}
}