/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Banco.Clases;

/**
 *
 * @author elKsa
 */
public abstract class CCuenta {

    // <editor-fold defaultstate="collapsed" desc="Atributos">
    protected int numCuenta;
    protected String cliente;
    protected double saldo;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Constructores">
    public CCuenta() {
    }

    public CCuenta(int numCuenta, String cliente, double saldo) {
        this.numCuenta = numCuenta;
        this.cliente = cliente;
        this.saldo = saldo;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Accesores">
    /**
     * @return the numCuenta
     */
    public int getNumCuenta() {
        return numCuenta;
    }

    /**
     * @param numCuenta the numCuenta to set
     */
    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Métodos">  
    public abstract double saldoAcumulado();
    // </editor-fold>

}
