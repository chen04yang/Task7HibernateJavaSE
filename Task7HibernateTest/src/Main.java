
import dao.HibernateBaseDao;

import model.Customer;
import model.Employee;


public class Main {
    public static void main(String[] args) {
        Customer s = new Customer();
        HibernateBaseDao hbd = new HibernateBaseDao();
        hbd.save(s);
        
        
    }

}
