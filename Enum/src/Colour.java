public enum Colour {
    RED(255, 0 ,0),
    GREEN(0, 255, 0),
    BLUE(0,0,255),
    YELLOW(255,255,0),
    MAGENTA(255,0,255),
    SILVER(192,192,192),
    OLIVE(128, 128, 0);

    final int r, g, b;

    Colour(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }

}
