package CricketPlayers;

public class Player {

	private String name;
	private String roll;
	private int run;
	
	
	public Player()
	{
		this.name = "";
		this.roll = "";
		this.run = 0;
	}
	
	public Player(String name)
	{
		this.name = name;
		this.roll = "";
		this.run = 0;
	}
	
	public Player(String name, String roll, int run)
	{
		this.name = name;
		this.roll = roll;
		this.run = run;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}
	
	public void print()
	{
		System.out.println("Name: "+name+" , Roll: "+
            roll+", Runs: "+run);
	}
}
