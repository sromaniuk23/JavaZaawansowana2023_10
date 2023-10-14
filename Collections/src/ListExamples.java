import java.util.ArrayList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        List<Float> transfers = new ArrayList<>();
        transfers.add(120.0f);
        transfers.add(400.0f);
        transfers.add(5000.0f);
        transfers.add(120.0f);
        for (Float transfer : transfers) {
            System.out.println(transfer);
        }

        System.out.println(transfers.get(2));
    }
}
