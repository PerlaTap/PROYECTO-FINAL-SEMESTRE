package ModeloBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelos.LocalidadesM;
import modelos.conectate;
/*** @author perla */
public class LocalidadesBD {
    conectate con;
    PreparedStatement pstm;
    
    public LocalidadesBD(){
        con = new conectate();
    }
    public void ingresaDatosLocalidades(int i, int m, int l, String nom, String am,
            int po, int pm, int pf, int vt){
        
        try{
            pstm = con.getConnection().prepareStatement("INSERT INTO localidades VALUES (?,?,?,?,?,?,?,?,?);");
            pstm.setInt(1,i);            
            pstm.setInt(2,m);            
            pstm.setInt(3, l);            
            pstm.setString(4,nom);            
            pstm.setString(5,am);            
            pstm.setInt(6, po);
            pstm.setInt(7,pm);            
            pstm.setInt(8,pf);            
            pstm.setInt(9, vt);
            
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
        }
    }
     public void Buscar(int c, int idm, int idl){
        try{
            pstm = con.getConnection().prepareStatement("SELECT * FROM localidades WHERE id_entidad = ? and id_municipio= ? and id_localidad=?;");
            pstm.setInt(1,c);  
            pstm.setInt(2,idm); 
            pstm.setInt(3,idm);
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
    public void deleteLocalidades(int cod, int idm, int idl){  
            try{
            pstm = con.getConnection().prepareStatement("DELETE FROM localidades WHERE id_entidad=? and id_municipio=? and id_localidad=?;");
            pstm.setInt(1,cod);  
            pstm.setInt(2,idm);
            pstm.setInt(3,idl);
            System.out.println("Datos eliminados");
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
    ///
    public List<LocalidadesM> getDatos(){
      int registros = 0;
      List<LocalidadesM> lis = new ArrayList<LocalidadesM>();
              
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT * FROM localidades" +
            " ORDER BY id_entidad and id_municipio and id_localidad;");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            LocalidadesM c= new LocalidadesM();
            c.setId_entidad(Integer.parseInt(res.getString("id_entidad")));
            c.setId_municipio(Integer.parseInt(res.getString("id_municipio")));
            c.setId_localidad(Integer.parseInt(res.getString("id_localidad")));
            c.setNom_localidad(res.getString("nom_localidad"));
            c.setAmbito(res.getString("ambito"));
            c.setPob_total(Integer.parseInt(res.getString("pob_total")));
            c.setPob_masculina(Integer.parseInt(res.getString("pob_masculina")));
            c.setPob_femenina(Integer.parseInt(res.getString("pob_femenina")));
            c.setViv_total(Integer.parseInt(res.getString("viv_total")));
            
            lis.add(c);
         }
        res.close();
      } 
        catch(SQLException e){
         System.out.println(e);
    }
    return lis;
        
    }
    
   /* public void updateLocalidades(int id_entid,int idmunic, int id_loc, String nom_lo, String ambi,int pob_t, int p_m, int p_f, int v_t){
       try {            
            PreparedStatement pstm = con.getConnection().prepareStatement("update localidades " +
            "set id_entidad = ? ," +
            "id_municipio = ? ," +
            "id_localidad = ? ," +                    
            "nom_localidad = ? ," +   
            "ambito = ? ," +   
            "pob_total = ? , " +
            "pob_masculina = ? ,"+
            "pob_femenina = ? ,"+
            "viv_total = ? ,"+
            "where id_entidad = ?; ");            
            pstm.setInt(1,id_entid);
            pstm.setInt(2, idmunic);
            pstm.setInt(3, id_loc);
            pstm.setString(4, nom_lo);
            pstm.setString(5, ambi);
            pstm.setInt(6, pob_t);
            pstm.setInt(7, p_m);
            pstm.setInt(8, p_f);
            pstm.setInt(9, v_t);          
            pstm.setInt(10, id_entid);
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
   }*/
    
    public List<LocalidadesM> listLocalidades() {

        String consultaSQL="Select * from localidades;";
        
        List<LocalidadesM> LocalidadesM = new ArrayList<LocalidadesM>();

        try {
          PreparedStatement  ps = con.getConnection().prepareStatement("Select * from conteo2005;");
          ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                LocalidadesM l = new LocalidadesM();
                l.setId_entidad(rs.getInt("id_entidad"));
                l.setId_municipio(rs.getInt("id_municipio"));
                l.setId_localidad(rs.getInt("pob_total"));
                l.setNom_localidad(rs.getString("nom_localidad"));
                l.setAmbito(rs.getString("ambito"));
                l.setPob_total(rs.getInt("pob_total"));
                l.setPob_masculina(rs.getInt("pob_masculina"));
                l.setPob_femenina(rs.getInt("pob_femenina"));
                l.setViv_total(rs.getInt("Viv_total"));
                LocalidadesM.add(l);
            }

        } catch (SQLException exception) {
            System.err.println("Error al CARGAR DATOS (Libro)" + exception);
        }
        return LocalidadesM;
    } 
}