package ModeloBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelos.MunicipioM;
import modelos.conectate;
/** @author perla */
public class MunicipioBD {
    conectate con;
    PreparedStatement pstm;
     public MunicipioBD(){
        con = new conectate();
    }
    public void ingresaDatosMunicipio(int a, int b, String c, String d){
        
        try{
            pstm = con.getConnection().prepareStatement("INSERT INTO municipios VALUES (?,?,?,?);");
            pstm.setInt(1,a);            
            pstm.setInt(2,b);            
            pstm.setString(3,c);            
            pstm.setString(4, d);   
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
            pstm = con.getConnection().prepareStatement
            ("SELECT * FROM municipios WHERE id_entidad = ? and id_municipio= ?;");
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
    public void deleteMunicipio(int cod, int idm){  
            try{
            pstm = con.getConnection().prepareStatement("DELETE FROM municipios WHERE id_entidad=? and id_municipio=?;");
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
    public List<MunicipioM> getDatos(){
      int registros = 0;
      List<MunicipioM> lis = new ArrayList<MunicipioM>();
              
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT * FROM municipios" +
            " ORDER BY id_entidad and id_municipio;");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            MunicipioM c= new MunicipioM();
            c.setId_entidad(Integer.parseInt(res.getString("id_entidad")));
            c.setId_municipio(res.getInt("id_municipio"));
            c.setNom_municipio(res.getString("nom_municipio"));
            c.setNom_cabecera(res.getString("nom_cabecera"));
            
            lis.add(c);
         }
        res.close();
      } 
        catch(SQLException e){
         System.out.println(e);
    }
    return lis;
        
    }
    
   /* public void updateMunicipio(int id_entid,int id_mun,String nom_m, String nom_cab) {
       try {            
            PreparedStatement pstm = con.getConnection().prepareStatement("update municipios " +
            "set id_entidad = ? ," +
            "id_municipio = ? ," +
            "nom_municipio = ? ," +                    
            "nom_cabecera = ? ," +
            "where id_entidad = ? ");            
            pstm.setInt(1,id_entid);
            pstm.setInt(2, id_mun);
            pstm.setString(3, nom_m);
            pstm.setString(4, nom_cab);
            pstm.setInt(6, id_entid);
            pstm.execute();
            pstm.close();            
         }catch(SQLException e){
         System.out.println(e);
      }
   }*/
    
    public List<MunicipioM> listMunicipio() {

        String consultaSQL="Select * from municipios;";
        
        List<MunicipioM> MunicipioM = new ArrayList<MunicipioM>();

        try {
          PreparedStatement  ps = con.getConnection().prepareStatement("Select * from municipios;");
          ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                MunicipioM l = new MunicipioM();
                l.setId_entidad(rs.getInt("id_entidad"));
                l.setId_municipio(rs.getInt("id_municipio"));
                l.setNom_municipio(rs.getString("nom_municipio"));
                l.setNom_cabecera(rs.getString("nom_cabecera"));
                MunicipioM.add(l);
            }

        } catch (SQLException exception) {
            System.err.println("Error al CARGAR DATOS (Libro)" + exception);
        }
        return MunicipioM;
    }   
     
}
