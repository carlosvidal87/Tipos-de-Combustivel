import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class App {
  public static void main(String[] args)  throws IOException {

  Scanner input = new Scanner(System.in);

  int alcool = 0, gasolina = 0, diesel = 0, opcao = 0;    
  
  while(opcao!=4){
    try{
      opcao = input.nextInt();
    }  catch (InputMismatchException e){
        input.next();
        opcao = 0;
      }
    switch(opcao){
      case 1:
        alcool++;
        break;
      case 2:
        gasolina++;
        break;
      case 3:
        diesel++;
        break;

  }  
    }
    System.out.println("MUITO OBRIGADO");
    System.out.println("Alcool: "+ alcool);
    System.out.println("Gasolina: "+ gasolina);
    System.out.println("Diesel: "+ diesel);
    input.close();
  }
}