import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GameProgress firstGamer = new GameProgress(100, 3, 80, 42.6);
        GameProgress secondGamer = new GameProgress(81, 4, 73, 84.1);
        GameProgress thirdGamer = new GameProgress(45, 1, 15, 107.8);

        firstGamer.saveGame("D://Games/savegames/save1.dat", firstGamer);
        secondGamer.saveGame("D://Games/savegames/save2.dat", secondGamer);
        thirdGamer.saveGame("D://Games/savegames/save3.dat", thirdGamer);

        ArrayList<String> files = new ArrayList<>();
        files.add("D://Games/savegames/save1.dat");
        files.add("D://Games/savegames/save2.dat");
        files.add("D://Games/savegames/save3.dat");

        GameProgress.zipFiles("D://Games/savegames/zip.zip", files);

        GameProgress.deleteFiles("D://Games/savegames/save1.dat");
        GameProgress.deleteFiles("D://Games/savegames/save2.dat");
        GameProgress.deleteFiles("D://Games/savegames/save3.dat");
    }
}
