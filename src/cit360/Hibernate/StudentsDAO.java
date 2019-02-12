/* This program is a part of a simple hibernate example used for CIT-360
   It is written by Troy Tuckett.  BYUI.EDU
 */
package cit360.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;

/** TestDAO implemented using a singleton pattern
 *  Used to get student data from my MYSQL database*/
public class StudentsDAO {

    SessionFactory factory = null;
    Session session = null;

    private static StudentsDAO single_instance = null;

    private StudentsDAO()
    {
        factory = HibernateUtils.getSessionFactory();
    }

    /** This is what makes this class a singleton.  You use this
     *  class to get an instance of the class. */
    public static StudentsDAO getInstance()
    {
        if (single_instance == null) {
            single_instance = new StudentsDAO();
        }

        return single_instance;
    }

    /** Used to get more than one student from database
     *  Uses the OpenSession construct rather than the
     *  getCurrentSession method so that I control the
     *  session.  Need to close the session myself in finally.*/
    public List<Students> getStudents() {

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from cit360.Hibernate.Students";
            List<Students> s = (List<Students>)session.createQuery(sql).getResultList();
            session.getTransaction().commit();
            return s;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }

    }
    
    public List<Teachers> getTeachers() {

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from cit360.Hibernate.Teachers";
            List<Teachers> tch = (List<Teachers>)session.createQuery(sql).getResultList();
            session.getTransaction().commit();
            return tch;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }

    }
    
    

    /** Used to get a single student from database */
    public Students getStudents(int id) {

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from cit360.Hibernate.Students where id=" + Integer.toString(id);
            Students s = (Students)session.createQuery(sql).getSingleResult();
            session.getTransaction().commit();
            return s;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }
    
       public Teachers getTeachers(int id) {

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from cit360.Hibernate.Teachers where id=" + Integer.toString(id);
            Teachers tch = (Teachers)session.createQuery(sql).getSingleResult();
            session.getTransaction().commit();
            return tch;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

}
