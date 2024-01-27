public class Discount {
    public static void main(String[] args) {
        double originalPrice = 99;
        double discount = 17;
        double discountValue = (discount/100) * originalPrice;

        System.out.println("Valor descontado: " + discountValue);
        System.out.println("Valor a pagar: " + (originalPrice - discountValue));
    }
}
