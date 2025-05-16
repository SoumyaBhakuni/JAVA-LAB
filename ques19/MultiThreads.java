public class MultiThreads {
    public static void main(String[] args) {
        Thread csThread = new CustomThread("CSthread");
        Thread itThread = new CustomThread("ITthread");

        csThread.start();
        itThread.start();
    }
}

