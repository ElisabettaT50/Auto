public class Main{
    public static void main(String []args){
        Auto auto1 = new Auto(1400, "ZA406VZ", 'a', "Jeep");

       System.out.println("Dettagli: ");
        System.out.println("Cilindrata: " + auto1.getCilindrata());
        System.out.println("Targa: " + auto1.getTarga());
        System.out.println("Modello: " + auto1.getModello());
        System.out.println("Marca: " + auto1.getMarca());

        auto1.setCilindrata(1300);
        auto1.setTarga("GH321FZ");
        auto1.setModello('f');
        auto1.setMarca("Honda");

        System.out.println(auto1);
    }
}