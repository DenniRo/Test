/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testatclass;

/**
 *
 * @author Dennis
 */
public class ContextCompresion {
    
    private Compresion compresion;
    
    public ContextCompresion(Compresion compresion){   
        this.setCompresion(compresion);
    }
    
    public void setCompresion(Compresion compresion){
        this.compresion = compresion;
    }
    
    public void doCompress(){
        this.compresion.compress();
    }
}
