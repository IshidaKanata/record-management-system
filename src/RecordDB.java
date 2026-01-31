public class RecordDB{
	public static EducateeList getEducateeList(){
		EducateeList educateeList = new EducateeList("学習者リスト");
		Educatee educatee1 = new Educatee("s001", "Taro");
		Subject subject1 = new Subject("UML演習");
		Task task1 = new Task("課題", 1);
		task1.setScore(90);
		Report report1 = new Report("レポート");
		report1.setScore(85);
		Test test1 = new Test("試験");
		test1.setScore(95);
		
		educateeList.add(educatee1);
		educatee1.add(subject1);
		subject1.add(task1);
		subject1.add(report1);
		subject1.add(test1);
		
		//追加
		Educatee educatee2 = new Educatee("s002", "Hanako");
		Subject subject2 = new Subject("UML演習");
		Task task2 = new Task("課題", 1);
		task2.setScore(80);
		Report report2 = new Report("レポート");
		report2.setScore(90);
		Test test2 = new Test("試験");
		test2.setScore(100);
		
		educateeList.add(educatee2);
		educatee2.add(subject2);
		subject2.add(task2);
		subject2.add(report2);
		subject2.add(test2);
		
		//科目の追加
		Subject subject3 = new Subject("コンピュータプログラミング");
		Task task3 = new Task("課題", 1);
		task3.setScore(75);
		Report report3 = new Report("レポート");
		report3.setScore(70);
		Test test3 = new Test("試験");
		test3.setScore(80);
		
		educatee1.add(subject3);
		subject3.add(task3);
		subject3.add(report3);
		subject3.add(test3);
		
		return educateeList;
	}
}