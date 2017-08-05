package sample;

import javafx.application.Platform;

/**
 * Created by Fahim on 7/2/2017.
 */
public class WorkThread extends Thread {
    RingProgressIndicator rpi;
    int progress = 0;

    public WorkThread(RingProgressIndicator rpi){
        this.rpi = rpi;
    }

    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Platform.runLater(()->{
                rpi.setProgress(progress);
            });


            progress++;
            if(progress>100) break;
        }
    }
}
