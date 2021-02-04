package propagationException.exceptions;

public class DatabaseException extends Exception
{
	public DatabaseException()
	{
		super("Exception survenue dans la couche DAO.");
	}
	
	public DatabaseException(Throwable throwable)
	{
		super("Exception survenue dans la couche DAO.", throwable);
	}
	
	public DatabaseException(String message)
	{
		super(message);
	}
	
	public DatabaseException(String message, Throwable throwable)
	{
		super(message, throwable);
	}
}
