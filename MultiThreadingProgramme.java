class MThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i <= 8; i++) {
                System.out.print("Hrushi ");
                Thread.sleep(1000);
            }
        } catch (InterruptedException f) {
            System.out.println(f);
        }
    }

    public void tru() throws InterruptedException {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                Thread.sleep(2000);
            }
        }
    }
}

class Boy {
    public static void main(String[] args) {
        MThread t1 = new MThread();
        t1.start();

        try {
            t1.tru();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
