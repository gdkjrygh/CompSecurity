// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzo;

// Referenced classes of package com.google.android.gms.internal:
//            zzhc

public class zzhf
{

    private int zzFV;
    private int zzFW;
    private final String zzFv;
    private final zzhc zzpv;
    private final Object zzqt;

    zzhf(zzhc zzhc1, String s)
    {
        zzqt = new Object();
        zzpv = zzhc1;
        zzFv = s;
    }

    public zzhf(String s)
    {
        this(zzo.zzby(), s);
    }

    public Bundle toBundle()
    {
        Bundle bundle;
        synchronized (zzqt)
        {
            bundle = new Bundle();
            bundle.putInt("pmnli", zzFV);
            bundle.putInt("pmnll", zzFW);
        }
        return bundle;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzf(int i, int j)
    {
        synchronized (zzqt)
        {
            zzFV = i;
            zzFW = j;
            zzpv.zza(zzFv, this);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
