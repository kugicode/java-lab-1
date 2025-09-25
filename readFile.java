package anas123;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class readFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:/Users/anzoh/eclipse-workspace/anas123/src/main/java/anas123/dataSet1.csv";
        String line;
        
        
        try
            (BufferedReader br = new BufferedReader(new FileReader(path)))
        {
          while((line = br.readLine()) !=null){
          System.out.println(line);
          }
                }
        catch(IOException e){
        	 e.printStackTrace();

	}

}
}
