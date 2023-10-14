public class CW1 {
    public static void main(String[] args) {
        SDAArrayList<String> stringSDAArrayList = new SDAArrayList<>();

        stringSDAArrayList.add("a");
        stringSDAArrayList.add("b");
        stringSDAArrayList.add("c");
        stringSDAArrayList.add("d");
        stringSDAArrayList.add("c");
        stringSDAArrayList.add("e");
        stringSDAArrayList.add("c");
        stringSDAArrayList.add("f");

        stringSDAArrayList.display();
        stringSDAArrayList.remove("c");
        stringSDAArrayList.display();

        SDAArrayList<Integer> integerSDAArrayList = new SDAArrayList<>();

        for(int i=0; i<50; i++){
            integerSDAArrayList.add((int)(Math.random()*10));
        }
        integerSDAArrayList.display();
        integerSDAArrayList.remove(5);
        integerSDAArrayList.display();

    }


}
