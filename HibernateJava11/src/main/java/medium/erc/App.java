package medium.erc;

import org.hibernate.Session;

public class App {
    public static Session session = HibernateUtil.getSessionFactory().openSession();

    public static void main( String[] args )
    {
        Categoria categoria1 = new Categoria(null, "Moradia");
        Categoria categoria2 = new Categoria(null, "Alimentação");

        Gasto gasto1 = new Gasto(null, 150.0, categoria1);
        Gasto gasto2 = new Gasto(null, 200.0, categoria1);
        Gasto gasto3 = new Gasto(null, 25.0, categoria2);
        Gasto gasto4 = new Gasto(null, 40.0, categoria2);

        session.beginTransaction();
        session.save(categoria1);
        session.save(categoria2);
        session.save(gasto1);
        session.save(gasto2);
        session.save(gasto3);
        session.save(gasto4);
        session.getTransaction().commit();

        HibernateUtil.shutdown();
        System.out.println("Acesso ao Banco de Dados concluído.");

    }
}
