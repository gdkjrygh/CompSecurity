// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrr, zzaf, zzrv, zzrq, 
//            zzrp, zzrx

public static final class zzO extends zzrr
{

    private static volatile zziP zziN[];
    public String name;
    public zziP zziO;
    public zziP zziP;

    public static zzO[] zzN()
    {
        if (zziN == null)
        {
            synchronized (zzrv.zzbck)
            {
                if (zziN == null)
                {
                    zziN = new zziN[0];
                }
            }
        }
        return zziN;
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
        if (!(obj instanceof zziN)) goto _L4; else goto _L3
_L3:
        obj = (zziN)obj;
        if (name != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((name) (obj)).name != null) goto _L4; else goto _L7
_L7:
        if (zziO != null) goto _L9; else goto _L8
_L8:
        flag = flag1;
        if (((zziO) (obj)).zziO != null) goto _L4; else goto _L10
_L10:
        if (zziP != null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        flag = flag1;
        if (((zziP) (obj)).zziP != null) goto _L4; else goto _L11
_L11:
        return zza(((zzrr) (obj)));
_L6:
        if (!name.equals(((name) (obj)).name))
        {
            return false;
        }
          goto _L7
_L9:
        if (!zziO.equals(((equals) (obj)).zziO))
        {
            return false;
        }
          goto _L10
        if (!zziP.equals(((equals) (obj)).zziP))
        {
            return false;
        }
          goto _L11
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (name == null)
        {
            i = 0;
        } else
        {
            i = name.hashCode();
        }
        if (zziO == null)
        {
            j = 0;
        } else
        {
            j = zziO.hashCode();
        }
        if (zziP != null)
        {
            k = zziP.hashCode();
        }
        return ((j + (i + 527) * 31) * 31 + k) * 31 + zzDk();
    }

    protected int zzB()
    {
        int j = super.zzB();
        int i = j;
        if (!name.equals(""))
        {
            i = j + zzrq.zzl(1, name);
        }
        j = i;
        if (zziO != null)
        {
            j = i + zzrq.zzc(2, zziO);
        }
        i = j;
        if (zziP != null)
        {
            i = j + zzrq.zzc(3, zziP);
        }
        return i;
    }

    public zziP zzO()
    {
        name = "";
        zziO = null;
        zziP = null;
        zzbca = null;
        zzbcl = -1;
        return this;
    }

    public void zza(zzrq zzrq1)
        throws IOException
    {
        if (!name.equals(""))
        {
            zzrq1.zzb(1, name);
        }
        if (zziO != null)
        {
            zzrq1.zza(2, zziO);
        }
        if (zziP != null)
        {
            zzrq1.zza(3, zziP);
        }
        super.zza(zzrq1);
    }

    public zzrx zzb(zzrp zzrp1)
        throws IOException
    {
        return zzj(zzrp1);
    }

    public zzj zzj(zzrp zzrp1)
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
                name = zzrp1.readString();
                break;

            case 18: // '\022'
                if (zziO == null)
                {
                    zziO = new <init>();
                }
                zzrp1.zza(zziO);
                break;

            case 26: // '\032'
                if (zziP == null)
                {
                    zziP = new <init>();
                }
                zzrp1.zza(zziP);
                break;
            }
        } while (true);
    }

    public ()
    {
        zzO();
    }
}
