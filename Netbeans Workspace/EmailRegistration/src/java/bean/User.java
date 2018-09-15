/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Rashid
 */
public class User {

    private String name, password, email, lname, fname, mname, cn, address;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setfname(String fname) {
        this.fname = fname;
    }

    public String getfname() {
        return fname;
    }

    public void setlname(String lname) {
        this.lname = lname;
    }

    public String getlname() {
        return lname;
    }

    public void setcn(String cn) {
        this.cn = cn;
    }

    public String getcn() {
        return cn;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public String getaddress() {
        return address;
    }

    public void setmname(String mname) {
        this.mname = mname;
    }

    public String getmname() {
        return mname;
    }
}
