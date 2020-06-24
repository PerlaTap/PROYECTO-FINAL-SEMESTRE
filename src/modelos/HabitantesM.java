package modelos;
/**@author perla */
public class HabitantesM {
    private int id_entidad;
    private int id_municipio;
    private int habitantes;
    private int hombres;
    private int mujeres;
    
    public HabitantesM(int id_entidad, int id_municipio, int habitantes, int hombres, int mujeres){
        this.id_entidad=id_entidad;
        this.id_municipio= id_municipio;
        this.habitantes=habitantes;
        this.hombres=hombres;
        this.mujeres=mujeres;
    }
public HabitantesM(){
}
public int getId_entidad(){
    return id_entidad;
}
public int getId_municipio(){
    return id_municipio;
}
public int getHabitantes(){
    return habitantes;
}
public int getHombres(){
    return hombres;
}
public int getMujeres(){
    return mujeres;
}
public void setId_entidad(int id_entidad){
    this.id_entidad=id_entidad;
}
public void setId_municipio(int id_municipio){
    this.id_municipio=id_municipio;
    }
public void setHabitantes(int habitantes){
    this.habitantes=habitantes;
}
public void setHombres(int hombres){
    this.hombres=hombres;
}
public void setMujeres(int mujeres){
    this.mujeres=mujeres;
}
@Override
    public String toString() {
        return ""+ id_entidad + "," + id_municipio + "," + habitantes + "," + hombres + "," + mujeres +"\n";
    } 
}