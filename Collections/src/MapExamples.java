import java.util.HashMap;
import java.util.Map;

public class MapExamples {
    public static void main(String[] args) {

        //tworzenie obiektu typu Map
        Map<String, Float> employees = new HashMap<>();
        //dodawania elementów do mapy
        employees.put("John Dool", 3000.0f);
        employees.put("Chao Di", 4500.0f);
        employees.put("Prasad D", 1000.0f);
        //usuwanie element z mapy o danym kluczu
        employees.remove("John Dool");
        //pobieranie elementu z mapy o danym kluczu
        System.out.println(employees.get("Prasad D"));
        for (String key : employees.keySet()) {
            System.out.println("Pracownik: " + key);
        }
        for (float value : employees.values()) {
            System.out.println("Wypłata: "+ value);
        }
        for (Map.Entry<String, Float> pair : employees.entrySet()) {
            System.out.println("Pracownik-wypłata " + pair);
        }

    }
}
