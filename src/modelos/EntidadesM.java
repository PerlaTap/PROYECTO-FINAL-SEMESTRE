package modelos;

/** @author perla */
public class EntidadesM {
   private int id_entidad;
   private String nom_entidad;
   private String abreviatura;
   private String nom_capital;
   
   public EntidadesM(int id_entidad, String nom_entidad, String abreviatura, String nom_capital){
       this.id_entidad=id_entidad;
       this.nom_capital=nom_capital;
       this.abreviatura=abreviatura;
       this.nom_capital=nom_capital;
   }
   public EntidadesM(){
   }
   public int getId_entidad(){
       return id_entidad;
   }
   public String getNom_entidad(){
       return nom_entidad;
   }
   public String getAbreviatura(){
       return abreviatura;       
   }
   public String getNom_capital(){
       return nom_capital;   }
   
   public void setId_entidad(int id_entidad){
       this.id_entidad=id_entidad;
   }
   public void setNom_entidad(String nom_entidad){
       this.nom_entidad=nom_entidad;
   }
   public void setAbreviatura(String abreviatura){
       this.abreviatura=abreviatura;
   }
   public void setNom_capital(String nom_capital){
       this.nom_capital=nom_capital;
   }  
   
   @Override
    public String toString() {
        return ""+ id_entidad + "," + nom_entidad + "," + abreviatura + "," + nom_capital +"\n";
    }
}