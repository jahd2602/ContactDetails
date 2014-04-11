package contact.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.VisitorFieldValidator;
import contact.model.Contact;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import nl.captcha.Captcha;
import org.apache.catalina.Session;
import org.apache.struts2.StrutsStatics;

// TODO agregar eliminar
public class Accion extends ActionSupport {

    static ArrayList<Contact> contactos;

    public ArrayList<Contact> getContactos() {
        if (contactos == null) {
            contactos = new ArrayList<Contact>();
        }

        return contactos;
    }
    private Contact contact;
    private String captcha;

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public Contact getContact() {
        return contact;
    }

    @VisitorFieldValidator(message = "")
    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String addContact() {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(StrutsStatics.HTTP_REQUEST);
        Captcha c = (Captcha) request.getSession().getAttribute(Captcha.NAME);
        if (c.isCorrect(captcha)) {
            getContactos().add(contact);
            contact = new Contact();
            return SUCCESS;
        } else {
            addFieldError("captcha", "El captcha ingresado no es correcto");
            return INPUT;
        }
    }

    public String listar() {
        getContactos();
        return SUCCESS;
    }
}
