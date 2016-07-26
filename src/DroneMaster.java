
//import java.util.Scanner;

// mission index is 3 here
public class DroneMaster implements IPlayable{
	public int play(){

		// customMethods object is created in IPlayable
		readinFile.fileOutput("DroneMaster");
		String invalid = "Invalid entry! with printf:";
		String tryagain = " Try again with chars from the text";
		String var = "%s so %s %n %n";
        String input = keyboard.nextLine().toLowerCase().trim();
        int choosing = 1;
		//checks the user input which will determine the next mission
		switch (input) {
        case "hold":
            choosing = 4;
            break;
        case "protest":
            choosing = 4;
            break;
        case "sign":
            choosing = 4;
            break;
        case "a":
            choosing = 4;
            break;
        case "b":
            choosing = 5;
            break;
        case "buy":
            choosing = 5;
            break;
        case "find":
            choosing = 5;
            break;
        case "get":
            choosing = 5;
            break;
        case "drone":
            choosing = 5;
            break;
        case "d":
            choosing = 2;
            break;
        case "park":
            choosing = 2;
           break;
        case "go":
            choosing = 2;
            break;
        case "bus":
            choosing = 2;
            break;
        case "c":
            choosing = 3;
        case "both":
            choosing = 3;
            System.out.format(var, invalid, tryagain);
        default: 
            choosing = 3;
            System.out.format(var, invalid, tryagain);
            break;
    }

    return choosing;
}


}
