import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opcion;
        Scanner sc = new Scanner(System.in);
        DeviceManager manager = new DeviceManager();
        do{
            System.out.println("        Menú        ");
            System.out.println("1. Añadir");
            System.out.println("2. Buscar");
            System.out.println("3. Listar");
            System.out.println("4. Salir");
            System.out.println("Seleccione la opción:");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                case 1:
                    System.out.print("Ingrese nombre del dispositivo: ");
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese serial del dispositivo: ");
                    String serial = sc.nextLine();

                    boolean agregado = manager.addDevice(nombre, serial);

                    if (agregado) {
                        System.out.println("Dispositivo agregado correctamente.");
                    } else {
                        System.out.println("Error: datos inválidos o serial duplicado.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese el serial a buscar: ");
                    String serialBuscar = sc.nextLine();

                    Device encontrado = manager.findDeviceBySerial(serialBuscar);

                    if (encontrado != null) {
                        System.out.println("Dispositivo encontrado:");
                        System.out.println("Nombre: " + encontrado.getNombre());
                        System.out.println("Serial: " + encontrado.getSerial());
                    } else {
                        System.out.println("No se encontró el dispositivo.");
                    }
                    break;
                    
                case 3:
                    if (manager.listarDevices().isEmpty()) {
                        System.out.println("No hay dispositivos registrados.");
                    } else {
                        System.out.println("Lista de dispositivos:");
                        for (Device d : manager.listarDevices()) {
                            System.out.println("Nombre: " + d.getNombre() + " | Serial: " + d.getSerial());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción invalida");
            }
        }while(opcion != 4);
        


    }
}
