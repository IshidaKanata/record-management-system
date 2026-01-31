import java.util.Arrays;
import java.util.List;

public class RecordSystem{
	private UI ui = new CUI(); //default CUI
	private EducateeList educateeList;
	private EducateeListManager eManager;
	
	public RecordSystem(){
		this.educateeList = RecordDB.getEducateeList();
		this.eManager = new EducateeListManager(this.educateeList);
	}
	public void setUI(UI ui){
		this.ui = ui;
	}
	public void run(){
		String keyId = this.ui.inputString("学籍番号");
		List<String> menu = Arrays.asList("全科目", "科目名一覧");
		int a = ui.select(menu, "選択");
		
		if(a == 0){
			Educatee educatee = this.eManager.searchEducateeById(keyId);
			Printable printable = new EducateeAdapter(educatee);
			this.ui.print(printable.getString());
			return ;
		}
		List<String> list = this.eManager.searchSubjectNamesById(keyId);
		int index = this.ui.select(list, "選択");
		String keySubjectName = list.get(index);
		Subject subject = this.eManager.searchSubjectById(keyId, keySubjectName);
		Printable printable = new SubjectAdapter(subject);
		this.ui.print(printable.getString());
	}
}