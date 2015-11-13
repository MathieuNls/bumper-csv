import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileUtils {
	
	private File file;
	private BufferedReader reader;
	
	public CsvFileUtils(String fileName){
		this.file = new File(fileName);
	}
	
	public String[] readOneLine() throws IOException{
		
		if(reader == null){
			reader = new BufferedReader(new FileReader(file));
			
		}
		
		String[] result = reader.readLine().split(";");
		
		return result;
		
	}
	
	public void closeFile() throws IOException{
		reader.close();
	}

}
