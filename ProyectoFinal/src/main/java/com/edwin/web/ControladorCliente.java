
package com.edwin.web;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class ControladorCliente {
   
    @RequestMapping(value="/cliente/{nombre}/{tipo_pago}", method=RequestMethod.GET, headers={"Accept=text/html"})
    public @ResponseBody String mensajito(@PathVariable String nombre, @PathVariable String tipo_pago){
           DAOClienteImpl d= new DAOClienteImpl();
           d.agregarCliente(new Cliente(nombre, tipo_pago));
           return "Cliente guardado con exito";
    }
    
    @RequestMapping(value="/cliente", method=RequestMethod.GET, headers={"Accept=application/json"})
    public @ResponseBody String metodo2()throws Exception {
        DAOClienteImpl d=new DAOClienteImpl();
        ObjectMapper maper=new ObjectMapper();
            
        return maper.writeValueAsString(d.buscarTodosClientes());
    }
    
}
