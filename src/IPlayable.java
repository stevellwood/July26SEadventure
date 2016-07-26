import java.util.Scanner;


public interface IPlayable {
	public Scanner keyboard = new Scanner(System.in);
	public ReadInfile readinFile = new ReadInfile();
	public int play();

}
