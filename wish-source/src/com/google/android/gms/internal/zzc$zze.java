// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzc, zznw, zznr

public static final class zzj extends zzns
{

    private static volatile zzaOe zzgs[];
    public int key;
    public int value;

    public static zzj[] zzi()
    {
        if (zzgs == null)
        {
            synchronized (zznw.zzaOd)
            {
                if (zzgs == null)
                {
                    zzgs = new zzgs[0];
                }
            }
        }
        return zzgs;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof zzgs)
            {
                obj = (zzgs)obj;
                flag = flag1;
                if (key == ((key) (obj)).key)
                {
                    flag = flag1;
                    if (value == ((value) (obj)).value)
                    {
                        return zza(((zzns) (obj)));
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return ((key + 527) * 31 + value) * 31 + zzzM();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        zznr1.zzx(1, key);
        zznr1.zzx(2, value);
        super.zza(zznr1);
    }

    protected int zzc()
    {
        return super.zzc() + zznr.zzz(1, key) + zznr.zzz(2, value);
    }

    public value zzj()
    {
        key = 0;
        value = 0;
        zzaNT = null;
        zzaOe = -1;
        return this;
    }

    public ()
    {
        zzj();
    }
}
