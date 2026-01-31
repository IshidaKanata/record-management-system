public class Test implements Record{
	private String name;
	private int score = 0;
	
	public Test(String name){
		this.name = name;
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
	
	public String getString(){
		return this.name + " " + this.score;
	}
}