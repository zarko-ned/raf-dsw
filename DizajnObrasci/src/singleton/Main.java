package singleton;

public class Main {
    public static void main(String[] args) {
        // Pristupanje jedinstvenoj instanci DataBase klase
        DataBase db1 = DataBase.getInstance();
        DataBase db2 = DataBase.getInstance();

        // Provera da li su obe reference na isti objekat
        System.out.println("db1 and db2 are the same instance: " + (db1 == db2));

        // Insertovanje objekata u bazu
        db1.insert(1, "Object 1");
        db1.insert(2, "Object 2");
        db2.insert(3, "Object 3"); // Koristimo drugu referencu, ali je instanca ista

        // Prikaz svih objekata u bazi
        db1.displayAll();

        // Dobijanje objekta iz baze
        Object obj = db1.get(2);
        System.out.println("Retrieved object: " + obj);

        // Brisanje objekta iz baze
        db1.delete(1);
        db1.displayAll();
    }
}