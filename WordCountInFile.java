package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountInFile {

	public static void main(String[] args) {
		BufferedReader rd = null;
		
		int WordCount = 0;
		int LineCount = 0;
		int CharCount = 0;
		
		try{
			
		 rd = new BufferedReader(new FileReader("C:/Users/mahim/Documents/EmpRecord.txt"));
		 
		 
		 String currentLine = rd.readLine();
		 
		 while(currentLine!=null){
			 
		 
		 LineCount++;
		 
		 String [] words = currentLine.split(" ");
		 WordCount = WordCount+words.length;
		 
		 for(String word: words){
			 CharCount = CharCount + word.length();
		 }
		 
		 //Reading next line
		 currentLine = rd.readLine();
		 
		}
		 
		 System.out.println("Char count " +CharCount);
		 System.out.println("Word Count " +WordCount);
		 System.out.println("Line Count " +LineCount);
		 
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
		finally
        {
            try
            {
                rd.close();           //Closing the reader
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }

	}

}
}
