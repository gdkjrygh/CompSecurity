// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.text.Editable;
import android.widget.CompoundButton;
import android.widget.EditText;
import com.wf.wellsfargomobile.util.o;

// Referenced classes of package com.wf.wellsfargomobile:
//            WFApp, LogonFragment

class t
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    final LogonFragment a;

    t(LogonFragment logonfragment)
    {
        a = logonfragment;
        super();
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (flag)
        {
            o.a("saveUsername", Boolean.valueOf(true));
        } else
        if (WFApp.G() && LogonFragment.a(a).getText().length() > 0 && LogonFragment.a(a).getText().toString().equals(WFApp.M()))
        {
            WFApp.O();
            LogonFragment.a(a).setText("");
            return;
        }
    }
}
