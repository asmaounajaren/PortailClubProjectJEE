package Model;
import java.io.Serializable;
public class inscription implements Serializable {
   
    

        private static final long serialVersionUID = 1L;
        private String firstName;
        private String Email;
        private String password;

        public String getFirstName() {
            return firstName;
        }
        public void setFirstName(String firstName) {
            this.firstName = firstName;
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

