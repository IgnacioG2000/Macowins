import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Venta {
    List<Prenda> prendasVendidas = new ArrayList<>(); //
    Date fecha;

    int cantidadVentas() {
        return prendasVendidas.size();
    }

    Venta(Date unaFecha) {
        fecha = unaFecha;
    }

    Boolean esDeEstaFecha(Date unaFecha) {
        return fecha == unaFecha;
    }

    double totalVenta() {
       return prendasVendidas
        .stream()
        .map(Prenda::precioPrenda)
        .collect(Collectors.toList())
        .stream()
        .mapToDouble(Double::doubleValue)
        .sum();
    }
}
// Heredo de Venta ya que tiene el mismo comportamiento excepto el calculo del precioTotal que cambia por un recargo
class VentaTarjeta extends Venta {
    int cantidadCuotas;
    double coeficienteTarjeta;

    VentaTarjeta(int cuotas, double unCoeficienteTarjeta, Date otraFecha){
        super(otraFecha);
        cantidadCuotas = cuotas;
        coeficienteTarjeta = unCoeficienteTarjeta;
    }

    double recargoPorTarjeta() {
        return cantidadCuotas * coeficienteTarjeta + 0.01;
    }

    @Override
    double totalVenta() {
        return this.recargoPorTarjeta() + super.totalVenta();
    }
}
