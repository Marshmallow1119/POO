package Av2;


import java.time.LocalDate;

public class Contact {

    private static int idcounter=1;
    private String name;
    private int phoneNumber;
    private String email;
    private LocalDate birthDate;
    private int id;

    public Contact(String name, int phoneNumber, String email, LocalDate birthDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthDate = birthDate;
        this.id=idcounter++;
    }
    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


@Override
public String toString() {
    return "Contact: Id=" + id + ", Name=" + name + ", PhoneNumber=" + phoneNumber + ", Email=" + email
            + ", BirthDate=" + birthDate + "";
}
   
@Override
public  boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (!(obj instanceof Contact))
        return false;
    Contact other = (Contact) obj;
    if (birthDate == null) {
        if (other.birthDate != null)
            return false;
    } else if (!birthDate.equals(other.birthDate))
        return false;
    if (email == null) {
        if (other.email != null)
            return false;
    } else if (!email.equals(other.email))
        return false;
    if (name == null) {
        if (other.name != null)
            return false;
    } else if (!name.equals(other.name))
        return false;
    if (phoneNumber != other.phoneNumber)
        return false;
    return true;
}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((birthDate == null) ? 0 : birthDate.hashCode());
    result = prime * result + ((email == null) ? 0 : email.hashCode());
    result = prime * result + id;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + phoneNumber;
    return result;
}
    }


