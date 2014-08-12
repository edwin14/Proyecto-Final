
package com.edwin.web;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class ControladorMesa {
    
    @RequestMapping(value="/mesa/{num_mesa}/{personas_mesa}/{id}", method=RequestMethod.GET, headers={"Accept=text/html"})
    public @ResponseBody String mensajito(@PathVariable float nummesa, @PathVariable float 
            pmesa,@PathVariable int id ){
        String mensajito="No se encuentra la mesa disponible";
        try{
           DAOMesaImpl d= new DAOMesaImpl();
            d.agregarMesa(new Mesa(nummesa, pmesa,new Cliente(id) ));
           mensajito= " mesa registrada con exito";
        }catch(Exception  e){
            mensajito="Lo siento pero no existe esa id de mesa";
        }
        return mensajito;
    }
    
    @RequestMapping(value="/mesa", method=RequestMethod.GET, headers={"Accept=application/json"})
    public @ResponseBody String metodo2()throws Exception {
        DAOClienteImpl d=new DAOClienteImpl();
        ObjectMapper maper=new ObjectMapper();
            
        return maper.writeValueAsString(d.buscarTodosClientes());
    }
}
