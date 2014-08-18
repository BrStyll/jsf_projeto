package br.com.js_porjeto.util;

import javax.faces.context.FacesContext;
import org.hibernate.Session;


public class FacesContextUtil {
    
    private static final String HIBERNATE_SESSION = "hibernate_session";

    
    public static void setHIBERNATE_SESSION(Session session) {
        FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put(HIBERNATE_SESSION, session );
    }
    
    public static Session getRequestSession() {
        return (Session)FacesContext.getCurrentInstance().getExternalContext().getRequestMap().get(HIBERNATE_SESSION);
    }

    static void setRequestSession(Session session) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
