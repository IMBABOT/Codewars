
public class SolveSuperMarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                int result = 0;
                for (int i = 0; i < customers.length; i++) {
                    result += customers[i];
                }
                System.out.println(result);
            }
        });
        t.start();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int result = 0;
                for (int i = 0; i < customers.length; i++) {
                    result += customers[i];
                }
                System.out.println(result);
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int result = 0;
                for (int i = 0; i < customers.length; i++) {
                    result += customers[i];
                }
                System.out.println(result);
            }
        });
        t2.start();


        try {
            t.join();
            t1.join();;
            t2.join();;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       return 0;
    }
}

