// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.SharedPreferences;

// Referenced classes of package com.google.android.gms.internal:
//            zzap, zzhc

static final class nit> extends zzap
{

    public Object zza(SharedPreferences sharedpreferences)
    {
        return zze(sharedpreferences);
    }

    public zzhc zzce()
    {
        return zzhc.zzr(getKey(), (String)zzcd());
    }

    public String zze(SharedPreferences sharedpreferences)
    {
        return sharedpreferences.getString(getKey(), (String)zzcd());
    }

    (String s, String s1)
    {
        super(s, s1, null);
    }
}
