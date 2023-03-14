import java.io.IOException;

public class Main {
    
    public static void reproducirCancion() {
        try {
            // Ruta de la canción
            String ruta = "C:\Users\Usuario A\Documents\Music";
            // Ejecutar comando para reproducir la canción
            Process proceso = Runtime.getRuntime().exec("cmd /c start " + ruta);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void hilo1() {
        System.out.println("Hilo 1");
    }
    
    public static void hilo2() {
        System.out.println("Hilo 2");
    }
    
    public static void hilo3() {
        System.out.println("Hilo 3");
    }
    
    public static void main(String[] args) {
        // Crear los tres hilos
        Thread hilo1 = new Thread(() -> hilo1());
        Thread hilo2 = new Thread(() -> hilo2());
        Thread hilo3 = new Thread(() -> reproducirCancion());
        
        // Iniciar los tres hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}