/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Banco.Clases;

/**
 *
 * @author elKsa
 */
public class CCuentaAhorro extends CCuenta implements Iinteres{

    @Override
    public double saldoAcumulado() {
        
        return saldo+interes();
    }
    public double interes() {
        return saldo*0.3;
    }

}
