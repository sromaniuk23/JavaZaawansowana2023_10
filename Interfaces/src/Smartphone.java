public class Smartphone implements MediaPlayer, RewindInterface{
    @Override
    public void stop() {
        System.out.println("Stop playing music on smartphone!");
    }

    @Override
    public void play() {
        System.out.println("Start playing music on smartphone!");
    }

    @Override
    public void rewindBackward() {
        System.out.println("Song is rewinding backward on Smartphone");
    }

    @Override
    public void rewindForward() {
        System.out.println("Song is rewinding forward on Smartphone");
    }

    public void callMyGirl(){
        System.out.println("Calling !");
    }
}
