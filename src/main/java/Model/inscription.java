package Model;
import java.io.Serializable;
public class inscription implements Serializable {
   
    

        private static final long serialVersionUID = 1L;
        private String firstName;
        private String Email;
        private String password;

        private String numtele;
        private String ville;
        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

    public String getNumtele() {
        return numtele;
    }

    public void setNumtele(String numtele) {
        this.numtele = numtele;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }


    }

