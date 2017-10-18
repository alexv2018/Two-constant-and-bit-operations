package com.github.alexv2018.main;

import com.github.alexv2018.model.BitOperations;
import com.github.alexv2018.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vendin on 18.10.2017.
 */
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        BitOperations bitOperations = (BitOperations) context.getBean("bitOperations");

        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.save(bitOperations);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            session.getTransaction().rollback();
        } finally {
            HibernateUtil.getSessionFactory().close();
        }

        bitOperations.doAnd();
        bitOperations.doOR();
        bitOperations.doXor();
        bitOperations.doNotVar1();
        bitOperations.doNotVar2();
    }
}
