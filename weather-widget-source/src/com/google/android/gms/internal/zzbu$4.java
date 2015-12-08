// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.SharedPreferences;

// Referenced classes of package com.google.android.gms.internal:
//            zzbu

static final class nit> extends zzbu
{

    public Object zza(SharedPreferences sharedpreferences)
    {
        return zze(sharedpreferences);
    }

    public String zze(SharedPreferences sharedpreferences)
    {
        return sharedpreferences.getString(getKey(), (String)zzdd());
    }

    (String s, String s1)
    {
        super(s, s1, null);
    }
}
