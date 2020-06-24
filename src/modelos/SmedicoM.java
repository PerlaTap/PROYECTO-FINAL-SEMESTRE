package modelos;

/** @author perla */
public class SmedicoM {
    private int id_entidad;
    private int id_municipio;
    private int imss;
    private int privado;
    private int issste;
    private int otro;
    private int defensa;
    private int popular;
    
    public SmedicoM(int id_entidad, int id_municipio, int imss, int privado, int issste, int otro, int defensa, int popular){
        this.id_entidad=id_entidad;
        this.id_municipio=id_municipio;
        this.imss=imss;
        this.privado=privado;
        this.issste=issste;
        this.otro=otro;
        this.defensa=defensa;
        this.popular=popular;
    }
    public SmedicoM(){
    }
    public int getId_entidad(){
        return id_entidad;
    }
    public int getId_municipio(){
        return id_municipio;
    }
    public int getImss(){
        return imss;
    }
    public int getPrivado(){
        return privado;
    }
    public int getIssste(){
        return issste;
    }
    public int getOtro(){
        return otro;
    }
    public int getDefensa(){
        return defensa;
    }
    public int getPopular(){
        return popular;
    }
    public void setId_entidad(int id_entidad){
        this.id_entidad=id_entidad;
    }
    public void setId_municipio(int id_municipio){
        this.id_municipio=id_municipio;
    }
    public void setImss(int imss){
        this.imss=imss;
    }
    public void setPrivado(int privado){
        this.privado=privado;
    }
    public void setIssste(int issste){
        this.issste=issste;
    }
    public void setOtro(int otro){
        this.otro=otro;
    }
    public void setDefensa(int defensa){
        this.defensa=defensa;
    }
    public void setPopular(int popular){
        this.popular=popular;
    }
    
    @Override
    public String toString() {
        String cadena;
        cadena = ":" + id_entidad + "," + id_municipio + "," + imss + "," + privado + "," + issste + "," + otro + "," + defensa + "," + popular + "\n";
        return cadena;
    }     
}    