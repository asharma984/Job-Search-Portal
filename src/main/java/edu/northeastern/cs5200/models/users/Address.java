package edu.northeastern.cs5200.models.users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String street1;
  private String street2;
  private String city;
  private String state;
  private String zip;
  private Boolean primary_;//can't name it "primary", reserved by SQL
  @ManyToOne
  private User user;

  public Address() {

  }

  public Address(String street1, String city, String zip, Boolean primary_) {
    this.street1 = street1;
    this.city = city;
    this.zip = zip;
    this.primary_ = primary_;
  }

  public Address(int id, String street1, String street2, String city, String state, String zip, Boolean primary_, User user) {
    this.id = id;
    this.street1 = street1;
    this.street2 = street2;
    this.city = city;
    this.state = state;
    this.zip = zip;
    this.primary_ = primary_;
    this.user = user;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getStreet1() {
    return street1;
  }

  public void setStreet1(String street1) {
    this.street1 = street1;
  }

  public String getStreet2() {
    return street2;
  }

  public void setStreet2(String street2) {
    this.street2 = street2;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZip() {
    return zip;
  }

  public void setZip(String zip) {
    this.zip = zip;
  }

  public Boolean getPrimary_() {
    return primary_;
  }

  public void setPrimary_(Boolean primary) {
    this.primary_ = primary;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
