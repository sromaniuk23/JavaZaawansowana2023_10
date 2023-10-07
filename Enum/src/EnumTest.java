public class EnumTest {
    public static void main(String[] args) {
        JsonSerializationStrategy jsonSerializationStrategy = JsonSerializationStrategy.CAMEL_CASE;

//        JsonSerializationStrategy serializationStrategy = new JsonSerializationStrategy(); //to nie zadziala

        JsonSerializationStrategy strategyA = JsonSerializationStrategy.CAMEL_CASE;
        JsonSerializationStrategy strategyB = JsonSerializationStrategy.CAMEL_CASE;
        System.out.println(strategyA == strategyB); // true
        System.out.println(strategyA.equals(strategyB)); // true
        System.out.println(strategyA == JsonSerializationStrategy.KEBAB_CASE);

        System.out.println(strategyA.getId());
        System.out.println(strategyB.getReadableName());

        Difficulty difficulties[] = Difficulty.values();
        System.out.println(difficulties.length);
        for(Difficulty d:difficulties){
            System.out.println(Difficulty.valueOf(d.name()) + ": " + d.name() + " -> " + d.ordinal());

        }


    }
}
