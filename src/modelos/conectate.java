package modelos;

/** @author perla */
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*; 

public class conectate { 

   static String bd = "bd_inegi";
   static String host = "localhost";
   static String puerto = "3306";
   static String login = "root"; 
   static String password = "perla2123"; 
   static String url="";
   private Connection conn = null; 
    
   public conectate() {
      url = "jdbc:mysql://"+host+":"+puerto+"/"+bd+"?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false"; 
      try{          
         Class.forName("com.mysql.cj.jdbc.Driver");          
        }catch(ClassNotFoundException e){ 
          System.err.println("Error al registrar el driver");
       }
      try{
      conn = DriverManager.getConnection(url+"?useSSL=false",login,password); 
      conn.setAutoCommit(true);
      }
      catch(SQLException e){
       System.err.println("Error al conectar con el servidor");
       System.exit(0);
      }
       System.out.println("Conexión a base de datos "+bd+". listo"); 
      
   } 
   public Connection getConnection(){ 
      return conn; 
   } 
   public void desconectar(){ 
      conn = null; 
   } 
    public static String getLogin() {
        return login;
    }
    public static String getPassword() {
        return password;
    }
}