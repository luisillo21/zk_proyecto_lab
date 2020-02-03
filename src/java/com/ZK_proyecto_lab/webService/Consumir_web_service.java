/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ZK_proyecto_lab.webService;

import com.ZK_proyecto_lab.dominio.Usuario;
import comMdf.devazt.networking.HttpClient;
import comMdf.devazt.networking.OnHttpRequestComplete;
import comMdf.devazt.networking.Response;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Usuario Final
 */
public class Consumir_web_service {
    JSONObject lista = null;
    
    public JSONObject listarCategorias(String servidor){
        HttpClient cliente = new HttpClient(new OnHttpRequestComplete() {
            public void onComplete(Response status) {
                try {
                    if(status.isSuccess()){
                        lista = new JSONObject(status.getResult());
                    }
                } catch (JSONException e) {
                    System.out.println(e);
                }
   
            }
        });
        cliente.excecute("http://127.0.0.1/web_service_php/"+servidor);
        return lista;
    }
    
        public JSONObject login(Usuario usuario){
        HttpClient cliente = new HttpClient(new OnHttpRequestComplete() {
            public void onComplete(Response status) {
                try {
                    if(status.isSuccess()){
                        lista = new JSONObject(status.getResult());
                    }
                } catch (JSONException e) {
                    System.out.println(e);
                }
   
            }
        });
        cliente.excecute("http://127.0.0.1/web_service_php/login.php?usuario="+usuario.getNombre()+"&clave="+usuario.getClave());
        return lista;
    }
    
    
    
    
    
}
