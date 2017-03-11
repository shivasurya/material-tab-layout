package com.ivisionblog.apps.materialtabsexample.modal;

/**
 * Created by root on 10/3/17.
 */

public class ContactsModal {
    private String mName;
    private String mPhoneNumber;

    public ContactsModal(String name,String phone){
        mName = name;
        mPhoneNumber = phone;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public void setmPhoneNumber(String mPhoneNumber) {
        this.mPhoneNumber = mPhoneNumber;
    }
}
