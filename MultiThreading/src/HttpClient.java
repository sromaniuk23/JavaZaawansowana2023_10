class HttpClient {
    public static void main(String[] args) {
        HttpAction httpAction = new HttpAction();
        httpAction.start();//uruchomienie wątku
        HttpAction httpAction1 = new HttpAction();

        //uzywajac metody run nie tworzymy nowego watku tylko wywolujemy metode run w watku w ktorym sie znajdujemy
        httpAction1.run();

    }
}
