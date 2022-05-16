package main;

public class TorpedoProgram {
static String[] palya = new String[7];
    public static void main(String[] args) {
        PalyaGeneral();
       
    }
    public static void PalyaGeneral(){
     for (int i = 0; i < palya.length ; i++) {
            palya[i]="_";
            System.out.print(palya[i]+" ");
        }
     
    }
}