/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package export_import_mysql;

import LD_Presentation.JFPrincipal_ExportDB;

/**
 *
 * @author KGR
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFPrincipal_ExportDB viewR = new JFPrincipal_ExportDB();

        //Mostrar vista Principal
        viewR.setLocationRelativeTo(null);
        //Guardar datos en variables
        viewR.setVisible(true);
        
        
        
    }
    
}
