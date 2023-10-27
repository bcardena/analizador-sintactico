package co.edu.udea;

import co.edu.udea.views.CalculadoraUi;

import java.util.*;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa una expresión matemática:");
        String expresion = scanner.nextLine();

        try {
            System.out.println("El resultado es: " + evaluar(expresion));
        } catch (Exception e) {
            System.out.println("Error sintáctico en la expresión ingresada: " + e.getMessage());
        }
    }

    public static double evaluar(String expresion) throws Exception {
        StringTokenizer tokenizer = new StringTokenizer(expresion, "+-*/()", true);
        List<String> tokens = new ArrayList<>();
        while (tokenizer.hasMoreTokens()) {
            tokens.add(tokenizer.nextToken());
        }

        Stack<Double> numeros = new Stack<>();
        Stack<Character> operadores = new Stack<>();

        for (String token : tokens) {
            if (token.equals(" "))
                continue;

            if (Character.isDigit(token.charAt(0))) {
                numeros.push(Double.parseDouble(token));
            } else if (token.equals("(")) {
                operadores.push('(');
            } else if (token.equals(")")) {
                while (!operadores.empty() && operadores.peek() != '(')
                    numeros.push(operar(operadores.pop(), numeros.pop(), numeros.pop()));
                operadores.pop();
            } else if (token.equals("+") || token.equals("-") ||
                    token.equals("*") || token.equals("/")) {
                while (!operadores.empty() && tienePrecedencia(token.charAt(0), operadores.peek()))
                    numeros.push(operar(operadores.pop(), numeros.pop(), numeros.pop()));
                operadores.push(token.charAt(0));
            }
        }

        while (!operadores.empty())
            numeros.push(operar(operadores.pop(), numeros.pop(), numeros.pop()));

        return numeros.pop();
    }

    public static boolean tienePrecedencia(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    public static double operar(char op, double b, double a) throws Exception {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new UnsupportedOperationException("No se puede dividir por cero");
                return a / b;
        }
        return 0;
    }
}
