package cfs003.ejemplohibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.metamodel.MetadataSources;

/**
 *
 * @author Yaki's
 */
public class TestHibernate {

    public static void main(String[] args) {

        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // obtiene los valores de hibernate.cfg.xml
                .build();
        try {
            SessionFactory sessionFactory = new MetadataSources(registry)
                    .buildMetadata().buildSessionFactory();
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            Cliente c = (Cliente) session.load(Cliente.class, 1);
            System.out.println("Nombre: " + c.getNombre() + "Apellido: " + c.getApellido() + "Dirección: " + c.getDireccion() + "Activo: " + c.getActivo());
            session.getTransaction().commit();
            session.close();
            sessionFactory.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        try {
//            String url = "jdbc:mysql://localhost:3306/bd111mil";
//            Connection conn = DriverManager.getConnection(url, "root", "admin");
//            PreparedStatement st = conn.prepareStatement("SELECT * FROM e01_cliente");
//            ResultSet resultSet = st.executeQuery();
//            while (resultSet.next()) {
//                int id = resultSet.getInt("nro_cliente");
//                String nombre = resultSet.getString("nombre");
//                String apellido = resultSet.getString("apellido");
//                String direccion = resultSet.getString("direccion");
//                boolean activo = resultSet.getBoolean("activo");
//                System.out.println("" + id + ", " + nombre + ", "
//                        + apellido + ", " + direccion + ", " + activo);
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
    }

}
