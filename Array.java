public class Array {
    public static void main(String[] args) {
        // Single diommensional array
        String arry[] = new String[4];
        arry[0] = "hi";
        arry[1] = "hello";
        arry[2] = "hy";
        arry[3] = "by";
        for(int i =0; i<=3; i++) {
            System.out.println(arry[i]);
        }
        // multi diammensional array
        int multi[][] = new int[3][4];
        for(int i =0; i <=2; i++) {
            for(int j =0; j <=3; j++) {
                multi[i][j] = (int)(Math.random()*100);
            }
        }
        for(int i =0; i <=2; i++) {
            for(int j =0; j <=3; j++) {
                System.out.print(multi[i][j] + " ");
            }
            System.out.println();
        }



    }
}
