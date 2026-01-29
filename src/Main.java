import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nome = "LELE";
        ArrayList<String> lista = new ArrayList<>();
        lista.add(nome);
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Digite seu nome: ");
            String novoNome = sc.nextLine();
            lista.add(novoNome);
            imprimir(lista);
        }
    }

    public static void imprimir(ArrayList<String> lista){
        for(String nomeLista :lista){
            System.out.println(nomeLista);
        }
    }
}

