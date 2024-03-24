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

        ObjectArray s1 = new ObjectArray();
        s1.rollNo = 10;
        s1.name = "vimal";
        s1.mark = 12;

        ObjectArray s2 = new ObjectArray();

        s2.rollNo = 11;
        s2.name = "vimala";
        s2.mark = 122;

        ObjectArray arry1[] = new ObjectArray[2];
        arry1[0] = s1;
        arry1[1] = s2;

        for(int i =0;i<arry1.length;i++) {
            System.out.println(arry1[i].rollNo + " " + arry1[i].name + " " + arry1[i].mark);
        }


    }
}

class ObjectArray {
    int rollNo;
    String name;
    int mark;
}
