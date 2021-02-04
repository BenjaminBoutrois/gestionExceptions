package propagationException.exceptions;

public class SQLDriverNotFoundException extends DatabaseException
{
	public SQLDriverNotFoundException()
	{
		super("Le driver SQL n'a pas été trouvé.");
	}
	
	public SQLDriverNotFoundException(Throwable throwable)
	{
		super("Le driver SQL n'a pas été trouvé.", throwable);
	}
	
	public SQLDriverNotFoundException(String message)
	{
		super(message);
	}
	
	public SQLDriverNotFoundException(String message, Throwable throwable)
	{
		super(message, throwable);
	}
}
