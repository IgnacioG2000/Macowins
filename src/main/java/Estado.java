public interface Estado {

    double precioTotal(double precioBase);
}

class Nueva implements Estado {

    public double precioTotal(double precioBase) {
        return precioBase;
    }
}

class Promocion implements Estado {
    double valorFijo;

    Promocion(double descuento) {
        valorFijo = descuento;
    }

    public double precioTotal(double precioBase) {
        return precioBase - valorFijo;
    }
}

class Liquidacion implements Estado {

    public double precioTotal(double precioBase) {
        return precioBase * 0.5;
    }
}
