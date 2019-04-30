/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ch1;

import io.reactivex.Observable;

/**
 *
 * @author avbravo
 */
public class Ch1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Observable<String> myStrings = Observable.just("Alfa","Beta","Gamma");
        myStrings.map(s -> s.length())
                .subscribe(s-> System.out.println(s));
    }
    
}
