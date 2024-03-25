public class InnerClass {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.hobby();
        Human.Aliean obj1 = obj.new Aliean();
        obj1.alieanHobby();
        Anonymous obj2 = new Anonymous() {
            public void sampleClass() {
                System.out.println("Anonymous");
            }
        };
        obj2.sampleClass();
        
    }
}
class Human {
    private int i;
    public void hobby() {
        System.out.println("singing");
    }
    /**
     * InnerInnerClass
     */
    public class Aliean {
        public void alieanHobby() {
            System.out.println("Dancing");
        }
    
        
    }
}

class Anonymous {
    public void sampleClass(){
        System.out.println("Not anonymous");
    }
}