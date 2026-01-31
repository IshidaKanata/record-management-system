public class RecordUtils{
	public static void print(EducateeList educateeList){
		System.out.println(educateeList.getName());
		int size = educateeList.size();
		for(int i = 0; i < size; i++){
			Educatee educatee = educateeList.get(i);
			RecordUtils.print(educatee);
		}
	}
	
	public static void print(Educatee educatee){
		System.out.print(educatee.getId() + " ");
		System.out.println(educatee.getName());
		int size = educatee.size();
		for(int i = 0; i < size; i++){
			Subject subject = educatee.get(i);
			RecordUtils.print(subject);
		}
	}
	
	public static void print(Subject subject){
		System.out.println(subject.getName());
		int size = subject.size();
		for(int i = 0; i < size; i++){
			Record record = subject.get(i);
			RecordUtils.print(record);
		}
	}
	
	public static void print(Record record){
		System.out.println(record.getString());
	}
}