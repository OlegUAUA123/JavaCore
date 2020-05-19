import java.io.*;
/**
 *
 * @author dmytr
 */
public class NameAndAdress {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      System.out.println("What is your name?");
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      String name=br.readLine();
      if(name.length()>0){
        System.out.println("Where are you from,"+name+"?");
        String adress=br.readLine();
        if(adress.length()>0){
        System.out.println("Name:"+name);
        System.out.println("Adress:"+adress);
        }
        else{
         System.out.println("You had not written your adress"); 
        }
      }
      else{
        System.out.println("You had not written your name"); 
      }
    }
    
}
