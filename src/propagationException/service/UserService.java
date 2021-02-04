package propagationException.service;

import propagationException.dao.UserDao;
import propagationException.domaine.User;
import propagationException.exceptions.DatabaseException;
import propagationException.exceptions.ServiceException;

public class UserService
{
	private UserDao userDao;

	public UserService()
	{
		userDao = new UserDao();
	}

	public void creerUtilisateur(User user) throws ServiceException
	{
		try
		{
			userDao.createUser(user.getNom(), user.getPrenom(), user.getMail(), user.getAdresse(), user.getTelephone(), user.getDateNaissance());
		}
		catch (Exception exception)
		{
			ServiceException serviceException = new ServiceException("Exception dans la couche DAO :", exception);
			
			throw serviceException;
		}
	}
}
