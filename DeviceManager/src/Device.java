public class Device {
    private String nombre;
    private String serial;

    public Device(String nombre, String serial){
        this.nombre = nombre;
        this.serial = serial;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String getSerial(){
        return serial;
    }

    public void setSerial(String nuevoSerial){
        this.serial = nuevoSerial;
    }
}
