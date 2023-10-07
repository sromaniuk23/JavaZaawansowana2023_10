class Ram {
    private String name;
    private int size;

    public Ram(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}