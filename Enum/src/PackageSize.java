public enum PackageSize {
    SMALL(5, 30),
    MEDIUM(31, 70),
    LARGE(71, 200);

    int minSize, maxSize;

    PackageSize(int minSize, int maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    public PackageSize getPackageSize(int minSize, int maxSize){
        if(minSize>= SMALL.minSize) { //nasza paczka nie moze byc mniejsza niz minimalny dozwolny rozmiar
            if (maxSize <= SMALL.maxSize) {
                return PackageSize.SMALL;
            } else if(maxSize <= MEDIUM.maxSize){
                return PackageSize.MEDIUM;
            } else if(maxSize <= LARGE.maxSize){
                return PackageSize.LARGE;
            }
        }

        throw new RuntimeException("There is no such package size!!");
    }
}
