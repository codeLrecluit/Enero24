package program;

public class ClienteMiembro  extends Cliente{

    int idMembresia;
    String fechaRegistro;
    TipoMembresia TipoMembresia;

    public ClienteMiembro(String nombre, String apellidos, String numeroTelefonico, int idMembresia, String fechaRegistro, TipoMembresia tipoMembresia) {
        super(nombre, apellidos, numeroTelefonico);
        this.idMembresia = idMembresia;
        this.fechaRegistro = fechaRegistro;
        TipoMembresia = tipoMembresia;
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public program.TipoMembresia getTipoMembresia() {
        return TipoMembresia;
    }

    public void setTipoMembresia(program.TipoMembresia tipoMembresia) {
        TipoMembresia = tipoMembresia;
    }

    @Override
    public String toString() {
        return "ClienteMiembro{" +
                "idMembresia=" + idMembresia +
                ", fechaRegistro='" + fechaRegistro + '\'' +
                ", TipoMembresia=" + TipoMembresia +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numeroTelefonico='" + numeroTelefonico + '\'' +
                '}';
    }
}
