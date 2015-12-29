package Dominio;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.transaction.UserTransaction;

 @Entity
 @Table(name="registro_alcoholemia")
public class Alcoholicos implements Serializable {
     
     @Id
     @Column(name="id_registro")
     private long id_registro;
     @Column(name="mail")
     private String mail;
     @Column(name="mililitros")
     private int mililitros;
     @Column(name="graduacion")
     private double graduacion;
     @Column(name="peso")
     private int peso;
     @Column(name="peso")
     private String sexo;
     @Column(name="alcoholemia")
     private double alcoholemia;
     @Column(name="estado")
     private String estado;
     @Column(name="fechaCreacion")
     private Timestamp fechaCreacion;

    public Alcoholicos() {
    }

    public long getId(){
        return id_registro;
    }
    
    public void setId(long id_registro){
        this.id_registro = id_registro;
    }
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getMililitros() {
        return mililitros;
    }

    public void setMililitros(int mililitros) {
        this.mililitros = mililitros;
    }
     public double getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(double graduacion) {
        this.graduacion = graduacion;
    }
     public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
     public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
     public double getAlcoholemia() {
        return alcoholemia;
    }

    public void setAlcoholemia(double alcoholemia) {
        this.alcoholemia = alcoholemia;
    }
    
    public String getEstado() {
        return mail;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Timestamp fechaCompra) {
        this.fechaCreacion = fechaCreacion;
    }

 
  /* @Override
    public String toString() {
        return "NumeroRifa{" + "numero=" + numero + ", nombre=" + nombre + ", fechaCompra=" + fechaCompra + '}';
    }

    public static void main(String[] args) {
        NumeroRifa n = new NumeroRifa();
        n.setNumero(3);
        n.setNombre("RVEGA");
        System.out.println("Clase: " + n);
    }*/ 

    public void persist(Object object) {
        /* Add this to the deployment descriptor of this module (e.g. web.xml, ejb-jar.xml):
         * <persistence-context-ref>
         * <persistence-context-ref-name>persistence/LogicalName</persistence-context-ref-name>
         * <persistence-unit-name>Certamen_2PU</persistence-unit-name>
         * </persistence-context-ref>
         * <resource-ref>
         * <res-ref-name>UserTransaction</res-ref-name>
         * <res-type>javax.transaction.UserTransaction</res-type>
         * <res-auth>Container</res-auth>
         * </resource-ref> */
        try {
            Context ctx = new InitialContext();
            UserTransaction utx = (UserTransaction) ctx.lookup("java:comp/env/UserTransaction");
            utx.begin();
            EntityManager em = (EntityManager) ctx.lookup("java:comp/env/persistence/LogicalName");
            em.persist(object);
            utx.commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }

    public void persist1(Object object) {
        /* Add this to the deployment descriptor of this module (e.g. web.xml, ejb-jar.xml):
         * <persistence-context-ref>
         * <persistence-context-ref-name>persistence/LogicalName</persistence-context-ref-name>
         * <persistence-unit-name>Certamen_2PU</persistence-unit-name>
         * </persistence-context-ref>
         * <resource-ref>
         * <res-ref-name>UserTransaction</res-ref-name>
         * <res-type>javax.transaction.UserTransaction</res-type>
         * <res-auth>Container</res-auth>
         * </resource-ref> */
        try {
            Context ctx = new InitialContext();
            UserTransaction utx = (UserTransaction) ctx.lookup("java:comp/env/UserTransaction");
            utx.begin();
            EntityManager em = (EntityManager) ctx.lookup("java:comp/env/persistence/LogicalName");
            em.persist(object);
            utx.commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }

    public void persist2(Object object) {
        /* Add this to the deployment descriptor of this module (e.g. web.xml, ejb-jar.xml):
         * <persistence-context-ref>
         * <persistence-context-ref-name>persistence/LogicalName</persistence-context-ref-name>
         * <persistence-unit-name>Certamen_2PU</persistence-unit-name>
         * </persistence-context-ref>
         * <resource-ref>
         * <res-ref-name>UserTransaction</res-ref-name>
         * <res-type>javax.transaction.UserTransaction</res-type>
         * <res-auth>Container</res-auth>
         * </resource-ref> */
        try {
            Context ctx = new InitialContext();
            UserTransaction utx = (UserTransaction) ctx.lookup("java:comp/env/UserTransaction");
            utx.begin();
            EntityManager em = (EntityManager) ctx.lookup("java:comp/env/persistence/LogicalName");
            em.persist(object);
            utx.commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }

}
