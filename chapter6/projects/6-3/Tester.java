public class Tester {

    public static void main(String[] args) {

        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction();

        fraction1.setFraction(1, 2);
        fraction2.setFraction(1, 3);

        Fraction addResult = fraction1.add(fraction2);
        Fraction subResult = fraction1.subtract(fraction2);
        Fraction multiResult = fraction1.multiply(fraction2);
        Fraction divResult = fraction1.divide(fraction2);
        
        System.out.println("Add: " + addResult);
        System.out.println("Subtract: " + subResult);
        System.out.println("Multiply: " + multiResult);
        System.out.println("Divide: " + divResult);
    }

}

