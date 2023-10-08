public class AndroidSmartphone extends Smartphone implements GetWeatherInfo{
    @Override
    public void stop() {
        System.out.println("Stop playing music on Android smartphone!");
    }

    @Override
    public void play() {
        super.play();
    }

    @Override
    public void rewindBackward() {
        super.rewindBackward();
    }

    @Override
    public void rewindForward() {
        super.rewindForward();
    }

    @Override
    public void callMyGirl() {
        super.callMyGirl();
    }
}
