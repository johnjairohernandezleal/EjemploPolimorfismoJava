/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopolimorfismo;

/**
 *
 * @author john hernandez
 */
public class EjemploPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emp = new Empleado("john", 1000);
       // Empleado emp = new Empleado("juan", 1000);
        imprimirDetalles(emp);
        
        Gerente ger = new Gerente("karla", 2000, "finanzas");
        imprimirDetalles(ger);
    }
    
    public static void imprimirDetalles(Empleado emp) {
        System.out.println(emp.obtenerDetalles());
        
    }
    
}
