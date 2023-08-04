import javax.swing.JOptionPane;

public class senhaUnica2 {

public static void main(String[] args) {
//Scanner sc = new Scanner(System.in);

//System.out.println("DIGITE SUA SENHA : ");
String senha = JOptionPane.showInputDialog("Digite sua senha");
//String senha = sc.next();
int contador = 1;


while(!senha.equals("senha123") && contador<=2) {
    //System.out.println("Senha Incorreta, Tente novamente : \nTentativas restantes: " +(3-contador));
    
    //senha=sc.next();
    senha = JOptionPane.showInputDialog("Senha Incorreta, Tente novamente : \nTentativas restantes: " +(3-contador));
    contador++;
}    
if (senha.equals("senha123")) {
    //System.out.println("ACESSO PERMITIDO");
    JOptionPane.showMessageDialog(null,"ACESSO PERMITIDO");
} else {
   // System.out.println("ACESSO BLOQUEADO (Senha incorreta)");
   JOptionPane.showMessageDialog(null,"ACESSO BLOQUEADO (Senha incorreta)");

   // sc.close();
}}

}

