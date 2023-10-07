public enum JsonSerializationStrategy implements IdProvider {
    SNAKE_CASE("snake case"),
    CAMEL_CASE("camel case", "1"),
    KEBAB_CASE("kebab case", "2");

    private final String readableName;
    private final String id;

    JsonSerializationStrategy(final String readableName) {
        this.readableName = readableName;
        this.id = "0";
    }

    JsonSerializationStrategy(final String readableName, final String id) {
        this.readableName = readableName;
        this.id = id;
    }

    public String getReadableName() {
        return readableName;
    }

    @Override
    public String getId() {
        return id;
    }
}
