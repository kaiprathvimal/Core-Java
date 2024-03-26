public class Lambda {
    public static void main(String[] args) {
       A obj = i -> System.out.println("Hello : " + i);
       obj.show(5);
       B obj1 = (i,j) ->  i+j;
       int result = obj1.add(10, 2);
       System.out.println("result : " + result);
    }
}

@FunctionalInterface
interface A {
    void show(int i);
    
}
@FunctionalInterface
interface B {

    int add(int i, int j);
}