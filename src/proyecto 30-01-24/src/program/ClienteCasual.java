package program;

public class ClienteCasual extends Cliente{
    int idCliente;

    public ClienteCasual(String nombre, String apellidos, String numeroTelefonico, int idCliente) {
        super(nombre, apellidos, numeroTelefonico);
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "ClienteCasual{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numeroTelefonico='" + numeroTelefonico + '\'' +
                '}';
    }
}
