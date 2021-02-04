package propagationException.exceptions;

public class DatabaseConnectionException extends DatabaseException
{
	public DatabaseConnectionException()
	{
		super("Impossible de se connecter à la base de données.");
	}

	public DatabaseConnectionException(Throwable throwable)
	{
		super("Impossible de se connecter à la base de données.", throwable);
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
