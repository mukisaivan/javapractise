package xLASTLESSONS.TIMER_TASKS;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {


        /*
        Timer =   Schedules tasks for future execution in the background

        TimerTask = schedules for one time or repeated execution

         */
        

        Timer timer = new Timer();

        

        TimerTask task = new TimerTask() {

            int counter = 5;

            @Override
            public void run() {

                if (counter > 0) {
                    System.out.println(counter + " seconds");
                    counter--;
                }
                else {
                    System.out.println(" waited for me !");
                    timer.cancel();
                }


                // created so that when the timer has finished, something in this method is immediately executed
                   // System.out.println("task is complete");
            }  
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2023);
        date.set(Calendar.MONTH, Calendar.FEBRUARY);
        date.set(Calendar.DAY_OF_MONTH, 6);
        date.set(Calendar.HOUR, 1);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);
        

        //timer.schedule(task, date.getTime());     this is to set the specifications for the date created and the timer executes at that time 

        timer.scheduleAtFixedRate(task, 0, 1000);

    }
}
