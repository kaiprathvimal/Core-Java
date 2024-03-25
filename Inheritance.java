public class Inheritance {
    public static void main(String[] args) {
        PowerCalc obj = new PowerCalc();
        int r = obj.add(10, 20);
        int rsub = obj.sub(30, 2);
        int rmul = obj.mul(12, 12);
        int rdiv = obj.divide(23, 2);
        int rpower = obj.power(4, 2);
        System.out.println(r + " " + rsub + " " + rmul + " "  + rdiv + " " + rpower);

    }
}
