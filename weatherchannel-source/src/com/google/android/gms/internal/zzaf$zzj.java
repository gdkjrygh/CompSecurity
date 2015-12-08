// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzaf, zzrm, zzrn, 
//            zzrl, zzrg, zzrf, zzrq

public static final class zzP extends zzrh
{

    public String zziN[];
    public String zziO;
    public String zziP;

    public static zzP zzd(byte abyte0[])
        throws zzrm
    {
        return (zzP)zzrn.zza(new <init>(), abyte0);
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
        if (!(obj instanceof <init>)) goto _L4; else goto _L3
_L3:
        obj = (<init>)obj;
        flag = flag1;
        if (!zzrl.equals(zziN, ((zziN) (obj)).zziN)) goto _L4; else goto _L5
_L5:
        if (zziO != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((zziO) (obj)).zziO != null) goto _L4; else goto _L8
_L8:
        if (zziP != null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        flag = flag1;
        if (((zziP) (obj)).zziP != null) goto _L4; else goto _L9
_L9:
        return zza(((zzrh) (obj)));
_L7:
        if (!zziO.equals(((equals) (obj)).zziO))
        {
            return false;
        }
          goto _L8
        if (!zziP.equals(((zziP) (obj)).zziP))
        {
            return false;
        }
          goto _L9
    }

    public int hashCode()
    {
        int j = 0;
        int k = zzrl.hashCode(zziN);
        int i;
        if (zziO == null)
        {
            i = 0;
        } else
        {
            i = zziO.hashCode();
        }
        if (zziP != null)
        {
            j = zziP.hashCode();
        }
        return ((i + (k + 527) * 31) * 31 + j) * 31 + zzBI();
    }

    protected int zzB()
    {
        int i = super.zzB();
        int j = i;
        if (zziN != null)
        {
            j = i;
            if (zziN.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= zziN.length)
                    {
                        break;
                    }
                    zzBI zzbi = zziN[k];
                    j = i;
                    if (zzbi != null)
                    {
                        j = i + zzrg.zzc(1, zzbi);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (zziO != null)
        {
            i = j + zzrg.zzc(2, zziO);
        }
        j = i;
        if (!zziP.equals(""))
        {
            j = i + zzrg.zzk(3, zziP);
        }
        return j;
    }

    public zziP zzP()
    {
        zziN = zzN();
        zziO = null;
        zziP = "";
        zzaVU = null;
        zzaWf = -1;
        return this;
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        if (zziN != null && zziN.length > 0)
        {
            for (int i = 0; i < zziN.length; i++)
            {
                zzaWf zzawf = zziN[i];
                if (zzawf != null)
                {
                    zzrg1.zza(1, zzawf);
                }
            }

        }
        if (zziO != null)
        {
            zzrg1.zza(2, zziO);
        }
        if (!zziP.equals(""))
        {
            zzrg1.zzb(3, zziP);
        }
        super.zza(zzrg1);
    }

    public zzrn zzb(zzrf zzrf1)
        throws IOException
    {
        return zzk(zzrf1);
    }

    public zzk zzk(zzrf zzrf1)
        throws IOException
    {
        do
        {
            int i = zzrf1.zzBr();
            switch (i)
            {
            default:
                if (zza(zzrf1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int k = zzrq.zzb(zzrf1, 10);
                zzk azzk[];
                int j;
                if (zziN == null)
                {
                    j = 0;
                } else
                {
                    j = zziN.length;
                }
                azzk = new zziN[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(zziN, 0, azzk, 0, j);
                    k = j;
                }
                for (; k < azzk.length - 1; k++)
                {
                    azzk[k] = new <init>();
                    zzrf1.zza(azzk[k]);
                    zzrf1.zzBr();
                }

                azzk[k] = new <init>();
                zzrf1.zza(azzk[k]);
                zziN = azzk;
                break;

            case 18: // '\022'
                if (zziO == null)
                {
                    zziO = new <init>();
                }
                zzrf1.zza(zziO);
                break;

            case 26: // '\032'
                zziP = zzrf1.readString();
                break;
            }
        } while (true);
    }

    public ()
    {
        zzP();
    }
}
