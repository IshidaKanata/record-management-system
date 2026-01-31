import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class GUI implements UI{
	private JFrame jFrame;
	public GUI(){
		this.jFrame = new JFrame();
		this.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.jFrame.setSize(400, 200);
		this.jFrame.setTitle("GUI");
		this.jFrame.add(new JLabel("ウィンドウの[x]で終了"));
		this.jFrame.setVisible(true);
	}
	public void print(String message){
		JOptionPane.showInputDialog(this.jFrame, message);
	}
	public String inputString(String message){
		return JOptionPane.showInputDialog(message, "");
	}
	public int inputInt(String message){
		String s = this.inputString(message);
		return Integer.parseInt(s);
	}
	public int select(List<String> list, String message){
		String menu = "";
		int size = list.size();
		for(int i = 0; i < size; i++){
			menu = menu + i + ":" + list.get(i) + System.lineSeparator();
		}
		return this.inputInt(menu + message);
	}
}