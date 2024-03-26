public class Enum {
    public static void main(String[] args) {
        Laptop obj = Laptop.apple;
        switch (obj) {
            case apple:
                System.out.println("apple : " + obj.getPrice() + " " + obj.getYear());
                break;
            case lenovo:
                System.out.println("lenovo");
                break;
            case hp:
                System.out.println("hp");
                break;
        
            default:
            System.out.println("dell");
                break;
        }
       
    }
}

enum Laptop {
    apple(1000000,2019),lenovo(60000,2018),hp(50000,2000),dell;
    private int price;
    private int year;
    
    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    private Laptop(int price, int year) {
        this.price = price;
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private Laptop() {
        price = 80000;
        year = 2024;

    }
    
}