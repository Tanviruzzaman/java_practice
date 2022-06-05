
package ReadTxt;


import java.io.*;

public class RFT {
    public static void main(String[] args) throws Exception {
       
       
        File file  = new File("C:\\Users\\750ta\\Desktop\\toha.txt");
       
     
        BufferedReader br = new BufferedReader (new FileReader(file));
        
        String st;
        
        while ((st = br.readLine()) != null)
            
            System.out.println(st);
    }
    
    
}
