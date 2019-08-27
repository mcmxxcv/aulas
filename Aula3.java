package aula3;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Aula3 {
    public static void main(String[] args) {
    //Declaração de variáveis
        int num1 = 0;
        int num2 = 0;
        int soma = 0;
        int sub = 0;
        int mult = 0;
        double div = 0;
        Scanner entrada = new Scanner(System.in);
    //Entrada de dados
//        System.out.print("Informe o 1º número: ");
//        num1 = entrada.nextInt();
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o 1º número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o 2º número"));
//        System.out.print("Informe o 2º número: ");
//        num2 = entrada.nextInt();
    //Processamento de dados
        soma = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / (num2*1.0);
    
    //Saída de dados
        JOptionPane.showMessageDialog(null,"A soma dos números vale: " + soma);
        JOptionPane.showMessageDialog(null,"A sub dos números vale: " + sub);
        JOptionPane.showMessageDialog(null,"A mult dos números vale: " + mult);
        JOptionPane.showMessageDialog(null,"A div dos números vale: " + div);
    }
}
