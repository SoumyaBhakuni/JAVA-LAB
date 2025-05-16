class CustomThread extends Thread {
    private int counter = 0;

    public CustomThread(String name) {
        super(name);
    }

    public void run() {
        while (counter < 5) {
            counter++;
            System.out.println(getName() + " executed " + counter + " times");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
            }
        }
    }
}

