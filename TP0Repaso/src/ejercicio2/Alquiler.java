/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import static java.util.concurrent.TimeUnit.DAYS;

/**
 *
 * @author agust
 */
public class Alquiler {

    private Cliente cliente;
    private String fechaIni;
    private String fechaFin;
    private int posAmarre;
    private Barco barco;

    //Constructor
    public Alquiler(Cliente cliente, String fechaIni, String fechaFin, int posAmarre, Barco barco) {
        this.cliente = cliente;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.posAmarre = posAmarre;
        this.barco = barco;
    }

    //Observadoras
    public Cliente getCliente() {
        return cliente;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public int getPosAmarre() {
        return posAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    //Modificadoras
    //Fechas con formato : yyyy/mm/dd
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFechaIni(String fechaIni) {
        this.fechaIni = fechaIni;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setPosAmarre(int posAmarre) {
        this.posAmarre = posAmarre;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public double calculaValor(Puerto unPuerto) {

        double dias, costoAlq;

        //calcula la resta de la cantidad de dias con la fecha final - la fecha inicial
        dias = cantDias();
        costoAlq = barco.calculaCostoAlq(unPuerto, dias);
        return costoAlq;
    }

    private int pasaFechaDiaAEntero(String fecha) {
        char pos = 0, letra = 0;
        int numDia = 0;
        String dia;
        while (letra != '/') {
            letra = fecha.charAt(pos);

            if (letra == '/') {
                dia = fecha.substring(0, pos + 1);
                numDia = Integer.parseInt(dia);

            }
            pos++;

        }

        return numDia;

    }

    private int pasaFechaMesAEntero(String fecha) {
        char letra = 0;
        String mes;
        int numMes = 0, pos = 0, p = 0, i = 0;
        while (letra != '/' || p != 2) {
            letra = fecha.charAt(pos);

            if (letra == '/' && p == 0) {
                p++;
                i = pos;
            } else {
                if (letra == '/' && p == 1) {
                    p++;
                }
            }

            if (p == 2) {
                mes = fecha.substring(i, pos + 1);
                numMes = Integer.parseInt(mes);
            }
        }
        return numMes;

    }

    private int pasaFechaAñoAEntero(String fecha) {
        int pos = 0, longFecha = fecha.length(), p = 0, numAño, i = 0;
        char letra = 0;
        String año;
        while (pos < longFecha) {
            if (letra == '/') {
                p++;
            }
            if (p == 2) {
                i = pos;
            }
        }
        año = fecha.substring(i, longFecha);
        numAño = Integer.parseInt(año);
        return numAño;
    }

    private double cantDias() {
        Date i, f;
        i = pasaStringADate(fechaIni);
        f = pasaStringADate(fechaFin);
        long fechaInicialMs = i.getTime();
        long fechaFinalMs = f.getTime();
        long rta = fechaFinalMs - fechaInicialMs;
        double dias = Math.floor(rta / (1000 * 60 * 60 * 24));
        return dias;
    }

    private Date pasaStringADate(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return fechaDate;
    }
    
   
}
