package propagationException.presentation;

import propagationException.domaine.User;
import propagationException.service.UserService;

public class Main
{
	public static void main(String[] args)
	{
		UserService userService = new UserService();

		User user = new User("Boutrois", "Benjamin", "bb@gmail.com", "1 rue des champs", "0102030405", "26/09/1996");
		
		try
		{
			userService.creerUtilisateur(user);	
			
			System.out.println("Utilisateur créé :");
			System.out.println(user);
		}
		catch (Exception exception)
		{
			System.out.println("Erreur lors de la création de l'utilisateur :");
			System.out.println(exception.getMessage());
			
			if (exception.getCause() != null)
			{
				System.out.println(exception.getCause().getMessage());
			}
		}
	}
}
