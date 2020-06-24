package ModeloBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelos.HabitantesM;
import modelos.conectate;

/** @author perla */
public class HabitanteBD {
    conectate con;
    PreparedStatement pstm;
     public HabitanteBD(){
        con = new conectate();
        
    }
    public void ingresaDatosHabitantes(int a, int b, int c, int d, int e){
        
        try{
            pstm = con.getConnection().prepareStatement("INSERT INTO habitantes VALUES (?,?,?,?,?);");
            pstm.setInt(1,a);            
            pstm.setInt(2,b);            
            pstm.setInt(3, c);            
            pstm.setInt(4, d);
            pstm.setInt(5, e);
            
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
            pstm = con.getConnection().prepareStatement("SELECT * FROM habitantes WHERE id_entidad = ? and id_municipio= ?;");
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
    public void deleteHabitantes(int cod, int idm){  
            try{
            pstm = con.getConnection().prepareStatement("DELETE FROM habitantes WHERE id_entidad=? and id_municipio=?;");
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
    public List<HabitantesM> getDatos(){
      int registros = 0;
      List<HabitantesM> lis = new ArrayList<HabitantesM>();
              
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT * FROM habitantes" +
            " ORDER BY id_entidad and id_municipio;");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            HabitantesM c= new HabitantesM();
            c.setId_entidad(Integer.parseInt(res.getString("Id_entidad")));
            c.setId_municipio(res.getInt("Id_municipio"));
            c.setHabitantes(res.getInt("Habitantes"));
            c.setHombres(res.getInt("Hombres"));
            c.setMujeres(res.getInt("Mujeres"));
            
            lis.add(c);
         }
        res.close();
      } 
        catch(SQLException e){
         System.out.println(e);
    }
    return lis;
        
    }
    public List<HabitantesM> listConteo() {

        String consultaSQL="Select * from habitantes;";
        
        List<HabitantesM> HabitantesM = new ArrayList<HabitantesM>();

        try {
          PreparedStatement  ps = con.getConnection().prepareStatement("Select * from habitantes;");
          ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                HabitantesM l = new HabitantesM();
                l.setId_entidad(rs.getInt("id_entidad"));
                l.setId_municipio(rs.getInt("id_municipio"));
                l.setHabitantes(rs.getInt("habitantes"));
                l.setHombres(rs.getInt("hombres"));
                l.setMujeres(rs.getInt("mujeres"));
                HabitantesM.add(l);
            }

        } catch (SQLException exception) {
            System.err.println("Error al CARGAR DATOS (Libro)" + exception);
        }
        return HabitantesM;
    }   
    
}
