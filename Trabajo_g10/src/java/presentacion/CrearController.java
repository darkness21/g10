package presentacion;
import Dominio.Alcoholicos;
import servicio.AlcoholismoService;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet(name = "CrearController", urlPatterns = {
    "/CrearController",
    "/crear.html"
})
public class CrearController extends HttpServlet {

    @Resource(name = "jdbc/CertamenTD")
    private DataSource ds;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try (Connection cnx = ds.getConnection()) {
            // crear la capa de servicio y persistencia con sus "dependencias"
         //CalcularAlchDAO dao = new CalcularAlchDAO(cnx);
         //AlcoholismoService service = new AlcoholismoService(dao);
            // FIN creacion capa de servicio
            
            request.setCharacterEncoding("UTF-8");

            String email = request.getParameter("email");
            String sexo = request.getParameter("sex");
            
            
            String strGrado = request.getParameter("grado");
            String strPeso = request.getParameter("peso");
            String strML = request.getParameter("mililt");
            
            int grado = Integer.parseInt(strGrado);
            int peso = Integer.parseInt(strPeso);
            int ml = Integer.parseInt(strML);
            double alcohol;
            double alcoholemia=0;
            String estado = "";
            alcohol = (ml*grado*0.8)/100;
            if (sexo == "male"){
                sexo="M";
                alcoholemia=alcohol/(peso*0.7);
                            }
            if (sexo == "female"){
                sexo="F";
                alcoholemia=alcohol/(peso*0.6);
            }
            if (alcoholemia < 0.3){
                estado="Sin sancion al conducir";
            }
            if (alcoholemia >= 0.3 && alcoholemia < 0.8){
                estado="Bajo la influencia del alcohol";
            }
            if (alcoholemia >= 0.8){
                estado="Estado de Ebriedad";
            }

            Alcoholicos dto = new Alcoholicos();
            dto.setAlcoholemia(alcoholemia);
            dto.setEstado(estado);
            dto.setFechaCreacion(new Timestamp(System.currentTimeMillis()));
            
            dto.setGraduacion(alcohol);
            dto.setEstado(estado);
            dto.setMililitros(ml);
            dto.setMail(email);
            dto.setSexo(sexo);
            // EJECUTAR LOGICA DE NEOGOCIO
       // service.crear(dto);
            
            request.setAttribute("estado", estado);
            request.setAttribute("alcoholemia", alcoholemia);
            request.getRequestDispatcher("/estado.jsp").forward(request, response);

        } catch (SQLException ex) {
            //TODO: configurar el servidor para muestre mensaje "amigable"
            throw new RuntimeException("Error al Obtener la conexion", ex);
        }

    }

}
