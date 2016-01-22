/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.plaz3bo.main;

import de.plaz3bo.files.Reader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KrostaA
 */
public class Main {

    public static void main(String[] args) {

        Reader r = new Reader("C://Users//KrostaA//Documents//NetBeansProjects//Printer Tool//src//de//plaz3bo//files//TeamConfig//Teams.ini");
        r.fillTeams();

    }
}
