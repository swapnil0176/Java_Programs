package com.AngularJava.DailyPrograms.Java_Programs;

public class DataHiding {
    private long aadhar_no,account_no;//achieving encapsulation variables make private
    private String pan_no;
    //geters and setters are use to access the private variables
    public long getAadhar_no(){
        return aadhar_no;
    }
    public void setAadhar_no(long aadhar_no){
        this.aadhar_no=aadhar_no;
    }
    public void setAccount_no(long account_no){
        this.account_no=account_no;
    }
    public long getAccount_no(){
        return account_no;
    }
    public void setPan_no(String pan_no){
        this.pan_no=pan_no;
    }
    public String getPan_no(){
        return pan_no;
    }
    public static void main(String[] args) {
        DataHiding data=new DataHiding();
        data.setAadhar_no(633868111);// set the aadhar value
        data.setPan_no("BFJP87T");
        data.setAccount_no(602048483);
        System.out.println("All data are sets");
        //for accessing data geter method is use;
        System.out.println("Addhar no:- "+data.getAadhar_no());
        System.out.println("Pan no:- "+data.getPan_no());
        System.out.println("Account no:- "+data.getAccount_no());
    }
}
