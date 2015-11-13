import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		CsvFileUtils csvFileUtils = new CsvFileUtils("quebec.txt");
		
		for (int i = 0; i < 2000; i++) {
			
			printArray(csvFileUtils.readOneLine());
			
		}
		
	}
	
	public static void printArray(String[] array){
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	

}
