public class LineRunnable implements Runnable{
    //static sprawia ze dane pole jest wspoldzielone w obrebie klasy!!!
    //w przypadku programow sekwencyjnych kolejne instancje klas po prostu maja referencje na ten sam adres w pamieci
    //w przypadku programow wielowatkowych z definicji wielowatkowosci kolejne instancje posiadaja lokalne kopie pol statycznych
    //w danych watkach, ktore to sa posiadaja powiazanie z pewnym adresem w globalnej pamieci procesu
    static Line line = new Line();

    @Override
    public void run() {
        line.getLine(2, 5);
    }
}
