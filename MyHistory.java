/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myhistory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * @author 2016-e-kodytek
 */
public class MyHistory extends Hlavni {
    //private String name;
    ArrayList a = new ArrayList();
    private Path pa;

    public MyHistory(String fileName) {
        // name=fileName;
        pa = Paths.get(fileName);
    }

    public void read() throws IOException {
        Files.readAllLines(pa);
     /*   for (int i = 0; i < a.size(); i++) {
            a.get(i);
        }
  */

    }

    public void save() throws IOException {
        Files.write(pa, a);
    }

    public void addLine(String str) {
        if (a == null) {
            a = new ArrayList<>();
        } else {
            if (!a.contains(str)) {
        }
    }

    public String toString() {
        return String.join("\n", a);
    }

}
   
