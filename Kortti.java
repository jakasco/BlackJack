package blackjj;

/** Kortti-Luokka. Tallentaa Kortin luvun ja maan.
 * @ versio 1.0
*/

public class Kortti {
	
	public int arvo;
	public String maa;
		
	/** konstruktori
	 * @param arvo 
	 * 
	 * @param maa
	 * @param arvo
	 */
	
	public Kortti(String maa,int arvo){
		
	this.arvo=arvo;
	this.maa=maa;
	}
	
public int getarvo(){
		
		return this.arvo;
	
}

public String getmaa(){
	
	return this.maa;
}


/** Tulostaa Kortin ja sen luvun ja maan
 */

public String toString() {
	return "Kortti ["   + this.maa + " " + this.arvo + "]";
}


public void setarvo(int arvo) {
	this.arvo=arvo;
	
}


public void setmaa(String maa) {
	this.maa=maa;
	
}





}
		 