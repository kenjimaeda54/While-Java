import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("digite o valor de x");
        x = sc.nextInt(); 	
        while(x != 2002) {
          System.out.println("Senha invalida");
          System.out.println("digite novamente o valor de x");
          x = sc.nextInt();
        }
        //Logica do whille.Enquanto a informação for verdadeira,verifica novamente,ate se tornar falsa e sair	    
        //Ou seja o whille trabalha com logica inversa do IF;
        System.out.println("Senha valida");
	    sc.close();
	}

}
