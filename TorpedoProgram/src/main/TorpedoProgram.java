package main;

import java.util.Random;

public class TorpedoProgram {
static String[] palya = new String[7];
    public static void main(String[] args) {
        PalyaGeneral();
        HajoGeneral();
    }
    public static void PalyaGeneral(){
     for (int i = 0; i < palya.length ; i++) {
            palya[i]="_";
            System.out.print(palya[i]+" ");
        } 
    }
    public static void HajoGeneral(){
        Random rnd = new Random();
        int rHely = rnd.nextInt(7);
            for (int j = 0; j < palya.length; j++) {
                palya[rHely]="X";
        }
        
        for (int i = 0; i < palya.length; i++) {
            System.out.println(palya[i]);
        }
    }
}