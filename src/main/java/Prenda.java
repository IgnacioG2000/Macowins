public class Prenda {
    Estado estado;
    double precioBase;
    TipoPrenda prenda;


    // Le delego al estado que calcule el precio de la prenda
    double precioPrenda() {
        return estado.precioTotal(precioBase);
    }

    //Aca podemos modificar el estado, el precio y la prenda
    Prenda(Estado unEstado, double otroPrecio, TipoPrenda unaPrenda){
        estado = unEstado;
        precioBase = otroPrecio;
        prenda = unaPrenda;
    }


}
