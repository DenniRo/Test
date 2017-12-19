/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testatclass;


import Exceptions.Exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dennis
 */
public class TestAtClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Compresion compresion1 = new Zip();
        Compresion compresion2 = new Rar();
        ContextCompresion contextCompresion = new ContextCompresion(compresion1);
        contextCompresion.doCompress();
        
        contextCompresion.setCompresion(compresion2);
        contextCompresion.doCompress();
        
        System.out.println("YOYOY");
        System.out.println("LOLOLO");
                
    }
    
}

