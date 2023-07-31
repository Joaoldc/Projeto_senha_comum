import java.util.Scanner;

public class senhaUnica {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("DIGITE SUA SENHA : ");

String senha = sc.next();
int contador = 1;


while(!senha.equals("senha123") && contador<=2) {
    System.out.println("Senha Incorreta, Tente novamente : \nTentativas restantes: " +(3-contador));
    contador++;
    senha=sc.next();

}    
if (senha.equals("senha123")) {
    System.out.println("ACESSO PERMITIDO");
} else {
    System.out.println("ACESSO BLOQUEADO (Senha incorreta)");

    sc.close();
}}

}

