import java.util.ArrayList;
import java.util.List;

public class Educatee{
	private String name;
	private String id;
	private List<Subject> list = new ArrayList<Subject>();
	
	public Educatee(String id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String getId(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void add(Subject subject){
		this.list.add(subject);
	}
	
	public Subject get(int index){
		return this.list.get(index);
	}
	
	public int size(){
		return this.list.size();
	}
	
	public Subject remove(int index){
		return this.list.remove(index);
	}
}