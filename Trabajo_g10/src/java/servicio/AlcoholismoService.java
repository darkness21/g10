package servicio;

import java.sql.Timestamp;
import java.util.ArrayList;
import Dominio.Alcoholicos;


import java.sql.SQLException;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AlcoholismoService{
    
    @PersistenceContext(unitName = "jpaPU")
    private EntityManager em;
    
    
    public Alcoholicos bucarPorCorreo(String correo){
            return em.find(Alcoholicos.class, correo);
    }
    
    public List<Alcoholicos>  listar(){
  //          return em.createNameQuery("Alcoholicos.listar", Alcoholicos.class)
    //                .getResultList();
    }
    
}


   /* public void crear(int cantidad) {
        dao.borrarTodo();
        for (int nro = 1; nro <= cantidad; nro++) {
            NumeroRifa numeroRifa = new NumeroRifa();
            numeroRifa.setNumero(nro);

            dao.agregar(numeroRifa);
        }
    }

    // solo dejamos pasar el resultado
    public ArrayList<NumeroRifa> getListaNumeroRifa() {
        return dao.buscarTodos();
    }

    public void comprar(NumeroRifa dto) throws NumeroNoDisponibleException {
        // colocamos la fecha de compra
        dto.setFechaCompra(new Timestamp(System.currentTimeMillis()));
        try {
            // tratamos de actualizar
            dao.actualizar(dto);
        } catch (BloqueOptimistaException ex) {
            // manejadores de excepciones
            String mensaje = "No se pudo comprar el numero: " + dto.getNumero();
            throw new NumeroNoDisponibleException(mensaje, ex);
        }

    }*/


