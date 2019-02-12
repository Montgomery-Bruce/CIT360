/* This program is a part of a simple hibernate example used for CIT-360
   It is written by Troy Tuckett.  BYUI.EDU
 */
package cit360.Hibernate;

import java.util.*;

public class RunHibernateExample {

    public static void main(String[] args) {

        StudentsDAO t = StudentsDAO.getInstance();

        List<Students> s = t.getStudents();
        for (Students i : s) {
            System.out.println(i);
        }

        System.out.println(t.getStudents(1));
        System.out.println();
        
        List<Teachers> tch = t.getTeachers();
        for (Teachers i : tch) {
            System.out.println(i);
        }
        
        System.out.println(t.getTeachers(2));
    }
}
