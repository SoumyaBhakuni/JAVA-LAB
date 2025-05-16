class SharedBuffer {
    private int data;
    private boolean empty = true;

    public synchronized void produce(int value) throws InterruptedException {
        while (!empty) {
            wait();
        }
        data = value;
        empty = false;
        System.out.println("Produced: " + data);
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (empty) {
            wait();
        }
        System.out.println("Consumed: " + data);
        empty = true;
        notify();
    }
}
