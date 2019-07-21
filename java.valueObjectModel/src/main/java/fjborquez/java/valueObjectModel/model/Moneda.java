package fjborquez.java.valueObjectModel.model;

public class Moneda {
	private final Long valor;
	
	// Aunque para el ejemplo está en string, 
	// la divisa también podría ser un object value
	private final String divisa;
	
	public Moneda(Long valor, String divisa) throws IllegalArgumentException {
		if (valor == null) {
			throw new IllegalArgumentException("Se espera que Long valor no sea null");
		}
		
		if (divisa == null) {
			throw new IllegalArgumentException("Se espera que String divisa no sea null");
		}
		
		if (valor < 0) {
			throw new IllegalArgumentException("Se espera que Long valor sea igual o mayor que 0");
		}
		
		if (divisa.isEmpty()) {
			throw new IllegalArgumentException("Se espera que String divisa no este vacio");
		}
		
		this.valor = valor;
		this.divisa = divisa;
	}
	
	
	// Sobreescribir el método equals para determinar igualidad propiedad a propiedad.
	@Override
	public boolean equals(Object otraMoneda) {
		return valor.equals(((Moneda) otraMoneda).valor)
				&& divisa.equals(((Moneda) otraMoneda).divisa);
	}
}
