/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Banco.Clases;

/**
 *
 * @author elKsa
 */
public class CBanco {

    // <editor-fold defaultstate="collapsed" desc="Atributos">
    private CCuenta[] cuentas;
    private int cantCuentas;
    private final int MAX_CUENTAS = 100;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Métodos Implementados">
    /**
     * Construye un banco.
     */
    public CBanco() {
        this.cantCuentas = 0;
        this.cuentas = new CCuenta[MAX_CUENTAS];
    }

    /**
     * Adiciona una nueva cuenta. Si el arreglo está lleno se redimensiona y adiciona la cuenta.
     * @param cuenta la nueva cuenta a adicionar.
     */
    public void adicionar(CCuenta cuenta) {
        if (cantCuentas == cuentas.length) {
            CCuenta[] aux = new CCuenta[cantCuentas];

            for (int i = 0; i < cantCuentas; i++)
                aux[i] = cuentas[i];

            cuentas = new CCuenta[cantCuentas + MAX_CUENTAS];

            for (int i = 0; i < aux.length; i++)
                cuentas[i] = aux[i];
        }

        cuentas[cantCuentas++] = cuenta;
    }

    /**
     * Elimina una cuenta.
     * @param numCuenta identificador de la cuenta a eliminar.
     * @return true si se eliminó la cuenta y false en caso contrario.
     */
    public boolean eliminar(int numCuenta) {
        int pos = this.buscarCuenta(numCuenta);

        if (pos != -1) {
            for (int i = pos; i < cantCuentas; i++) {
                cuentas[i] = cuentas[i+1];
            }
            return true;
        }
        else
            return false;
    }

    /**
     * Busca la posición de una cuenta dada.
     * @param numCuenta identificador de la cuenta a buscar.
     * @return la posición de la cuenta, en caso de no encontrarla devuelve -1.
     */
    public int buscarCuenta(int numCuenta) {
        int i=0;

        while (i < cantCuentas && cuentas[i].getNumCuenta() != numCuenta) {
            i++;
        }

        if (i < cantCuentas)
            return i;

        return -1;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Métodos para Implementar">
    /**
     * Devuelve cuántos clientes tienen un saldo acumulado por encima de un valor dado.
     * @param saldo valor para comparar.
     * @return la cantidad de clientes con saldo superior al valor dado.
     */
    public int cantidadClientesSaldoMayor(double saldo) {

        int cant=0;

        for (int i = 0; i < cantCuentas; i++) {
            if (cuentas[i].saldoAcumulado() > saldo)
                cant++;
        }

        return cant;
    }

    /**
     * Calcula el saldo acumulado de un cliente. Se conoce que esta operación se realiza una vez al año.
     * @param numCuenta el número de la cuenta del cliente para calcularle el saldo acumulado.
     * @return saldo acumulado del cliente que incluye los intereses.
     */
    public double saldoAcumulado(int numCuenta) {
        //Busco la cuenta
        int posCuenta = buscarCuenta(numCuenta);

        if (posCuenta != -1)
            return cuentas[posCuenta].saldoAcumulado();
        else
            return -1;
    }

    /**
     * Busca la cuenta con mayor saldo acumulado.
     * @return El objeto de tipo cuenta
     */
    public CCuenta cuentaMayorSaldo() {
        
        CCuenta mayor=cuentas[0];

        for (int i = 1; i < cantCuentas; i++)
            if (mayor.saldoAcumulado() < cuentas[i].saldoAcumulado()) {
                mayor = cuentas[i];
            }

        return mayor;
    }
    // </editor-fold>
}
