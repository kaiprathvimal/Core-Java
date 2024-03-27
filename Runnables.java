

public class Runnables {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter(); 
        Runnable obj1 = () -> {
                for(int i=0;i<1000;i++) {
                    c.add();
                }
            };
        Runnable obj2 = () -> {
            for(int i=0;i<1000;i++) {
                c.add();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);

    }
    
}
class Counter {
    int count;
    public synchronized void add() {
        count++;
    }
}
// class A implements Runnable{
//     public void run() {
//         for(int i=0;i<=5;i++) {
//             System.out.println("hello");
//             try {
//                 Thread.sleep(2);
//             } catch(Exception e) {
//                 e.printStackTrace();
//             }
//         }
//     }


    
// }
// class B implements Runnable{
//     public void run() {
//         for(int i=0;i<=5;i++) {
//             System.out.println("Hi");
//             try {
//                 Thread.sleep(2);
//             } catch(Exception e) {
//                 e.printStackTrace();
//             }
//         }
//     }
    
// }