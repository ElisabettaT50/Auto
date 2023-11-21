/*
Scrivere un programma che contenga una classe che definisce uno Studente che abbia come proprietà nome,
cognome ed identificativo.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Studente.
*/
public class Studente {

    private String nome;

    private String cognome;

    private int id;

    public Studente(String nome, String cognome, int id){
        this.nome = nome;
        this.cognome = cognome;
        this.id = id;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCognome(){
        return cognome;
    }
    public void setCognome(String cognome){
        this.cognome = cognome;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String toString() {

        return "Studente{" +
                "nome = '" + nome + '\'' +
                ", cognome = '" + cognome + '\'' +
                ", id = " + id +
                '}';
    }
}
