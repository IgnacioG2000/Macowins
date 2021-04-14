import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Venta {
    List<Prenda> ventasDePrendas = new ArrayList();
    Date fecha;

    int cantidadVentas() {
        return ventasDePrendas.size();
    }

    Venta(Date unaFecha) {
        fecha = unaFecha;
    }

    double totalVenta() {
        ventasDePrendas
        .stream()
        .map(Prenda::precioPrenda)
        .collect(Collectors.toList() //VER SUM
    }
}
