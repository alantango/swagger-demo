package com.example.demo1.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@ToString
public class Subscriber {

    @Id @GeneratedValue
    @Getter @Setter
    private Long id;
    @Getter @Setter
    private String first;
    @Getter @Setter
    private String last;
    @Getter @Setter
    private String email;

    public Subscriber(){
    }

    public Subscriber(String first, String last, String email) {
        this.first = first;
        this.last = last;
        this.email = email;
    }
    
//    public Long getId() {
//        return id;
//    }
//    public void setId(Long id) {
//        this.id = id;
//    }
//    public String getFirst() {
//        return first;
//    }
//    public void setFirst(String first) {
//        this.first = first;
//    }
//    public String getLast() {
//        return last;
//    }
//    public void setLast(String last) {
//        this.last = last;
//    }
//    public String getEmail() {
//        return email;
//    }
//    public void setEmail(String email) {
//        this.email = email;
//    }

//        @Override
//    public String toString() {
//        return "subscriber [id=" + id + ", first=" + first + ", last=" + last + ", email=" + email + "]";
//    }

    
    
}
