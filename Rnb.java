/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if1.pkg10119024.kusnandipirmansyah.no3;

/**
 *
 * @author acer
 */
public class Rnb extends MusicGenre implements Blues, Jazz{
    @Override
    public void genreJazz(String artisName) {
        System.out.println(artisName+"adalah genre Jazz");
    }
    @Override
    public void genreBlues(String artisName) {
        System.out.println(artisName+"adalah genre Blues");
    }
    
}
