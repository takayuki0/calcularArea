package figuras;

/**
 * Clase Circunferencia.
 * En esta clase tenemos todos los atributos y métodos de nuestro proyecto.
 * Esta clase es la encargada de darle la funcionalidad a nuestro proyecto.
 */

public class Circunferencia {
    private double radio;
    private String color;

    public Circunferencia(double radio) {

        this.setRadio(radio);
    }

    public void imprimir() {
        color = "rojo";
        System.out.println("Diámetro: " + 2 * getRadio());
        System.out.println("Color: " + color);

        double area = 2 * 3.1416 * getRadio() * getRadio();
        System.out.println(area);
    }

    public boolean esIgual(boolean considerarDecimales, Circunferencia otro) {
        double radio1 = this.getRadio();
        double radio2 = otro.getRadio();
        if (considerarDecimales) {
            if (radio1 == radio2)
                return true;
            else
                return false;
        } else {
            if (Math.abs(radio1 - radio2) < 1)
                return true;
            else
                return false;
        }
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}

