public class DemoException {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int arr[] = new int[5];
        try {
            j = 10/i;
            System.out.println(arr[2]);
            System.out.println(arr[5]);
        } catch(ArithmeticException e) {
            System.out.println("zero ");
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("limit");
        }
        System.out.println(j);
    }
}
