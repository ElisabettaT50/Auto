public class Main {
    public static void main(String []Args) {

        Studente studente1 = new Studente("Andrea", "Rossi", 99951);

        System.out.println("Nome studente: " + studente1.getNome());
        System.out.println("Cognome studente: " + studente1.getCognome());
        System.out.println("ID studente: " + studente1.getId());

        studente1.setNome("Gaia");
        studente1.setCognome("Bianchi");
        studente1.setId(99952);

        System.out.println(studente1);
    }
}
