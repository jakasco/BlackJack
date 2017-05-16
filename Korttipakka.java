package blackjj;

import java.util.ArrayList;
import java.util.Collections;

import blackjj.Kortti;
import blackjj.PelaajanKasi;

import java.util.Random;


public class Korttipakka {
	

	ArrayList<Kortti> pakka; 

	
	//konstruktori korttipakkaan. Sijoittaa atribuutti-korttipaikkaan kortit 
		//maa- ja numerojärjestyksessä
		
	public Korttipakka(){
		this.pakka = new ArrayList<Kortti>();
		this.kortitPakkaan();
		this.shuffle();
	}
		//  ArrayList<Kortti> pakka = new ArrayList<Kortti>();

	// Luodaan Pakka
	private void kortitPakkaan(){ 
		 String maa = "pata";
		for (int arvo = 1; arvo <= 13; arvo++) {
	    	this.pakka.add(new Kortti(maa, arvo));
		}	
		maa = "Ruutu";
		for (int arvo = 1; arvo <= 13; arvo++) {
	    	this.pakka.add(new Kortti(maa, arvo));
		}	
		 maa = "hertta";
		for (int arvo = 1; arvo <= 13; arvo++) {
	    	this.pakka.add(new Kortti(maa, arvo));
		}	
		 maa = "risti";
			for (int arvo = 1; arvo <= 13; arvo++) {
		    	this.pakka.add(new Kortti(maa, arvo));
			}	
	}
	// Sekoitus
			
	   // for (int i = 1; i < pakka.size(); i++) {
	  //    System.out.println(pakka.get(i)); 
	    
	//}
	  

	  public void shuffle() {
	    Collections.shuffle(pakka);
	  }

	//metodi, joka jakaa kortit ja poistaa
	  
	 public  Kortti JaaKortti(){
		 Kortti a = pakka.get(0);
		 pakka.remove(0);
		 return a;
		 
	 }
	


		//sekoittaa pakan (atribuutin)
		
		public void shuffleArray(int[] kortti) {
			 Random rnd = new Random();
		        for (int i = kortti.length - 1; i > 0; i--)
		        {
		            int index = rnd.nextInt(i + 1);
		            // Swap
		            int a = kortti[index];
		            kortti[index] = kortti[i];
		            kortti[i] = a;
		
	} 


}
		}