package ramsir.Banque.Entity;

public class Compte {

	private int idClient;
	private double solde;
	private int idCmpte;
     
	public Compte()
	{
		
	}
	
	public Compte(int idcmpte, int idclt, double solde) {
		
		this.idCmpte=idcmpte;
		this.idClient= idclt;
		this.solde = solde;
	}
	
	public int getIdCmpte() {
		return idCmpte;
	}

	public void setIdCmpte(int idCmpte) {
		this.idCmpte = idCmpte;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

}
