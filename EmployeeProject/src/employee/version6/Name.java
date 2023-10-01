package version6;

import employee.version4.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Name{
    private String fname;
    private String mname;
    private String lname;
    private String[] suffix = {""};
    
    public Name(String fname, String mname, String lname,String ... suffix) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.suffix = suffix;
    }

    public Name(String fname, String mname, String lname) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }

    public Name(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public Name(String fname) {
        this.fname = fname;
    }

    public Name(){
        
    }
    
    public Name(Name me){
        this.fname = me.fname;
        this.mname = me.mname;
        this.lname = me.lname;
        this.suffix = me.suffix;
    }
    
    
    public String getFname() {
        
        return this.fname;
    }

    public String getMname() {
        return this.mname;
    }

    public String getLname() {
        return this.lname;
    }

    public String getSuffix() {
        String gsuffix = "";
        for(int x=0; x< this.suffix.length; x++){
            if(x+1!=this.suffix.length){
                gsuffix += this.suffix[x] + ", ";
            }
            else{
                gsuffix += this.suffix[x];
            }
        }
        return gsuffix;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setSuffix(String[] suffix) {
        this.suffix = suffix;
    }
    
    @Override
    public String toString(){
        String midname = this.mname;
        String lastname = this.lname;
        if(midname!=null){
            midname = " " + midname.charAt(0) + ".";
        }
        else{
            midname = "";
        }
        
        if(lastname!=null){
            lastname = " " + lastname;
        }
        else{
            lastname = "";
        }
        
        return getFname() + midname + lastname + " " + getSuffix();
    }
    
}
