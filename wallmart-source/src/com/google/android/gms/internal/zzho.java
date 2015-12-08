// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzp;

// Referenced classes of package com.google.android.gms.internal:
//            zzhl

public class zzho
{

    private final String zzGP;
    private int zzHq;
    private int zzHr;
    private final zzhl zzpN;
    private final Object zzpc;

    zzho(zzhl zzhl1, String s)
    {
        zzpc = new Object();
        zzpN = zzhl1;
        zzGP = s;
    }

    public zzho(String s)
    {
        this(zzp.zzbA(), s);
    }

    public Bundle toBundle()
    {
        Bundle bundle;
        synchronized (zzpc)
        {
            bundle = new Bundle();
            bundle.putInt("pmnli", zzHq);
            bundle.putInt("pmnll", zzHr);
        }
        return bundle;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzf(int i, int j)
    {
        synchronized (zzpc)
        {
            zzHq = i;
            zzHr = j;
            zzpN.zza(zzGP, this);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
