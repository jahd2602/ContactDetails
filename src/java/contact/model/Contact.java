package contact.model;

import com.opensymphony.xwork2.validator.annotations.DateRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

public class Contact  
{
    private String Nombre;
    private String Apellido;
    private String Provincia;
    private String Distrito;
    private String Nacimiento;
    private String website;

    public String getNacimiento()
        {        return Nacimiento;    }
    public void setNacimiento(String Nacimiento)
        {        this.Nacimiento = Nacimiento;    }
    public String getDistrito() 
        {        return Distrito;    }
    public void setDistrito(String Distrito)
        {        this.Distrito = Distrito;    }
    public String getProvincia()
        {        return Provincia;    }
    public void setProvincia(String Provincia)
        {        this.Provincia = Provincia;    }
    public String getNombre()
        {        return Nombre;    }
    @RequiredStringValidator(message="El campo nombre es obligatorio", trim=true)
    public void setNombre(String Nombre)
        {        this.Nombre = Nombre;    }
    public String getApellido()
        {        return Apellido;    }
    public void setApellido(String Apellido)
        {        this.Apellido = Apellido;    }
    public String getWebsite()
        {        return website;    }
    public void setWebsite(String website)
        {        this.website = website;    }
}
