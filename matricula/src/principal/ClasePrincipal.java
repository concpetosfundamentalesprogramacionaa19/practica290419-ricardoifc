/*
 En esta clase vamos a calcular el valor de una matricula con varios problemas
 */
package principal;
// import paquete1.*;
import java.util.Scanner;
import paquete1.Porcentajes;

/**
 *
 * @author Ricardo Freire
 */
public class ClasePrincipal {
    // declaro un public static para la variable matricula
    public static double matricula=1330;
        public static double total;
    public static void main(String[] arg){
Scanner entrada = new Scanner(System.in);
    // declaro mis variables
    float porCiudad = 0;
    float porEdad = 0;
    float porEstadoCivil = 0;
    float porCargaFamiliar  = 0;
    float porTramite = 0;
    float totalFinal;
    int aux = 0; // creo un auxiliar
    String auxS = null;
    // la ciudad
    System.out.println("Usted es de la ciudad de Zamora o Loja");
    auxS=entrada.next();
    if(auxS.equals("Loja") || auxS.equals("Zamora")){
        porCiudad = (Porcentajes.ciudad);
        }
    auxS=null;
    // edad
    System.out.println("Ingrese su edad");
    aux=entrada.nextInt();
    if (aux >= 17 && aux <20){
        porEdad = (Porcentajes.edad);
        }
    aux = 0;
    // estado civil
    System.out.println("Estado Civil");
    auxS=entrada.next();
    if (auxS.equals("Casado") || auxS.equals("casado")){
        porEstadoCivil = (Porcentajes.civil);
        }
    auxS=null;
    //cargas familiares
    entrada.nextLine();
    System.out.println("¿Cuantas cargas familiares tiene?");
    aux=entrada.nextInt();
    if (aux<1){
        porCargaFamiliar = (Porcentajes.cargoFamiliares);
        }
    // tramites administrativos
    total = porCiudad + porEdad + porEstadoCivil + porCargaFamiliar;
    porTramite = +(Porcentajes.tramite);
    
    //total
    totalFinal = (float) (total -(porCiudad + porEdad + porEstadoCivil + 
            porCargaFamiliar + porTramite));
    System.out.printf("Descuento por ciudad: %2.f\nDesucento por edad: %2.f\n"
       + "Descuento por estado civil%2.fDescuento por cargas familiares%.2f\n"
            + "",total);
    
            
}
    
}
