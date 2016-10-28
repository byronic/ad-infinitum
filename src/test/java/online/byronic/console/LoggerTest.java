/* 
 * License information
 * 
 * 
 */

package online.byronic.console;

import static org.junit.Assert.*;
import org.junit.Test;

public class LoggerTest
{
	@Test
	public void testSuccessfulConsoleCommand()
	{
		assertTrue(Logger.cmd("test"));
	}
	
	@Test
	public void testFailedConsoleCommand()
	{
		assertFalse(Logger.cmd("fake command"));
	}
	
	@Test
	public void testLoggingInfo()
	{
		assertTrue(Logger.log("Test log message with INFO."));
	}
	
	@Test
	public void testLoggingError()
	{
		assertTrue(Logger.err("Test log message with ERROR."));
	}
}