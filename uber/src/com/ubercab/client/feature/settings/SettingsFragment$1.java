// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.settings;

import android.content.Context;
import android.widget.ArrayAdapter;

// Referenced classes of package com.ubercab.client.feature.settings:
//            SettingsFragment

public final class a extends ArrayAdapter
{

    final SettingsFragment a;

    public final boolean isEnabled(int i)
    {
        return false;
    }

    (SettingsFragment settingsfragment, Context context, String as[])
    {
        a = settingsfragment;
        super(context, 0x7f030155, 0x7f0e03e4, as);
    }
}
