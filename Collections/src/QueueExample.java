import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> pokemons = new LinkedList<>();
        pokemons.offer("Pikachu");
        pokemons.offer("Charmander");
        System.out.println(pokemons.poll());
        System.out.println(pokemons.peek());

    }
}
