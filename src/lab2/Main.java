package lab2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Producer pr = new Producer();
        Consumer cr = new Consumer();
        Warehouse wh = new Warehouse(11); //10 размер склада
        System.out.println("Размер склада: " + wh.getLimit());

        //производитель
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pr.produce(wh);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        //потребитель
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    cr.consume(wh);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}
