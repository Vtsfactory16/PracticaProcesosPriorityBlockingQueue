import java.util.Comparator;

/**
 * Esta clase implementa la interfaz comparator para definir un orden entre los clientes
 * Primero van los clientes VIP y luego por orden de llegada
 */
public class OrdenarClientes implements Comparator<Cliente> {
    /**
     * Compara dos clientes para determinar su orden relativo
     * @param o1 el primer cliente a comparar
     * @param o2 segundo cliente a comparar
     * @return devuelve un valor negativo si o1 debe ir antes que o2, un valor positivo si debe ir despues,
     * y cero si son iguales en terminos de prioridad VIP y orden de llegada
     */
    @Override
    public int compare(Cliente o1, Cliente o2) {


        if (o1.isVip() && o2.isVip() || !o1.isVip() && !o2.isVip()) {

            return 0;
        } else if (o1.isVip() && !o2.isVip()) {
            return -1;
        } else if (!o1.isVip() && o2.isVip()) {
            return 1;
        }
        return 0;
    }
}
