// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzf;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.cast:
//            LaunchOptions

public static final class zzRB
{

    private LaunchOptions zzRB;

    public LaunchOptions build()
    {
        return zzRB;
    }

    public zzRB setLocale(Locale locale)
    {
        zzRB.setLanguage(zzf.zzb(locale));
        return this;
    }

    public age setRelaunchIfRunning(boolean flag)
    {
        zzRB.setRelaunchIfRunning(flag);
        return this;
    }

    public ()
    {
        zzRB = new LaunchOptions();
    }
}
