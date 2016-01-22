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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KrostaA
 */
public class Reader {

    private String teams[];
    private FileReader fileReader;
    private final String teamsPfad;
    BufferedReader br;

    public Reader(String path) {
        teamsPfad = path;
        //System.out.println(teams[0]);

    }

    public void fillTeams() throws IOException {
        try {
            fileReader = new FileReader(teamsPfad);
        } catch (FileNotFoundException ex) {
            System.err.println("Fehler bei 'fillTeams' in der Klasse Reader: 'File not Found exception");
            return;
        }
        br = new BufferedReader(fileReader);
        //System.out.println(br.readLine());
int i = 0;
        teams = new String[2];
        String s = br.readLine();
        while(s != null){
            teams[i] = s;
            //System.out.println(br.readLine());
             s = br.readLine();
            i++;
        }
        

                
                

//            } catch (IOException ex) {
//                System.err.println("Fehler beim befüllen des Teamarrays in der Klasse Reader");
//            }
        }

    

    @Override
    public String toString() {
        return teams[0];
    }

}
