package ModeloBD;

/** @author perla */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelos.EdadesM;
import modelos.conectate;
public class EdadBD {
    conectate con;
    PreparedStatement pstm;
    public EdadBD(){
        con = new conectate();
    }
    public void ingresaDatosEdad(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l,
            int m, int n, int o, int p, int q, int r , int s, int t, int v){
       
        try{
            pstm = con.getConnection().prepareStatement("INSERT INTO edades VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
            pstm.setInt(1,a);   
            pstm.setInt(2,b);   
            pstm.setInt(3,c);  
            pstm.setInt(4,d);   
            pstm.setInt(5,e);   
            pstm.setInt(6,f);  
            pstm.setInt(7,g);   
            pstm.setInt(8,h);   
            pstm.setInt(9,i);  
            pstm.setInt(10,j);   
            pstm.setInt(11,k);   
            pstm.setInt(12,l);  
            pstm.setInt(13,m);   
            pstm.setInt(14,n);   
            pstm.setInt(15,o); 
            pstm.setInt(16,p);   
            pstm.setInt(17,q);   
            pstm.setInt(18,r);  
            pstm.setInt(19,s);   
            pstm.setInt(20,t);   
            pstm.setInt(21,v);  
            pstm.executeUpdate();
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
    public void Buscar(int c, int m){
        try{
            pstm = con.getConnection().prepareStatement("SELECT * FROM edades WHERE id_entidad =? and id_municipio=?;");
            pstm.setInt(1,c);  
            pstm.setInt(2,m);
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
    public void deleteEdades(int cod, int idm){  
            try{
            pstm = con.getConnection().prepareStatement("DELETE FROM edades WHERE id_entidad=? and id_municipio=?;");
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
    public List<EdadesM> getDatos(){
      int registros = 0;
      List<EdadesM> lis = new ArrayList<EdadesM>();
              
    //realizamos la consulta sql y llenamos los datos en "Object"
      try{    
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT * FROM edades" +
            " ORDER BY id_entidad and id_entidad;");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            EdadesM c= new EdadesM();
            c.setId_entidad(Integer.parseInt(res.getString("id_entidad")));
            c.setId_municipio(Integer.parseInt(res.getString("id_municipio")));
            c.setE1(Integer.parseInt(res.getString("e0_4")));
            c.setE2(Integer.parseInt(res.getString("e5_9")));
            c.setE3(Integer.parseInt(res.getString("e10_14")));
            c.setE4(Integer.parseInt(res.getString("e15_19")));
            c.setE5(Integer.parseInt(res.getString("e20_24")));
            c.setE6(Integer.parseInt(res.getString("e25_29")));
            c.setE7(Integer.parseInt(res.getString("e30_34")));
            c.setE8(Integer.parseInt(res.getString("e35_39")));
            c.setE9(Integer.parseInt(res.getString("e40_44")));
            c.setE10(Integer.parseInt(res.getString("e45_49")));
            c.setE11(Integer.parseInt(res.getString("e50_54")));
            c.setE12(Integer.parseInt(res.getString("e55_59")));
            c.setE13(Integer.parseInt(res.getString("e60_64")));
            c.setE14(Integer.parseInt(res.getString("e65_69")));
            c.setE15(Integer.parseInt(res.getString("e70_74")));
            c.setE16(Integer.parseInt(res.getString("e75_79")));
            c.setE17(Integer.parseInt(res.getString("e80_84")));
            c.setE18(Integer.parseInt(res.getString("e85")));
            c.setNo_es(Integer.parseInt(res.getString("no_espec")));
            
            lis.add(c);
         }
        res.close();
      } 
        catch(SQLException e){
         System.out.println(e);
    }
    return lis;
        
    }
    
    
    public List<EdadesM> listEdades() {

        String consultaSQL="Select * from edades;";
        
        List<EdadesM> EdadesM = new ArrayList<EdadesM>();

        try {
          PreparedStatement  ps = con.getConnection().prepareStatement("Select * from edades;");
          ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                EdadesM l = new EdadesM();
                l.setId_entidad(rs.getInt("id_entidad"));
                l.setId_municipio(rs.getInt("id_municipio"));
                l.setE1(rs.getInt("e0_4"));
                l.setE2(rs.getInt("e5_9"));
                l.setE3(rs.getInt("e10_14"));
                l.setE4(rs.getInt("e15_19"));
                l.setE5(rs.getInt("e20_24"));
                l.setE6(rs.getInt("e25_29"));
                l.setE7(rs.getInt("e30_34"));
                l.setE8(rs.getInt("e35_39"));
                l.setE9(rs.getInt("e40_44"));
                l.setE10(rs.getInt("e45_49"));
                l.setE11(rs.getInt("e50_54"));
                l.setE12(rs.getInt("e55_59"));
                l.setE13(rs.getInt("e60_64"));
                l.setE14(rs.getInt("e65_69"));
                l.setE15(rs.getInt("e70_74"));
                l.setE16(rs.getInt("e75_79"));
                l.setE17(rs.getInt("e80_84"));
                l.setE18(rs.getInt("e85"));
                l.setNo_es(rs.getInt("no_espec"));
                
                EdadesM.add(l);
            }

        } catch (SQLException exception) {
            System.err.println("Error al CARGAR DATOS (Libro)" + exception);
        }
        return EdadesM;
    } 
}    
