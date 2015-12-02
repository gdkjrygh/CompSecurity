// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import com.whatsapp.util.x;

// Referenced classes of package com.whatsapp:
//            SettingsChat, ko

class auu
    implements android.content.DialogInterface.OnClickListener
{

    final boolean a;
    final SettingsChat b;

    auu(SettingsChat settingschat, boolean flag)
    {
        b = settingschat;
        a = flag;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        b.removeDialog(5);
        b.showDialog(6);
        x.a(new ko(this));
    }
}
