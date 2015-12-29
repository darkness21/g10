package presentacion;



import servicio.AlcoholismoService;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet(name = "ListarController", urlPatterns = {
    "/ListarController", 
    "/listar.html"
})
public class ListarController extends HttpServlet {

    @Resource(name = "jdbc/rifa")
    private DataSource ds;
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try (Connection cnx = ds.getConnection()) {
            // crear la capa de servicio y persistencia con sus "dependencias"
      //      CalcularAlchDAO dao = new CalcularAlchDAO(cnx);
      //      AlcoholismoService service = new AlcoholismoService(dao);
            // FIN creacion capa de servicio
            
            request.setCharacterEncoding("UTF-8");
            
            //request.setAttribute("listaAlcoholicos", service.buscar(null));
            request.getRequestDispatcher("/listar.jsp").forward(request, response);

        } catch (SQLException ex) {
            //TODO: configurar el servidor para muestre mensaje "amigable"
            throw new RuntimeException("Error al Obtener la conexion", ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


}
