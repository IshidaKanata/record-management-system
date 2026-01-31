import java.util.List;

public interface UI{
	public void print(String message);
	
	public String inputString(String message);
	
	public int inputInt(String message);
	
	public int select(List<String> list, String message);
}