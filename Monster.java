package gra;

import java.util.Random;

public class Monster {
	//attributes
	private MonsterNames name;
	private int health;
	private int attack;
	
	public enum MonsterNames {
		BALROG, AGRAEL, LILITH, AZAKIEL 
	}
	//constructor
	public Monster(MonsterNames name, int health, int attack){
		this.name = name; 
		this.health = health;
		this.attack = attack;
		System.out.println("Utworzono demona " + name + " o sile od 5 do 10 i zyciu od 5 do 25");
	}
	//getters and setters
	public MonsterNames getName() {
		return name;
	}
	public void setName(MonsterNames name) {
		this.name = name;
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
	public void setAttack(int attack) {
		this.attack = attack;
	}
	//methods
	Random rand = new Random();
	
	public void printAttributes(){
		System.out.println("Parametry demona:");
		System.out.println("Imie: " + name);
		System.out.println("Zdrowie: " + health);
		System.out.println("Attack: " + attack);
	}
	public int attGen(){
		int randatt = rand.nextInt(5) + 5;
		return randatt;
	}
	public int hGen(){	
		int randh = rand.nextInt(20) + 5;
		return randh;
	}
	public MonsterNames nameGen(){
		int randn = rand.nextInt(MonsterNames.values().length);
		return MonsterNames.values()[randn];
	}
	
}
