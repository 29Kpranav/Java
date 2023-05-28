
// packages and access modifiers..

// package bank;   
//this package can be import by other files in same folder.

//access modifiers are public,private,protected and default.

import java.util.*;
class account{
    public String name;        //acess anywhere 
    protected String email;    //acess by current package and only subclass of differnt packages
    private String password;   // acess only by account class no by subclass,package,nothing.. 

    //to acess private things we use getter and setter in java.
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password=pass;
    }
}
public class w3oops6 {
    public static void main(String[] args){
        account acc1= new account();
        acc1.name="k.pranav";
        acc1.email="pranav29.kulkarni@gmail.com";
        acc1.setPassword("abcd");
        System.out.println(acc1.getPassword());
    }
}
