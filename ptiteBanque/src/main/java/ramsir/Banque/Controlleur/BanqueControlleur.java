package ramsir.Banque.Controlleur;



import java.util.Date;
import java.util.Scanner;

import ramsir.Banque.Dao.BanqueDAO;
import ramsir.Banque.Entity.Client;
import ramsir.Banque.Entity.Compte;
import ramsir.Banque.Entity.Virement;
import ramsir.Banque.Service.BanqueService;

public class BanqueControlleur {
	
	private BanqueService banqueService;
	
	public BanqueService getBanqueService() {
		return banqueService;
	}

	public void setBanqueService(BanqueService banqueService) {
		this.banqueService = banqueService;
	}

	public void registerBanqueControlleurClient(Client clt) throws Exception
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir le nom Client !");
		String nom = sc.nextLine();
		clt.setNom(nom);
		System.out.println("saisir le prenom du client !");
		String prenom= sc.nextLine();
		clt.setPrenom(prenom);
		System.out.println("saisir l'adresse du client");
		String adresse = sc.nextLine();
		clt.setAdresse(adresse);
		System.out.println("saisir le mail de client !");
		String mail = sc.nextLine();
		clt.setMail(mail);
		System.out.println("Saisir le numero du client !");
		String tel = sc.nextLine();
		clt.setTel(tel);
		banqueService.setBqDao(new BanqueDAO());
		banqueService.creerClient(clt);
	}
	
	public void registerBanqueControlleurCompte(Compte cpte) throws Exception
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir Identifiant du client ");
		String IdCltstr= sc.nextLine();
		cpte.setIdClient(Integer.parseInt(IdCltstr));
		System.out.println("Veuillez saisir le solde du client !");
		String mtsolde = sc.nextLine();
		cpte.setSolde(Double.parseDouble(mtsolde));
		banqueService.setBqDao(new BanqueDAO());
		banqueService.creationCompte(cpte);
		System.out.println("Compte Enregistrer!");
		
	}
	
	public void registerBanqueVirement(Virement virmt) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez Saisir Compte Debit !");
		
		String numDebitstr= sc.nextLine();
		virmt.setNumCpteDebit(Integer.parseInt(numDebitstr));
		System.out.println("Veuillez Saisir Compte Crédit !");
		String numCreditstr = sc.nextLine();
		virmt.setNumCpteCredit(Integer.parseInt(numCreditstr));
		System.out.println("Veuillez saisir le montant du virement !");
		String mtstr = sc.nextLine();
		virmt.setMontant(Double.parseDouble(mtstr));
       //virmt.setDateVirement(new Date());
		banqueService.setBqDao(new BanqueDAO());
		banqueService.ajoutVirement(virmt);
		System.out.println("Enregistrement du virement !");
		
	}
	

}
