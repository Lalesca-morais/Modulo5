package Exercicio2;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Set<String> lista = new HashSet<>();

        lista.add("1");
        lista.add("5");
        lista.add("5");
        lista.add("6");
        lista.add("7");
        lista.add("8");
        lista.add("8");
        lista.add("8");

        System.out.println(lista);
    }
}
//O hashmap não deixa ter números iguais, ele vai imprimir no console somente um número, como por exemplo esta lista.