package modulo1.ejercicios05;

import java.util.Stack;

public class Conversor {

    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        //String infija = "((2+2)-1*3)";
        String infija = "(4*2) + 3";
        String postfija = "";
        //==Comienzo solucion
        Stack POpe = new Stack();

        for (int i = 0; i < infija.length(); i++) {
            char c = infija.charAt(i);
            if (Character.isDigit(c)) {
                postfija += c;
            } else {
                if (c == '(' || POpe.isEmpty()) {
                    POpe.push(c);
                } else if (c == ')') {
                    while ((char) POpe.peek() != '(') {
                        postfija += POpe.pop();
                    }
                    POpe.pop();
                } else if (prioridad(c) > prioridad((char) POpe.peek())) {
                    POpe.push(c);
                } else if (prioridad(c) <= prioridad((char) POpe.peek())) {
                    postfija += POpe.pop();
                    POpe.push(c);
                }
            }
        }
        while (!POpe.isEmpty()) {
            postfija += POpe.pop();
        }
        //==Fin solucion
        System.out.println("INFIJA -> " + infija);
        System.out.println("POSTFIJA -> " + postfija);
    }

    private static int prioridad(char o) {
        int p = -10;
        if (o == '+' || o == '-') {
            p = 1;
        }
        if (o == '*' || o == '/') {
            p = 2;
        }
        if (o == '^') {
            p = 3;
        }
        return p;
    }
}
