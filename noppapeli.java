package noppapeli;
import java.util.*;

public class noppapeli {
    private Scanner lukija;
    private ArrayList<Integer> lista;
    public noppapeli(){     //constructor
        this.lukija = new Scanner(System.in);
        this.lista = new ArrayList<Integer>();
    }
    public void arvaatulos(){
        int luku = 0;
        System.out.print("Arvaa noppien yhteenlaskettu tulos(min 2 max 12): "); 
        while(true){
            luku = this.lukija.nextInt();
            if(luku < 2 || luku > 12){
                System.out.print("Arvattu tulos liian suuri tai pieni, arvaa uudelleen: ");
            }
            else{
                break;  //arvattu tulos kelvollinen
            }
        }
        this.lista.add(luku);
    }
    public void heitanoppaa(){
        int i,luku;
        System.out.println("Heitetaan noppaa...");
        for(i=0;i<2;i++){
            luku = 1 + (int)(Math.random() * ((6 - 1) + 1));
            this.lista.add(luku);
        }
    }
    public void tarkistatulos(){
        int yhteensa;
        yhteensa = this.lista.get(1) + this.lista.get(2);

        if(yhteensa == this.lista.get(0)){   //lista.get(0) = arvaus
                System.out.println("Onneksi olkoon! Arvasit Oikein! ^.^  noppien osumat: " + this.lista.get(1) + " ja " + this.lista.get(2)+ ". yhteensa " + yhteensa + ".");
            }
        else{
                System.out.println("Arvasit vaarin :( noppien osumat: " + this.lista.get(1) + " ja " + this.lista.get(2)+ ". yhteensa " + yhteensa + ".");
            }
    }
    public boolean valitse(){
        int luku;
        while(true){
            System.out.println("Pelaa uudelleen---1");
            System.out.println("Lopeta------------2 ");
            System.out.print("Valintasi: ");
            luku = lukija.nextInt();
            if(luku == 1){
                    this.lista.clear();
                    return true;
                }
            else if(luku == 2){
                    System.out.println("Lopetetaan...");
                    return false;
                }
            else{
                    System.out.println("\n\n");
                    System.out.println("Vaara valinta. Valitse 1 tai 2");
                    System.out.println("\n\n");
            }
        }
    }
    public void kaynnista(){
        boolean luku;
        while(true){
            this.arvaatulos();
            System.out.println("\n\n");
            this.heitanoppaa();
            System.out.println("\n\n");
            this.tarkistatulos();
            System.out.println("\n\n");
            luku = this.valitse();
            System.out.println("\n\n");

            if(luku == false){              // lopeta
                break;
            }
        }
    }        
}
