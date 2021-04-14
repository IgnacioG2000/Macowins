import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Negocio {
   List<Venta> ventas = new ArrayList<>();

   double ganancias(Date fecha) {
       return ventas
       .stream()
       .filter(venta -> venta.esDeEstaFecha(fecha))
       .collect(Collectors.toList())
       .stream()
       .mapToDouble(Venta::totalVenta)
       .sum();
   }

   void agregarVenta(Venta unaVenta){
       ventas.add(unaVenta);
   }
}
