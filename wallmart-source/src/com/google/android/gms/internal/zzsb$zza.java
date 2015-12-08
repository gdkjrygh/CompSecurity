// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrr, zzsb, zzrv, zzrq, 
//            zzrp, zzsa, zzrx

public static final class zzDy extends zzrr
{

    public String zzbcv[];
    public String zzbcw[];
    public int zzbcx[];
    public long zzbcy[];

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
            if (obj instanceof zzDy)
            {
                obj = (zzDy)obj;
                flag = flag1;
                if (zzrv.equals(zzbcv, ((zzbcv) (obj)).zzbcv))
                {
                    flag = flag1;
                    if (zzrv.equals(zzbcw, ((zzbcw) (obj)).zzbcw))
                    {
                        flag = flag1;
                        if (zzrv.equals(zzbcx, ((zzbcx) (obj)).zzbcx))
                        {
                            flag = flag1;
                            if (zzrv.equals(zzbcy, ((zzbcy) (obj)).zzbcy))
                            {
                                return zza(((zzrr) (obj)));
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
        return ((((zzrv.hashCode(zzbcv) + 527) * 31 + zzrv.hashCode(zzbcw)) * 31 + zzrv.hashCode(zzbcx)) * 31 + zzrv.hashCode(zzbcy)) * 31 + zzDk();
    }

    protected int zzB()
    {
        boolean flag = false;
        int l2 = super.zzB();
        int i;
        int k;
        if (zzbcv != null && zzbcv.length > 0)
        {
            i = 0;
            int j = 0;
            int l;
            int l1;
            for (l = 0; i < zzbcv.length; l = l1)
            {
                String s = zzbcv[i];
                int j2 = j;
                l1 = l;
                if (s != null)
                {
                    l1 = l + 1;
                    j2 = j + zzrq.zzfy(s);
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
        if (zzbcw != null)
        {
            k = i;
            if (zzbcw.length > 0)
            {
                k = 0;
                int i1 = 0;
                int i2;
                int k2;
                for (i2 = 0; k < zzbcw.length; i2 = k2)
                {
                    String s1 = zzbcw[k];
                    l2 = i1;
                    k2 = i2;
                    if (s1 != null)
                    {
                        k2 = i2 + 1;
                        l2 = i1 + zzrq.zzfy(s1);
                    }
                    k++;
                    i1 = l2;
                }

                k = i + i1 + i2 * 1;
            }
        }
        i = k;
        if (zzbcx != null)
        {
            i = k;
            if (zzbcx.length > 0)
            {
                i = 0;
                int j1 = 0;
                for (; i < zzbcx.length; i++)
                {
                    j1 += zzrq.zzls(zzbcx[i]);
                }

                i = k + j1 + zzbcx.length * 1;
            }
        }
        k = i;
        if (zzbcy != null)
        {
            k = i;
            if (zzbcy.length > 0)
            {
                int k1 = 0;
                for (k = ((flag) ? 1 : 0); k < zzbcy.length; k++)
                {
                    k1 += zzrq.zzY(zzbcy[k]);
                }

                k = i + k1 + zzbcy.length * 1;
            }
        }
        return k;
    }

    public zzbcy zzB(zzrp zzrp1)
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
                int l1 = zzsa.zzb(zzrp1, 10);
                String as[];
                int j;
                if (zzbcv == null)
                {
                    j = 0;
                } else
                {
                    j = zzbcv.length;
                }
                as = new String[l1 + j];
                l1 = j;
                if (j != 0)
                {
                    System.arraycopy(zzbcv, 0, as, 0, j);
                    l1 = j;
                }
                for (; l1 < as.length - 1; l1++)
                {
                    as[l1] = zzrp1.readString();
                    zzrp1.zzCT();
                }

                as[l1] = zzrp1.readString();
                zzbcv = as;
                break;

            case 18: // '\022'
                int i2 = zzsa.zzb(zzrp1, 18);
                String as1[];
                int k;
                if (zzbcw == null)
                {
                    k = 0;
                } else
                {
                    k = zzbcw.length;
                }
                as1 = new String[i2 + k];
                i2 = k;
                if (k != 0)
                {
                    System.arraycopy(zzbcw, 0, as1, 0, k);
                    i2 = k;
                }
                for (; i2 < as1.length - 1; i2++)
                {
                    as1[i2] = zzrp1.readString();
                    zzrp1.zzCT();
                }

                as1[i2] = zzrp1.readString();
                zzbcw = as1;
                break;

            case 24: // '\030'
                int j2 = zzsa.zzb(zzrp1, 24);
                int ai[];
                int l;
                if (zzbcx == null)
                {
                    l = 0;
                } else
                {
                    l = zzbcx.length;
                }
                ai = new int[j2 + l];
                j2 = l;
                if (l != 0)
                {
                    System.arraycopy(zzbcx, 0, ai, 0, l);
                    j2 = l;
                }
                for (; j2 < ai.length - 1; j2++)
                {
                    ai[j2] = zzrp1.zzCW();
                    zzrp1.zzCT();
                }

                ai[j2] = zzrp1.zzCW();
                zzbcx = ai;
                break;

            case 26: // '\032'
                int j3 = zzrp1.zzll(zzrp1.zzDa());
                int i1 = zzrp1.getPosition();
                int k2;
                for (k2 = 0; zzrp1.zzDf() > 0; k2++)
                {
                    zzrp1.zzCW();
                }

                zzrp1.zzln(i1);
                int ai1[];
                if (zzbcx == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = zzbcx.length;
                }
                ai1 = new int[k2 + i1];
                k2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(zzbcx, 0, ai1, 0, i1);
                    k2 = i1;
                }
                for (; k2 < ai1.length; k2++)
                {
                    ai1[k2] = zzrp1.zzCW();
                }

                zzbcx = ai1;
                zzrp1.zzlm(j3);
                break;

            case 32: // ' '
                int l2 = zzsa.zzb(zzrp1, 32);
                long al[];
                int j1;
                if (zzbcy == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = zzbcy.length;
                }
                al = new long[l2 + j1];
                l2 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(zzbcy, 0, al, 0, j1);
                    l2 = j1;
                }
                for (; l2 < al.length - 1; l2++)
                {
                    al[l2] = zzrp1.zzCV();
                    zzrp1.zzCT();
                }

                al[l2] = zzrp1.zzCV();
                zzbcy = al;
                break;

            case 34: // '"'
                int k3 = zzrp1.zzll(zzrp1.zzDa());
                int k1 = zzrp1.getPosition();
                int i3;
                for (i3 = 0; zzrp1.zzDf() > 0; i3++)
                {
                    zzrp1.zzCV();
                }

                zzrp1.zzln(k1);
                long al1[];
                if (zzbcy == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = zzbcy.length;
                }
                al1 = new long[i3 + k1];
                i3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(zzbcy, 0, al1, 0, k1);
                    i3 = k1;
                }
                for (; i3 < al1.length; i3++)
                {
                    al1[i3] = zzrp1.zzCV();
                }

                zzbcy = al1;
                zzrp1.zzlm(k3);
                break;
            }
        } while (true);
    }

    public  zzDy()
    {
        zzbcv = zzsa.zzbcs;
        zzbcw = zzsa.zzbcs;
        zzbcx = zzsa.zzbcn;
        zzbcy = zzsa.zzbco;
        zzbca = null;
        zzbcl = -1;
        return this;
    }

    public void zza(zzrq zzrq1)
        throws IOException
    {
        boolean flag = false;
        if (zzbcv != null && zzbcv.length > 0)
        {
            for (int i = 0; i < zzbcv.length; i++)
            {
                String s = zzbcv[i];
                if (s != null)
                {
                    zzrq1.zzb(1, s);
                }
            }

        }
        if (zzbcw != null && zzbcw.length > 0)
        {
            for (int j = 0; j < zzbcw.length; j++)
            {
                String s1 = zzbcw[j];
                if (s1 != null)
                {
                    zzrq1.zzb(2, s1);
                }
            }

        }
        if (zzbcx != null && zzbcx.length > 0)
        {
            for (int k = 0; k < zzbcx.length; k++)
            {
                zzrq1.zzz(3, zzbcx[k]);
            }

        }
        if (zzbcy != null && zzbcy.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < zzbcy.length; l++)
            {
                zzrq1.zzb(4, zzbcy[l]);
            }

        }
        super.zza(zzrq1);
    }

    public zzrx zzb(zzrp zzrp1)
        throws IOException
    {
        return zzB(zzrp1);
    }

    public ()
    {
        zzDy();
    }
}
