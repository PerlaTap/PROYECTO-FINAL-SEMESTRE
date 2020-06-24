package modelos;
/** @author perla */
public class MunicipioM {
    
    private int id_entidad;
    private int id_municipio;
    private String nom_municipio;
    private String nom_cabecera;  
    
    public MunicipioM(int id_entidad, int id_municipio, String nom_muncipio, String nom_cabecera){
        this.id_entidad=id_entidad;
        this.id_municipio=id_municipio;
        this.nom_municipio=nom_municipio;
        this.nom_cabecera=nom_cabecera;
    }
    public MunicipioM(){
    }
    public int getId_entidad(){
        return id_entidad;
    }
    public int getId_municipio(){
        return id_municipio;
    }
    public String getNom_municipio(){
        return nom_municipio;
    }
    public String getNom_cabecera(){
        return nom_cabecera;
    }
    public void setId_entidad(int id_entidad){
        this.id_entidad=id_entidad;
    }
    public void setId_municipio(int id_municipio){
        this.id_municipio=id_municipio;
    }
    public void setNom_municipio(String nom_municipio){
        this.nom_municipio=nom_municipio;
    }
    public void setNom_cabecera(String nom_cabecera){
        this.nom_cabecera=nom_cabecera;
    }    
    @Override
    public String toString() {
        return ""+ id_entidad + "," + id_municipio + "," + nom_municipio + "," + nom_cabecera +"\n";
    }    
}
