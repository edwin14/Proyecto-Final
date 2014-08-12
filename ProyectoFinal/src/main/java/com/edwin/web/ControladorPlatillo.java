
package com.edwin.web;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class ControladorPlatillo {
    
    @RequestMapping(value="/platillo/{num_platillo}/{tipo_platillo}/{id}", method=RequestMethod.GET, headers={"Accept=text/html"})
    public @ResponseBody String mensajito(@PathVariable float numplatillo, @PathVariable float tplatillo,@PathVariable int id ){
        String mensajito="Ese platillo no se encuentra disponible el dia de hoy";
        try{
           DAOPlatilloImpl d= new DAOPlatilloImpl();
            d.agregarPlatillo(new Platillo(numplatillo,tplatillo,new Cliente(id) ));
           mensajito= "Platillo Registrado con exito";
        }catch(Exception  e){
            mensajito="Lo siento no existe ese tipo de platillo";
        }
        return mensajito;
    }
    
    @RequestMapping(value="/platillo", method=RequestMethod.GET, headers={"Accept=application/json"})
    public @ResponseBody String metodo2()throws Exception {
        DAOClienteImpl d=new DAOClienteImpl();
        ObjectMapper maper=new ObjectMapper();
            
        return maper.writeValueAsString(d.buscarTodosClientes());
    }
    
}
