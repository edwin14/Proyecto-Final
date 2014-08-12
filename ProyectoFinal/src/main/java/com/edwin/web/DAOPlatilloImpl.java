
package com.edwin.web;

import static com.edwin.web.DAO.close;
import static com.edwin.web.DAO.getSession;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Query;


public class DAOPlatilloImpl extends DAO {
    
 public void agregarPlatillo(Platillo p) {
    begin();
 
    
    getSession().save(p);
    commit();
    close();
    
    }
 
       
    public ArrayList<Platillo> buscarTodosPlatillo() {
        begin();
        Criteria c=getSession().createCriteria(Platillo.class);
        ArrayList<Platillo> platillo = (ArrayList<Platillo>)c.list();
        commit();
        close();
         
return platillo; 
         
    }
    
    
 public void borrarPlatillo(Platillo p){
            begin();
            getSession().delete(p);
            commit();
            close();
 }   
        
  public Platillo buscarPorId(int id){
      begin();
     Query q = getSession().createQuery("from Platillo where id = :id");
        q.setInteger("id",id);
        Platillo p = (Platillo)q.uniqueResult();
        commit();
        close();
return p;  
   
  }
    
}
