public class Venta {
    List<TipoPrenda> listaVentas = newArrayList();
    Date fecha;

    int cantidadVentas() {
        return listaVentas.size();
    }

    Venta(Date unaFecha) {
        fecha = unaFecha;
    }
}
