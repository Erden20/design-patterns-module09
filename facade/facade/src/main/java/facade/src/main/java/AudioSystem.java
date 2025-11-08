public class AudioSystem {
    private int volume;

    public void on() {
        System.out.println("AudioSystem is ON");
    }

    public void off() {
        System.out.println("AudioSystem is OFF");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("AudioSystem volume set to " + volume);
    }
}
