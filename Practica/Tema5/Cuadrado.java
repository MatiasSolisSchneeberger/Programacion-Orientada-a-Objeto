public class Cuadrado extends Rectangulo {

	public Cuadrado(double lado) {
		super(lado, lado);
	}

	public double getLado() {
		return getAlto();
	}

	public void nombreFigura() {
		System.out.println("****** Cuadrado ******");
	}

	public void setLado(double lado) {
		setAlto(lado);
		setAncho(lado);
	}

	@Override
	public void setAlto(double alto) {
		super.setAlto(alto);
		super.setAncho(alto);
	}

	@Override
	public void setAncho(double ancho) {
		super.setAncho(ancho);
		super.setAlto(ancho);
	}

}
