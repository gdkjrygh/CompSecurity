// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzrr, zzrl, zzrg, 
//            zzrf, zzrq, zzrn

public static final class zzBW extends zzrh
{

    public String zzaWp[];
    public String zzaWq[];
    public int zzaWr[];
    public int zzaWs[];

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
            if (obj instanceof zzBW)
            {
                obj = (zzBW)obj;
                flag = flag1;
                if (zzrl.equals(zzaWp, ((zzaWp) (obj)).zzaWp))
                {
                    flag = flag1;
                    if (zzrl.equals(zzaWq, ((zzaWq) (obj)).zzaWq))
                    {
                        flag = flag1;
                        if (zzrl.equals(zzaWr, ((zzaWr) (obj)).zzaWr))
                        {
                            flag = flag1;
                            if (zzrl.equals(zzaWs, ((zzaWs) (obj)).zzaWs))
                            {
                                return zza(((zzrh) (obj)));
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return ((((zzrl.hashCode(zzaWp) + 527) * 31 + zzrl.hashCode(zzaWq)) * 31 + zzrl.hashCode(zzaWr)) * 31 + zzrl.hashCode(zzaWs)) * 31 + zzBI();
    }

    protected int zzB()
    {
        boolean flag = false;
        int l2 = super.zzB();
        int i;
        int k;
        if (zzaWp != null && zzaWp.length > 0)
        {
            i = 0;
            int j = 0;
            int l;
            int l1;
            for (l = 0; i < zzaWp.length; l = l1)
            {
                String s = zzaWp[i];
                int j2 = j;
                l1 = l;
                if (s != null)
                {
                    l1 = l + 1;
                    j2 = j + zzrg.zzfj(s);
                }
                i++;
                j = j2;
            }

            i = l2 + j + l * 1;
        } else
        {
            i = l2;
        }
        k = i;
        if (zzaWq != null)
        {
            k = i;
            if (zzaWq.length > 0)
            {
                k = 0;
                int i1 = 0;
                int i2;
                int k2;
                for (i2 = 0; k < zzaWq.length; i2 = k2)
                {
                    String s1 = zzaWq[k];
                    l2 = i1;
                    k2 = i2;
                    if (s1 != null)
                    {
                        k2 = i2 + 1;
                        l2 = i1 + zzrg.zzfj(s1);
                    }
                    k++;
                    i1 = l2;
                }

                k = i + i1 + i2 * 1;
            }
        }
        i = k;
        if (zzaWr != null)
        {
            i = k;
            if (zzaWr.length > 0)
            {
                i = 0;
                int j1 = 0;
                for (; i < zzaWr.length; i++)
                {
                    j1 += zzrg.zzkJ(zzaWr[i]);
                }

                i = k + j1 + zzaWr.length * 1;
            }
        }
        k = i;
        if (zzaWs != null)
        {
            k = i;
            if (zzaWs.length > 0)
            {
                int k1 = 0;
                for (k = ((flag) ? 1 : 0); k < zzaWs.length; k++)
                {
                    k1 += zzrg.zzkJ(zzaWs[k]);
                }

                k = i + k1 + zzaWs.length * 1;
            }
        }
        return k;
    }

    public zzaWs zzB(zzrf zzrf1)
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
                int l1 = zzrq.zzb(zzrf1, 10);
                String as[];
                int j;
                if (zzaWp == null)
                {
                    j = 0;
                } else
                {
                    j = zzaWp.length;
                }
                as = new String[l1 + j];
                l1 = j;
                if (j != 0)
                {
                    System.arraycopy(zzaWp, 0, as, 0, j);
                    l1 = j;
                }
                for (; l1 < as.length - 1; l1++)
                {
                    as[l1] = zzrf1.readString();
                    zzrf1.zzBr();
                }

                as[l1] = zzrf1.readString();
                zzaWp = as;
                break;

            case 18: // '\022'
                int i2 = zzrq.zzb(zzrf1, 18);
                String as1[];
                int k;
                if (zzaWq == null)
                {
                    k = 0;
                } else
                {
                    k = zzaWq.length;
                }
                as1 = new String[i2 + k];
                i2 = k;
                if (k != 0)
                {
                    System.arraycopy(zzaWq, 0, as1, 0, k);
                    i2 = k;
                }
                for (; i2 < as1.length - 1; i2++)
                {
                    as1[i2] = zzrf1.readString();
                    zzrf1.zzBr();
                }

                as1[i2] = zzrf1.readString();
                zzaWq = as1;
                break;

            case 24: // '\030'
                int j2 = zzrq.zzb(zzrf1, 24);
                int ai[];
                int l;
                if (zzaWr == null)
                {
                    l = 0;
                } else
                {
                    l = zzaWr.length;
                }
                ai = new int[j2 + l];
                j2 = l;
                if (l != 0)
                {
                    System.arraycopy(zzaWr, 0, ai, 0, l);
                    j2 = l;
                }
                for (; j2 < ai.length - 1; j2++)
                {
                    ai[j2] = zzrf1.zzBu();
                    zzrf1.zzBr();
                }

                ai[j2] = zzrf1.zzBu();
                zzaWr = ai;
                break;

            case 26: // '\032'
                int j3 = zzrf1.zzkC(zzrf1.zzBy());
                int i1 = zzrf1.getPosition();
                int k2;
                for (k2 = 0; zzrf1.zzBD() > 0; k2++)
                {
                    zzrf1.zzBu();
                }

                zzrf1.zzkE(i1);
                int ai1[];
                if (zzaWr == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = zzaWr.length;
                }
                ai1 = new int[k2 + i1];
                k2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(zzaWr, 0, ai1, 0, i1);
                    k2 = i1;
                }
                for (; k2 < ai1.length; k2++)
                {
                    ai1[k2] = zzrf1.zzBu();
                }

                zzaWr = ai1;
                zzrf1.zzkD(j3);
                break;

            case 32: // ' '
                int l2 = zzrq.zzb(zzrf1, 32);
                int ai2[];
                int j1;
                if (zzaWs == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = zzaWs.length;
                }
                ai2 = new int[l2 + j1];
                l2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(zzaWs, 0, ai2, 0, j1);
                    l2 = j1;
                }
                for (; l2 < ai2.length - 1; l2++)
                {
                    ai2[l2] = zzrf1.zzBu();
                    zzrf1.zzBr();
                }

                ai2[l2] = zzrf1.zzBu();
                zzaWs = ai2;
                break;

            case 34: // '"'
                int k3 = zzrf1.zzkC(zzrf1.zzBy());
                int k1 = zzrf1.getPosition();
                int i3;
                for (i3 = 0; zzrf1.zzBD() > 0; i3++)
                {
                    zzrf1.zzBu();
                }

                zzrf1.zzkE(k1);
                int ai3[];
                if (zzaWs == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = zzaWs.length;
                }
                ai3 = new int[i3 + k1];
                i3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(zzaWs, 0, ai3, 0, k1);
                    i3 = k1;
                }
                for (; i3 < ai3.length; i3++)
                {
                    ai3[i3] = zzrf1.zzBu();
                }

                zzaWs = ai3;
                zzrf1.zzkD(k3);
                break;
            }
        } while (true);
    }

    public  zzBW()
    {
        zzaWp = zzrq.zzaWm;
        zzaWq = zzrq.zzaWm;
        zzaWr = zzrq.zzaWh;
        zzaWs = zzrq.zzaWh;
        zzaVU = null;
        zzaWf = -1;
        return this;
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        boolean flag = false;
        if (zzaWp != null && zzaWp.length > 0)
        {
            for (int i = 0; i < zzaWp.length; i++)
            {
                String s = zzaWp[i];
                if (s != null)
                {
                    zzrg1.zzb(1, s);
                }
            }

        }
        if (zzaWq != null && zzaWq.length > 0)
        {
            for (int j = 0; j < zzaWq.length; j++)
            {
                String s1 = zzaWq[j];
                if (s1 != null)
                {
                    zzrg1.zzb(2, s1);
                }
            }

        }
        if (zzaWr != null && zzaWr.length > 0)
        {
            for (int k = 0; k < zzaWr.length; k++)
            {
                zzrg1.zzy(3, zzaWr[k]);
            }

        }
        if (zzaWs != null && zzaWs.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < zzaWs.length; l++)
            {
                zzrg1.zzy(4, zzaWs[l]);
            }

        }
        super.zza(zzrg1);
    }

    public zzrn zzb(zzrf zzrf1)
        throws IOException
    {
        return zzB(zzrf1);
    }

    public ()
    {
        zzBW();
    }
}
