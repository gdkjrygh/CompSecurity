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
//            aj

public class ai extends DialogFragment
{

    protected LinearLayout b;

    public ai()
    {
    }

    protected void a()
    {
        String s = getArguments().getString("DIALOG_POSITIVE_BUTTON_TEXT");
        if (s == null)
        {
            s = getString(0x7f0800b3);
        }
        Button button = (Button)b.findViewById(0x7f0f0078);
        button.setText(s);
        button.setOnClickListener(new aj(this));
    }

    protected void b()
    {
        ((Button)b.findViewById(0x7f0f0079)).setVisibility(8);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(getActivity());
        Object obj1 = getArguments();
        int i = ((Bundle) (obj1)).getInt("DIALOG_ICON");
        Object obj = ((Bundle) (obj1)).getString("DIALOG_TITLE");
        obj1 = ((Bundle) (obj1)).getString("DIALOG_MESSAGE");
        b = (LinearLayout)getActivity().getLayoutInflater().inflate(0x7f040025, null);
        bundle.setView(b);
        TextView textview = (TextView)b.findViewById(0x7f0f0076);
        if (i != -1)
        {
            textview.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        }
        if (obj != null)
        {
            textview.setText(((CharSequence) (obj)));
        } else
        {
            textview.setVisibility(8);
        }
        obj = (TextView)b.findViewById(0x7f0f0077);
        if (obj1 != null)
        {
            ((TextView) (obj)).setText(((CharSequence) (obj1)));
        } else
        {
            ((TextView) (obj)).setVisibility(8);
        }
        bundle.setCancelable(false);
        setCancelable(false);
        a();
        b();
        return bundle.create();
    }
}
