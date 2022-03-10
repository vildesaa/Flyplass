public class Fly implements Comparable<Fly> {

    private String flyNummer;
    private String til;
    private String fra;
    private int avgangstid;
    private Fly foran = null;
    private Fly etter = null;
    
    public Fly(String flyNr, String til, String fra, int avgangstid){
        flyNummer = flyNr;
        this.til = til;
        this.fra = fra;
        this.avgangstid = avgangstid;
    }
    public Fly hentForan(){
        return foran;   
    }
    
    public Fly hentEtter(){
        return etter;        
    }    
     
    @Override
    public String toString() {return null;}{
        String string = "Flynummer: " + flyNummer + "\nAvgangstid: " + avgangstid + "\nFra: " + fra + "\nTil: " + til;
        return string;
        
    }    

    // Sorterer flyene fra foerste til siste avgangstid
    @Override
    public int compareTo(Fly annen){
        if(this.avgangstid < annen.avgangstid){
            return -1;
        }
        else if (this.avgangstid > annen.avgangstid){
            return 1;
        } else {
            return 0;
        }    
    }    
}
