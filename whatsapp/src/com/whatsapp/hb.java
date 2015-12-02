// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;

// Referenced classes of package com.whatsapp:
//            iz, App

public class hb
{

    public static View a(Activity activity, ActionBar actionbar, String s, android.view.View.OnClickListener onclicklistener)
    {
        activity = iz.a(activity.getLayoutInflater(), 0x7f030019, null, false);
        com.actionbarsherlock.app.ActionBar.LayoutParams layoutparams = new com.actionbarsherlock.app.ActionBar.LayoutParams(-2, -2);
        int i;
        if (App.aR())
        {
            i = 5;
        } else
        {
            i = 3;
        }
        layoutparams.gravity = i;
        actionbar.setCustomView(activity, layoutparams);
        ((TextView)activity.findViewById(0x7f0b007d)).setText(s.toUpperCase());
        activity.findViewById(0x7f0b007c).setOnClickListener(onclicklistener);
        return activity;
    }
}
