

package com.edwin.web;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Query;


public class DAOMesaImpl extends DAO {
    
 public void agregarMesa(Mesa m) {
    begin();
 
    
    getSession().save(m);
    commit();
    close();
    
    }
 
       
    public ArrayList<Mesa> buscarTodosMesa() {
        begin();
        Criteria c=getSession().createCriteria(Mesa.class);
        ArrayList<Mesa> mesa = (ArrayList<Mesa>)c.list();
        commit();
        close();
         
return mesa; 
         
    }
    
    
 public void borrarMesa(Mesa p){
            begin();
            getSession().delete(p);
            commit();
            close();
 }   
        
  public Mesa buscarPorId(int id){
      begin();
     Query q = getSession().createQuery("from Mesa where id = :id");
        q.setInteger("id",id);
        Mesa p = (Mesa)q.uniqueResult();
        commit();
        close();
return p;  
   
  }
    
}
