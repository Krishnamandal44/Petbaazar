package com.brandtechnosolutions.petbaazar;


import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class SellerOptionFragment extends DialogFragment {


    public SellerOptionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seller_option, container, false);
    }

    @Nullable
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Button camera = null, gallery = null;
        View view = getActivity().getLayoutInflater().inflate(R.layout.fragment_seller_option, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity()).setView(view);
        final Dialog dialog = builder.create();
        camera = (Button) view.findViewById(R.id.picture_id);
        gallery = (Button) view.findViewById(R.id.gallery_id);

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().finish();
            }
        });
        return dialog;
    }

}