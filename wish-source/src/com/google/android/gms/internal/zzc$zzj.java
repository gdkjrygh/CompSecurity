// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzc, zznw, zznr

public static final class zzq extends zzns
{

    public zzaOe zzhg[];
    public zzaOe zzhh;
    public String zzhi;

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
        if (!(obj instanceof zzq)) goto _L4; else goto _L3
_L3:
        obj = (zzq)obj;
        flag = flag1;
        if (!zznw.equals(zzhg, ((zzhg) (obj)).zzhg)) goto _L4; else goto _L5
_L5:
        if (zzhh != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((zzhh) (obj)).zzhh != null) goto _L4; else goto _L8
_L8:
        if (zzhi != null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        flag = flag1;
        if (((zzhi) (obj)).zzhi != null) goto _L4; else goto _L9
_L9:
        return zza(((zzns) (obj)));
_L7:
        if (!zzhh.equals(((equals) (obj)).zzhh))
        {
            return false;
        }
          goto _L8
        if (!zzhi.equals(((zzhi) (obj)).zzhi))
        {
            return false;
        }
          goto _L9
    }

    public int hashCode()
    {
        int j = 0;
        int k = zznw.hashCode(zzhg);
        int i;
        if (zzhh == null)
        {
            i = 0;
        } else
        {
            i = zzhh.hashCode();
        }
        if (zzhi != null)
        {
            j = zzhi.hashCode();
        }
        return ((i + (k + 527) * 31) * 31 + j) * 31 + zzzM();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        if (zzhg != null && zzhg.length > 0)
        {
            for (int i = 0; i < zzhg.length; i++)
            {
                zzzM zzzm = zzhg[i];
                if (zzzm != null)
                {
                    zznr1.zza(1, zzzm);
                }
            }

        }
        if (zzhh != null)
        {
            zznr1.zza(2, zzhh);
        }
        if (!zzhi.equals(""))
        {
            zznr1.zzb(3, zzhi);
        }
        super.zza(zznr1);
    }

    protected int zzc()
    {
        int i = super.zzc();
        int j = i;
        if (zzhg != null)
        {
            j = i;
            if (zzhg.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= zzhg.length)
                    {
                        break;
                    }
                      = zzhg[k];
                    j = i;
                    if ( != null)
                    {
                        j = i + zznr.zzc(1, );
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (zzhh != null)
        {
            i = j + zznr.zzc(2, zzhh);
        }
        j = i;
        if (!zzhi.equals(""))
        {
            j = i + zznr.zzj(3, zzhi);
        }
        return j;
    }

    public zzhi zzq()
    {
        zzhg = zzo();
        zzhh = null;
        zzhi = "";
        zzaNT = null;
        zzaOe = -1;
        return this;
    }

    public ()
    {
        zzq();
    }
}
