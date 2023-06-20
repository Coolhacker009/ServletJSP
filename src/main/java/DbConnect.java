import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbConnect {
		private String dburl = "jdbc:mysql://localhost:3306/jsp";
		private String dbname = "root";
		private String dbpassword = "";
		private String dbdriver = "com.mysql.jdbc.Driver";
		
		public void loadDriver(String dbDriver) {
			try {
				Class.forName(dbDriver);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		public Connection getConnection(){
			
			Connection con = null;  
			try {
				con = DriverManager.getConnection(dburl, dbname, dbpassword);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
		}
		
		public String insert(User user) {
			
			loadDriver(dbdriver);
			Connection con = getConnection();
			String msg = "Bienvenue"+ " " + user.getPrenom()+" "+user.getNom();
			String sql = "insert into users(prenom, nom,pseudo,email,mdp,mdp2 ) values(?,?,?,?,?,?)";
			
			
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, user.getPrenom());
				ps.setString(2, user.getNom());
				ps.setString(3, user.getPseudo());
				ps.setString(4, user.getEmail());
				ps.setString(5, user.getMdp());
				ps.setString(6, user.getMdp2());
				ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				msg = "Informations non enregistrées";
			}
			return msg;
			
		}
}
