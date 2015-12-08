// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

// Referenced classes of package com.wf.wellsfargomobile:
//            aq, ap

public class ao extends DialogFragment
{

    private aq a;

    public ao()
    {
        a = null;
    }

    static aq a(ao ao1)
    {
        return ao1.a;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        a = (aq)activity;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        Object obj = "";
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        bundle = getArguments();
        int i;
        if (bundle != null)
        {
            i = bundle.getInt("SELECT_FRAGMENT");
            obj = bundle.getString("DIALOG_TITLE");
        } else
        {
            i = 0;
        }
        if (i == 2)
        {
            bundle = (ViewGroup)getActivity().getLayoutInflater().inflate(0x7f040025, null);
        } else
        if (i == 1)
        {
            bundle = (ViewGroup)getActivity().getLayoutInflater().inflate(0x7f04004d, null);
        } else
        {
            bundle = (ViewGroup)getActivity().getLayoutInflater().inflate(0x7f040051, null);
        }
        builder.setView(bundle);
        if (i == 2)
        {
            TextView textview = (TextView)bundle.findViewById(0x7f0f0076);
            TextView textview1 = (TextView)bundle.findViewById(0x7f0f0077);
            String s = ((String) (obj));
            if (obj == null)
            {
                s = getString(0x7f0800f9);
            }
            textview.setText(s);
            textview1.setVisibility(8);
            obj = (Button)bundle.findViewById(0x7f0f0078);
            ((Button) (obj)).setText(0x7f08010e);
            ((Button)bundle.findViewById(0x7f0f0079)).setVisibility(8);
            bundle = ((Bundle) (obj));
        } else
        if (i == 1)
        {
            View view = bundle.findViewById(0x7f0f00f5);
            View view1 = bundle.findViewById(0x7f0f00f8);
            view.setVisibility(8);
            view1.setVisibility(0);
            bundle = (Button)bundle.findViewById(0x7f0f00f9);
        } else
        {
            bundle = (Button)bundle.findViewById(0x7f0f0105);
        }
        bundle.setOnClickListener(new ap(this));
        setCancelable(false);
        bundle = builder.create();
        bundle.setCanceledOnTouchOutside(false);
        return bundle;
    }

    public void onDetach()
    {
        super.onDetach();
        a = null;
    }
}
