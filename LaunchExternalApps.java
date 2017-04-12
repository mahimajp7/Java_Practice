package practice;

import java.io.IOException;

public class LaunchExternalApps {

	public static void main(String[] args) {
		Runtime  rt = Runtime.getRuntime();
		
		try{
			rt.exec("notepad.exe"); //Opens new Nodepad instance ,MSPaint
			
		}
		catch(IOException e){
			e.printStackTrace();
		}

	}

}
