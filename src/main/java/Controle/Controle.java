package Controle;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class Controle {
    int id;
    String type;
    double valor;
    int nota;
    
    public Controle(int id,String type,double valor,int nota){
        this.id = id;
        this.type = type;
        this.valor = valor;
        this.nota = nota;
    }
    
    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }


    public double getValor() {
        return valor;
    }

    public int getNota() {
        return nota;
    }
    
}
