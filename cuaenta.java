public class Cuenta {
    private String titular;
    private int numero;
    private double cantidad;
    private String[] movimientos;
    
    public void inicializar(String titular, int numero){
        inicializar(titular, numero, 0.0);
    }
    
    public void inicializar(String titular, int numero, double cantidad){
        setTitular(titular);
        setNumero(numero);
        setCantidad(cantidad);
        movimientos = new String[10];
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String[] getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(String[] movimientos) {
        this.movimientos = movimientos;
    }
    
    public void setMovimientos(String movimiento, int i){
        movimientos[i] = movimiento;  
    }
    
    public String mostrar(){
        return "Titular de la cuenta: " + getTitular() +
               "\nNumero de cuenta: " + getNumero(); 
    }
    
    
}