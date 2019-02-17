package ramsir.Banque.Entity;

public class Client {

	private String nom;
	private String prenom;
	private String adresse;
	private String mail;
	private String tel;
	private int idCLient;

	public int getIdCLient() {
		return idCLient;
	}
	public void setIdCLient(int idCLient) {
		this.idCLient = idCLient;
	}
	public Client()
	{
		
	}
	public Client(int idclt, String nom, String prenom, String adresse, String mail, String tel) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = mail;
		this.tel = tel;
		this.idCLient= idclt;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
