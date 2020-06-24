package ModeloBD;
import Vista.Entidadess;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelos.EntidadesM;
import modelos.conectate;
/**@author perla */
public class EntidadesBD {
     conectate con;
     PreparedStatement pstm;
     Entidadess es;
      boolean hecho;
     public EntidadesBD(){
        con = new conectate();
    }
    public void ingresaDatosEntidades(int a, String b, String c, String gc){
         try{
             
            pstm = con.getConnection().prepareStatement("INSERT INTO entidades (id_entidad, nom_entidad, abreviatura, nom_capital)VALUES (?,?,?,?);");
            pstm.setInt(1,a);            
            pstm.setString(2,b);            
            pstm.setString(3, c);            
            pstm.setString(4, gc);            
            int res=pstm.executeUpdate();
            System.out.println("Se han insertado los datos");
            if(res>0){
                JOptionPane.showMessageDialog(null, "Dato agregado");
            }else{
                JOptionPane.showMessageDialog(null,"Error al agregar");
            }
            pstm.close();
            
        }catch (SQLException EX) {
            System.out.println(EX);
            JOptionPane.showMessageDialog(null,EX);
        }
    }
    
    public void Buscar(int c){
        try{
            pstm = con.getConnection().prepareStatement("SELECT * FROM entidades WHERE id_entidad =?");
            pstm.setInt(1,c);  
            ResultSet res = pstm.executeQuery(); 
            System.out.println("Realizando Busqueda!");
            
            if(res.next()){
                System.out.println("!Registro encontrado!");
                
            }else{
               JOptionPane.showMessageDialog(null, "¡No existe el registro!");
            }
            pstm.close();            
        }catch(Exception e){
            System.err.println(e);               
        }         
    }
    
    
    public void deleteEntidades(int c){ 
        try{
            pstm = con.getConnection().prepareStatement("DELETE FROM entidades WHERE id_entidad=?;");
            pstm.setInt(1,c);    
            
            int res=pstm.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"Registro eliminado");                
            }else{
                JOptionPane.showMessageDialog(null,"Error");
             }
            pstm.close();
            
        }catch (SQLException EX) {
            System.out.println(EX);
        }                
   }    
    
    
    public List<EntidadesM> getDatos(){
      int registros = 0;
      List<EntidadesM> lis = new ArrayList<EntidadesM>();
              
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT * FROM entidades" +
            " ORDER BY id_entidad");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            EntidadesM c= new EntidadesM();
            c.setId_entidad(Integer.parseInt(res.getString("id_entidad")));
            c.setNom_entidad(res.getString("nom_entidad"));
            c.setAbreviatura(res.getString("abreviatura"));
            c.setNom_capital(res.getString("nom_capital"));
            lis.add(c);
         }
        res.close();
      } 
        catch(SQLException e){
         System.out.println(e);
    }
    return lis;        
    }
    /*
    public void updateEntidades(int id_entid,String nom, String abre, String nom_c, int iii){
       
        try {            
            PreparedStatement pstm = con.getConnection().prepareStatement("UPDATE entidades " +
            "SET id_entidad = ?,nom_entidad = ? ,abreviatura = ? ,nombre_capital = ? ,WHERE id_entidad = ? ;");            
            pstm.setInt(1,id_entid);
            pstm.setString(2, nom);
            pstm.setString(3, abre);
            pstm.setString(4, nom_c);
            pstm.setInt(5, iii);
            int res = pstm.executeUpdate();
            if(res>0){
                JOptionPane.showMessageDialog(null,"Registro modificado");
                System.out.print("siiiiiiiiiiiiiiiii");
                es.limpia_entidades();
            }else{
                JOptionPane.showMessageDialog(null, "Error");
            }   es.limpia_entidades();
            hecho=false;
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
         
      }
   }*/
    
    public List<EntidadesM> listConteo() {

        String consultaSQL="Select * from entidades;";
        
        List<EntidadesM> EntidadesM = new ArrayList<EntidadesM>();

        try {
          PreparedStatement  ps = con.getConnection().prepareStatement("Select * from entidades;");
          ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                EntidadesM l = new EntidadesM();
                l.setId_entidad(rs.getInt("id_entidad"));
                l.setNom_entidad(rs.getString("nom_entidad"));
                l.setAbreviatura(rs.getString("abreviatura"));
                l.setNom_capital(rs.getString("nom_capital"));
                EntidadesM.add(l);
            }

        } catch (SQLException exception) {
            System.err.println("Error al CARGAR DATOS (Libro)" + exception);
        }
        return EntidadesM;
    }         
}