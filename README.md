# bumper-csv

BUMPER is a bug-fix search engine available at https://bumper-app.com

The aim of BUMPER is to help developer to find a suitable fix when facing an unknown bug.

To assess BUMPER's utility, we ask participants to find a code snippet that can be slightly modified in order to fix a bug using BUMPER and GOOGLE.

The goal of the experiment is to compare how fast a suitable fix can be found using BUMPER and GOOGLE. Consequently, we ask participant look for a fix online even if they know how to fix.

The made-up bug we ask you to fix goes like this:

When I run the CSVReader with a simple main like this

```java
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
```

I got the following Exception:

Exception in thread "main" java.lang.NullPointerException
	at CsvFileUtils.readOneLine(CsvFileUtils.java:22)
	at Main.main(Main.java:11)

Can you please fix CsvFileUtils ?

The related google form is here : https://docs.google.com/forms/d/1zCmDac77S7vGzBUKZ8EewOA3MZipP7kxa0GK2KDQGGA/viewform
