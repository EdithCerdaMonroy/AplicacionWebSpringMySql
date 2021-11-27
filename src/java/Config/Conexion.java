package Config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Conexion {//inicia clase
    
    public DriverManagerDataSource conectar(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/bdtramite");
        dataSource.setUsername("adminedith");
        dataSource.setPassword("edith123");
        
        return dataSource;
    }
    /*
    //prueba de conexion
    public static void main(String[] args) {
        Conexion pruebaConexion = new Conexion();
        pruebaConexion.conectar();
        System.out.println("Prueba de Conexion exitosa.");
    }*/
    
    
}//termina clase



