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
        return zzc(sharedpreferences);
    }

    public Integer zzc(SharedPreferences sharedpreferences)
    {
        return Integer.valueOf(sharedpreferences.getInt(getKey(), ((Integer)zzdd()).intValue()));
    }

    (String s, Integer integer)
    {
        super(s, integer, null);
    }
}
