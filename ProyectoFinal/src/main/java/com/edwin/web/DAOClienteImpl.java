
package com.edwin.web;

import static com.edwin.web.DAO.close;
import static com.edwin.web.DAO.getSession;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Query;

public class DAOClienteImpl extends DAO {
    
 public void agregarCliente(Cliente cliente) {
    begin();
    getSession().save(cliente);
    commit();
    close();
    
    }
 

    public ArrayList<Cliente> buscarTodosClientes() {
        begin();
        Query q = getSession().createQuery("from Cliente");
        ArrayList<Cliente> cliente = (ArrayList<Cliente>)q.list();
        commit();
        close();
         
return cliente; 
          
    }
    
 public void borrarAlumno(Cliente p){
            begin();
            getSession().delete(p);
            commit();
            close();
 }   
        
  public Cliente buscarPorId(int id){
      begin();
     Query q = getSession().createQuery("from Cliente where id = :id");
        q.setInteger("id",id);
        Cliente p = (Cliente)q.uniqueResult();
        commit();
        close();
return p;  
   
  }  
    
}

