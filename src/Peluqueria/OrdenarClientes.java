package Peluqueria;
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

}
