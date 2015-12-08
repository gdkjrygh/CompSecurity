// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class SimpleMessageDialogFragment extends DialogFragment
{

    private static final String ARG_MESSAGE = "message";
    private static final String ARG_TITLE = "title";

    public SimpleMessageDialogFragment()
    {
    }

    public static SimpleMessageDialogFragment newInstance(String s, String s1)
    {
        SimpleMessageDialogFragment simplemessagedialogfragment = new SimpleMessageDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", s);
        bundle.putString("message", s1);
        simplemessagedialogfragment.setArguments(bundle);
        return simplemessagedialogfragment;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = getArguments().getString("title");
        String s = getArguments().getString("message");
        com.walmart.android.ui.dialog.AlertDialog.Builder builder = new com.walmart.android.ui.dialog.AlertDialog.Builder(getActivity());
        builder.setTitle(bundle).setMessage(s).setPositiveButton(getString(com.walmartlabs.android.photo.R.string.photo_ok), new android.content.DialogInterface.OnClickListener() {

            final SimpleMessageDialogFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                this$0 = SimpleMessageDialogFragment.this;
                super();
            }
        });
        return builder.create();
    }
}
