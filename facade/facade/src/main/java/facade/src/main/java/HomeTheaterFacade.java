public class HomeTheaterFacade {
    private TV tv;
    private AudioSystem audio;
    private DVDPlayer dvd;
    private GameConsole console;

    public HomeTheaterFacade(TV tv, AudioSystem audio, DVDPlayer dvd, GameConsole console) {
        this.tv = tv;
        this.audio = audio;
        this.dvd = dvd;
        this.console = console;
    }

    // Просмотр фильма
    public void watchMovie() {
        System.out.println("Starting movie...");
        tv.on();
        audio.on();
        audio.setVolume(20);
        dvd.on();
        dvd.play();
    }

    // Выключение всей системы
    public void endMovie() {
        System.out.println("Shutting down system...");
        dvd.stop();
        dvd.off();
        audio.off();
        tv.off();
    }

    // Игровой режим
    public void playGame() {
        System.out.println("Starting game...");
        tv.on();
        console.on();
        console.playGame();
    }

    // Прослушивание музыки
    public void listenMusic() {
        System.out.println("Listening to music...");
        tv.on();
        audio.on();
        audio.setVolume(15);
    }

    // Регулировка громкости через фасад
    public void setVolume(int volume) {
        audio.setVolume(volume);
    }
}
