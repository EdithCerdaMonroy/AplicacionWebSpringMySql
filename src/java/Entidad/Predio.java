package Entidad;

/**
 *
 * @author edith
 */
public class Predio {
    int idpredio;
    float clave;
    float superficie;
    double valor;
    String ubicacion;
    float anio;
    double total;

    public Predio() {
    }

    public Predio(int idpredio, float clave, float superficie, double valor, String ubicacion, float anio, double total) {
        this.idpredio = idpredio;
        this.clave = clave;
        this.superficie = superficie;
        this.valor = valor;
        this.ubicacion = ubicacion;
        this.anio = anio;
        this.total = total;
    }

    public int getIdpredio() {
        return idpredio;
    }

    public void setIdpredio(int idpredio) {
        this.idpredio = idpredio;
    }

    public float getClave() {
        return clave;
    }

    public void setClave(float clave) {
        this.clave = clave;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public float getAnio() {
        return anio;
    }

    public void setAnio(float anio) {
        this.anio = anio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
