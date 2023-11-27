public class esercizio24di1 {
    public static void main(String[] args) {
        Integer numerador = 9;
        Integer denominador = 3;

        try {
            division(numerador, denominador);
        } catch (ArithmeticException e) {
            System.out.println("Excepcion " + e);
        } catch (Exception e) {
            System.out.println("Otra Excepcion" + e);
        }
    }
    static void division(int num, int den) {
        System.out.println(num / den);
    }
}
