//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double celsius = 37;
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Temperatura em C:" + celsius + ", temperatura em Fahrenheit:" + fahrenheit);
        System.out.println("arrendondando o Fahrenheit teremos " + (int) fahrenheit);
    }
}