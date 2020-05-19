import java.io.*;

/**
 *
 * @author dmytr
 */
public class Calls {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
      System.out.println("Enter standart units for each of three calls:");
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      try{
        int c1=Integer.parseInt(br.readLine());
        int c2=Integer.parseInt(br.readLine());
        int c3=Integer.parseInt(br.readLine());
        System.out.println("Enter duration for each of three calls:");
        int t1=Integer.parseInt(br.readLine());
        int t2=Integer.parseInt(br.readLine());
        int t3=Integer.parseInt(br.readLine());
        int talk1=t1*c1;
        int talk2=t2*c2;
        int talk3=t3*c3;
        int allTalks=talk1+talk2+talk3;
        System.out.println("Each call seperately:"+talk1+", "+talk2+", "+talk3);
        System.out.println("All talks:"+allTalks);
      }
      catch(Exception ex){
        System.out.println("Wrong parameters");
      }
    }
    
}
