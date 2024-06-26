package orientadoObjetos.tiendaMoviles;

/*
Una tienda de móviles nos pide ayuda para gestionar sus productos. Todo lo que venden, 
que podemos llamar Producto, tiene un nombre y un precio de venta.
Hay un tipo de producto que son los teléfonos móviles, que tienen un tamaño de pantalla, una cantidad de RAM
y una cantidad de memoria de almacenamiento secundario.
Otro tipo de productos son los Accesorios. De estos, tenemos a su vez, otros tipos como son las carcasas 
y los cargadores. 
Los accesorios tienen dentro un array de teléfonos móviles, que indican aquellos con los que son compatibles.
 */

public class App {
    public static void main(String[] args) {

        // Crear un teléfono móvil
        TelefonoMovil telefono = new TelefonoMovil("iPhone 12", 999.99, 6.1, 4, 128);

        // Crear una carcasa compatible con el teléfono
        Carcasa carcasa = new Carcasa("Carcasa transparente", 19.99);
        carcasa.agregarTelefonoCompatible(telefono);

        // Crear un cargador compatible con el teléfono
        Cargador cargador = new Cargador("Cargador rápido", 29.99);
        cargador.agregarTelefonoCompatible(telefono);

        // Imprimir información del teléfono
        System.out.println("Teléfono: " + telefono.getNombre());
        System.out.println("Precio: %.2f€".formatted(telefono.getPrecio()));
        System.out.println("Tamaño de pantalla: " + telefono.getTamanoPantalla() + " pulgadas");
        System.out.println("RAM: " + telefono.getCantidadRam() + " GB");
        System.out.println("Almacenamiento: " + telefono.getCantidadAlmacenamiento() + " GB");

        // Imprimir información de la carcasa
        System.out.println("\nCarcasa: " + carcasa.getNombre());
        System.out.println("Precio: %.2f€".formatted(carcasa.getPrecio()));
        System.out.println("Telefonos compatibles con la carcasa:");
        TelefonoMovil[] telefonosCarcasa = carcasa.getTelefonosCompatibles();
        for (int i = 0; i < carcasa.getNumTelefonosCompatibles(); i++) {
            System.out.println("- " + telefonosCarcasa[i].getNombre());
        }

        // Imprimir información del cargador
        System.out.println("\nCargador: " + cargador.getNombre());
        System.out.println("Precio: %.2f€".formatted(cargador.getPrecio()));
        System.out.println("Telefonos compatibles con el cargador:");
        TelefonoMovil[] telefonosCargador = cargador.getTelefonosCompatibles();
        for (int i = 0; i < cargador.getNumTelefonosCompatibles(); i++) {
            System.out.println("- " + telefonosCargador[i].getNombre());
        }
    }
}
