public class Estado {

}

class Nueva extends Estado {

    double precioTotal(double precioBase) {
        return precioBase;
    }
}

class Promocion extends Estado {
    double valorFijo;

    double precioTotal(double precioBase) {
        return precioBase - valorFijo;
    }
}

class Liquidacion extends Estado {

    double precioTotal(double precioBase) {
        return precioBase * 0.5;
    }
}
