package blackjj;

import java.util.Scanner;


import blackjj.Tietokantavarasto;
import blackjj.YhteydenHallinta;

public class Main {
	public static Kortti kortti1;
	private static int ota;
	private static int assa;
	private static Scanner input = new Scanner(System.in);
	private static int vastustaja  = 0;
	public static void main(String[] args) {
		
		boolean havisit = false;
		
		Korttipakka pakka = new Korttipakka();
		PelaajanKasi pakka1 = new PelaajanKasi();
	//	PelaajanKasi vastustaja = new PelaajanKasi();
		
	    System.out.println(pakka.pakka);
		System.out.println(pakka1.pakka);
		
		
		//peli alkaa
		 System.out.println("Tervetuloa pelaamaan Black Jack peliä!");
		
		// Aloitus Kortit
		kortti1 = pakka.JaaKortti();
		pakka1.pakka.add(kortti1);
		pakka1.selvitaSumma();
		kortti1 = pakka.JaaKortti();
		pakka1.pakka.add(kortti1);
		pakka1.selvitaSumma();
		System.out.println("PELAAJAN KÄSI: "+pakka1.pakka);
		
		kortti1 = pakka.JaaKortti();
		if(kortti1.arvo >10 && kortti1.arvo <=13){
			kortti1.arvo = 10;
		}
		vastustaja = vastustaja + kortti1.arvo;
		kortti1 = pakka.JaaKortti();
		if(kortti1.arvo >10 && kortti1.arvo <=13){
			kortti1.arvo = 10;
		}
		vastustaja = vastustaja + kortti1.arvo;
		if(vastustaja == 21){
			System.out.println("HÄVISIT");
			havisit = true;
		}
		if(vastustaja >= 22){
			System.out.println("vastustaja sai kaksi ässää, eli yhteensä 11");
			vastustaja = 11;
		} 
		
		System.out.println("Vastustajalla on "+vastustaja);
		
		//Kortin nosto
		do{
		System.out.println("Haluatko nostaa? paina 1 nostaaksesi kortin...");
		ota = input.nextInt();
		if(ota == 1){
		kortti1 = pakka.JaaKortti();
		System.out.println(kortti1);
		if(kortti1.arvo == 1){
			System.out.println("sait ässän, haluatko 1 vai 11?(valitse 1/11)");
			assa = input.nextInt();
			if(assa == 1){
				kortti1.arvo= 1;
			}
			else if(assa == 11){
				kortti1.arvo= 11;
			}
		}
		pakka1.otaKortti();
		System.out.println("PELAAJAN KÄSI: "+pakka1.pakka);
		pakka1.selvitaSumma();
		if(PelaajanKasi.sum > 21){
			System.out.println("HÄVISIT");
			havisit = true;
				}
		if(PelaajanKasi.sum == 21){
			System.out.println("VOITIT");
			havisit =  true;
		}
			}
		////////
		
		
		
		
		}while(ota==1 && havisit == false);
		
		
		while(vastustaja <= PelaajanKasi.sum && havisit == false){
			kortti1 = pakka.JaaKortti();
			vastustaja = vastustaja + kortti1.arvo;
			System.out.println("Vastustajalla on "+vastustaja);
			if(vastustaja > PelaajanKasi.sum && vastustaja < 21){
				System.out.println("HÄVISIT");
				havisit = true;
			}
		}	
		//
		if(PelaajanKasi.sum > vastustaja && havisit == false ){
			System.out.println("VOITIT!");
		}
		else if(vastustaja > 21){
			System.out.println("VOITIT!");
		}
		else if(PelaajanKasi.sum < vastustaja && havisit == false){
			System.out.println("HÄVISIT");
			havisit = true;
		}
		
		 Tietokantavarasto rekisteri = new Tietokantavarasto();
		 int sum = PelaajanKasi.sum;
		 
		 rekisteri.lisaaTulos(sum,havisit);
}
}
