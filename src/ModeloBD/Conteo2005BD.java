package ModeloBD;
/*** @author perla */

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelos.Conteo2005M;
import modelos.conectate;
public class Conteo2005BD {
    conectate con;
     PreparedStatement pstm;
    public Conteo2005BD(){
        con = new conectate();
    }
    public void ingresaDatosConteo(int a, int b, int c, int d, int e, int f){
        try{
             
            pstm = con.getConnection().prepareStatement("INSERT INTO conteo2005 (id_entidad, id_municipio, pob_total, pob_masculina, pob_femenina, tot_vivienda)VALUES (?,?,?,?,?,?);");
            pstm.setInt(1,a);            
            pstm.setInt(2,b);            
            pstm.setInt(3,c);            
            pstm.setInt(4,d); 
            pstm.setInt(5,e);            
            pstm.setInt(6,f);            
           
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
      public void Buscar(int c, int idm){
        try{
            pstm = con.getConnection().prepareStatement("SELECT * FROM conteo2005 WHERE id_entidad = ? and id_municipio= ?;");
            pstm.setInt(1,c);  
            pstm.setInt(2,idm); 
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
    public void deleteConteo(int cod, int idm){  
            try{
            pstm = con.getConnection().prepareStatement("DELETE FROM conteo2005 WHERE id_entidad=? and id_municipio=?;");
            pstm.setInt(1,cod);  
            pstm.setInt(2,idm);
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
    public List<Conteo2005M> getDatos(){
      int registros = 0;
      List<Conteo2005M> lis = new ArrayList<Conteo2005M>();
              
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT * FROM conteo2005" +
            " ORDER BY id_entidad and id_municipio;");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            Conteo2005M c= new Conteo2005M();
            c.setId_entidad(Integer.parseInt(res.getString("id_entidad")));
            c.setId_municipio(Integer.parseInt(res.getString("id_municipio")));
            c.setPob_total(Integer.parseInt(res.getString("pob_total")));
            c.setPob_masculina(Integer.parseInt(res.getString("pob_masculina")));
            c.setPob_femenina(Integer.parseInt(res.getString("pob_femenina")));
            c.setTot_vivienda(Integer.parseInt(res.getString("tot_vivienda")));
            lis.add(c);
         }
        res.close();
      } 
        catch(SQLException e){
         System.out.println(e);
    }
    return lis;
    }
    
    public void updateConteo(int id_entid,int idmunic, int pobt, int pobm, int pobf,int totv){
       try {            
            PreparedStatement pstm = con.getConnection().prepareStatement("update conteo2005 " +
            "set id_entidad = ? ," +
            "id_municipio = ? ," +
            "pob_total = ? ," +                    
            "pob_masculina = ? ," +   
            "pob_femenina = ? ," +   
            "tot_vivienda = ? " +   
            "where id_entidad = ? "+
            "and id_municipio=?");            
            pstm.setInt(1,id_entid);
            pstm.setInt(2, idmunic);
            pstm.setInt(3, pobt);
            pstm.setInt(4, pobm);
            pstm.setInt(5, pobf);
            pstm.setInt(6, totv);
            pstm.setInt(7, id_entid);
            pstm.setInt(8, idmunic);
            pstm.executeUpdate();
            
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
   }
    
    public List<Conteo2005M> listConteo() {

        String consultaSQL="Select * from conteo2005;";
        
        List<Conteo2005M> conteo2005M = new ArrayList<Conteo2005M>();

        try {
          PreparedStatement  ps = con.getConnection().prepareStatement("Select * from conteo2005;");
          ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                Conteo2005M l = new Conteo2005M();
                l.setId_entidad(rs.getInt("id_entidad"));
                l.setId_municipio(rs.getInt("id_municipio"));
                l.setPob_total(rs.getInt("pob_total"));
                l.setPob_masculina(rs.getInt("pob_masculina"));
                l.setPob_femenina(rs.getInt("pob_femenina"));
                l.setTot_vivienda(rs.getInt("tot_vivienda"));
                conteo2005M.add(l);
            }
        } catch (SQLException exception) {
            System.err.println("Error al CARGAR DATOS (Libro)" + exception);
        }
        return conteo2005M;
    } 
}