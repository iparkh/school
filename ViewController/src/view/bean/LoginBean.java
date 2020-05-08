package view.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import oracle.adf.view.rich.component.rich.input.RichInputText;

import oracle.adf.view.rich.component.rich.nav.RichCommandMenuItem;

import view.common.MyADFUtil;

public class LoginBean {
    private RichInputText usernameInputText;
    private RichInputText passwordInputText;
    private RichCommandMenuItem logoutAction;

    public LoginBean() {
    }

    public void setUsernameInputText(RichInputText usernameInputText) {
        this.usernameInputText = usernameInputText;
    }

    public RichInputText getUsernameInputText() {
        return usernameInputText;
    }

    public void setPasswordInputText(RichInputText passwordInputText) {
        this.passwordInputText = passwordInputText;
    }

    public RichInputText getPasswordInputText() {
        return passwordInputText;
    }
    public String logoutAction(){
        System.out.println("username-------------password");
        try {
            
           FacesContext context = FacesContext.getCurrentInstance();
           HttpSession session = (HttpSession) context.getExternalContext().getSession(true);

            if (session != null) {
                session.invalidate();
                 System.out.println("session != null");
            } else {
                    System.out.println("session == null");
                }
       } catch (Exception e) {
            // TODO: Add catch code
            System.out.println("error in logout --"+e);
        }
        System.out.println("return index");
        return "index";
    }
    public String loginAction(){
        String username=usernameInputText.getValue().toString();
        String password=passwordInputText.getValue().toString();
        System.out.println("username:"+username+" password:"+password);
        
        Connection conn=null;
        PreparedStatement stat=null;
        ResultSet rs=null;
 
        try {
            String sql="select SCHOOL_PRINCIPAL_NAME from school_information where SCHOOL_PRINCIPAL_USERNAME='"+username+"' and SCHOOL_PRINCIPAL_PASWORD='"+password+"'";
            conn=MyADFUtil.getConnection();
            stat =conn.prepareStatement(sql);
            rs=stat.executeQuery();
            while(rs.next()){
                MyADFUtil.putInSessionScope("username", username);
                MyADFUtil.putInSessionScope("principalName", rs.getString(1));
                return "dashboard";
            }
            
        } catch (Exception e) {
            System.out.println("error in logout --"+e);
        }

        MyADFUtil.showErrorMessage("Не вірне імя користувача чи пароль");
        return null;

        }

    public void setLogoutAction(RichCommandMenuItem logoutAction) {
        this.logoutAction = logoutAction;
    }

    public RichCommandMenuItem getLogoutAction() {
        return logoutAction;
    }
}
