// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;

// Referenced classes of package com.whatsapp:
//            l1, SettingsNetworkUsage

class s4
    implements android.content.DialogInterface.OnClickListener
{

    final SettingsNetworkUsage a;

    s4(SettingsNetworkUsage settingsnetworkusage)
    {
        a = settingsnetworkusage;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            l1.b();
            SettingsNetworkUsage.a(a);
        }
    }
}
