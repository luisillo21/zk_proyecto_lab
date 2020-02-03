/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ZK_proyecto_lab.main;

import com.ZK_proyecto_lab.dominio.Usuario;
import com.ZK_proyecto_lab.webService.Consumir_web_service;
import comMdf.devazt.networking.HttpClient;
import comMdf.devazt.networking.OnHttpRequestComplete;
import comMdf.devazt.networking.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Usuario Final
 */
public class Main {
    public static void main(String[] args){
          Consumir_web_service genr = new Consumir_web_service();
          JSONObject categorias = genr.listarCategorias("lst_Marcas.php");
          for(int i=0;i < categorias.length();i++){
              System.out.println(categorias.getJSONObject(""+i+"").get("nombre"));
          }
          Usuario usu = new Usuario();
          usu.setNombre("luis123");
          usu.setClave("soda");
          System.out.println(genr.login(usu).getJSONObject(""+0+"").get("usuario"));
    }
    
 
    
}
