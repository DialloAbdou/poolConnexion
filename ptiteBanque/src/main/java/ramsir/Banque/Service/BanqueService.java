package ramsir.Banque.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import ramsir.Banque.Dao.BanqueDAO;
import ramsir.Banque.Entity.Client;
import ramsir.Banque.Entity.Compte;
import ramsir.Banque.Entity.Virement;

public class BanqueService {

	private BanqueDAO bqDao;

	/*
	 * 
	 * Methode geteur et setteur
	 */
	public BanqueDAO getBqDao() {
		return bqDao;
	}

	public void setBqDao(BanqueDAO bqDao) {
		this.bqDao = bqDao;
	}

	/*
	 * 
	 * Création d'un compte du Client pour la banque
	 */
	public void creerClient(Client clt) throws Exception {
		if (clt != null) {
			String sqlClt = "Insert Into client(Nom,Prenom, Adresse,Mail,Telephone)" + " VALUES('" + clt.getNom()
					+ "','" + clt.getPrenom() + "'," + "'" + clt.getAdresse() + "','" + clt.getMail() + "','"
					+ clt.getTel() + "')";
			BanqueDAO.setData(sqlClt);
		}
	}

	/*
	 * elle renvoie le resultat de la requette client côte base de données pour la
	 * banque
	 * 
	 */
	private ResultSet getRegister(String lsql) throws Exception {
		ResultSet rset = BanqueDAO.getData(lsql);
		return rset;

	}

	/*
	 * elle renvoie la liste des Clients
	 */
	public List<Client> getClient(String lsqlCt) throws Exception {
		ResultSet rset = getRegister(lsqlCt);
		List<Client> clients = new ArrayList<>();
		while (rset.next()) {
			clients.add(new Client(rset.getInt("IdClient"), rset.getString("Nom"), rset.getString("Prenom"),
					rset.getString("Adresse"), rset.getString("Mail"), rset.getString("Telephone")));
		}
		return clients;
	}

	/*
	 * Creation d'un Compte
	 */

	public void creationCompte(Compte cpte) throws Exception {
		if (cpte != null) {
			String sqlCpte = "Insert Into compte (IdClient,Solde)" + " VALUES('" + cpte.getIdClient() + "','"
					+ cpte.getSolde() + "')";
			BanqueDAO.setData(sqlCpte);
		}
	}
	/*
	 * ========= Listes des comptes des Clients=========
	 */

	public List<Compte> ListeCompteClient(int idclt) throws Exception {

		List<Compte> comptes = new ArrayList<>();
		String sqlCpte = "Select IdCompte,Solde" + "From compte where compte.IdCompte =" + idclt;
		ResultSet rset = getRegister(sqlCpte);
		while (rset.next()) {
			comptes.add(new Compte(rset.getInt("IdCompte"), rset.getInt("IdClient"), rset.getDouble("Solde")));
		}
		return comptes;
	}

	/**
	 * 
	 * Fonction de Virement Entre le Compte client
	 * 
	 * @throws Exception
	 **/

//	@Override
//	public void registerFilm(Film film) throws Exception {
//		String sql = "Insert INTO film (Titre, Genre, NbreExemplaire) VALUES ('" + film.getTitre() + "','"
//				+ film.getGenre() + "'," + film.getNbreExemplaire() + ")";
//		dao.setData(sql);
//
//	}

	public void ajoutVirement(Virement virmt) throws Exception {
		if (virmt != null) {
				String sql = "Insert INTO virement (IdCompteDebit, IdCompteCredit, Montant) VALUES ('" + virmt.getNumCpteDebit() + "','"
					+ virmt.getNumCpteCredit() + "'," + virmt.getMontant() + ")";
			BanqueDAO.setData(sql);
		}
	}
	
	private void modifCompte(double montant )
	{
			/*
			 * CREATE TRIGGER deptoMtant AFTER INSERT
				on virement for EACH ROW
				BEGIN
				    UPDATE compte
				     set compte.Solde = compte+mont
				     WHERE compte.IdCompte = virement.IdCompteDebit
				 END
							 
				* */
		
	}
}
