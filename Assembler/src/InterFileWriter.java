import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Really simple, just writes a line to a file, erases a file if it already exists
 */
public class InterFileWriter 
{
	public static String filePath = "";
	
	public static void init()
	{
		File file = new File(filePath);
		if(file.exists())
			file.delete();
	}
	
	public static void write(String _line)
	{
		try {
			Writer output = new BufferedWriter(new FileWriter(filePath, true));
			output.append(_line + "\n");
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
