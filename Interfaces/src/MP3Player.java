public class MP3Player implements MediaPlayer, RewindInterface{
    @Override
    public void stop() {
        System.out.println("Music stopped! MP3Player");
    }

    @Override
    public void play() {
        System.out.println("Start playing! MP3Player");
    }

    @Override
    public void rewindBackward() {
        System.out.println("Song is rewinding backward on MP3Player");
    }

    @Override
    public void rewindForward() {
        System.out.println("Song is rewinding forward on MP3Player");
    }

    public void ejectDisc(){
        System.out.println("Disc ejected");
    }
}
