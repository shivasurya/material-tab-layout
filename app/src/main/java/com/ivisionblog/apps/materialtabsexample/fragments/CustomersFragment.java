package com.ivisionblog.apps.materialtabsexample.fragments;

/**
 * Created by root on 10/3/17.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ivisionblog.apps.materialtabsexample.R;
import com.ivisionblog.apps.materialtabsexample.adapter.ContactsAdapter;
import com.ivisionblog.apps.materialtabsexample.modal.ContactsModal;

import java.util.ArrayList;

public class CustomersFragment extends Fragment{

private RecyclerView mRecyclerview;

public CustomersFragment() {
        // Required empty public constructor
        }

public static ContactsFragment newInstance() {
        ContactsFragment fragment = new ContactsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
        }

@Override
public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        }

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
                         Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_customer, container, false);
        }

@Override
public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mRecyclerview = (RecyclerView) getActivity().findViewById(R.id.customerlist);

        ContactsAdapter contactsAdapter = new ContactsAdapter(generateData());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        mRecyclerview.setLayoutManager(layoutManager);
        mRecyclerview.setAdapter(contactsAdapter);
}

private ArrayList<ContactsModal> generateData(){
        ArrayList<ContactsModal> contactsModals = new ArrayList<>();

        contactsModals.add(new ContactsModal("Shivasurya S","987654321"));
        contactsModals.add(new ContactsModal("Twitter","987654321"));
        contactsModals.add(new ContactsModal("Facebook","987654321"));
        contactsModals.add(new ContactsModal("Zoho","987654321"));
        contactsModals.add(new ContactsModal("Blogger","987654321"));
        contactsModals.add(new ContactsModal("Google","987654321"));
        contactsModals.add(new ContactsModal("Deducely","987654321"));
        contactsModals.add(new ContactsModal("Appnet","987654321"));
        Log.e("size",contactsModals.size()+"");
        return contactsModals;
        }
}

