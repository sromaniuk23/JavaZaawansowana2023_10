public enum Country {
    POLAND("Warsaw"),
    GERMANY("Berlin"),
    FRANCE("Paris");
//    SPAIN,
//    ITALY,
//    PORTUGAL,
//    GREAT_BRITAIN,
//    CHINA;

    final String capital;

    Country(String capital) {
        this.capital = capital;
    }
}
