public class MainGUI{
	public static void main(String[] args){
		RecordSystem recordSystem = new RecordSystem();
		recordSystem.setUI(new GUI());
		recordSystem.run();
	}
}