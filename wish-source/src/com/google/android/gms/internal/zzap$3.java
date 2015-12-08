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
        return zzd(sharedpreferences);
    }

    public zzhc zzce()
    {
        return zzhc.zza(getKey(), (Long)zzcd());
    }

    public Long zzd(SharedPreferences sharedpreferences)
    {
        return Long.valueOf(sharedpreferences.getLong(getKey(), ((Long)zzcd()).longValue()));
    }

    (String s, Long long1)
    {
        super(s, long1, null);
    }
}
