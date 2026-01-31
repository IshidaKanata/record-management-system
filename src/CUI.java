import java.util.Scanner;
import java.util.List;

public class CUI implements UI{
	private Scanner scanner = new Scanner(System.in);
	
	public CUI(){
	}
	
	public void print(String message){
		System.out.println(message);
	}
	
	public String inputString(String message){
		System.out.print(message);
		System.out.print(">>");//prompt
		return this.scanner.nextLine();
	}
	
	public int inputInt(String message){
		String s = this.inputString(message);
		return Integer.parseInt(s);
	}
	
	@Override
	public int select(List<String> list, String message){
		String menu = "";
		int size = list.size();
		for(int i = 0; i < size; i++){
			menu = menu + i + ":" + list.get(i) + System.lineSeparator();
		}
		return this.inputInt(menu + message);
	}
}