/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myhistory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 2016-e-kodytek
 */
public class MyHistoryTest {

    public MyHistoryTest() {
    }

    @Test
    public void test() throws IOException {
        MyHistory x = new MyHistory("x.txt");


        h.addLine("jedna");
        h.addLine("dva");

        assertEquals("ble", h.toString());
    }

    @Test
    public void test1() throws IOException {
        Path p = Files.createTempFile(null, null);
        ArrayList arr = new ArrayList();

        arr.add("ahoj");
        Files.write(p, a);

        MyHistory h = new MyHistory(p.toString());
        h.read();
    }

}
