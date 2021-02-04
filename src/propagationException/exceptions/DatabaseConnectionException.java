package propagationException.exceptions;

public class DatabaseConnectionException extends DatabaseException
{
	public DatabaseConnectionException()
	{
		super("Impossible de se connecter � la base de donn�es.");
	}

	public DatabaseConnectionException(Throwable throwable)
	{
		super("Impossible de se connecter � la base de donn�es.", throwable);
	}

	public DatabaseConnectionException(String message)
	{
		super(message);
	}

	public DatabaseConnectionException(String message, Throwable throwable)
	{
		super(message, throwable);
	}
}
