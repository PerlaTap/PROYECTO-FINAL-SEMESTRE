package modelos;
/** @author perla */
public class LocalidadesM {
    private int id_entidad;
    private int id_municipio;
    private int id_localidad;
    private String nom_localidad;
    private String ambito;
    private int pob_total;
    private int pob_masculina;
    private int pob_femenina;
    private int viv_total;
    
    public LocalidadesM(int id_entidad, int id_municipio, int id_localidad, String nom_localidad, String ambito, int pob_total, int pob_masculina, int pob_femenina, int viv_total){
        this.id_entidad=id_entidad;
        this.id_municipio=id_municipio;
        this.id_localidad=id_localidad;
        this.nom_localidad=nom_localidad;
        this.ambito=ambito;
        this.pob_total=pob_total;
        this.pob_masculina=pob_masculina;
        this.pob_femenina=pob_femenina;
        this.viv_total=viv_total;   
    }
    
    public LocalidadesM(){
    }
    public int getId_entidad(){
        return id_entidad;
    }
    public int getId_municipio(){
        return id_municipio;
    }
    public int getId_localidad(){
        return id_localidad;
    }
    public String getNom_localidad(){
        return nom_localidad;
    }
    public String getAmbito(){
        return ambito;
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
    public int getViv_total(){
        return viv_total;
    }
    public void setId_entidad(int id_entidad){
        this.id_entidad=id_entidad;
    }
    public void setId_municipio(int id_municipio){
        this.id_municipio=id_municipio;
    }
    public void setId_localidad(int id_localidad){
        this.id_localidad=id_localidad;
    }
    public void setNom_localidad(String nom_localidad){
        this.nom_localidad=nom_localidad;
    }
    public void setAmbito(String ambito){
        this.ambito=ambito;
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
    public void setViv_total(int viv_total){
        this.viv_total=viv_total;
    }  
    @Override
    public String toString() {
        return ""+ id_entidad + "," + id_municipio + "," + id_localidad + "," + nom_localidad + "," + ambito + "," + pob_total + "," + pob_masculina + "," + pob_femenina + "," + viv_total +"\n";
    }
}
