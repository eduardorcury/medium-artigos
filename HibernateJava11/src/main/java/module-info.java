module HibernateJava {
    requires java.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;
    requires java.xml.bind;
    requires java.sql;
    requires net.bytebuddy;
    requires com.sun.xml.bind;
    opens medium.erc to org.hibernate.orm.core;
}