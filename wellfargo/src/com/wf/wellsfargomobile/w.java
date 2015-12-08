// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ToggleButton;

// Referenced classes of package com.wf.wellsfargomobile:
//            LogonFragment, WFApp

class w extends BroadcastReceiver
{

    final LogonFragment a;

    w(LogonFragment logonfragment)
    {
        a = logonfragment;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        LogonFragment.a(a).setText(WFApp.P());
        LogonFragment.b(a).setChecked(WFApp.G());
        LogonFragment.f(a).setText("");
        LogonFragment.d(a).setEnabled(true);
    }
}
