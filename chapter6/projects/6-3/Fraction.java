public class Fraction {

    public int n, d;
    
    public Fraction() {
        n = 0;
        d = 0;
    }

    public void setFraction(int a, int b) {
        n = a;
        d = b;
    }

    public int getNum() {
        return n;
    }

    public int getDem() {
        return d;
    }

    public Fraction add(Fraction obj) {
        int n2 = obj.getNum();
        int d2 = obj.getDem();
        int n3 = n * d2 + n2 * d;
        int d3 = d * d2;
        Fraction result = new Fraction();
        result.setFraction(n3, d3);
        return result;
    }

    public Fraction subtract(Fraction obj) {
        int n2 = obj.getNum();
        int d2 = obj.getDem();
        int n3 = n * d2 - n2 * d;
        int d3 = d * d2;
        Fraction result = new Fraction();
        result.setFraction(n3, d3);
        return result;
    }

    public Fraction multiply(Fraction obj) {
        int n2 = obj.getNum();
        int d2 = obj.getDem();
        int n3 = n * n2;
        int d3 = d * d2;
        Fraction result = new Fraction();
        result.setFraction(n3, d3);
        return result;
    }

    public Fraction divide(Fraction obj) {
        int n2 = obj.getNum();
        int d2 = obj.getDem();
        int n3 = n * d2;
        int d3 = d * n2;
        Fraction result = new Fraction();
        result.setFraction(n3, d3);
        return result;
    }

    public String toString() {
        String str;
        str = n + "/" + d;
        return str;
    }

}