/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ZK_proyecto_lab.controladores;

import com.ZK_proyecto_lab.dominio.Usuario;
import com.ZK_proyecto_lab.webService.Consumir_web_service;
import org.json.JSONObject;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;
import org.zkoss.zk.ui.Session;
/**
 *
 * @author Usuario Final
 */
public class Validar_usuario extends GenericForwardComposer{
    
    Textbox usuario;
    Textbox clave;
    Consumir_web_service ws;
    
    public void onClick$btn_logear(){
        ws = new Consumir_web_service();
        Usuario usu = new Usuario();
            usu.setNombre(usuario.getValue());
            usu.setClave(clave.getValue());
         JSONObject rs = ws.login(usu);
        
        if(rs.toString().equals("{}")){
            
            Messagebox.show("Usuario o contraseña incorrectos.");
        }else{
            usu.setId_usuario((int) rs.getJSONObject(""+0+"").get("idconf_usuario"));
            Session sess = null;
            sess.setAttribute("userCredential", usu);
            Messagebox.show((String) rs.getJSONObject(""+0+"").get("usuario"));
        }
        
    }
}
