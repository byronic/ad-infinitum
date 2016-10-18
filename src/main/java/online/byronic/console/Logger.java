package online.byronic.console;

public final class Logger
{
	public static boolean log(String message)
	{
		System.out.println("[INFO] " + message);
		return true;
	}
	
	public static boolean err(String message)
	{
		System.out.println("[ERROR] " + message);
		return true;
	}
	
	public static boolean cmd(String command)
	{
		if(command.equals("test"))
		{
			System.out.println("[COMMAND] Successful test");
			return true;
		}
		
		// if no commands matched existing possibilities, return false
		Logger.err("Invalid command: " + command);
		return false;
	}
}