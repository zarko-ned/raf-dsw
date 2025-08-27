package creational.singleton;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
    // Staticka promenljiva koja cuva jedinstvenu instancu
    private static DataBase instance;

    // Mapa koja simulira bazu podataka
    private Map<Integer, Object> databaseMap;

    // Privatni konstruktor sprečava instanciranje spolja
    private DataBase() {
        databaseMap = new HashMap<>();
        System.out.println("DataBase instance created.");
    }

    // Staticka metoda koja vraca jedinstvenu instancu
    public static synchronized DataBase getInstance() {
        if (instance == null) {
            instance = new DataBase();
        }
        return instance;
    }

    // Metoda za insertovanje objekta u mapu
    public void insert(Integer key, Object value) {
        databaseMap.put(key, value);
        System.out.println("Inserted object with key: " + key);
    }

    // Metoda za dobijanje objekta iz mape
    public Object get(Integer key) {
        return databaseMap.get(key);
    }

    // Metoda za prikaz svih objekata u mapi
    public void displayAll() {
        System.out.println("Database contents:");
        for (Map.Entry<Integer, Object> entry : databaseMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    // Metoda za brisanje objekta iz mape
    public void delete(Integer key) {
        databaseMap.remove(key);
        System.out.println("Deleted object with key: " + key);
    }
}