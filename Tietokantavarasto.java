package blackjj;

import java.sql.Connection;
import java.sql.PreparedStatement;

import blackjj.YhteydenHallinta;
import  blackjj.Main;

public class Tietokantavarasto {

	   private String ajuri="com.mysql.jdbc.Driver";
	    private String url="jdbc:mysql://localhost/bjtietokanta";
	    private String kayttaja="root";
	    private String salasana="";

	    private String pelinLisaysSQL = "insert into bjtietokanta (sum,havisit) values (?,?)";
	    private String pelinHakuSQL = "select * from bjtietokanta where sum=?";
	  


public void lisaaTulos(int sum, boolean havisit){
	
	Connection yhteys = null;
    PreparedStatement korttienhaku=null;
    PreparedStatement pelinLisays=null;
    try{
        yhteys=YhteydenHallinta.avaaYhteys(ajuri,url,kayttaja,salasana);
        pelinLisays = yhteys.prepareStatement(pelinLisaysSQL);
       pelinLisays.setInt(1,sum);
        pelinLisays.setBoolean(2,havisit);
      

        pelinLisays.executeUpdate();

    }catch(Exception e){
        System.out.println("Virhe lisäyksessä"+ e);
    }finally{
        YhteydenHallinta.suljeLause(pelinLisays);
        YhteydenHallinta.suljeYhteys(yhteys);
    }
}
	

}
