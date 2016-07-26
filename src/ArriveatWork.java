// mission index is 1
public class ArriveatWork implements IPlayable{

	public int play() {
		
		
		readinFile.fileOutput("ArrivingWork");
		String invalid = "Invalid entry! with printf:";
        String tryagain = " Try again with chars from the text";
        String var = "%s so %s %n %n";
		//checks the user input which will determine the next mission
		 String input = keyboard.nextLine().toLowerCase().trim();
        int choosing = 1;
        //checks the user input which will determine the next mission
        switch (input) {
        case "go":
            choosing = 3;
            break;
        case "see":
            choosing = 3;
            break;
        case "strange":
            choosing = 3;
            break;
        case "man":
            choosing = 3;
            break;
        case "yes":
            choosing = 3;
            break;
        case "home":
            choosing = 2;
            break;
        case "give":
            choosing = 2;
            break;
        case "no":
            choosing = 2;
            break;
        case "park":
            choosing = 2;
            break;
        case "exit":
            choosing = 2;
            break;
        case "leave":
            choosing = 2;
            break;
        default: 
            choosing = 1;
            System.out.format(var, invalid, tryagain);
            break;
    }

    return choosing;
	}
}
