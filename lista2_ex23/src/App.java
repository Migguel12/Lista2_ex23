import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        double numero = ler.nextDouble();
        System.out.println("");

        ler.close();

        if((numero % 1 ) == 0){
            System.out.println("O numero informado é inteiro.");
        }
        else{
            System.out.println("O numero informado é decimal");
        }
    }
}
