import java.util.Comparator;

public class OrdenarClientes implements Comparator<Cliente>{

    @Override
    public int compare(Cliente o1, Cliente o2) {
      if(o1.isVip() && o2.isVip() || !o1.isVip() && !o2.isVip()){
            return 0;
        } else if(o1.isVip() && !o2.isVip()){
            return -1;
        } else if(!o1.isVip() && o2.isVip()){
            return 1;
        }
        return 0;
    }
       /* if (o1.isVip() && o2.isVip()) {
            return -1; // Ambos clientes son VIP, o1 tiene mayor prioridad
        } else if (!o1.isVip() && !o2.isVip()) {
            return 0;  // Ambos clientes no son VIP, se consideran iguales en prioridad
        } else {
            return 1;  // Al menos uno de los clientes no es VIP, o2 tiene mayor prioridad
        }
    }*/
}
