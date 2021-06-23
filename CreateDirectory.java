import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Scanner;

public class CreateDirectory 
{
	public static void makeDir(String path) throws IOException
	{
	    
		File file = new File(path);
		if(file.getParentFile() != null)
		{
			file.getParentFile().mkdirs();
		}
		file.createNewFile();
		
		boolean exists = file.exists();
	if(exists)
	{
		System.out.print("Your file and its directories have been successfully made!!");
	}
	else
	{
		System.out.print("An error has occurred!!");
	}
}
}
