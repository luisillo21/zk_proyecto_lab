/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ZK_proyecto_lab.controladores;


import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;


public class Login extends GenericForwardComposer{
        public void onClick$btn_login(){
            Window window = (Window)Executions.createComponents(
                "/Paginas/Login/login.zul", null, null);
             window.doModal();
        }
}
