import java.util.Scanner;

public class App {

    private Scanner scan = new Scanner(System.in);
    private String inp;
 

    public App(){

        System.out.println("Please eneter the number of looping time\n: ");
        this.inp = scan.nextLine();        
        System.out.println(logic.Maths.getSummation(Integer.parseInt(this.inp)));
    }
    public static void main(String[] args) throws Exception {
        new App();
    }
}
