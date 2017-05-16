package blackjj;


import blackjj.Kortti;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import blackjj.Korttipakka;
import blackjj.Main;

public class PelaajanKasi {
	public static Kortti kortti1;
	public static int sum = 0;
	public static int summa;
	
	public static ArrayList<Kortti> pakka = new ArrayList<Kortti>();
	
	
	public ArrayList<Kortti> Pelaajankasi(){
	
	return pakka;
	
	}
	

	public static void otaKortti(){

		pakka.add(Main.kortti1);
		}

	
	public void selvitaSumma(){
	

		summa = Main.kortti1.arvo;
		
		if(summa>10 && summa <=13){
			summa = 10;
			System.out.println("sait kuvakortin, eli 10");
		}
	//	else if(summa == 1){
	//		summa = 11;
		//	System.out.println("sait ässän, eli 11");
	//	}
		else if(summa+summa==22){
			summa = 10;
		}
		sum = sum + summa;
		if(sum == 22){
			sum =11;
			System.out.println("sait kaksi ässää");
		}
		System.out.println("Sinulla on yhteensä "+sum);
		System.out.println(" ");

	}
	
	public  static void selvitablackjack(){
	
		summa = Main.kortti1.arvo;
		
		
		 if (summa== 10+14){
		        System.out.println("BlackJack voitit pelin.");
		        System.exit(0);
		}
		 if (summa  == 11+14){
		        System.out.println("BlackJack voitit pelin.");
		        System.exit(0);
		}
		 if (summa  == 12+14){
		        System.out.println("BlackJack voitit pelin.");
		        System.exit(0);
		}
		 if (summa == 13+14){
		        System.out.println("BlackJack voitit pelin.");
		        System.exit(0);
		}
		 if (summa  == 14+10){
		        System.out.println("BlackJack voitit pelin.");
		        System.exit(0);
		}
		 if (summa  == 14+11){
		        System.out.println("BlackJack voitit pelin.");
		        System.exit(0);
		}
		 if (summa  == 14+12){
		        System.out.println("BlackJack voitit pelin.");
		        System.exit(0);
		}
		 if (summa  == 14+13){
		        System.out.println("BlackJack voitit pelin.");
		        System.exit(0);
	}
	}
}	
	
	
	





