// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzm

public abstract class zzl
{

    private static final Object zzadT = new Object();
    private static zzl zzadU;

    public zzl()
    {
    }

    public static zzl zzak(Context context)
    {
        synchronized (zzadT)
        {
            if (zzadU == null)
            {
                zzadU = new zzm(context.getApplicationContext());
            }
        }
        return zzadU;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public abstract boolean zza(ComponentName componentname, ServiceConnection serviceconnection, String s);

    public abstract boolean zza(String s, ServiceConnection serviceconnection, String s1);

    public abstract void zzb(ComponentName componentname, ServiceConnection serviceconnection, String s);

    public abstract void zzb(String s, ServiceConnection serviceconnection, String s1);

}
