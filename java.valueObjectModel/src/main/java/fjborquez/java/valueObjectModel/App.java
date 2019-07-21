package fjborquez.java.valueObjectModel;

import fjborquez.java.valueObjectModel.model.Moneda;
import fjborquez.java.valueObjectModel.model.Producto;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// El value object se genera antes de la clase que lo contendrá.
    	// Como lleva sus propias validaciones, las abstrae de la creación del producto.
    	final Moneda precioManzana = new Moneda(0L, "CLP");
        Producto manzana = new Producto("FRUTA-01", "Manzana", precioManzana);
        
        final Moneda precioPera = new Moneda(100L, "CLP");
        Producto pera = new Producto("Fruta-02", "Pera", precioPera);
        
        final Moneda precioCarne = new Moneda(500L, "CLP");
        Producto carne = new Producto("Carne-01", "Carne", precioCarne);
        
        // Las comparaciones utilizan el metodo equals sobreescrito
        System.out.println("¿Las manzanas tienen el mismo precio que las peras?");
        System.out.println(manzana.getPrecio().equals(pera.getPrecio()));
        System.out.println("¿Las manzanas tienen el mismo precio que la carne?");
        System.out.println(manzana.getPrecio().equals(carne.getPrecio()));
    }
}
