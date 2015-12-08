// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.mrdc;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import com.wf.wellsfargomobile.BaseActionBarActivity;
import com.wf.wellsfargomobile.WFApp;

// Referenced classes of package com.wf.wellsfargomobile.mrdc:
//            m, n

public class l
{

    private final Context a;
    private Dialog b;

    public l(Context context)
    {
        a = context;
    }

    private boolean a(String s)
    {
        while (s == null || WFApp.o() == null || !s.equals(WFApp.o())) 
        {
            return false;
        }
        return true;
    }

    public void closeDialog(View view)
    {
        closeDialog(WFApp.o());
    }

    public void closeDialog(String s)
    {
        if (!a(s))
        {
            return;
        } else
        {
            b.dismiss();
            return;
        }
    }

    public void closeDialogDontShow(View view)
    {
        closeDialogDontShow(WFApp.o());
    }

    public void closeDialogDontShow(String s)
    {
        if (!a(s))
        {
            return;
        } else
        {
            s = a.getSharedPreferences("WF_PREFERENCES", 0).edit();
            s.putBoolean("PHOTO_TIPS_DONT_SHOW", true);
            s.apply();
            b.dismiss();
            return;
        }
    }

    public void openPhotoTips(String s)
    {
        openPhotoTips(s, true);
    }

    public void openPhotoTips(String s, boolean flag)
    {
        while (!a(s) || b != null && b.isShowing()) 
        {
            return;
        }
        ((BaseActionBarActivity)a).updateUserLocale();
        b = new Dialog(a, 0x7f0a0112);
        b.setTitle(a.getString(0x7f0800c6));
        b.setContentView(0x7f04004e);
        ((Button)b.findViewById(0x7f0f00fb)).setOnClickListener(new m(this));
        s = (Button)b.findViewById(0x7f0f00fa);
        if (flag)
        {
            s.setVisibility(8);
        } else
        {
            s.setOnClickListener(new n(this));
        }
        b.show();
    }
}
