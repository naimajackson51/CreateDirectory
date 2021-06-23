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

public class CreateDirectoryDemo 
{
	 public static void main(String[] args) throws IOException
	 {
		 System.out.println("Please enter the path to create a file: ");
		 Scanner in = new Scanner(System.in);
		 String path = in.next();
		 System.out.println("Please enter the name of the file: ");
		 Scanner dr = new Scanner(System.in);
		 path = path + "/" + dr.next();
		
		 
		 CreateDirectory.makeDir(path);
	 }//end of main method
	 
	 
	
}//end of class 
