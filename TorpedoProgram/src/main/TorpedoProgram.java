package main;

import java.util.Random;
import java.util.Scanner;

public class TorpedoProgram {
static String[] palya = new String[7];
static String[] hajo = new String[3];
static int rHely;

    public static void main(String[] args) {
        PalyaGeneral();
        System.out.println(" ");
        HajoGeneral();
        JatekosLoves(rHely);
    }
    public static void PalyaGeneral(){
     for (int i = 0; i < palya.length ; i++) {
            palya[i]="_";
            System.out.print(palya[i]+" ");
        } 
    }
    public static void HajoGeneral(){
        Random rnd = new Random();
        rHely = rnd.nextInt(5);
            for (int j = 0; j < palya.length; j++) {
                palya[rHely]="X";
                palya[rHely+1]="X";
                palya[rHely+2]="X";
        }
        
        for (int i = 0; i < palya.length; i++) {
            System.out.print(palya[i]+" ");
        }
       
    }
    //Ricsi munkája:
    public static void JatekosLoves(int rHely){
        System.out.println("\nKérlek add meg a tippelt számot! (1-7):");
        Scanner sc = new Scanner(System.in);
        int loves = sc.nextInt();
        for (int i = 0; i < palya.length; i++) {
            if (loves==rHely || loves==rHely+1 || loves==rHely+2) {
                System.out.println("Talált!");
            }else{
                System.out.println("Nem talált!");
            }
        }
    }
}