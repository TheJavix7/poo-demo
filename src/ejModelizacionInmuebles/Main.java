package ejModelizacionInmuebles;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CasaRural casaRural = new CasaRural(1, "Direccion 1", 150, 5, 2, 2, 500, 350);
        CasaUrbanizacion casaUrbana = new CasaUrbanizacion(2, "Direccion 2", 90, 3, 1, 1, 300, true);
        CasaIndependiente casaIndependiente = new CasaIndependiente(3, "Direccion 3", 350, 6, 3, 3);
        ApartEstudio apartamentoEstudio = new ApartEstudio(4, "Direccion 4", 60, 1, 160);
        ApartamentoFamiliar apartamentoFamiliar = new ApartamentoFamiliar(5, "Direccion 5", 120, 3, 2, 432);
        LocalComercial localComercial = new LocalComercial(6, "Direccion 6", 250, Localizacion.EXTERNO, "Nevada Shoping");
        Oficina oficina = new Oficina(7, "Direccion 7", 400, Localizacion.INTERNO, false);

        ArrayList<Inmueble> inmuebles = new ArrayList<>();
        inmuebles.add(casaRural);
        inmuebles.add(casaUrbana);
        inmuebles.add(casaIndependiente);
        inmuebles.add(apartamentoEstudio);
        inmuebles.add(apartamentoFamiliar);
        inmuebles.add(localComercial);
        inmuebles.add(oficina);

        for (Inmueble inmueble : inmuebles) {
            System.out.println("Precio por m2 de " + inmueble.getId() + ": " + inmueble.getValorMetroCuadrado());
            System.out.println("Area de " + inmueble.getId() + ": " + inmueble.getArea());
            System.out.println("Valor de compra/venta de " + inmueble.getId() + ": "  + inmueble.getValorCompra());
            System.out.println();
        }

        // Asi podemos cambiar el valor por metro cuadrado y recalcular el valor de compra
        casaRural.cambiarValorCompra(3000);

        System.out.println("Precio por m2 de " + casaRural.getId() + ": " + casaRural.getValorMetroCuadrado());
        System.out.println("Area de " + casaRural.getId() + ": " + casaRural.getArea());
        System.out.println("Valor de compra/venta de " + casaRural.getId() + ": "  + casaRural.getValorCompra());
    }
}