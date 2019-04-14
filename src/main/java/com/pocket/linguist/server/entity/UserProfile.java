package com.pocket.linguist.server.entity;


import com.pocket.linguist.server.entity.base.BaseEntity;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "user_profile")
public class UserProfile extends BaseEntity {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(name = "user_password", nullable = false)
    private String userPassword;

    @Column(name = "user_login", nullable = false)
    private String userLogin;

    public UserProfile() {
        //default
    }

    public UserProfile(String userName, String userPassword, String userLogin) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userLogin = userLogin;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserProfile)) {
            return false;
        }
        UserProfile that = (UserProfile) o;
        return id == that.id &&
            Objects.equals(userName, that.userName) &&
            userPassword.equals(that.userPassword) &&
            userLogin.equals(that.userLogin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, userPassword, userLogin);
    }
}
