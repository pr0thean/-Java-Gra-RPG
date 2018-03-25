package gra;

import java.util.Scanner;

public class Create {
	
		Scanner scanner = new Scanner(System.in);
		private int attValue;
		private int hValue;
		private String imie;
		
		public String retName(){
			System.out.println("Podaj imie swojego bohatera");
			imie = scanner.nextLine();
			return imie;
		}
		
		public int retAtt(){
			System.out.println("Podaj wartosc ataku");
			attValue = scanner.nextInt();
			return attValue;
		}
		
		public int retH(){
			System.out.println("Podaj wartosc zycia");
			hValue = scanner.nextInt();
			return hValue;
		}
		
		public void checkCharacter() {
			int sum = attValue + hValue;
			if(sum > 20)
			{
				System.out.println("Koniec gry oszuscie!!!");
				System.exit(0);
			}			
		}		
}
