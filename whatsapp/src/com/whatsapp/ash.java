// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.HashMap;

// Referenced classes of package com.whatsapp:
//            SettingsPrivacy, App

final class ash
    implements Runnable
{

    ash()
    {
    }

    public void run()
    {
        if (!SettingsPrivacy.d().isEmpty())
        {
            SettingsPrivacy.d().clear();
            App.b(App.au.getApplicationContext(), 0x7f0e0187, 1);
            if (SettingsPrivacy.c() != null)
            {
                SettingsPrivacy.a(SettingsPrivacy.c());
            }
        }
    }
}
