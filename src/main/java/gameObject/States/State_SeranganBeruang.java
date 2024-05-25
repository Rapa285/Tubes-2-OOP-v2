package gameObject.States;
import gameObject.Pemain.Ladang;
import gameObject.Pemain.Pemain;
import gameObject.Toko;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class State_SeranganBeruang extends Thread implements GameState {
    private  Integer turn;
    private Pemain p1;
    private Pemain p2;
    private boolean serang;
    private int durasi;
    private Ladang ladang;
    private List<Integer> area;
//    private GameState nextGameState;

    public State_SeranganBeruang(Integer turn,Pemain p1,Pemain p2){
        Random random = new Random();
        this.turn = turn;
        this.p1 = p1;
        this.p2 = p2;
        this.ladang = p1.getLadang();
        double test_serang = random.nextDouble();
        this.serang = test_serang >= 0.70;
        this.durasi = random.nextInt(30,61);
        this.area = generateArea();


        // this.area = ;
    }

    public GameState start_state(){
//        if (serang){
//            Thread timer = startTimer();
//            timer.start();
//            for (Integer cords : area) {
//                ladang.getPetak().remove(cords);
//            }
//        }
        return next_state();
    }

    public GameState next_state(){
        return new FreeState(turn,p1,p2);
    }

    public Ladang ladang_lawan(){
        return null;
    }

    public void store(Toko toko){
        throw new UnsupportedOperationException("Can't open store in this state");
    }

    public void load(){
        throw new UnsupportedOperationException("Can't load in this state");
    }


    public void plugin(){
        throw new UnsupportedOperationException("Can't insert plugin in this state");
    }
    public void save(){
        throw new UnsupportedOperationException("Can't save in this state");
    }

    public String checkTrap(){
        return null;
    }

    private List<Integer> generateArea(){
        Random random = new Random();
        List<Integer> area = new ArrayList<Integer>();
        int width = random.nextInt(1,5); // width -> panjang dalam sumbu y
        int length;
        if (width == 1){
            length = random.nextInt(1,6/width); // length -> panjang dalam sumbu x
        }else{
            length = random.nextInt(1,6/width+1);
        }
        int point = random.nextInt(0,20); // cords 0-19
        while(point%5 + length > 5 || point/5 + width > 4){
            point = random.nextInt(0,20);
        }
        return area;
    }

    private Thread startTimer(){
        int duration = durasi;

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

    public Integer currentTurn(){
        return turn;
    }
}

