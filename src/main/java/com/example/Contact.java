package com.example;

/**
 * Created by Rajdeep Dua on 11/2/16.
 */
public class Contact {
    private int id;
    private String sfid;
    private String first;
    private String last;
    private String phone;

    public void setEmail(String email) {
        this.email = email;
    }
     public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSfid(String sfid) {
        this.sfid = sfid;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public void setLast(String last) {
        this.last = last;
    }

    private String email;
    public Contact() {}
    public Contact(int id, String sfid, String first, String last, String email,String phone ) {
        super();
        this.id = id;
        this.sfid = sfid;
        this.first = first;
        this.last = last;
        this.email = email;
        this.phone = phone;
    }
    
    public int getId()
    {
        return id;
    }
public String getPhone()
    {
        return phone;
    }

    public String getSfid()
    {
        return sfid;
    }

    public String getLast()
    {
        return this.last;
    }

    public String getFirst()
    {
        return this.first;
    }

    public String getEmail()
    {
        return this.email;
    }
}
