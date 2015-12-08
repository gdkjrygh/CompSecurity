// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrr, zzaf, zzrv, zzrq, 
//            zzrp, zzrx

public static final class zzI extends zzrr
{

    private static volatile  zzic[];
    public int key;
    public int value;

    public static zzI[] zzH()
    {
        if (zzic == null)
        {
            synchronized (zzrv.zzbck)
            {
                if (zzic == null)
                {
                    zzic = new zzic[0];
                }
            }
        }
        return zzic;
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
            if (obj instanceof zzic)
            {
                obj = (zzic)obj;
                flag = flag1;
                if (key == ((key) (obj)).key)
                {
                    flag = flag1;
                    if (value == ((value) (obj)).value)
                    {
                        return zza(((zzrr) (obj)));
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return ((key + 527) * 31 + value) * 31 + zzDk();
    }

    protected int zzB()
    {
        return super.zzB() + zzrq.zzB(1, key) + zzrq.zzB(2, value);
    }

    public value zzI()
    {
        key = 0;
        value = 0;
        zzbca = null;
        zzbcl = -1;
        return this;
    }

    public void zza(zzrq zzrq1)
        throws IOException
    {
        zzrq1.zzz(1, key);
        zzrq1.zzz(2, value);
        super.zza(zzrq1);
    }

    public zzrx zzb(zzrp zzrp1)
        throws IOException
    {
        return zzf(zzrp1);
    }

    public zzf zzf(zzrp zzrp1)
        throws IOException
    {
        do
        {
            int i = zzrp1.zzCT();
            switch (i)
            {
            default:
                if (zza(zzrp1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                key = zzrp1.zzCW();
                break;

            case 16: // '\020'
                value = zzrp1.zzCW();
                break;
            }
        } while (true);
    }

    public ()
    {
        zzI();
    }
}
