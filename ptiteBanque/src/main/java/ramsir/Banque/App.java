package ramsir.Banque;
import java.util.Date;
import java.util.Scanner;

import com.mysql.fabric.xmlrpc.base.Data;

import ramsir.Banque.Controlleur.BanqueControlleur;
import ramsir.Banque.Dao.BanqueDAO;
import ramsir.Banque.Entity.Client;
import ramsir.Banque.Entity.Compte;
import ramsir.Banque.Entity.Virement;
import ramsir.Banque.Service.BanqueService;
/**
 * Hello world!
 *
 */
public class App 
{
	private static   BanqueControlleur bqcontroleur = new BanqueControlleur();
	  
   private static Scanner sc = new Scanner(System.in);
	public static void main( String[] args ) throws Exception
    {
//	    Client clt = new Client()  ;  	
//		bqcontroleur.setBanqueService(new BanqueService());
//		bqcontroleur.registerBanqueControlleurClient(clt);		
		//====Création d'un Compte d'un Client=========
		
//		System.out.println("===Creation Compte d'un Client=== !");
		
//		bqcontroleur.setBanqueService(new BanqueService());
//		bqcontroleur.registerBanqueControlleurCompte(new Compte());	
////		Date mydate = new Date();
////		System.out.println(" la date est :"+mydate.toString());
		System.out.println("===Affectuation du Virement====!");
		bqcontroleur.setBanqueService(new BanqueService());
		bqcontroleur.registerBanqueVirement(new Virement());
		
	
    }
}
