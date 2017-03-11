package com.ivisionblog.apps.materialtabsexample.adapter;

/**
 * Created by root on 10/3/17.
 */


import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ivisionblog.apps.materialtabsexample.R;
import com.ivisionblog.apps.materialtabsexample.modal.ContactsModal;

import java.util.ArrayList;

/**
 * Created by root on 9/3/17.
 */

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactsHolder> {

    private ArrayList<ContactsModal> mContactsModals;
    private FragmentManager mFm;

    public ContactsAdapter(ArrayList<ContactsModal> contactsModals){
        mContactsModals = contactsModals;
    }

    @Override
    public ContactsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.single_contact, parent, false);

        ContactsHolder viewHolder = new ContactsHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ContactsHolder holder, int position) {
        ContactsModal contact = mContactsModals.get(position);

        holder.mPhoneView.setText(contact.getmPhoneNumber());
        holder.mContactsNameView.setText(contact.getmName());
    }

    @Override
    public int getItemCount() {
        return mContactsModals.size();
    }


    public static class ContactsHolder extends RecyclerView.ViewHolder{

        TextView mContactsNameView;
        TextView mPhoneView;

        public ContactsHolder(View itemView) {
            super(itemView);
            mContactsNameView = (TextView) itemView.findViewById(R.id.nameView);
            mPhoneView = (TextView) itemView.findViewById(R.id.phoneNumberView);
        }

    }
}

