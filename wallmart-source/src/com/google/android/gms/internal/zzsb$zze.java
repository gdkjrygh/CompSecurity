// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrr, zzsb, zzrv, zzrq, 
//            zzrp, zzrx

public static final class zzDD extends zzrr
{

    private static volatile zzF zzbcV[];
    public String key;
    public String value;

    public static zzDD[] zzDC()
    {
        if (zzbcV == null)
        {
            synchronized (zzrv.zzbck)
            {
                if (zzbcV == null)
                {
                    zzbcV = new zzbcV[0];
                }
            }
        }
        return zzbcV;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof zzbcV)) goto _L4; else goto _L3
_L3:
        obj = (zzbcV)obj;
        if (key != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((key) (obj)).key != null) goto _L4; else goto _L7
_L7:
        if (value != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        flag = flag1;
        if (((value) (obj)).value != null) goto _L4; else goto _L8
_L8:
        return zza(((zzrr) (obj)));
_L6:
        if (!key.equals(((key) (obj)).key))
        {
            return false;
        }
          goto _L7
        if (!value.equals(((value) (obj)).value))
        {
            return false;
        }
          goto _L8
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (key == null)
        {
            i = 0;
        } else
        {
            i = key.hashCode();
        }
        if (value != null)
        {
            j = value.hashCode();
        }
        return ((i + 527) * 31 + j) * 31 + zzDk();
    }

    protected int zzB()
    {
        int j = super.zzB();
        int i = j;
        if (!key.equals(""))
        {
            i = j + zzrq.zzl(1, key);
        }
        j = i;
        if (!value.equals(""))
        {
            j = i + zzrq.zzl(2, value);
        }
        return j;
    }

    public value zzDD()
    {
        key = "";
        value = "";
        zzbca = null;
        zzbcl = -1;
        return this;
    }

    public zzbcl zzF(zzrp zzrp1)
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

            case 10: // '\n'
                key = zzrp1.readString();
                break;

            case 18: // '\022'
                value = zzrp1.readString();
                break;
            }
        } while (true);
    }

    public void zza(zzrq zzrq1)
        throws IOException
    {
        if (!key.equals(""))
        {
            zzrq1.zzb(1, key);
        }
        if (!value.equals(""))
        {
            zzrq1.zzb(2, value);
        }
        super.zza(zzrq1);
    }

    public zzrx zzb(zzrp zzrp1)
        throws IOException
    {
        return zzF(zzrp1);
    }

    public ()
    {
        zzDD();
    }
}
