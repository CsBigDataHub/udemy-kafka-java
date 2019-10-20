package com.luv2code.hibernate.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

//    @Embedded
    // The address is embeddable, so no annotation needed here...
    private Address homeAddress;

    @AttributeOverrides({
        @AttributeOverride(name = "street", column = @Column(name = "BILLING_STREET")),
        @AttributeOverride(name = "city", column = @Column(name = "BILLING_CITY")),
        @AttributeOverride(name = "zipcode", column = @Column(name = "BILLING_ZIPCODE"))
    })
    private Address billingAddress;

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                    "id=" + id + ", " +
                    "firstName='" + firstName + '\'' + ", " +
                    "lastName='" + lastName + '\'' + ", " +
                    "email='" + email + '\'' +
                '}';
    }
}
