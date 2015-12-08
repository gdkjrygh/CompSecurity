// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrr, zzaf, zzrs, zzrv, 
//            zzrq, zzsa, zzrp, zzrx

public static final class zzM extends zzrr
{

    public static final zzrs zziE = zzrs.zza(11, com/google/android/gms/internal/zzaf$zzh, 810);
    private static final  zziF[] = new [0];
    public int zziG[];
    public int zziH[];
    public int zziI[];
    public int zziJ;
    public int zziK[];
    public int zziL;
    public int zziM;

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
            if (obj instanceof zzM)
            {
                obj = (zzM)obj;
                flag = flag1;
                if (zzrv.equals(zziG, ((zziG) (obj)).zziG))
                {
                    flag = flag1;
                    if (zzrv.equals(zziH, ((zziH) (obj)).zziH))
                    {
                        flag = flag1;
                        if (zzrv.equals(zziI, ((zziI) (obj)).zziI))
                        {
                            flag = flag1;
                            if (zziJ == ((zziJ) (obj)).zziJ)
                            {
                                flag = flag1;
                                if (zzrv.equals(zziK, ((zziK) (obj)).zziK))
                                {
                                    flag = flag1;
                                    if (zziL == ((zziL) (obj)).zziL)
                                    {
                                        flag = flag1;
                                        if (zziM == ((zziM) (obj)).zziM)
                                        {
                                            return zza(((zzrr) (obj)));
                                        }
                                    }
                                }
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
        return (((((((zzrv.hashCode(zziG) + 527) * 31 + zzrv.hashCode(zziH)) * 31 + zzrv.hashCode(zziI)) * 31 + zziJ) * 31 + zzrv.hashCode(zziK)) * 31 + zziL) * 31 + zziM) * 31 + zzDk();
    }

    protected int zzB()
    {
        boolean flag = false;
        int l = super.zzB();
        int j;
        int k;
        if (zziG != null && zziG.length > 0)
        {
            int i = 0;
            k = 0;
            for (; i < zziG.length; i++)
            {
                k += zzrq.zzls(zziG[i]);
            }

            k = l + k + zziG.length * 1;
        } else
        {
            k = l;
        }
        j = k;
        if (zziH != null)
        {
            j = k;
            if (zziH.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zziH.length; j++)
                {
                    l += zzrq.zzls(zziH[j]);
                }

                j = k + l + zziH.length * 1;
            }
        }
        k = j;
        if (zziI != null)
        {
            k = j;
            if (zziI.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zziI.length; k++)
                {
                    l += zzrq.zzls(zziI[k]);
                }

                k = j + l + zziI.length * 1;
            }
        }
        j = k;
        if (zziJ != 0)
        {
            j = k + zzrq.zzB(4, zziJ);
        }
        k = j;
        if (zziK != null)
        {
            k = j;
            if (zziK.length > 0)
            {
                l = 0;
                for (k = ((flag) ? 1 : 0); k < zziK.length; k++)
                {
                    l += zzrq.zzls(zziK[k]);
                }

                k = j + l + zziK.length * 1;
            }
        }
        j = k;
        if (zziL != 0)
        {
            j = k + zzrq.zzB(6, zziL);
        }
        k = j;
        if (zziM != 0)
        {
            k = j + zzrq.zzB(7, zziM);
        }
        return k;
    }

    public zziM zzM()
    {
        zziG = zzsa.zzbcn;
        zziH = zzsa.zzbcn;
        zziI = zzsa.zzbcn;
        zziJ = 0;
        zziK = zzsa.zzbcn;
        zziL = 0;
        zziM = 0;
        zzbca = null;
        zzbcl = -1;
        return this;
    }

    public void zza(zzrq zzrq1)
        throws IOException
    {
        boolean flag = false;
        if (zziG != null && zziG.length > 0)
        {
            for (int i = 0; i < zziG.length; i++)
            {
                zzrq1.zzz(1, zziG[i]);
            }

        }
        if (zziH != null && zziH.length > 0)
        {
            for (int j = 0; j < zziH.length; j++)
            {
                zzrq1.zzz(2, zziH[j]);
            }

        }
        if (zziI != null && zziI.length > 0)
        {
            for (int k = 0; k < zziI.length; k++)
            {
                zzrq1.zzz(3, zziI[k]);
            }

        }
        if (zziJ != 0)
        {
            zzrq1.zzz(4, zziJ);
        }
        if (zziK != null && zziK.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < zziK.length; l++)
            {
                zzrq1.zzz(5, zziK[l]);
            }

        }
        if (zziL != 0)
        {
            zzrq1.zzz(6, zziL);
        }
        if (zziM != 0)
        {
            zzrq1.zzz(7, zziM);
        }
        super.zza(zzrq1);
    }

    public zzrx zzb(zzrp zzrp1)
        throws IOException
    {
        return zzi(zzrp1);
    }

    public zzi zzi(zzrp zzrp1)
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

            case 8: // '\b'
                int j2 = zzsa.zzb(zzrp1, 8);
                int ai[];
                int j;
                if (zziG == null)
                {
                    j = 0;
                } else
                {
                    j = zziG.length;
                }
                ai = new int[j2 + j];
                j2 = j;
                if (j != 0)
                {
                    System.arraycopy(zziG, 0, ai, 0, j);
                    j2 = j;
                }
                for (; j2 < ai.length - 1; j2++)
                {
                    ai[j2] = zzrp1.zzCW();
                    zzrp1.zzCT();
                }

                ai[j2] = zzrp1.zzCW();
                zziG = ai;
                break;

            case 10: // '\n'
                int j4 = zzrp1.zzll(zzrp1.zzDa());
                int k = zzrp1.getPosition();
                int k2;
                for (k2 = 0; zzrp1.zzDf() > 0; k2++)
                {
                    zzrp1.zzCW();
                }

                zzrp1.zzln(k);
                int ai1[];
                if (zziG == null)
                {
                    k = 0;
                } else
                {
                    k = zziG.length;
                }
                ai1 = new int[k2 + k];
                k2 = k;
                if (k != 0)
                {
                    System.arraycopy(zziG, 0, ai1, 0, k);
                    k2 = k;
                }
                for (; k2 < ai1.length; k2++)
                {
                    ai1[k2] = zzrp1.zzCW();
                }

                zziG = ai1;
                zzrp1.zzlm(j4);
                break;

            case 16: // '\020'
                int l2 = zzsa.zzb(zzrp1, 16);
                int ai2[];
                int l;
                if (zziH == null)
                {
                    l = 0;
                } else
                {
                    l = zziH.length;
                }
                ai2 = new int[l2 + l];
                l2 = l;
                if (l != 0)
                {
                    System.arraycopy(zziH, 0, ai2, 0, l);
                    l2 = l;
                }
                for (; l2 < ai2.length - 1; l2++)
                {
                    ai2[l2] = zzrp1.zzCW();
                    zzrp1.zzCT();
                }

                ai2[l2] = zzrp1.zzCW();
                zziH = ai2;
                break;

            case 18: // '\022'
                int k4 = zzrp1.zzll(zzrp1.zzDa());
                int i1 = zzrp1.getPosition();
                int i3;
                for (i3 = 0; zzrp1.zzDf() > 0; i3++)
                {
                    zzrp1.zzCW();
                }

                zzrp1.zzln(i1);
                int ai3[];
                if (zziH == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = zziH.length;
                }
                ai3 = new int[i3 + i1];
                i3 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(zziH, 0, ai3, 0, i1);
                    i3 = i1;
                }
                for (; i3 < ai3.length; i3++)
                {
                    ai3[i3] = zzrp1.zzCW();
                }

                zziH = ai3;
                zzrp1.zzlm(k4);
                break;

            case 24: // '\030'
                int j3 = zzsa.zzb(zzrp1, 24);
                int ai4[];
                int j1;
                if (zziI == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = zziI.length;
                }
                ai4 = new int[j3 + j1];
                j3 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(zziI, 0, ai4, 0, j1);
                    j3 = j1;
                }
                for (; j3 < ai4.length - 1; j3++)
                {
                    ai4[j3] = zzrp1.zzCW();
                    zzrp1.zzCT();
                }

                ai4[j3] = zzrp1.zzCW();
                zziI = ai4;
                break;

            case 26: // '\032'
                int l4 = zzrp1.zzll(zzrp1.zzDa());
                int k1 = zzrp1.getPosition();
                int k3;
                for (k3 = 0; zzrp1.zzDf() > 0; k3++)
                {
                    zzrp1.zzCW();
                }

                zzrp1.zzln(k1);
                int ai5[];
                if (zziI == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = zziI.length;
                }
                ai5 = new int[k3 + k1];
                k3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(zziI, 0, ai5, 0, k1);
                    k3 = k1;
                }
                for (; k3 < ai5.length; k3++)
                {
                    ai5[k3] = zzrp1.zzCW();
                }

                zziI = ai5;
                zzrp1.zzlm(l4);
                break;

            case 32: // ' '
                zziJ = zzrp1.zzCW();
                break;

            case 40: // '('
                int l3 = zzsa.zzb(zzrp1, 40);
                int ai6[];
                int l1;
                if (zziK == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = zziK.length;
                }
                ai6 = new int[l3 + l1];
                l3 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(zziK, 0, ai6, 0, l1);
                    l3 = l1;
                }
                for (; l3 < ai6.length - 1; l3++)
                {
                    ai6[l3] = zzrp1.zzCW();
                    zzrp1.zzCT();
                }

                ai6[l3] = zzrp1.zzCW();
                zziK = ai6;
                break;

            case 42: // '*'
                int i5 = zzrp1.zzll(zzrp1.zzDa());
                int i2 = zzrp1.getPosition();
                int i4;
                for (i4 = 0; zzrp1.zzDf() > 0; i4++)
                {
                    zzrp1.zzCW();
                }

                zzrp1.zzln(i2);
                int ai7[];
                if (zziK == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = zziK.length;
                }
                ai7 = new int[i4 + i2];
                i4 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(zziK, 0, ai7, 0, i2);
                    i4 = i2;
                }
                for (; i4 < ai7.length; i4++)
                {
                    ai7[i4] = zzrp1.zzCW();
                }

                zziK = ai7;
                zzrp1.zzlm(i5);
                break;

            case 48: // '0'
                zziL = zzrp1.zzCW();
                break;

            case 56: // '8'
                zziM = zzrp1.zzCW();
                break;
            }
        } while (true);
    }


    public ()
    {
        zzM();
    }
}
