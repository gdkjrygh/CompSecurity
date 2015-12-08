// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.wf.wellsfargomobile:
//            j, k

public class i extends DialogFragment
{

    private String a;

    public i()
    {
    }

    static String a(i l)
    {
        return l.a;
    }

    public void a(String s)
    {
        a = s;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        if (a == null && bundle != null)
        {
            a = bundle.getString("confirm_external_browser_url");
        }
        bundle = new android.app.AlertDialog.Builder(getActivity());
        Object obj = (LinearLayout)getActivity().getLayoutInflater().inflate(0x7f040025, null);
        bundle.setView(((android.view.View) (obj)));
        Object obj1 = (TextView)((LinearLayout) (obj)).findViewById(0x7f0f0076);
        ((TextView) (obj1)).setCompoundDrawablesWithIntrinsicBounds(0x7f0200fe, 0, 0, 0);
        ((TextView) (obj1)).setText(0x7f080123);
        ((TextView)((LinearLayout) (obj)).findViewById(0x7f0f0077)).setVisibility(8);
        obj1 = (Button)((LinearLayout) (obj)).findViewById(0x7f0f0078);
        ((Button) (obj1)).setText(0x7f0800b3);
        ((Button) (obj1)).setOnClickListener(new j(this));
        obj = (Button)((LinearLayout) (obj)).findViewById(0x7f0f0079);
        ((Button) (obj)).setText(0x7f080039);
        ((Button) (obj)).setOnClickListener(new k(this));
        bundle.setCancelable(false);
        setCancelable(false);
        return bundle.create();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("confirm_external_browser_url", a);
    }
}
