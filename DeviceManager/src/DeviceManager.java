import java.util.ArrayList;

public class DeviceManager {
    private ArrayList<Device> listaDevice = new ArrayList<>();


    public boolean addDevice(String nombre, String serial){
        if(nombre != null && serial != null && !nombre.trim().isEmpty() && !serial.trim().isEmpty() && !DeviceExiste(serial)){
            Device nuevo = new Device(nombre, serial);
            listaDevice.add(nuevo);
            return true;
        }
        return false;
    }

    public Device findDeviceBySerial(String serial){
        for(Device device:listaDevice){
            if(device.getSerial().equals(serial)){
                return device;
            }
        }
        return null;
    }

    public ArrayList<Device> listarDevices(){
        return listaDevice;
        
    }

    public boolean DeviceExiste(String serial) {
    for (Device device:listaDevice) {
            if (device.getSerial().equals(serial)) {
            return true;
            }
        }
        return false;
    }
}
