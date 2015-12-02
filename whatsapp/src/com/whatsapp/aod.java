// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import com.whatsapp.util.x;

// Referenced classes of package com.whatsapp:
//            SettingsChat, rm

class aod
    implements android.content.DialogInterface.OnClickListener
{

    final SettingsChat a;

    aod(SettingsChat settingschat)
    {
        a = settingschat;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.showDialog(6);
        x.a(new rm(this));
    }
}
