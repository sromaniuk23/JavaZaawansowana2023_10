import java.util.Arrays;

public class CW3 {
    public static void main(String[] args) {
        String[] strings = new String[]{"abc", "def", "ghi", "jkl", "mno"};

        //metoda swap tworzy nowa tablice kopiujac tablice podana jako argument
        String[] result = swap(strings, 0,3);
        showTable(result);
        showTable(strings);

        //zas metoda swapNonCopy dokonuje zmiany referencji elementow na tablicy podanej jako argument
        String[] resultNonCopy = swapNonCopy(strings, 0,3);
        showTable(resultNonCopy);
        showTable(strings);
    }



    private static <T> T[] swap(T[] table, int pos1, int pos2){
        //kopiowanie tablicy
        T[] resultingTable = Arrays.copyOf(table, table.length);

        resultingTable[pos1] = table[pos2];
        resultingTable[pos2] = table[pos1];

        return resultingTable;
    }

    private static <T> T[] swapNonCopy(T[] table, int pos1, int pos2){
        //element tymczasowy, tu przechowany na czas kopiowania dana wartosc
        T temporaryElement = table[pos1];
        table[pos1] = table[pos2];
        table[pos2] = temporaryElement;

        return table;
    }

    private static <T> void showTable(T[] table){
        System.out.print("{");
        int ind=0;
        for(T s:table){
            if(ind++<table.length-1){
                System.out.print(s+", ");
            } else {
                System.out.print(s);
            }

        }
        System.out.println("}");
    }
}
