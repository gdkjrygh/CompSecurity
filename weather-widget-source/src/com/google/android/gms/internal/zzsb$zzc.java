// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            zzrr, zzsb, zzrv, zzsa, 
//            zzrq, zzrp, zzrx

public static final class zzDA extends zzrr
{

    public byte zzbcB[];
    public byte zzbcC[][];
    public boolean zzbcD;

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
            if (obj instanceof zzDA)
            {
                obj = (zzDA)obj;
                flag = flag1;
                if (Arrays.equals(zzbcB, ((zzbcB) (obj)).zzbcB))
                {
                    flag = flag1;
                    if (zzrv.zza(zzbcC, ((zzbcC) (obj)).zzbcC))
                    {
                        flag = flag1;
                        if (zzbcD == ((zzbcD) (obj)).zzbcD)
                        {
                            return zza(((zzrr) (obj)));
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        int i = Arrays.hashCode(zzbcB);
        int j = zzrv.zza(zzbcC);
        char c;
        if (zzbcD)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        return (c + ((i + 527) * 31 + j) * 31) * 31 + zzDk();
    }

    protected int zzB()
    {
        boolean flag = false;
        int j = super.zzB();
        int i = j;
        if (!Arrays.equals(zzbcB, zzsa.zzbcu))
        {
            i = j + zzrq.zzb(1, zzbcB);
        }
        j = i;
        if (zzbcC != null)
        {
            j = i;
            if (zzbcC.length > 0)
            {
                int k = 0;
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < zzbcC.length;)
                {
                    byte abyte0[] = zzbcC[j];
                    int j1 = k;
                    int i1 = l;
                    if (abyte0 != null)
                    {
                        i1 = l + 1;
                        j1 = k + zzrq.zzC(abyte0);
                    }
                    j++;
                    k = j1;
                    l = i1;
                }

                j = i + k + l * 1;
            }
        }
        i = j;
        if (zzbcD)
        {
            i = j + zzrq.zzc(3, zzbcD);
        }
        return i;
    }

    public zzbcD zzD(zzrp zzrp1)
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
                zzbcB = zzrp1.readBytes();
                break;

            case 18: // '\022'
                int k = zzsa.zzb(zzrp1, 18);
                byte abyte0[][];
                int j;
                if (zzbcC == null)
                {
                    j = 0;
                } else
                {
                    j = zzbcC.length;
                }
                abyte0 = new byte[k + j][];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(zzbcC, 0, abyte0, 0, j);
                    k = j;
                }
                for (; k < abyte0.length - 1; k++)
                {
                    abyte0[k] = zzrp1.readBytes();
                    zzrp1.zzCT();
                }

                abyte0[k] = zzrp1.readBytes();
                zzbcC = abyte0;
                break;

            case 24: // '\030'
                zzbcD = zzrp1.zzCX();
                break;
            }
        } while (true);
    }

    public  zzDA()
    {
        zzbcB = zzsa.zzbcu;
        zzbcC = zzsa.zzbct;
        zzbcD = false;
        zzbca = null;
        zzbcl = -1;
        return this;
    }

    public void zza(zzrq zzrq1)
        throws IOException
    {
        if (!Arrays.equals(zzbcB, zzsa.zzbcu))
        {
            zzrq1.zza(1, zzbcB);
        }
        if (zzbcC != null && zzbcC.length > 0)
        {
            for (int i = 0; i < zzbcC.length; i++)
            {
                byte abyte0[] = zzbcC[i];
                if (abyte0 != null)
                {
                    zzrq1.zza(2, abyte0);
                }
            }

        }
        if (zzbcD)
        {
            zzrq1.zzb(3, zzbcD);
        }
        super.zza(zzrq1);
    }

    public zzrx zzb(zzrp zzrp1)
        throws IOException
    {
        return zzD(zzrp1);
    }

    public ()
    {
        zzDA();
    }
}
