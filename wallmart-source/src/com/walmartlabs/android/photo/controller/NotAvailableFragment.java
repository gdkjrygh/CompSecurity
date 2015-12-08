// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NotAvailableFragment extends Fragment
{

    public NotAvailableFragment()
    {
    }

    private ActionBar getActionBar()
    {
        return ((AppCompatActivity)getActivity()).getSupportActionBar();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        getActionBar().setTitle(getString(com.walmartlabs.android.photo.R.string.photo_title_name));
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);
        layoutinflater = layoutinflater.inflate(com.walmartlabs.android.photo.R.layout.photo_fragment_disabled, viewgroup, false);
        layoutinflater.findViewById(com.walmartlabs.android.photo.R.id.ok_button).setOnClickListener(new android.view.View.OnClickListener() {

            final NotAvailableFragment this$0;

            public void onClick(View view)
            {
                getActivity().finish();
            }

            
            {
                this$0 = NotAvailableFragment.this;
                super();
            }
        });
        return layoutinflater;
    }
}
