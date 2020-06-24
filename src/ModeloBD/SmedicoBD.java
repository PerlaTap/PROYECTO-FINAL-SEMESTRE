package ModeloBD;

/** @author perla */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelos.SmedicoM;
import modelos.conectate;
public class SmedicoBD {
    conectate con;
       PreparedStatement pstm;
    public SmedicoBD(){
        con = new conectate();
    }
    public void ingresaDatosSmedico(int a, int b, int c, int d, int e, int f, int g, int h){
     
        try{
            pstm = con.getConnection().prepareStatement("INSERT INTO smedico VALUES (?,?,?,?,?,?,?,?);");
            pstm.setInt(1,a);            
            pstm.setInt(2,b);            
            pstm.setInt(3,c);            
            pstm.setInt(4, d);            
            pstm.setInt(5, e);            
            pstm.setInt(6, f);
            pstm.setInt(7, g);
            pstm.setInt(8, h);
            
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
            pstm = con.getConnection().prepareStatement("SELECT * FROM smedico WHERE id_entidad = ? and id_municipio= ?;");
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
    public void deleteSmedico(int cod,int idm){  
             try{
            pstm = con.getConnection().prepareStatement("DELETE FROM smedico WHERE id_entidad=? and id_municipio=?;");
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
    public List<SmedicoM> getDatos(){
      int registros = 0;
      List<SmedicoM> lis = new ArrayList<SmedicoM>();
              
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT * FROM smedico" +
            " ORDER BY id_entidad and id_municipio;");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            SmedicoM c= new SmedicoM();
            c.setId_entidad(Integer.parseInt(res.getString("id_entidad")));
            c.setId_municipio(Integer.parseInt(res.getString("id_municipio")));
            c.setImss(Integer.parseInt(res.getString("imss")));
            c.setPrivado(Integer.parseInt(res.getString("privado")));
            c.setIssste(Integer.parseInt(res.getString("issste")));
            c.setOtro(Integer.parseInt(res.getString("otro")));
            c.setDefensa(Integer.parseInt(res.getString("defensa")));
            c.setPopular(Integer.parseInt(res.getString("popular")));
            
            lis.add(c);
         }
        res.close();
      } 
        catch(SQLException e){
         System.out.println(e);
    }
    return lis;
        
    }
    
    /*public void updateSmedico(int id_entid,int idmunic, int pobt, int pobm, int pobf,int totv){
       try {            
            PreparedStatement pstm = con.getConnection().prepareStatement("update smedico " +
            "set id_entidad = ? ," +
            "id_municipio = ? ," +
            "pob_total = ? ," +                    
            "pob_masculina = ? ," +   
            "pob_femenina = ? ," +   
            "tot_vivienda = ? " +   
            "where id_entidad = ? ");            
            pstm.setInt(1,id_entid);
            pstm.setInt(2, idmunic);
            pstm.setInt(3, pobt);
            pstm.setInt(4, pobm);
            pstm.setInt(5, pobf);
            pstm.setInt(6, totv);
            pstm.setInt(7, id_entid);
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
   }*/
    
    public List<SmedicoM> listConteo() {

        String consultaSQL="Select * from smedico;";
        
        List<SmedicoM> SmedicoM = new ArrayList<SmedicoM>();

        try {
          PreparedStatement  ps = con.getConnection().prepareStatement("Select * from smedico;");
          ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                SmedicoM l = new SmedicoM();
                l.setId_entidad(rs.getInt("id_entidad"));
                l.setId_municipio(rs.getInt("id_municipio"));
                l.setImss(rs.getInt("imss"));
                l.setPrivado(rs.getInt("privado"));
                l.setIssste(rs.getInt("issste"));
                l.setOtro(rs.getInt("otro"));
                l.setDefensa(rs.getInt("defensa"));
                l.setPopular(rs.getInt("popular"));
                
                SmedicoM.add(l);
            }

        } catch (SQLException exception) {
            System.err.println("Error al CARGAR DATOS (Libro)" + exception);
        }
        return SmedicoM;
    } 
    
}
