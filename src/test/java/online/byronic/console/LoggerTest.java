/* 
 * License information
 * 
 * 
 */

package online.byronic.console;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

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
		assertTrue(Logger.cmd("fake command") == false);
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