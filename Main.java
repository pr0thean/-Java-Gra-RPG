package gra;

import java.util.Random;
import java.util.Scanner;

import gra.Monster.MonsterNames;

public class Main {

	public static void main(String[] args) {
		
		int monsterHealth, playerHealth;
		Scanner scanner = new Scanner(System.in);
		String combatchoice;
		Random rand = new Random();
		Create c = new Create();	
		String welcome = "witaj w prostej grze rpg!\n";
		
		System.out.println(welcome.toUpperCase());
		/////////////create character//////////////////////		
		System.out.println("Masz 20 pkt do rozdzielenia na atak i zycie.");
		System.out.println("Podaj parametry bohatera");
		Player p = new Player(c.retName(), c.retH(), c.retAtt());
		c.checkCharacter();
		/////////////create monster//////////////////////		
		Monster m = new Monster(MonsterNames.BALROG, 10, 5);
		m.setHealth(m.hGen());
		m.setAttack(m.attGen());
		m.setName(m.nameGen());
		System.out.println();
		/////////////print data//////////////////////		
		p.printAttributes();
		System.out.println();
		m.printAttributes();
		System.out.println();
		
		/////////////combat loop//////////////////////
		while(p.getHealth() > 0 && m.getHealth() > 0)
		{	
			System.out.println(p.getName() + " atakuje");
			monsterHealth = m.getHealth() - p.getAttack();
			m.setHealth(monsterHealth);
			m.printAttributes();
			System.out.println();
			
			System.out.println(m.getName() + " atakuje");
			playerHealth = p.getHealth() - m.getAttack();
			p.setHealth(playerHealth);
			p.printAttributes();
			System.out.println();
			
			System.out.println("Walczysz dalej? (tak/nie)");
			combatchoice = scanner.nextLine();
			if(combatchoice.equals("tak"))
			{
				if(p.getHealth() <= 0 && m.getHealth() > 0)
					System.out.println(m.getName() + " CIE POKONAL!!!");
				else if(m.getHealth() <= 0 && p.getHealth() > 0)
					System.out.println("Pokonales " + m.getName() + " !!!");
				else if(p.getHealth() <= 0 && m.getHealth() <= 0)
					System.out.println("Nikt nie przezyl");
				else
				continue;
			}
				
			else if(combatchoice.equals("nie"))
			{
				boolean run = rand.nextBoolean();
				if(run) {
					System.out.println("Uciekles z pola walki");
					break;
				}
				else {
					System.out.println("Nie udalo ci sie uciec. PORAZKA!");	
					break;
				}
			}
			else
				System.out.println("Niepoprawna komenda");		
		}
		/////////////combat END/////////////////
		scanner.close();
	}
	
}
