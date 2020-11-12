package vn.nangcafe.nangcafe.model;

import com.sun.istack.NotNull;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Personnel")
public class Personnel {

    public Personnel() {
        id = 0;
        name = "";
        gender = "";
        address = "";
        phone = "";
        username = "";
        password = "";
    }

    public Personnel(int id, String name, String gender, String address, String phone,
                     String username, String password) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public Personnel setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Personnel setName(String name) {
        this.name = name;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Personnel setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Personnel setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Personnel setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Personnel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Personnel setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "Address")
    private String address;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "Username")
    private String username;

    @Column(name = "Password")
    private String password;

}
