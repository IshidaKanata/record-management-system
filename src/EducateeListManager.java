import java.util.ArrayList;
import java.util.List;

public class EducateeListManager{
	private EducateeList educateeList;
	
	public EducateeListManager(EducateeList educateeList){
		this.educateeList = educateeList;
	}
	
	public Educatee searchEducateeById(String keyId){
		int size = this.educateeList.size();
		for(int i = 0; i < size; i++){
			Educatee educatee = this.educateeList.get(i);
			String id = educatee.getId();
			
			if( keyId.equals(id) ){
				return educatee;
			}
		}
		return null;
	}
	
	public List<String> searchSubjectNamesById(String keyId){
		List<String> list = new ArrayList<String>();
		Educatee educatee = this.searchEducateeById(keyId);
		int size = educatee.size();
		for(int i = 0; i < size; i++){
			Subject subject = educatee.get(i);
			String name = subject.getName();
			list.add(name);
		}
		return list;
	}
	
	public Subject searchSubjectById(String keyId, String keySubjectName){
		Educatee educatee = this.searchEducateeById(keyId);
		int size = educatee.size();
		for(int i = 0; i < size; i++){
			Subject subject = educatee.get(i);
			String name = subject.getName();
			if(keySubjectName.equals(name)){
				return subject;
			}
		}
		
		return null;
	}
}