/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.Calendar;

/**
 *
 * @author paco
 */
public interface IFecha {
     public final static int Dia_Del_Mes = Calendar.DAY_OF_MONTH;
    public final static int Mes_Del_Anio = Calendar.MONTH;
    public final static int anio = Calendar.YEAR;
   
    public abstract int dia();
    public abstract int mes();
    public abstract int anio();
}
