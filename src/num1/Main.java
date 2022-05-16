package num1;
import java.util.*;

public class Main {
    public static void main(String[] args){
        double n1, n2;

        Scanner entrada1 = new Scanner(System.in);
        System.out.println("Insira o primeiro valor: ");
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Insira o segundo valor: ");
        n1 = entrada1.nextDouble();
        n2 = entrada2.nextDouble();

        //Calculadora
        Calculadora.soma(n1, n2);
        Calculadora.subtracao(n1, n2);
        Calculadora.multiplicacao(n1, n2);
        Calculadora.divisao(n1, n2);

        //Hora
        Time.obterMensagem(9);
        Time.obterMensagem(14);
        Time.obterMensagem(21);

        //Emprestimo
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}

