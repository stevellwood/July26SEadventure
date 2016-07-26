import java.util.ArrayList;

public class Engine {

	public static void main(String[] args) {


		ArrayList <IPlayable> playMissionsList = new ArrayList();
		
		// creating objects that represents the missions
		StartDay m0 = new StartDay();
		ArriveatWork m1 = new ArriveatWork();
		GiveUp m2 = new GiveUp();
		DroneMaster m3 = new DroneMaster();
		Protesting m4 = new Protesting();
		Spying m5 = new Spying();
		
		//arraylist is a better data structure because I can flesh out the story later
		// filling the array list with the mission
		
		playMissionsList.add(0, m0);//adding story part to arraylist of stories called playMissionList
		playMissionsList.add(1, m1);
		playMissionsList.add(2, m2);
		playMissionsList.add(3, m3);
		playMissionsList.add(4, m4);
		playMissionsList.add(5, m5);
		
		
		int missionNumber = 0;

		// missions return 999 when game is over
		while (missionNumber != 999)
		{
			// play method return an int which is the index of the next mission in the array
			missionNumber = playMissionsList.get(missionNumber).play();
			}

	}

}
