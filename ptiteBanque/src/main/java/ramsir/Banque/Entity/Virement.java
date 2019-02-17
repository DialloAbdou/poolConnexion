package ramsir.Banque.Entity;

import java.util.Date;

public class Virement {
	private int numVirement;
	private int numCpteDebit;
	private int numCpteCredit;
	private double montant;
	private Date dateVirement;
	
	public Date getDateVirement() {
		return dateVirement;
	}
	
	public void setDateVirement(Date dateVirement) {
		this.dateVirement = dateVirement;
	}
	public int getNumVirement() {
		return numVirement;
	}
	public void setNumVirement(int numVirement) {
		this.numVirement = numVirement;
	}
	public int getNumCpteDebit() {
		return numCpteDebit;
	}
	public void setNumCpteDebit(int numCpteDebit) {
		this.numCpteDebit = numCpteDebit;
	}
	public int getNumCpteCredit() {
		return numCpteCredit;
	}
	public void setNumCpteCredit(int numCpteCredit) {
		this.numCpteCredit = numCpteCredit;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}

}
