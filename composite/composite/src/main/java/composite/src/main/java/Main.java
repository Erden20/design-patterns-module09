public class Main {
    public static void main(String[] args) {
        // Создаём файлы
        File file1 = new File("file1.txt", 10);
        File file2 = new File("file2.txt", 20);
        File file3 = new File("file3.txt", 30);

        // Создаём папки
        Directory dir1 = new Directory("Documents");
        Directory dir2 = new Directory("Images");
        Directory dir3 = new Directory("Projects");

        // Добавляем файлы в папки
        dir1.addComponent(file1);
        dir1.addComponent(file2);

        dir2.addComponent(file3);

        dir3.addComponent(dir1);
        dir3.addComponent(dir2);

        // Вывод структуры и размера
        dir3.display();
        System.out.println("Total size: " + dir3.getSize());
    }
}
