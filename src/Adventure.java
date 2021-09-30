import java.util.Scanner;

public class Adventure {
  public static void main(String[] args) {
    Adventure a = new Adventure();

    System.out.println(a.getInput());
  }



  public String getInput(){
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }

  public void checkInput(String getInput){

  }
}
