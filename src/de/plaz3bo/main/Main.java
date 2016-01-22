/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.plaz3bo.main;

import de.plaz3bo.files.Reader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author KrostaA
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Path p = Paths.get(System.getProperty("user.dir"),"src","de","plaz3bo","files","Teams.ini");
        Reader r = new Reader(p.toString());
        r.fillTeams();
        System.out.println(r); 

    }
}
