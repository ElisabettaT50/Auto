/*
Scrivere un programma che contenga una classe che definisce un Auto che abbia come
proprietà cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getters e setters)
ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto.
 */
public class Auto {

    private int cilindrata;
    private String targa;
    private char modello;
    private String marca;

    public Auto(int cilindrata, String targa, char modello, String marca){
        this.cilindrata = cilindrata;
        this.targa = targa;
        this.modello = modello;
        this.marca = marca;
    }
    public int getCilindrata(){
        return cilindrata;
    }
    public void setCilindrata(int cilindrata){
        this.cilindrata = cilindrata;
    }
    public String getTarga(){
        return targa;
    }
    public void setTarga(String targa){
        this.targa = targa;
    }
    public char getModello(){
        return modello;
    }
    public void setModello(char modello){
        this.modello = modello;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    @Override
    public String toString() {
        return "Auto{" +
                "cilindrata = " + cilindrata +
                ", targa = '" + targa + '\'' +
                ", modello = " + modello +
                ", marca = '" + marca + '\'' +
                '}';
    }
}
