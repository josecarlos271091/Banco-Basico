/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Banco.Clases;

/**
 *
 * @author elKsa
 */
public class CCuentaFF extends CCuenta implements Iinteres{

    // <editor-fold defaultstate="collapsed" desc="Atributos">
    private double montoMensual;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Métodos">
    public double interes() {
        return saldo*0.9;
    }
    public double saldoAcumulado() {
        return saldo+interes();
    }   
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Accesores">
    /**
     * @return the montoMensual
     */
    public double getMontoMensual() {
        return montoMensual;
    }

    /**
     * @param montoMensual the montoMensual to set
     */
    public void setMontoMensual(double montoMensual) {
        this.montoMensual = montoMensual;
    }

    
    // </editor-fold>
}
