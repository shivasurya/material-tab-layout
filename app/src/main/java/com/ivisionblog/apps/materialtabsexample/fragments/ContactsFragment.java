package com.ivisionblog.apps.materialtabsexample.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ivisionblog.apps.materialtabsexample.R;
import com.ivisionblog.apps.materialtabsexample.adapter.ContactsAdapter;
import com.ivisionblog.apps.materialtabsexample.modal.ContactsModal;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ContactsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ContactsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContactsFragment extends Fragment {

    private RecyclerView mRecyclerview;

    public ContactsFragment() {
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
        return inflater.inflate(R.layout.fragment_contacts, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mRecyclerview = (RecyclerView) getActivity().findViewById(R.id.contactlist);

        ContactsAdapter contactsAdapter = new ContactsAdapter(generateData());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        mRecyclerview.setLayoutManager(layoutManager);
        mRecyclerview.setAdapter(contactsAdapter);
    }

    private ArrayList<ContactsModal> generateData(){
        ArrayList<ContactsModal> contactsModals = new ArrayList<>();

        contactsModals.add(new ContactsModal("Midhun Vignesh S","987654321"));
        contactsModals.add(new ContactsModal("Shivasurya S","987654321"));
        contactsModals.add(new ContactsModal("Aswin Vayiravan","987654321"));
        contactsModals.add(new ContactsModal("Muthu Alagappan M","987654321"));
        contactsModals.add(new ContactsModal("SriramaMoorthy S","987654321"));
        contactsModals.add(new ContactsModal("Puviyarasu V","987654321"));
        contactsModals.add(new ContactsModal("Arun Kumar K R","987654321"));
        contactsModals.add(new ContactsModal("Venkat Raman","987654321"));

        return contactsModals;
    }
}
