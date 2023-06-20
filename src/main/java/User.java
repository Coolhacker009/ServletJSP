
public class User {
      private String prenom, nom, pseudo, email, mdp, mdp2;
      
      
	public User() {
		super();
	}


	public User(String prenom, String nom, String pseudo, String email, String mdp, String mdp2) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.pseudo = pseudo;
		this.email = email;
		this.mdp = mdp;
		this.mdp2 = mdp2;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPseudo() {
		return pseudo;
	}


	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMdp() {
		return mdp;
	}


	public void setMdp(String mdp) {
		this.mdp = mdp;
	}


	public String getMdp2() {
		return mdp2;
	}


	public void setMdp2(String mdp2) {
		this.mdp2 = mdp2;
	}
	
	
      
}
