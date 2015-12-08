// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.c;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.wf.wellsfargomobile.hcewallet.d.i;

// Referenced classes of package com.wf.wellsfargomobile.hcewallet.c:
//            e, f, g

public class d extends DialogFragment
{

    protected LinearLayout a;
    private final String b = "PayNowDialogFragment";
    private Handler c;
    private Runnable d;

    public d()
    {
        d = new e(this);
    }

    static void a(d d1)
    {
        d1.d();
    }

    private void c()
    {
        c = new Handler();
        c.postDelayed(d, 60000L);
    }

    private void d()
    {
        i.isPopupShowing = false;
        c.removeCallbacks(d);
    }

    protected void a()
    {
        String s = getArguments().getString("DIALOG_POSITIVE_BUTTON_TEXT");
        if (s == null)
        {
            s = getString(0x7f0800bc);
        }
        Button button = (Button)a.findViewById(0x7f0f0078);
        button.setText(s);
        button.setOnClickListener(new f(this));
    }

    protected void b()
    {
        Button button = (Button)a.findViewById(0x7f0f0079);
        button.setText(getString(0x7f080061));
        button.setOnClickListener(new g(this));
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        c();
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        Object obj1 = getArguments();
        int j = ((Bundle) (obj1)).getInt("DIALOG_ICON");
        Object obj = ((Bundle) (obj1)).getString("DIALOG_TITLE");
        obj1 = ((Bundle) (obj1)).getString("DIALOG_MESSAGE");
        a = (LinearLayout)getActivity().getLayoutInflater().inflate(0x7f040025, null);
        bundle.setView(a);
        TextView textview = (TextView)a.findViewById(0x7f0f0076);
        if (j != -1)
        {
            textview.setCompoundDrawablesWithIntrinsicBounds(j, 0, 0, 0);
        }
        if (obj != null)
        {
            textview.setText(((CharSequence) (obj)));
        } else
        {
            textview.setVisibility(8);
        }
        obj = (TextView)a.findViewById(0x7f0f0077);
        if (obj1 != null)
        {
            ((TextView) (obj)).setText(((CharSequence) (obj1)));
        } else
        {
            ((TextView) (obj)).setVisibility(8);
        }
        bundle.setCancelable(true);
        setCancelable(true);
        a();
        b();
        bundle = bundle.create();
        bundle.setCanceledOnTouchOutside(false);
        return bundle;
    }

    public void onDetach()
    {
        super.onDetach();
        d();
    }
}
