// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.locations;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.wf.wellsfargomobile.locations:
//            x, y

public class w extends DialogFragment
{

    public w()
    {
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        Object obj = (LinearLayout)getActivity().getLayoutInflater().inflate(0x7f040025, null);
        bundle.setView(((android.view.View) (obj)));
        Object obj1 = (TextView)((LinearLayout) (obj)).findViewById(0x7f0f0076);
        ((TextView) (obj1)).setText(0x7f080070);
        ((TextView) (obj1)).setCompoundDrawablesWithIntrinsicBounds(0x1080027, 0, 0, 0);
        ((TextView)((LinearLayout) (obj)).findViewById(0x7f0f0077)).setText(0x7f08006f);
        obj1 = (Button)((LinearLayout) (obj)).findViewById(0x7f0f0078);
        ((Button) (obj1)).setText(0x7f080032);
        ((Button) (obj1)).setOnClickListener(new x(this));
        obj = (Button)((LinearLayout) (obj)).findViewById(0x7f0f0079);
        ((Button) (obj)).setText(0x7f0800f5);
        ((Button) (obj)).setOnClickListener(new y(this));
        setCancelable(false);
        bundle = bundle.create();
        bundle.setCanceledOnTouchOutside(false);
        return bundle;
    }
}
