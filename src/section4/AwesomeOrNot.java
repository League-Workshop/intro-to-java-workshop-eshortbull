package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

	
	// Random Generator
	//Random rand = new Random();
	//int random = rand.nextInt(5);
	Random rand = new Random();
	int random = rand.nextInt(4);
	
	
	// 3. Print out this variable
JOptionPane.showMessageDialog(null, rand);
	// 4. Get the user to enter something that they think is awesome
String answer = JOptionPane.showInputDialog("enter somthing you think is cool");
	// 5. If the random number is 0
if(random == 0 ) {
	JOptionPane.showInputDialog("that is awesome");
}
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
if (random == 0) {
	JOptionPane.showMessageDialog(null, "that is ok");
	// -- tell the user whatever they entered is ok.
}
	// 7. If the random number is 2
if (random == 2) {
	JOptionPane.showMessageDialog(null, "BORING");
	// -- tell the user whatever they entered is boring.
}
	// 8. If the random number is 3
if (random == 3) {
	JOptionPane.showMessageDialog(null, "cool");
}
	// -- write your own answer

}

}
