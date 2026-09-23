package model;

public class Implante extends Tratamiento{
    private boolean  incluyeCorona;

    public Implante() {
    }

    public Implante(String descripcion, int nroSesiones, int duracion, boolean incluyeCorona) {
        super(descripcion, nroSesiones, duracion);
        this.incluyeCorona = incluyeCorona;
    }

    public boolean getIncluyeCorona() {
        return incluyeCorona;
    }

    public void setIncluyeCorona(boolean incluyeCorona) {
        this.incluyeCorona = incluyeCorona;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nIncluye Corona: " + siNo();
    }

    public String siNo(){
        return this.incluyeCorona ? "Si" : "No";
    }

    @Override
    public double calcular() {
        double costoBase = 350000;
        double costoTotal = costoBase;
        if (this.incluyeCorona) {
            costoTotal = costoBase * 1.20;
        }
        return costoTotal;
    }
}
