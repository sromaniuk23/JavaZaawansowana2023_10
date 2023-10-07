public class AndroidTV {
    public static void main(String[] args) {
        final String player = args[0];
        VodPlayer vodPlayer;
        if (player.equals("Netflix")) {
            vodPlayer = new NetflixPlayer();
        } else if (player.equals("HBO")) {
            vodPlayer = new HBOGoPlayer();
        } else {
            vodPlayer = new DefaultPlayer();
        }
        playEpisode(vodPlayer, "GOT_S1E1");
    }

    static void playEpisode(VodPlayer vodPlayer, String title) {
        // nie wiemy z jaką implementacją mamy do czynienia
        vodPlayer.play(title);
    }
}