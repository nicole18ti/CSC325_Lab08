/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.farmingdale.csc325_week8_lab;

import java.awt.print.Paper;

public class Application {
    // Application to describe the garment

    private Professional p;
    private Casual c;
    private Party pa;

   

    public void content() {
        p.professionalPiece();
        c.causalPiece();
        pa.partyPiece();
    }

}
