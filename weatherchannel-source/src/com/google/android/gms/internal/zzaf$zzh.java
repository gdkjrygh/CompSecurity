// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzaf, zzri, zzrl, 
//            zzrg, zzrq, zzrf, zzrn

public static final class zzM extends zzrh
{

    public static final zzri zziB = zzri.zza(11, com/google/android/gms/internal/zzaf$zzh, 810);
    private static final  zziC[] = new [0];
    public int zziD[];
    public int zziE[];
    public int zziF[];
    public int zziG;
    public int zziH[];
    public int zziI;
    public int zziJ;

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
                if (zzrl.equals(zziD, ((zziD) (obj)).zziD))
                {
                    flag = flag1;
                    if (zzrl.equals(zziE, ((zziE) (obj)).zziE))
                    {
                        flag = flag1;
                        if (zzrl.equals(zziF, ((zziF) (obj)).zziF))
                        {
                            flag = flag1;
                            if (zziG == ((zziG) (obj)).zziG)
                            {
                                flag = flag1;
                                if (zzrl.equals(zziH, ((zziH) (obj)).zziH))
                                {
                                    flag = flag1;
                                    if (zziI == ((zziI) (obj)).zziI)
                                    {
                                        flag = flag1;
                                        if (zziJ == ((zziJ) (obj)).zziJ)
                                        {
                                            return zza(((zzrh) (obj)));
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
        return (((((((zzrl.hashCode(zziD) + 527) * 31 + zzrl.hashCode(zziE)) * 31 + zzrl.hashCode(zziF)) * 31 + zziG) * 31 + zzrl.hashCode(zziH)) * 31 + zziI) * 31 + zziJ) * 31 + zzBI();
    }

    protected int zzB()
    {
        boolean flag = false;
        int l = super.zzB();
        int j;
        int k;
        if (zziD != null && zziD.length > 0)
        {
            int i = 0;
            k = 0;
            for (; i < zziD.length; i++)
            {
                k += zzrg.zzkJ(zziD[i]);
            }

            k = l + k + zziD.length * 1;
        } else
        {
            k = l;
        }
        j = k;
        if (zziE != null)
        {
            j = k;
            if (zziE.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zziE.length; j++)
                {
                    l += zzrg.zzkJ(zziE[j]);
                }

                j = k + l + zziE.length * 1;
            }
        }
        k = j;
        if (zziF != null)
        {
            k = j;
            if (zziF.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zziF.length; k++)
                {
                    l += zzrg.zzkJ(zziF[k]);
                }

                k = j + l + zziF.length * 1;
            }
        }
        j = k;
        if (zziG != 0)
        {
            j = k + zzrg.zzA(4, zziG);
        }
        k = j;
        if (zziH != null)
        {
            k = j;
            if (zziH.length > 0)
            {
                l = 0;
                for (k = ((flag) ? 1 : 0); k < zziH.length; k++)
                {
                    l += zzrg.zzkJ(zziH[k]);
                }

                k = j + l + zziH.length * 1;
            }
        }
        j = k;
        if (zziI != 0)
        {
            j = k + zzrg.zzA(6, zziI);
        }
        k = j;
        if (zziJ != 0)
        {
            k = j + zzrg.zzA(7, zziJ);
        }
        return k;
    }

    public zziJ zzM()
    {
        zziD = zzrq.zzaWh;
        zziE = zzrq.zzaWh;
        zziF = zzrq.zzaWh;
        zziG = 0;
        zziH = zzrq.zzaWh;
        zziI = 0;
        zziJ = 0;
        zzaVU = null;
        zzaWf = -1;
        return this;
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        boolean flag = false;
        if (zziD != null && zziD.length > 0)
        {
            for (int i = 0; i < zziD.length; i++)
            {
                zzrg1.zzy(1, zziD[i]);
            }

        }
        if (zziE != null && zziE.length > 0)
        {
            for (int j = 0; j < zziE.length; j++)
            {
                zzrg1.zzy(2, zziE[j]);
            }

        }
        if (zziF != null && zziF.length > 0)
        {
            for (int k = 0; k < zziF.length; k++)
            {
                zzrg1.zzy(3, zziF[k]);
            }

        }
        if (zziG != 0)
        {
            zzrg1.zzy(4, zziG);
        }
        if (zziH != null && zziH.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < zziH.length; l++)
            {
                zzrg1.zzy(5, zziH[l]);
            }

        }
        if (zziI != 0)
        {
            zzrg1.zzy(6, zziI);
        }
        if (zziJ != 0)
        {
            zzrg1.zzy(7, zziJ);
        }
        super.zza(zzrg1);
    }

    public zzrn zzb(zzrf zzrf1)
        throws IOException
    {
        return zzi(zzrf1);
    }

    public zzi zzi(zzrf zzrf1)
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

            case 8: // '\b'
                int j2 = zzrq.zzb(zzrf1, 8);
                int ai[];
                int j;
                if (zziD == null)
                {
                    j = 0;
                } else
                {
                    j = zziD.length;
                }
                ai = new int[j2 + j];
                j2 = j;
                if (j != 0)
                {
                    System.arraycopy(zziD, 0, ai, 0, j);
                    j2 = j;
                }
                for (; j2 < ai.length - 1; j2++)
                {
                    ai[j2] = zzrf1.zzBu();
                    zzrf1.zzBr();
                }

                ai[j2] = zzrf1.zzBu();
                zziD = ai;
                break;

            case 10: // '\n'
                int j4 = zzrf1.zzkC(zzrf1.zzBy());
                int k = zzrf1.getPosition();
                int k2;
                for (k2 = 0; zzrf1.zzBD() > 0; k2++)
                {
                    zzrf1.zzBu();
                }

                zzrf1.zzkE(k);
                int ai1[];
                if (zziD == null)
                {
                    k = 0;
                } else
                {
                    k = zziD.length;
                }
                ai1 = new int[k2 + k];
                k2 = k;
                if (k != 0)
                {
                    System.arraycopy(zziD, 0, ai1, 0, k);
                    k2 = k;
                }
                for (; k2 < ai1.length; k2++)
                {
                    ai1[k2] = zzrf1.zzBu();
                }

                zziD = ai1;
                zzrf1.zzkD(j4);
                break;

            case 16: // '\020'
                int l2 = zzrq.zzb(zzrf1, 16);
                int ai2[];
                int l;
                if (zziE == null)
                {
                    l = 0;
                } else
                {
                    l = zziE.length;
                }
                ai2 = new int[l2 + l];
                l2 = l;
                if (l != 0)
                {
                    System.arraycopy(zziE, 0, ai2, 0, l);
                    l2 = l;
                }
                for (; l2 < ai2.length - 1; l2++)
                {
                    ai2[l2] = zzrf1.zzBu();
                    zzrf1.zzBr();
                }

                ai2[l2] = zzrf1.zzBu();
                zziE = ai2;
                break;

            case 18: // '\022'
                int k4 = zzrf1.zzkC(zzrf1.zzBy());
                int i1 = zzrf1.getPosition();
                int i3;
                for (i3 = 0; zzrf1.zzBD() > 0; i3++)
                {
                    zzrf1.zzBu();
                }

                zzrf1.zzkE(i1);
                int ai3[];
                if (zziE == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = zziE.length;
                }
                ai3 = new int[i3 + i1];
                i3 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(zziE, 0, ai3, 0, i1);
                    i3 = i1;
                }
                for (; i3 < ai3.length; i3++)
                {
                    ai3[i3] = zzrf1.zzBu();
                }

                zziE = ai3;
                zzrf1.zzkD(k4);
                break;

            case 24: // '\030'
                int j3 = zzrq.zzb(zzrf1, 24);
                int ai4[];
                int j1;
                if (zziF == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = zziF.length;
                }
                ai4 = new int[j3 + j1];
                j3 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(zziF, 0, ai4, 0, j1);
                    j3 = j1;
                }
                for (; j3 < ai4.length - 1; j3++)
                {
                    ai4[j3] = zzrf1.zzBu();
                    zzrf1.zzBr();
                }

                ai4[j3] = zzrf1.zzBu();
                zziF = ai4;
                break;

            case 26: // '\032'
                int l4 = zzrf1.zzkC(zzrf1.zzBy());
                int k1 = zzrf1.getPosition();
                int k3;
                for (k3 = 0; zzrf1.zzBD() > 0; k3++)
                {
                    zzrf1.zzBu();
                }

                zzrf1.zzkE(k1);
                int ai5[];
                if (zziF == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = zziF.length;
                }
                ai5 = new int[k3 + k1];
                k3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(zziF, 0, ai5, 0, k1);
                    k3 = k1;
                }
                for (; k3 < ai5.length; k3++)
                {
                    ai5[k3] = zzrf1.zzBu();
                }

                zziF = ai5;
                zzrf1.zzkD(l4);
                break;

            case 32: // ' '
                zziG = zzrf1.zzBu();
                break;

            case 40: // '('
                int l3 = zzrq.zzb(zzrf1, 40);
                int ai6[];
                int l1;
                if (zziH == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = zziH.length;
                }
                ai6 = new int[l3 + l1];
                l3 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(zziH, 0, ai6, 0, l1);
                    l3 = l1;
                }
                for (; l3 < ai6.length - 1; l3++)
                {
                    ai6[l3] = zzrf1.zzBu();
                    zzrf1.zzBr();
                }

                ai6[l3] = zzrf1.zzBu();
                zziH = ai6;
                break;

            case 42: // '*'
                int i5 = zzrf1.zzkC(zzrf1.zzBy());
                int i2 = zzrf1.getPosition();
                int i4;
                for (i4 = 0; zzrf1.zzBD() > 0; i4++)
                {
                    zzrf1.zzBu();
                }

                zzrf1.zzkE(i2);
                int ai7[];
                if (zziH == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = zziH.length;
                }
                ai7 = new int[i4 + i2];
                i4 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(zziH, 0, ai7, 0, i2);
                    i4 = i2;
                }
                for (; i4 < ai7.length; i4++)
                {
                    ai7[i4] = zzrf1.zzBu();
                }

                zziH = ai7;
                zzrf1.zzkD(i5);
                break;

            case 48: // '0'
                zziI = zzrf1.zzBu();
                break;

            case 56: // '8'
                zziJ = zzrf1.zzBu();
                break;
            }
        } while (true);
    }


    public ()
    {
        zzM();
    }
}
