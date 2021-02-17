import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SerieMultiplos {
    HashMap<String, ArrayList<Integer>> mapMultiplos = new HashMap<>();

    public SerieMultiplos() {
    }

    public void añadirEntrada(int num) {
        mapMultiplos.put(String.valueOf(num), generarMultiplos(num));
    }

    private ArrayList<Integer> generarMultiplos(int num) {
        ArrayList<Integer> multiplos = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            multiplos.add(i * num);
        }
        return multiplos;
    }

    public ArrayList<Integer> obtenerMultiplos(int num) {
        ArrayList<Integer> multiplos = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            multiplos.add(i * num);
        }

        System.out.println(multiplos + "'");
        return multiplos;
    }

    public void escribirMap() {
        Iterator<Map.Entry<String, ArrayList<Integer>>> iterator = mapMultiplos.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, ArrayList<Integer>> pair = iterator.next();
            escribirValor(pair.getValue());
        }
    }

    private void escribirValor(ArrayList<Integer> lista) {
        System.out.println(mapMultiplos.containsValue(lista));
        for (Map.Entry<String, ArrayList<Integer>> entry: mapMultiplos.entrySet()){
            if (entry.getValue().equals(lista)){
                System.out.println(entry.getValue());
                System.out.println(entry.getKey());
            }
        }

    }
}


