public class Task implements Record{
	private String name;
	private int score = 0;
	private int number;
	
	public Task(String name, int number){
		this.name = name;
		this.number = number;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setScore(int score){
		this.score = score;
	}
	
	public int getScore(){
		return this.score;
	}
	
	public int getNumber(){
		return this.number;
	}
	
	public String getString(){
		return this.name + " " + this.number + " " + this.score;
	}
}