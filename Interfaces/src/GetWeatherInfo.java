public interface GetWeatherInfo {

    default void getTemperature(){
        System.out.println("It's very hot");
    }

    default void getHumidity(){
        System.out.println("50%");
    }
}
