package Pyramids;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        List<Pyramid> pyramids = pDAO.readPyramidsFromCSV("C:\\ITI\\Java\\Day 2\\Assignment\\pyramids.csv");

        int i = 0;
        for(Pyramid p:pyramids){
            System.out.println("# " + (i++) +" " + p.toString());
        }
    }
}