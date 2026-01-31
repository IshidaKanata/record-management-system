public class EducateeAdapter implements Printable{
	private Educatee educatee;
	public EducateeAdapter(Educatee educatee){
		this.educatee = educatee;
	}
	
	@Override
	public String getString(){
		String s = this.educatee.getId() + " " + this.educatee.getName() + System.lineSeparator();
		int size = educatee.size();
		for(int i = 0; i < size; i++){
			Subject subject = this.educatee.get(i);
			s = s + subject.getName() + System.lineSeparator();
			int size2 = subject.size();
				for(int j = 0; j < size2; j++){
				Record record = subject.get(j);
				s = s + record.getString() + System.lineSeparator();
			}
		}
		
		return s;
	}
}