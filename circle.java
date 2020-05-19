import java.io.*;
/**
 *
 * @author dmytr
 */
public class Circle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {      
      System.out.println("Enter a radius of a circle:");
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      try{
      Double radius=Double.valueOf(br.readLine());
      Double perimeter=radius*3.14*2;
      Double area=Math.pow(radius,2)*3.14;
      System.out.println("Area:"+area);
      System.out.println("Perimeter:"+perimeter);
      }
      catch(Exception ex){
      System.out.println("Wrong radius");
      }
    }
    
}
