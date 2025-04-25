package PassionProject.UntitledGame;

import java.awt.List;
import java.io.File;
import java.lang.StringBuilder;
import java.io.IOException;
import java.util.Scanner;
import PassionProject.UntitledGame.Locations;

public class LevelBuilder {

//    private String filePath;
//    private List locationList = new List();
//    private String locationInfo;
//
//    public LevelBuilder(String filePath) {
//        this.filePath = filePath;
//        this.locationInfo = readFile(filePath);
//        this.locationList = null;
//    }
//
//    public String readFile(String name) {
//        ClassLoader classLoader = getClass().getClassLoader();
//        File file = new File(classLoader.getResource(name).getFile());
//        StringBuilder str = new StringBuilder("");
//        try (Scanner scan = new Scanner(file)) {
//            while(scan.hasNextLine()) {
//                String roomDesc = scan.nextLine();
//                str.append(roomDesc).append("\n");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return str.toString();
//    }
//
//    public void addPath(Locations path) {
//        locationList.add(path.getLocationName());
//    }
//
//    public List buildList(String input) {
//        String[] rooms = input.split("##");
//        for (String roomDetails : rooms) {
//            String[] details = roomDetails.split("; ");
//            String[] branches = new String[5];
//            if (details.length == 4) {
//                branches = details[3].split("/");
//            }
//            List subList = new List();
//            for (String paths : branches) {
//                subList.add(paths);
//            }
//            this.addPath(new Locations(details[0], details[1], details[2], subList));
//        }
//        return this.locationList;
//    }

}
