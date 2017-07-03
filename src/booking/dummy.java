/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author Amr
 */
public class dummy {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String output = "asdgf\n";
        output += "asdgf\n";
        output += "asdgf\n";
        output += "asdgf\n";
        output += "asdgf\n";
        File fout = new File("abc.txt");
        fout.createNewFile();
        FileOutputStream fos = new FileOutputStream(fout);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        bw.write(output);
        bw.close();
    }
}
