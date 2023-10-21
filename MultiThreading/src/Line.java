public class Line {
    public void getLine(int lineNumber, int trainId) {
        System.out.printf("Block %d by %d \n", lineNumber, trainId);
        synchronized (this) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Line available!");
        }
    }
}
