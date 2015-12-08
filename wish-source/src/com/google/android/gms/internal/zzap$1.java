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
        return zzb(sharedpreferences);
    }

    public Boolean zzb(SharedPreferences sharedpreferences)
    {
        return Boolean.valueOf(sharedpreferences.getBoolean(getKey(), ((Boolean)zzcd()).booleanValue()));
    }

    public zzhc zzce()
    {
        return zzhc.zzg(getKey(), ((Boolean)zzcd()).booleanValue());
    }

    (String s, Boolean boolean1)
    {
        super(s, boolean1, null);
    }
}
