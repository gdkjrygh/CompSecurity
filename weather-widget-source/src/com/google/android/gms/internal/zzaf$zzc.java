// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrr, zzaf, zzrv, zzrq, 
//            zzrp, zzrx

public static final class zzF extends zzrr
{

    private static volatile  zzhU[];
    public String key;
    public long zzhV;
    public long zzhW;
    public boolean zzhX;
    public long zzhY;

    public static zzF[] zzE()
    {
        if (zzhU == null)
        {
            synchronized (zzrv.zzbck)
            {
                if (zzhU == null)
                {
                    zzhU = new zzhU[0];
                }
            }
        }
        return zzhU;
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
        if (!(obj instanceof zzhU))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (zzhU)obj;
        if (key != null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((key) (obj)).key != null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (zzhV == ((zzhV) (obj)).zzhV)
        {
            flag = flag1;
            if (zzhW == ((zzhW) (obj)).zzhW)
            {
                flag = flag1;
                if (zzhX == ((zzhX) (obj)).zzhX)
                {
                    flag = flag1;
                    if (zzhY == ((zzhY) (obj)).zzhY)
                    {
                        return zza(((zzrr) (obj)));
                    }
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!key.equals(((key) (obj)).key))
        {
            return false;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public int hashCode()
    {
        int i;
        char c;
        int j;
        int k;
        if (key == null)
        {
            i = 0;
        } else
        {
            i = key.hashCode();
        }
        j = (int)(zzhV ^ zzhV >>> 32);
        k = (int)(zzhW ^ zzhW >>> 32);
        if (zzhX)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        return ((c + (((i + 527) * 31 + j) * 31 + k) * 31) * 31 + (int)(zzhY ^ zzhY >>> 32)) * 31 + zzDk();
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
        if (zzhV != 0L)
        {
            j = i + zzrq.zzd(2, zzhV);
        }
        i = j;
        if (zzhW != 0x7fffffffL)
        {
            i = j + zzrq.zzd(3, zzhW);
        }
        j = i;
        if (zzhX)
        {
            j = i + zzrq.zzc(4, zzhX);
        }
        i = j;
        if (zzhY != 0L)
        {
            i = j + zzrq.zzd(5, zzhY);
        }
        return i;
    }

    public zzhY zzF()
    {
        key = "";
        zzhV = 0L;
        zzhW = 0x7fffffffL;
        zzhX = false;
        zzhY = 0L;
        zzbca = null;
        zzbcl = -1;
        return this;
    }

    public void zza(zzrq zzrq1)
        throws IOException
    {
        if (!key.equals(""))
        {
            zzrq1.zzb(1, key);
        }
        if (zzhV != 0L)
        {
            zzrq1.zzb(2, zzhV);
        }
        if (zzhW != 0x7fffffffL)
        {
            zzrq1.zzb(3, zzhW);
        }
        if (zzhX)
        {
            zzrq1.zzb(4, zzhX);
        }
        if (zzhY != 0L)
        {
            zzrq1.zzb(5, zzhY);
        }
        super.zza(zzrq1);
    }

    public zzrx zzb(zzrp zzrp1)
        throws IOException
    {
        return zzd(zzrp1);
    }

    public zzd zzd(zzrp zzrp1)
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

            case 16: // '\020'
                zzhV = zzrp1.zzCV();
                break;

            case 24: // '\030'
                zzhW = zzrp1.zzCV();
                break;

            case 32: // ' '
                zzhX = zzrp1.zzCX();
                break;

            case 40: // '('
                zzhY = zzrp1.zzCV();
                break;
            }
        } while (true);
    }

    public ()
    {
        zzF();
    }
}
