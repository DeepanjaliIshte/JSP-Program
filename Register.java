import java.io.IOException;
import java.rmi.ServerException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Register extends HttpServlet{
	protected void service(HttpServletRequest req,HttpServletResponse res) throws ServerException, IOException
	{
		
		System.out.println("I'm in register method.....");
	}
}
