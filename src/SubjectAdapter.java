public class SubjectAdapter implements Printable{
	private Subject subject;
	
	public SubjectAdapter(Subject subject){
		this.subject = subject;
	}
	
	@Override
	public String getString(){
		String s = this.subject.getName() + System.lineSeparator();
		int size = this.subject.size();
		for(int i = 0; i < size; i++){
			Record record = this.subject.get(i);
			s = s + record.getString() + System.lineSeparator();
		}
		return s;
	}
}