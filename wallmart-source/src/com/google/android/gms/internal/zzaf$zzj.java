// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrr, zzaf, zzrw, zzrx, 
//            zzrv, zzrq, zzrp, zzsa

public static final class zzP extends zzrr
{

    public String zziQ[];
    public String zziR;
    public String zziS;

    public static zzP zzd(byte abyte0[])
        throws zzrw
    {
        return (zzP)zzrx.zza(new <init>(), abyte0);
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
        if (!zzrv.equals(zziQ, ((zziQ) (obj)).zziQ)) goto _L4; else goto _L5
_L5:
        if (zziR != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((zziR) (obj)).zziR != null) goto _L4; else goto _L8
_L8:
        if (zziS != null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        flag = flag1;
        if (((zziS) (obj)).zziS != null) goto _L4; else goto _L9
_L9:
        return zza(((zzrr) (obj)));
_L7:
        if (!zziR.equals(((equals) (obj)).zziR))
        {
            return false;
        }
          goto _L8
        if (!zziS.equals(((zziS) (obj)).zziS))
        {
            return false;
        }
          goto _L9
    }

    public int hashCode()
    {
        int j = 0;
        int k = zzrv.hashCode(zziQ);
        int i;
        if (zziR == null)
        {
            i = 0;
        } else
        {
            i = zziR.hashCode();
        }
        if (zziS != null)
        {
            j = zziS.hashCode();
        }
        return ((i + (k + 527) * 31) * 31 + j) * 31 + zzDk();
    }

    protected int zzB()
    {
        int i = super.zzB();
        int j = i;
        if (zziQ != null)
        {
            j = i;
            if (zziQ.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= zziQ.length)
                    {
                        break;
                    }
                    zzDk zzdk = zziQ[k];
                    j = i;
                    if (zzdk != null)
                    {
                        j = i + zzrq.zzc(1, zzdk);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (zziR != null)
        {
            i = j + zzrq.zzc(2, zziR);
        }
        j = i;
        if (!zziS.equals(""))
        {
            j = i + zzrq.zzl(3, zziS);
        }
        return j;
    }

    public zziS zzP()
    {
        zziQ = zzN();
        zziR = null;
        zziS = "";
        zzbca = null;
        zzbcl = -1;
        return this;
    }

    public void zza(zzrq zzrq1)
        throws IOException
    {
        if (zziQ != null && zziQ.length > 0)
        {
            for (int i = 0; i < zziQ.length; i++)
            {
                zzbcl zzbcl = zziQ[i];
                if (zzbcl != null)
                {
                    zzrq1.zza(1, zzbcl);
                }
            }

        }
        if (zziR != null)
        {
            zzrq1.zza(2, zziR);
        }
        if (!zziS.equals(""))
        {
            zzrq1.zzb(3, zziS);
        }
        super.zza(zzrq1);
    }

    public zzrx zzb(zzrp zzrp1)
        throws IOException
    {
        return zzk(zzrp1);
    }

    public zzk zzk(zzrp zzrp1)
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
                int k = zzsa.zzb(zzrp1, 10);
                zzk azzk[];
                int j;
                if (zziQ == null)
                {
                    j = 0;
                } else
                {
                    j = zziQ.length;
                }
                azzk = new zziQ[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(zziQ, 0, azzk, 0, j);
                    k = j;
                }
                for (; k < azzk.length - 1; k++)
                {
                    azzk[k] = new <init>();
                    zzrp1.zza(azzk[k]);
                    zzrp1.zzCT();
                }

                azzk[k] = new <init>();
                zzrp1.zza(azzk[k]);
                zziQ = azzk;
                break;

            case 18: // '\022'
                if (zziR == null)
                {
                    zziR = new <init>();
                }
                zzrp1.zza(zziR);
                break;

            case 26: // '\032'
                zziS = zzrp1.readString();
                break;
            }
        } while (true);
    }

    public ()
    {
        zzP();
    }
}
