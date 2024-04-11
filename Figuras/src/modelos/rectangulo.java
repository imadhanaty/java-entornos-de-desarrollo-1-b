package modelos;
/**
 * clase que representa un rectangulo.contiene metodos
 * para calcular su area y perimetro
 * 
 * @version 1.0
 * 
 * @author imad
 */

public class rectangulo extends figura {
	private double base;
	private int altura;
	/**
	 * constructor por defecto.crea un rectangulo con base y altura 1,en metros
	 */
	public  rectangulo() {
		this.base=1;
		this.altura=1;
		/**
		 * @param base	la base del rectangulo,en metros
		 * @param altura	la altura del rectangulo,en metros
		 */
	}
	public rectangulo (double base,int altura) {
		this.base=base;
		this.altura=altura;
		
	}
	/**
	 * @see modelos.Figura#area();
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base*altura ;
	}
	/**
	 * @see modelos.Figura#perimetro();
	 */

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
