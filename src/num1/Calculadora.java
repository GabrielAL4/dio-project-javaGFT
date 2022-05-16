package num1;

public class Calculadora {

    public static void soma(double number1, double number2){
        double result = number1 + number2;
        System.out.println("A soma de: "+ number1 + " + " + number2  + " foi de: " + result);
    }

    public static void subtracao(double number1, double number2){
        double result = number1 - number2;
        System.out.println("A subtração de: "+ number1 + " - " + number2  + " foi de: " + result);
    }

    public static void multiplicacao(double number1, double number2){
        double result = number1 * number2;
        System.out.println("A multiplicação de: "+ number1 + " X " + number2  + " foi de: " + result);
    }

    public static void divisao(double number1, double number2){
        double result = number1 / number2;
        System.out.println("A divisão de: "+ number1 + "/" + number2  + " foi de: " + result);
    }
}