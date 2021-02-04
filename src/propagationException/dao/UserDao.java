package propagationException.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import propagationException.exceptions.DatabaseConnectionException;
import propagationException.exceptions.DatabaseException;
import propagationException.exceptions.SQLDriverNotFoundException;
import propagationException.exceptions.ServiceException;

public class UserDao
{
	// variables bdd
	static String url = "jdbc:mysql://localhost/propagation";
	static String login = "root";
	static String passwd = "";

	public boolean createUser(String nom, String prenom, String mail, String adresse, String telephone,
			String dateNaissance) throws DatabaseException
	{
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();
			String sql = "INSERT into etudiants (nom, prenom, mail, adresse, tel, naissance) VALUES " + "('" + nom + "'"
					+ ",'" + prenom + "'" + ",'" + mail + "'" + ", '" + adresse + "'" + ", '" + telephone + "'" + ", '"
					+ dateNaissance + "'" + ")";
			st.executeUpdate(sql);
		}
		catch (ClassNotFoundException e)
		{
			SQLDriverNotFoundException sqlDriverNotFoundException = new SQLDriverNotFoundException(e);
			
			throw sqlDriverNotFoundException;
		}
		catch (SQLException e)
		{
			DatabaseConnectionException databaseConnectionException = new DatabaseConnectionException("SQL Exception", e);
			
			throw databaseConnectionException;
		}
		finally
		{
			try
			{
				if (cn != null)
					cn.close();
				if (st != null)
					st.close();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		return true;
	}
}
