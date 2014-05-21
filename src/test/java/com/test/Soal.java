/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Apey
 */
public class Soal {
    
    public Soal() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Before
    public void soal(){
        soal1 = new com.ujian.ujian_rkppl.Soal();
    }
    
    private static com.ujian.ujian_rkppl.Soal soal1;
    
    @Test
    public void tesPangkat(){
        soal1.pangkat(2, 2);
        soal1.pangkat(0, 1);
    }
    
    @Test
    public void tesFaktorial(){
        soal1.faktorial(5);
        soal1.faktorial(0);
    }
}
