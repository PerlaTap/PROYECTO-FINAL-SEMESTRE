package ModeloBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelos.conectate;
/** @author perla */
public class ConsultaBD {
    conectate con;

    public ConsultaBD() {
        con = new conectate();
    }
    //----1-------------------------------------------------------------
    public String [] consulta1() {
        /*
        1.-1. proyectar cuántas localidades 
        tienen las entidades 20, 31 y 04*/
         
        String[] data = new String[2];
        try{    
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT " +
            " id_entidad, count(id_localidad)" +
            " FROM localidades" +
            " where id_entidad in(20,31,04)"+
            " group by id_entidad");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String identidad = res.getString("id_entidad");
            String countid = res.getString("count(id_localidad)");
            
            data[0] = identidad;            
            data[1] = countid;
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
    }
    //----2-------------------------------------------------------------
   
    public String [] consulta2() {
        /*
        2. proyectar cuántas localidades tiene en cada uno de
        sus municipios las entidades 02, 03 y 04 
        */
         
        String[] data = new String[3];
        try{    
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT " +
            " id_entidad, id_municipio,count(id_localidad)" +
            " FROM localidades" +
            " where id_entidad in(02,03,04)"+
            " group by id_entidad, id_municipio");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String identidad = res.getString("id_entidad");
            String idmun = res.getString("id_municipio");
            String countid = res.getString("count(id_localidad)");
            
            data[0] = identidad; 
            data[1] = idmun;
            data[2] = countid;
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
    }
    //----3-------------------------------------------------------------
   
    public String [] consulta3() {
        /*3. Proyectar cuáles son las
        claves de entidades con más de 10,000 localidades
        */
         
        String[] data = new String[2];
        try{    
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT " +
            " id_entidad, count(id_localidad)" +
            " FROM localidades" +
            " group by id_entidad"+
            " having count(id_localidad)>10000");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String identidad = res.getString("id_entidad");
            String countid = res.getString("count(id_localidad)");
            
            data[0] = identidad;            
            data[1] = countid;
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
    }
    //----4-------------------------------------------------------------
   
    public String [] consulta4() {
        /*
        /*4. cuál es la entidad que tiene el mayor número
        de habitantes en el país.
        Proyectar el id de la entidad y la cantidad de habitantes */

        String[] data = new String[2];
        try{    
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT " +
            " id_entidad, sum(habitantes)" +
            " FROM habitantes" +
            " group by id_entidad"+
            " order by sum(habitantes)desc");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String identidad = res.getString("id_entidad");
            String sum = res.getString("sum(habitantes)");
            
            data[0] = identidad;            
            data[1] = sum;
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
    }
//----5-------------------------------------------------------------
    public String [] consulta5() {
        /*5.-proyectar cuántas localidades tienen 
        las entidades 20, 31 y 04*/
    
         
        String[] data = new String[2];
        try{    
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT " +
            " select id_entidad, count(id_localidad)" +
            " from localidades" +
            " where id_entidad in ('02','03','04')" +
            " group by id_entidad");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String identidad = res.getString("id_entidad");
            String countid = res.getString("count(id_localidad)");
            
            data[0] = identidad;            
            data[1] = countid;
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
    }  
//----6-------------------------------------------------------------
    public String [] consulta6() {
        /*/*1. proyectar cuántas localidades 
        tienen las entidades 20, 31 y 04*/
        
        String[] data = new String[2];
        try{    
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT " +
            " id_entidad, count(id_localidad)" +
            " FROM localidades" +
            " where id_entidad in(20,31,04)"+
            " group by id_entidad");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String identidad = res.getString("id_entidad");
            String countid = res.getString("count(id_localidad)");
            
            data[0] = identidad;            
            data[1] = countid;
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
    }
//----7-------------------------------------------------------------
    public String [] consulta7() {
        /*proyectar cuántas localidades tiene en cada 
        uno de sus municipios las entidades 02, 03 y 04 */
        
        String[] data = new String[3];
        try{    
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT " +
            "id_entidad, id_municipio, count(id_localidad)" +
            "from localidades" +
            "where id_entidad in ('02','03','04')" +
            "group by id_entidad, id_municipio");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String identidad = res.getString("id_entidad");
            String idmun = res.getString("id_municipio");
            String countid = res.getString("count(id_localidad)");
            
            data[0] = identidad;   
            data[1] = idmun;
            data[2] = countid;
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
    } 
//----8-------------------------------------------------------------
    public String [] consulta8() {
        /*
        /*3. Proyectar cuáles son las claves de entidades 
            con más de 10,000 localidades*/

        String[] data = new String[2];
        try{    
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT " +
            " select id_entidad, count(id_localidad)" +
            "from localidades" +
            "group by id_entidad" +
            "having count(id_localidad)>10000");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String identidad = res.getString("id_entidad");
            String countid = res.getString("count(id_localidad)");
            
            data[0] = identidad;            
            data[1] = countid;
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
    }
//----9-------------------------------------------------------------
    public String [] consulta9() {
        /*cuál es la entidad que tiene el mayor número
          de habitantes en el país.
          Proyectar el id de la entidad y la cantidad de habitantes */
                 
        String[] data = new String[2];
        try{    
         PreparedStatement pstm = con.getConnection().prepareStatement("SELECT " +
            " select id_entidad, sum(habitantes)" +
            "from habitantes" +
            "group by id_entidad" +
            "order by sum(habitantes)" +
            "limit 2;");
         ResultSet res = pstm.executeQuery();
         int i = 0;
         while(res.next()){
            String identidad = res.getString("id_entidad");
            String countid = res.getString("sum(habitantes)");
            
            data[0] = identidad;            
            data[1] = countid;
            i++;
         }
         res.close();
          }catch(SQLException e){
         System.out.println(e);
    }
    return data;
    }
//----10-------------------------------------------------------------
    
}
