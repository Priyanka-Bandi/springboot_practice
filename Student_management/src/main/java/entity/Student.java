package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String Firstname;
    private String Lastname;
    private String email;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name = "First_Name")
    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }
    @Column(name = "Last_Name")
    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }
    @Column(name = "Email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public Student(){

    }
    public Student(Long id, String firstname, String lastname, String email) {
        this.id = id;
       this.Firstname = firstname;
        this.Lastname = lastname;
        this.email = email;
    }



}
