package modelos;

/** @author perla */
public class Conteo2005M {
    //correg 
    
    private int id_entidad;
    private int id_municipio;
    private int pob_total;
    private int pob_masculina;
    private int pob_femenina;
    private int tot_vivienda;
    
    public Conteo2005M(int id_entidad, int id_municipio, int pob_total, int pob_masculina, int pob_femenina, int tot_vivienda){
        this.id_entidad=id_entidad;
        this.id_municipio= id_municipio;
        this.pob_total = pob_total;
        this.pob_masculina = pob_masculina;
        this.pob_femenina = pob_femenina;
        this.tot_vivienda = tot_vivienda;           
    }
    
    public Conteo2005M(){
    }
    public int getId_entidad(){
            return id_entidad;
    }
    public int getId_municipio(){
        return id_municipio;
    }
    public int getPob_total(){
        return pob_total;
    }
    public int getPob_masculina(){
        return pob_masculina;
    }
    public int getPob_femenina(){
        return pob_femenina;
    }
    public int getTot_vivienda(){
        return tot_vivienda;
    }    
    public void setId_entidad(int id_entidad){
        this.id_entidad=id_entidad;
    }
    public void setId_municipio(int id_municipio){
        this.id_municipio=id_municipio;
    }
    public void setPob_total(int pob_total){
        this.pob_total=pob_total;
    }
    public void setPob_masculina(int pob_masculina){
        this.pob_masculina=pob_masculina;
    }
    public void setPob_femenina(int pob_femenina){
        this.pob_femenina=pob_femenina;
    }
    public void setTot_vivienda(int tot_vivienda){
        this.tot_vivienda=tot_vivienda;
    }   
    @Override
    public String toString() {
        return ""+ id_entidad + "," + id_municipio + "," + pob_total + "," + pob_masculina + "," + pob_femenina + "," + tot_vivienda +"\n";
    }      
}