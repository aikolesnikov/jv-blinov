package classes;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class PlayFiles {

    public static void main(String[] args) throws IOException {
// объект типа File связывается с файлом на диске testFile.txt
        File fp = new File("file" + File.separator + "testFile.txt");
        if (fp.exists()) {
            System.out.println(fp.getName() + " существует");
            if (fp.isFile()) {// если объект – файл
                System.out.println("Путь к файлу: " + fp.getPath());
                System.out.println("Абсолютный путь: " + fp.getAbsolutePath());
                System.out.println("Размер файла: " + fp.length());
                System.out.println("Последняя модификация: " + new Date(fp.lastModified()));
                System.out.println("Файл доступен для чтения: " + fp.canRead());
                System.out.println("Файл доступен для записи: " + fp.canWrite());
                System.out.println("Файл удален: " + fp.delete());
            }
        } else {
            System.out.println("файл с именем " + fp.getName() + " не существует");
            try {
                if (fp.createNewFile())
                    System.out.println("Файл с именем " + fp.getName() + " создан");
            } catch (IOException e) {
                System.err.println(e);
            }
        }

// Далее в объект типа File помещается каталог
// в корне проекта должен быть создан каталог file.sample с несколькими
// файлами
        File dir = new File("file" + File.separator + "sample");
        if (dir.exists() && dir.isDirectory()) {
// если объект является каталогом и если этот каталог существует
            System.out.println("каталог " + dir.getName() + " существует");
            File[] files = dir.listFiles();
            for (int i = 0; i < files.length; i++) {
                Date date = new Date(files[i].lastModified());
                System.out.print("\n" + files[i].getPath() + " | " + files[i].length() + " | " + date.toString());
            }
        }
        File[] paths; // массив для доступных корневых путей
        try {
// метод listRoots() возвращает доступные корневые каталоги в массив
            paths = File.listRoots();
            System.out.println();
// для каждого каталога в массиве
            for (File path : paths) {
// выводится путь и доступное и свободное пространство
                System.out.printf("\n%s %,d из %,d свободно.", path.getPath(), path.getUsableSpace(), path.getTotalSpace());
            }
        } catch (Exception e) {
// если происходит любая ошибка
            e.printStackTrace();
        }
    }

}
