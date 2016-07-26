
public class StartDay implements IPlayable {

	
	public int play() {
		
		readinFile.fileOutput("InTheBeginning");
		
		String input = keyboard.nextLine().toLowerCase().trim();
		int choosing = 0;
		String invalid = "Invalid entry! with printf:";
        String tryagain = " Try again with chars from the text";
        String var = "%s so %s %n %n";

        switch (input) {
            case "get":
                choosing = 1;
                break;
            case "face":
                choosing = 1;
                break;
            case "work":
                choosing = 1;
                break;
            case "yes":
                choosing = 1;
                break;
            case "stay":
                choosing = 999;
                break;
            case "home":
                choosing = 999;
                break;
            case "play":
                choosing = 999;
                break;
            case "sick":
                choosing = 999;
                break;
            case "continue":
                choosing = 999;
                break;
            case "keep":
                choosing = 999;
                break;
            default: 
                choosing = 1;
                System.out.format(var, invalid, tryagain);
                break;
        }

        return choosing;
    }
//		if (input.contains("get") || input.contains("yes"))
//			return 1;
//		else
//			return 999;
	}
	


