package model;

public abstract class Tratamiento {
    private String descripcion; // not null / empty
    private int nroSesiones; // entre 1 a 12
    private int duracion; // mayor a  0

    public Tratamiento() {
    }

    public Tratamiento(String descripcion, int nroSesiones, int duracion) {
        this.descripcion = descripcion;
        this.nroSesiones = nroSesiones;
        this.duracion = duracion;
    }

    public int getNroSesiones() {
        return nroSesiones;
    }

    public void setNroSesiones(int nroSesiones) {
        if (nroSesiones < 1 || nroSesiones > 12){
            throw new IllegalArgumentException();
        }
        this.nroSesiones = nroSesiones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion == null || descripcion.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if (duracion <= 0 ){
            throw new IllegalArgumentException();
        }
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "\nTratamiento: " +
                "\nDescripcion: " + descripcion +
                "\nNro sesiones: " + nroSesiones;
    }

    //metodos customizados (abstracto)
    public abstract double calcular();
}
