package group;

public class test {
    public static void main(String[] args){
        Thread timer = startTimer();
        timer.start();
    }


    private static Thread startTimer(){
        int duration = 10000;

        Thread timer = new Thread(() -> {
            try {
                int i = 0;
                System.out.println("Time remaining : "+((double)duration/1000));
                while(i < duration){
                    // Sleep for the specified delay
                    Thread.sleep(1000);
                    i += 1000;
                    // Execute the task
                    double sisa =(double) (duration - i)/1000;
                    System.out.println("Time remaining : "+(sisa));
                }
            } catch (InterruptedException e) {
                System.err.println("Thread was interrupted");
            }
        });
        return timer;
    }
}
