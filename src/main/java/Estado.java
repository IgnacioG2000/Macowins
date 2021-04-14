public interface Estado {

    double precioTotal(double precioPrenda);
}

class Nueva implements Estado {

    public double precioTotal(double precioPrenda) {
        return precioPrenda;
    }
}

class Promocion implements Estado {
    double valorFijo;

    Promocion(double descuento) {
        valorFijo = descuento;
    }

    public double precioTotal(double precioPrenda) {

        return precioPrenda - valorFijo;
    }
}

class Liquidacion implements Estado {

    public double precioTotal(double precioPrenda) {

        return precioPrenda * 0.5;
    }
}
