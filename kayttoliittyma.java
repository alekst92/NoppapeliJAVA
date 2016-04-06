package noppapeli;

public class kayttoliittyma {
    private noppapeli noppapeli;
    public kayttoliittyma(){    //constructor
        this.noppapeli = new noppapeli();
    }
    public void kaynnista(){
        this.noppapeli.kaynnista();
    }
}
