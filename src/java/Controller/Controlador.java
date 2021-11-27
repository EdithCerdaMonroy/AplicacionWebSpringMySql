package Controller;
import Entidad.Predio;
import Config.Conexion;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class Controlador {//inicia clase
    //Generar objeto conexion
     Conexion con = new Conexion();
    //Plantilla de datos para tratamiento
     JdbcTemplate jdbcTemplate = new JdbcTemplate(con.conectar());
     //Agregar Modelo y Vista
    ModelAndView mav = new ModelAndView();
    List datos;
    
    //Metodo para realizar consulta a la base de datos tabla tpredio
    @RequestMapping("index.htm")
    public ModelAndView Listar (){
        String sql = "select * from tpredio";
        datos=this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista",datos);
        mav.setViewName("index");
        return mav;
    }
    
    //metodo en el controlador para agregar mapeo
    @RequestMapping(value = "agregar.htm",method = RequestMethod.GET)
    public ModelAndView Agregar(){
        mav.addObject(new Predio());
        mav.setViewName("agregar");
        return mav;
    }
     //metodo en el controlador para agregar registro
    @RequestMapping(value = "agregar.htm",method = RequestMethod.POST)
    public ModelAndView Agregar(Predio p){
        String sql="insert into tpredio (clave,superficie, valor, ubicacion, anio, total) values (?,?,?,?,?,?)"; 
        this.jdbcTemplate.update(sql, p.getClave(),p.getSuperficie(),p.getValor(),p.getUbicacion(),p.getAnio(),p.getTotal());
        return new ModelAndView("redirect:/index.htm");
        
    //metodo en el controlador para borrar registro
    }
    @RequestMapping(value = "delete.htm")
    public ModelAndView Delete(HttpServletRequest request){
        float clave=Float.parseFloat(request.getParameter("clave"));
        
        String sql="delete from tpredio where clave = "+clave;
         this.jdbcTemplate.update(sql);
         return new ModelAndView("redirect:/index.htm");
         
    }

    
    
}//termina clase

