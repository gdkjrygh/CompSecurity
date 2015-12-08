// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrr, zzrw, zzrx, zzrv, 
//            zzrq, zzsa, zzrp

public final class zzrn extends zzrr
{

    public String zzbbK[];
    public int zzbbL[];
    public byte zzbbM[][];

    public zzrn()
    {
        zzCS();
    }

    public static zzrn zzx(byte abyte0[])
        throws zzrw
    {
        return (zzrn)zzrx.zza(new zzrn(), abyte0);
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
            if (obj instanceof zzrn)
            {
                obj = (zzrn)obj;
                flag = flag1;
                if (zzrv.equals(zzbbK, ((zzrn) (obj)).zzbbK))
                {
                    flag = flag1;
                    if (zzrv.equals(zzbbL, ((zzrn) (obj)).zzbbL))
                    {
                        flag = flag1;
                        if (zzrv.zza(zzbbM, ((zzrn) (obj)).zzbbM))
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
        return (((zzrv.hashCode(zzbbK) + 527) * 31 + zzrv.hashCode(zzbbL)) * 31 + zzrv.zza(zzbbM)) * 31 + zzDk();
    }

    protected int zzB()
    {
        boolean flag = false;
        int l2 = super.zzB();
        int j;
        int k;
        if (zzbbK != null && zzbbK.length > 0)
        {
            int i = 0;
            k = 0;
            int l;
            int k1;
            for (l = 0; i < zzbbK.length; l = k1)
            {
                String s = zzbbK[i];
                int i2 = k;
                k1 = l;
                if (s != null)
                {
                    k1 = l + 1;
                    i2 = k + zzrq.zzfy(s);
                }
                i++;
                k = i2;
            }

            k = l2 + k + l * 1;
        } else
        {
            k = l2;
        }
        j = k;
        if (zzbbL != null)
        {
            j = k;
            if (zzbbL.length > 0)
            {
                j = 0;
                int i1 = 0;
                for (; j < zzbbL.length; j++)
                {
                    i1 += zzrq.zzls(zzbbL[j]);
                }

                j = k + i1 + zzbbL.length * 1;
            }
        }
        k = j;
        if (zzbbM != null)
        {
            k = j;
            if (zzbbM.length > 0)
            {
                int j1 = 0;
                int l1 = 0;
                for (k = ((flag) ? 1 : 0); k < zzbbM.length;)
                {
                    byte abyte0[] = zzbbM[k];
                    int k2 = j1;
                    int j2 = l1;
                    if (abyte0 != null)
                    {
                        j2 = l1 + 1;
                        k2 = j1 + zzrq.zzC(abyte0);
                    }
                    k++;
                    j1 = k2;
                    l1 = j2;
                }

                k = j + j1 + l1 * 1;
            }
        }
        return k;
    }

    public zzrn zzCS()
    {
        zzbbK = zzsa.zzbcs;
        zzbbL = zzsa.zzbcn;
        zzbbM = zzsa.zzbct;
        zzbca = null;
        zzbcl = -1;
        return this;
    }

    public void zza(zzrq zzrq1)
        throws IOException
    {
        boolean flag = false;
        if (zzbbK != null && zzbbK.length > 0)
        {
            for (int i = 0; i < zzbbK.length; i++)
            {
                String s = zzbbK[i];
                if (s != null)
                {
                    zzrq1.zzb(1, s);
                }
            }

        }
        if (zzbbL != null && zzbbL.length > 0)
        {
            for (int j = 0; j < zzbbL.length; j++)
            {
                zzrq1.zzz(2, zzbbL[j]);
            }

        }
        if (zzbbM != null && zzbbM.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < zzbbM.length; k++)
            {
                byte abyte0[] = zzbbM[k];
                if (abyte0 != null)
                {
                    zzrq1.zza(3, abyte0);
                }
            }

        }
        super.zza(zzrq1);
    }

    public zzrx zzb(zzrp zzrp1)
        throws IOException
    {
        return zzz(zzrp1);
    }

    public zzrn zzz(zzrp zzrp1)
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
                int j1 = zzsa.zzb(zzrp1, 10);
                String as[];
                int j;
                if (zzbbK == null)
                {
                    j = 0;
                } else
                {
                    j = zzbbK.length;
                }
                as = new String[j1 + j];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(zzbbK, 0, as, 0, j);
                    j1 = j;
                }
                for (; j1 < as.length - 1; j1++)
                {
                    as[j1] = zzrp1.readString();
                    zzrp1.zzCT();
                }

                as[j1] = zzrp1.readString();
                zzbbK = as;
                break;

            case 16: // '\020'
                int k1 = zzsa.zzb(zzrp1, 16);
                int ai[];
                int k;
                if (zzbbL == null)
                {
                    k = 0;
                } else
                {
                    k = zzbbL.length;
                }
                ai = new int[k1 + k];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(zzbbL, 0, ai, 0, k);
                    k1 = k;
                }
                for (; k1 < ai.length - 1; k1++)
                {
                    ai[k1] = zzrp1.zzCW();
                    zzrp1.zzCT();
                }

                ai[k1] = zzrp1.zzCW();
                zzbbL = ai;
                break;

            case 18: // '\022'
                int j2 = zzrp1.zzll(zzrp1.zzDa());
                int l = zzrp1.getPosition();
                int l1;
                for (l1 = 0; zzrp1.zzDf() > 0; l1++)
                {
                    zzrp1.zzCW();
                }

                zzrp1.zzln(l);
                int ai1[];
                if (zzbbL == null)
                {
                    l = 0;
                } else
                {
                    l = zzbbL.length;
                }
                ai1 = new int[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(zzbbL, 0, ai1, 0, l);
                    l1 = l;
                }
                for (; l1 < ai1.length; l1++)
                {
                    ai1[l1] = zzrp1.zzCW();
                }

                zzbbL = ai1;
                zzrp1.zzlm(j2);
                break;

            case 26: // '\032'
                int i2 = zzsa.zzb(zzrp1, 26);
                byte abyte0[][];
                int i1;
                if (zzbbM == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = zzbbM.length;
                }
                abyte0 = new byte[i2 + i1][];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(zzbbM, 0, abyte0, 0, i1);
                    i2 = i1;
                }
                for (; i2 < abyte0.length - 1; i2++)
                {
                    abyte0[i2] = zzrp1.readBytes();
                    zzrp1.zzCT();
                }

                abyte0[i2] = zzrp1.readBytes();
                zzbbM = abyte0;
                break;
            }
        } while (true);
    }
}
