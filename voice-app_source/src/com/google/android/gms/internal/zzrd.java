// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzrm, zzrn, zzrl, 
//            zzrg, zzrq, zzrf

public final class zzrd extends zzrh
{

    public String zzaVE[];
    public int zzaVF[];
    public byte zzaVG[][];

    public zzrd()
    {
        zzBq();
    }

    public static zzrd zzx(byte abyte0[])
        throws zzrm
    {
        return (zzrd)zzrn.zza(new zzrd(), abyte0);
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
            if (obj instanceof zzrd)
            {
                obj = (zzrd)obj;
                flag = flag1;
                if (zzrl.equals(zzaVE, ((zzrd) (obj)).zzaVE))
                {
                    flag = flag1;
                    if (zzrl.equals(zzaVF, ((zzrd) (obj)).zzaVF))
                    {
                        flag = flag1;
                        if (zzrl.zza(zzaVG, ((zzrd) (obj)).zzaVG))
                        {
                            return zza(((zzrh) (obj)));
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (((zzrl.hashCode(zzaVE) + 527) * 31 + zzrl.hashCode(zzaVF)) * 31 + zzrl.zza(zzaVG)) * 31 + zzBI();
    }

    protected int zzB()
    {
        boolean flag = false;
        int l2 = super.zzB();
        int j;
        int k;
        if (zzaVE != null && zzaVE.length > 0)
        {
            int i = 0;
            k = 0;
            int l;
            int k1;
            for (l = 0; i < zzaVE.length; l = k1)
            {
                String s = zzaVE[i];
                int i2 = k;
                k1 = l;
                if (s != null)
                {
                    k1 = l + 1;
                    i2 = k + zzrg.zzfj(s);
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
        if (zzaVF != null)
        {
            j = k;
            if (zzaVF.length > 0)
            {
                j = 0;
                int i1 = 0;
                for (; j < zzaVF.length; j++)
                {
                    i1 += zzrg.zzkJ(zzaVF[j]);
                }

                j = k + i1 + zzaVF.length * 1;
            }
        }
        k = j;
        if (zzaVG != null)
        {
            k = j;
            if (zzaVG.length > 0)
            {
                int j1 = 0;
                int l1 = 0;
                for (k = ((flag) ? 1 : 0); k < zzaVG.length;)
                {
                    byte abyte0[] = zzaVG[k];
                    int k2 = j1;
                    int j2 = l1;
                    if (abyte0 != null)
                    {
                        j2 = l1 + 1;
                        k2 = j1 + zzrg.zzC(abyte0);
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

    public zzrd zzBq()
    {
        zzaVE = zzrq.zzaWm;
        zzaVF = zzrq.zzaWh;
        zzaVG = zzrq.zzaWn;
        zzaVU = null;
        zzaWf = -1;
        return this;
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        boolean flag = false;
        if (zzaVE != null && zzaVE.length > 0)
        {
            for (int i = 0; i < zzaVE.length; i++)
            {
                String s = zzaVE[i];
                if (s != null)
                {
                    zzrg1.zzb(1, s);
                }
            }

        }
        if (zzaVF != null && zzaVF.length > 0)
        {
            for (int j = 0; j < zzaVF.length; j++)
            {
                zzrg1.zzy(2, zzaVF[j]);
            }

        }
        if (zzaVG != null && zzaVG.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < zzaVG.length; k++)
            {
                byte abyte0[] = zzaVG[k];
                if (abyte0 != null)
                {
                    zzrg1.zza(3, abyte0);
                }
            }

        }
        super.zza(zzrg1);
    }

    public zzrn zzb(zzrf zzrf1)
        throws IOException
    {
        return zzz(zzrf1);
    }

    public zzrd zzz(zzrf zzrf1)
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
                int j1 = zzrq.zzb(zzrf1, 10);
                String as[];
                int j;
                if (zzaVE == null)
                {
                    j = 0;
                } else
                {
                    j = zzaVE.length;
                }
                as = new String[j1 + j];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(zzaVE, 0, as, 0, j);
                    j1 = j;
                }
                for (; j1 < as.length - 1; j1++)
                {
                    as[j1] = zzrf1.readString();
                    zzrf1.zzBr();
                }

                as[j1] = zzrf1.readString();
                zzaVE = as;
                break;

            case 16: // '\020'
                int k1 = zzrq.zzb(zzrf1, 16);
                int ai[];
                int k;
                if (zzaVF == null)
                {
                    k = 0;
                } else
                {
                    k = zzaVF.length;
                }
                ai = new int[k1 + k];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(zzaVF, 0, ai, 0, k);
                    k1 = k;
                }
                for (; k1 < ai.length - 1; k1++)
                {
                    ai[k1] = zzrf1.zzBu();
                    zzrf1.zzBr();
                }

                ai[k1] = zzrf1.zzBu();
                zzaVF = ai;
                break;

            case 18: // '\022'
                int j2 = zzrf1.zzkC(zzrf1.zzBy());
                int l = zzrf1.getPosition();
                int l1;
                for (l1 = 0; zzrf1.zzBD() > 0; l1++)
                {
                    zzrf1.zzBu();
                }

                zzrf1.zzkE(l);
                int ai1[];
                if (zzaVF == null)
                {
                    l = 0;
                } else
                {
                    l = zzaVF.length;
                }
                ai1 = new int[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(zzaVF, 0, ai1, 0, l);
                    l1 = l;
                }
                for (; l1 < ai1.length; l1++)
                {
                    ai1[l1] = zzrf1.zzBu();
                }

                zzaVF = ai1;
                zzrf1.zzkD(j2);
                break;

            case 26: // '\032'
                int i2 = zzrq.zzb(zzrf1, 26);
                byte abyte0[][];
                int i1;
                if (zzaVG == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = zzaVG.length;
                }
                abyte0 = new byte[i2 + i1][];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(zzaVG, 0, abyte0, 0, i1);
                    i2 = i1;
                }
                for (; i2 < abyte0.length - 1; i2++)
                {
                    abyte0[i2] = zzrf1.readBytes();
                    zzrf1.zzBr();
                }

                abyte0[i2] = zzrf1.readBytes();
                zzaVG = abyte0;
                break;
            }
        } while (true);
    }
}
