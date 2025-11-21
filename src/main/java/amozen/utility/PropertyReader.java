package amozen.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.Properties;

public class PropertyReader 
{
	private static char[] ok;
	private static FileInputStream s;

	public static void  main(String arg[]) throws Throwable
	{
	FileInputStream s=new FileInputStream("");
	Properties r=new Properties();
	r.load(s);
	String value =r.getProperty("Url");
	String value1= r.getProperty("browser");
	System.out.println(ok);
	System.out.println();
	}
	//System.out.println(value);
 
//method return type String
		//method should be String
		//method Parameterised string
	public static String elisha (String s1)
		throws Throwable {
	FileInputStream s=new FileInputStream("");
	Properties r=new Properties();
	r.load(s);
	String value =r.getProperty("Url");
	String value1= r.getProperty("browser");
	System.out.println(ok);
	
return s1;
		}
}