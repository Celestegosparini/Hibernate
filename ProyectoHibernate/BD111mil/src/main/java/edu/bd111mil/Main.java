package edu.bd111mil;

import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

/**
 *
 * @author lvidarte
 */
public class Main {

    public static void main(String args[]) {
        try {

            StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

            try {
                SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
                Session session = sessionFactory.openSession();

                session.beginTransaction();

                //ejemplo1(session);
                //ejemplo2(session);
                //ejemplo3(session);
                ejemplo4(session);
                session.getTransaction().commit();

                session.close();
                sessionFactory.close();

            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ejemplo1(Session session) {
        // Traigo el cliente con ID 1
        Cliente c = session.load(Cliente.class, 1);
        System.out.println(c);

        // Imprimo sus teléfonos
        System.out.println("---Telefonos");
        for (Telefono telefono : c.getTelefonos()) {
            System.out.println(telefono.getNumero());
        }

        // Imprimo sus facturas
        for (Factura factura : c.getFacturas()) {
            System.out.println("---Factura");
            System.out.println(factura);
            for (DetalleFactura detalleFactura : factura.getDetalleFactura()) {
                System.out.println(detalleFactura);
            }
        }
    }

    public static void ejemplo2(Session session) {

        CriteriaQuery<Cliente> q = session.getCriteriaBuilder().createQuery(Cliente.class);
        q.select(q.from(Cliente.class));
        List<Cliente> l = session.createQuery(q).list();
        System.out.println("Lista de clientes");
        for (Cliente cl : l) {

            System.out.println(cl);
        }
    }

    public static void ejemplo3(Session session) {

        Query q = session.createQuery("FROM Cliente WHERE activo = :valor", Cliente.class);
        q.setParameter("valor", true);
        List<Cliente> l = q.list();
        System.out.println("Lista de clientes no activos");
        for (Cliente cl : l) {
            System.out.println(cl);
        }
    }

    public static void ejemplo4(Session session) {
        Query q = session.createQuery("FROM Cliente WHERE apellido LIKE  :valor ", Cliente.class);
        q.setParameter("valor" , "B%");
        List<Cliente> l = q.list();
        System.out.println ("Apellidos de cliente que empisancon B");
        for (Cliente cl : l) {
            System.out.println(cl);
        }
    }
}
