package OBJECTORIENTEDPROGRAMMING.AUDIOPAYER;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Audioplayer {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        Scanner scanner = new Scanner(System.in); // this is inserted here so that to get the user ineraction so that the audio doesnot play infinitely in the background


        File file = new File("OBJECTORIENTEDPROGRAMMING/AUDIOPAYER/arguing.wav");

        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";
        
        

        while (!response.equals("Q")) {
            System.out.println("P= play, R = restart, Q= quit, S= Stop");

            System.out.println("Enter your choice: ");
            response = scanner.next();
            response = response.toUpperCase();

            switch (response) {
                case "P":
                    clip.start();
                    ;
                    break;
                case "S":
                    clip.stop();
                    break;
                case "R":
                    clip.setMicrosecondPosition(0);
                    break;
                case "Q":
                    clip.close();
                    break;

                default:
                    System.out.println("the operation entered is not correct");
                    break;
            }

        }
        scanner.close();
        
        System.out.print("thanks bye !!");

        
        
    }
}
