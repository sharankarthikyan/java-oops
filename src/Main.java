public class Main {
    public static void main(String[] args) {

        SimpleCalculator cal = new SimpleCalculator();
        cal.setFirstNumber(10);
        cal.setSecondNumber(10);
        System.out.println(cal.getAdditionResult());
        System.out.println(cal.getSubtractionResult());
        System.out.println(cal.getMultiplicationResult());
        System.out.println(cal.getDivisionResult());
    }
}