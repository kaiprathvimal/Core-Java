public class Methods {
    public static void main(String[] args) {
        int i =0;
        MethodClass mclass = new MethodClass();
        mclass.textMethod();
        String result = mclass.getMePen(9);
        System.out.println(result);
    }
    
}

/**
 * MethodClass
 */
class MethodClass {

    public void textMethod() {
        System.out.println("new method");

    }
    public String getMePen(int i) {
        if(i>=10) {
            return "pen";
        }
        return "pencil";
        
    }
}