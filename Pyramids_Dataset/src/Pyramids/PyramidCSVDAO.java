package Pyramids;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PyramidCSVDAO {
    List<Pyramid> pyramidList;


    public PyramidCSVDAO() {
        this.pyramidList = new ArrayList<>();
    }

    public List<Pyramid> readPyramidsFromCSV(String fileName) {
        // reading lines from file and saving them in list
        this.pyramidList = new ArrayList<>();
        File pyramidFile = new File(fileName);
        List<String> lines = new ArrayList<>();
        String[] fields = {};
        try {
            lines = Files.readAllLines(pyramidFile.toPath());
        } catch (Exception e) {
            System.out.println("There is a problem happened." + e);
        }

        // extract all pyramids info and save them in a list
        for (int lineIndex = 0; lineIndex < lines.size(); lineIndex++) {
            String line = lines.get(lineIndex);
            fields = line.split(",");

            for (int fieldIndex = 0; fieldIndex < fields.length; fieldIndex++) {
                fields[fieldIndex] = fields[fieldIndex].trim();
            }
            createPyramid(fields);
        }
        // pyramidList.add(createPyramid(fields));
        return this.pyramidList;
    }

    public Pyramid createPyramid (String[]fields){
        Pyramid pyramid = new Pyramid();


        try {
            pyramid.setPharaoh(fields[0]);
        }catch (Exception ex){
            pyramid.setPharaoh("Null");
        }
        try {
            pyramid.setModern_name(fields[1]);
        }catch (Exception ex){
            pyramid.setModern_name("Null");
        }
        try {
            pyramid.setSite(fields[4]);
        }catch (Exception ex){
            pyramid.setSite("Null");
        }
        try {
            pyramid.setHeight(Double.parseDouble(fields[7]));
        }catch (Exception ex){
            pyramid.setHeight(0);
        }
        pyramidList.add(pyramid);

        return pyramid;
    }
}