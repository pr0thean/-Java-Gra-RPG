package gra;

public class Player {
	//attributes
	private String name;
	private int health;
	private int attack;
	//constructor
	public Player(String name, int health, int attack){
		this.name = name; 
		this.health = health;
		this.attack = attack;
		System.out.println("Utworzono gracza " + name);
	}
	//getters and setters
	public String getName() {
		return name;
	}
	
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getAttack() {
		return attack;
	}
	//methods
	public void printAttributes(){
		System.out.println("Parametry gracza:");
		System.out.println("Imie: " + name);
		System.out.println("Zdrowie: " + health);
		System.out.println("Attack: " + attack);
	}

	

	/*public void setName(String name) {
		this.name = name;
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
	}*/
}
