import java.util.ArrayList;
import java.util.List;

public class EducateeList{
	private String name;
	private List<Educatee> list = new ArrayList<Educatee>();
	
	public EducateeList(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void add(Educatee educatee){
		this.list.add(educatee);
	}
	
	public Educatee get(int index){
		return this.list.get(index);
	}
	
	public int size(){
		return this.list.size();
	}
	
	public Educatee remove(int index){
		return this.list.remove(index);
	}
}