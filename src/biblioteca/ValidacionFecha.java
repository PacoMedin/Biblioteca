
package biblioteca;

import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 *
 * @author paco
 */
public class ValidacionFecha implements IFecha , Serializable {
     private int dia,mes,Anio;
    IFecha ifecha;
    GregorianCalendar FechaActual=new GregorianCalendar();
    public ValidacionFecha(int dia, int mes, int Anio) {
        this.dia = dia;
        this.mes = mes;
        this.Anio = Anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return Anio;
    }

    public void setAnio(int Anio) {
        this.Anio = Anio;
    }

    public IFecha getIfecha() {
        return ifecha;
    }

    public void setIfecha(IFecha ifecha) {
        this.ifecha = ifecha;
    }

       
    private boolean bisiesto(){
    return(((Anio%4==0)&&(Anio%100!=0))|(Anio%400==0));
    }
    
    public boolean FechaCorrecta(){
        
    boolean DiaCorrecto,MesCorrecto,AnioCorrecto;
    AnioCorrecto=(Anio>=2017)&&(Anio<=2018);
    int MesActual=FechaActual.get(Mes_Del_Anio);
    int DiaActual=FechaActual.get(Dia_Del_Mes);
    MesCorrecto=((mes>=1)&&(mes<=12))&&(mes<=MesActual+04)&&(mes>MesActual);
    switch (mes){
        case 2: if(bisiesto()) 
                     DiaCorrecto=((dia>=1)&&(dia<=29))&&((mes==(MesActual+01))&&(dia>=DiaActual))||((dia>=1)&&(dia<=31))&&((mes==MesActual+04)&&(dia<=DiaActual))||((dia>=1)&&(dia<=31))&&(mes>MesActual+01)&&(mes<MesActual+04);
            else     DiaCorrecto=((dia>=1)&&(dia<=28))&&((mes==(MesActual+01))&&(dia>=DiaActual))||((dia>=1)&&(dia<=31))&&((mes==MesActual+04)&&(dia<=DiaActual))||((dia>=1)&&(dia<=31))&&(mes>MesActual+01)&&(mes<MesActual+04); 
                break;
            case 4:  DiaCorrecto=((dia>=1)&&(dia<=30))&&((mes==(MesActual+01))&&(dia>=DiaActual))||((dia>=1)&&(dia<=31))&&((mes==MesActual+04)&&(dia<=DiaActual))||((dia>=1)&&(dia<=31))&&(mes>MesActual+01)&&(mes<MesActual+04); 
                break;//30
            case 6:  DiaCorrecto=((dia>=1)&&(dia<=30))&&((mes==(MesActual+01))&&(dia>=DiaActual))||((dia>=1)&&(dia<=31))&&((mes==MesActual+04)&&(dia<=DiaActual))||((dia>=1)&&(dia<=31))&&(mes>MesActual+01)&&(mes<MesActual+04); 
                break;//30
            case 9:  DiaCorrecto=((dia>=1)&&(dia<=30))&&((mes==(MesActual+01))&&(dia>=DiaActual))||((dia>=1)&&(dia<=31))&&((mes==MesActual+04)&&(dia<=DiaActual))||((dia>=1)&&(dia<=31))&&(mes>MesActual+01)&&(mes<MesActual+04); 
                break;//30
            case 11: DiaCorrecto=((dia>=1)&&(dia<=30))&&((mes==(MesActual+01))&&(dia>=DiaActual))||((dia>=1)&&(dia<=31))&&((mes==MesActual+04)&&(dia<=DiaActual))||((dia>=1)&&(dia<=31))&&(mes>MesActual+01)&&(mes<MesActual+04); 
                break;//30
            default: DiaCorrecto=((dia>=1)&&(dia<=31))&&((mes==(MesActual+01))&&(dia>=DiaActual))||((dia>=1)&&(dia<=31))&&((mes==MesActual+04)&&(dia<=DiaActual))||((dia>=1)&&(dia<=31))&&(mes>MesActual+01)&&(mes<MesActual+04); 
                break; 
        }
    return DiaCorrecto&&MesCorrecto&&AnioCorrecto;
    }

    @Override
    public int dia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int mes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int anio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
