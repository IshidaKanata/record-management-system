import java.util.List;
import java.util.ArrayList;

public class Subject{
	private String name;
	private List<Record> list = new ArrayList<Record>();
	
	public Subject(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void add(Record record){
		this.list.add(record);
	}
	
	public Record get(int index){
		return this.list.get(index);
	}
	
	public int size(){
		return this.list.size();
	}
	
	public Record remove(int index){
		return this.list.remove(index);
	}
}