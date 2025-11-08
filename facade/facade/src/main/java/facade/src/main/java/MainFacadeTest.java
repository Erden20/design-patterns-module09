public class MainFacadeTest {
    public static void main(String[] args) {
        // Создаём подсистемы
        TV tv = new TV();
        AudioSystem audio = new AudioSystem();
        DVDPlayer dvd = new DVDPlayer();
        GameConsole console = new GameConsole();

        // Создаём фасад
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, audio, dvd, console);

        // Сценарий 1: Смотреть фильм
        homeTheater.watchMovie();
        homeTheater.endMovie();

        // Сценарий 2: Играть в игру
        homeTheater.playGame();

        // Сценарий 3: Слушать музыку и менять громкость
        homeTheater.listenMusic();
        homeTheater.setVolume(25);
    }
}
