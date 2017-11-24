package com.nextBook.database.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name="user_roles")
public class User_roles extends BaseEntity implements Serializable {

  @Id
  @NotNull
  @GeneratedValue(generator = "increment")
  @GenericGenerator(name="increment", strategy = "increment")
  @Column(name = "role_id", unique = true, nullable = false)
  private int role_id;

  @NotNull
  @Column(name="user_name")
  private String user_name;

  @NotNull
  @Column(name="role_type")
  private String role_type;

  @NotNull
  private int user_id_fk;

  @Id
  @ManyToOne
  @JoinColumn(name = "user_name", referencedColumnName = "user_name", nullable = false)
  private Users user;

  public int getId() {
    return role_id;
  }

  public void setRole_id(int role_id) {
    this.role_id = role_id;
  }

  public String getUser_name() {
    return user_name;
  }

  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }

  public String getRole_type() {
    return role_type;
  }

  public void setRole_type(String role_type) {
    this.role_type = role_type;
  }

  public int getUser_id_fk() {
    return user_id_fk;
  }

  public void setUser_id_fk(int user_id_fk) {
    this.user_id_fk = user_id_fk;
  }

  public Users getUser() {
    return this.user;
  }

  public void setUser(Users user) {
    this.user = user;
  }

  @Override
  public String toString() {
    String newLine = System.getProperty("line.separator");
    String user_role = "Role ID: " + role_id + newLine;
    user_role += "Username: " + user_name + newLine;
    user_role += "Role type: " + role_type + newLine;
    user_role += "User Foreign key id: " + user_id_fk + newLine;

    return user_role;
  }
}
