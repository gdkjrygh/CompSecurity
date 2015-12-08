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
//            aa, ab

public class z extends DialogFragment
{

    public z()
    {
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = (new android.app.AlertDialog.Builder(getActivity())).setIcon(0x1080027);
        Object obj = (LinearLayout)getActivity().getLayoutInflater().inflate(0x7f040025, null);
        bundle.setView(((android.view.View) (obj)));
        ((TextView)((LinearLayout) (obj)).findViewById(0x7f0f0076)).setText(0x7f08006e);
        ((TextView)((LinearLayout) (obj)).findViewById(0x7f0f0077)).setVisibility(8);
        Button button = (Button)((LinearLayout) (obj)).findViewById(0x7f0f0078);
        button.setText(0x7f080039);
        button.setOnClickListener(new aa(this));
        obj = (Button)((LinearLayout) (obj)).findViewById(0x7f0f0079);
        ((Button) (obj)).setText(0x7f0800f5);
        ((Button) (obj)).setOnClickListener(new ab(this));
        setCancelable(false);
        bundle = bundle.create();
        bundle.setCancelable(false);
        return bundle;
    }
}
