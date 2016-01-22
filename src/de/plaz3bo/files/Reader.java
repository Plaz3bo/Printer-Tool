/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.plaz3bo.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author KrostaA
 */
public class Reader {

    public Reader(String path) throws FileNotFoundException, IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader br = new BufferedReader(fileReader);
        String s = br.readLine();
        while
            (s != null)
        {
            System.out.println(s);
            s = br.readLine();
        }
    }

}
