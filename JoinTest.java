public class JoinTest {
    public static void main(String [] args) throws InterruptedException {
        ThreadJoinTest t1 = new ThreadJoinTest("thread1");
        ThreadJoinTest t2 = new ThreadJoinTest("thread2");
        t1.start();
        t1.join();
        t2.start();
        System.out.println("main thread exit");
    }
}

class ThreadJoinTest extends Thread {
    public ThreadJoinTest(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            for(int i = 0; i < 20; i++) {
                System.out.println(this.getName() + ":" + i);
                this.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
