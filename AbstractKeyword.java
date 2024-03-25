public class AbstractKeyword {
    public static void main(String[] args) {
        SwiftCar obj = new SwiftCar();
        obj.drive();
        obj.playMusic();
    }
}
abstract class Car {
    public abstract void drive();
    public void playMusic() {
        System.out.println("music playing");
    }
}
 class SwiftCar extends Car {
    public  void drive() {
        System.out.println("Start driving");
    }
    
}