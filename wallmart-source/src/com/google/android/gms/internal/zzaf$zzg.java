// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrr, zzaf, zzrv, zzrq, 
//            zzsa, zzrp, zzrx

public static final class zzL extends zzrr
{

    private static volatile  zzit[];
    public int zziA[];
    public int zziB[];
    public int zziC[];
    public int zziD[];
    public int zziu[];
    public int zziv[];
    public int zziw[];
    public int zzix[];
    public int zziy[];
    public int zziz[];

    public static zzL[] zzK()
    {
        if (zzit == null)
        {
            synchronized (zzrv.zzbck)
            {
                if (zzit == null)
                {
                    zzit = new zzit[0];
                }
            }
        }
        return zzit;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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
            if (obj instanceof zzit)
            {
                obj = (zzit)obj;
                flag = flag1;
                if (zzrv.equals(zziu, ((zziu) (obj)).zziu))
                {
                    flag = flag1;
                    if (zzrv.equals(zziv, ((zziv) (obj)).zziv))
                    {
                        flag = flag1;
                        if (zzrv.equals(zziw, ((zziw) (obj)).zziw))
                        {
                            flag = flag1;
                            if (zzrv.equals(zzix, ((zzix) (obj)).zzix))
                            {
                                flag = flag1;
                                if (zzrv.equals(zziy, ((zziy) (obj)).zziy))
                                {
                                    flag = flag1;
                                    if (zzrv.equals(zziz, ((zziz) (obj)).zziz))
                                    {
                                        flag = flag1;
                                        if (zzrv.equals(zziA, ((zziA) (obj)).zziA))
                                        {
                                            flag = flag1;
                                            if (zzrv.equals(zziB, ((zziB) (obj)).zziB))
                                            {
                                                flag = flag1;
                                                if (zzrv.equals(zziC, ((zziC) (obj)).zziC))
                                                {
                                                    flag = flag1;
                                                    if (zzrv.equals(zziD, ((zziD) (obj)).zziD))
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
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return ((((((((((zzrv.hashCode(zziu) + 527) * 31 + zzrv.hashCode(zziv)) * 31 + zzrv.hashCode(zziw)) * 31 + zzrv.hashCode(zzix)) * 31 + zzrv.hashCode(zziy)) * 31 + zzrv.hashCode(zziz)) * 31 + zzrv.hashCode(zziA)) * 31 + zzrv.hashCode(zziB)) * 31 + zzrv.hashCode(zziC)) * 31 + zzrv.hashCode(zziD)) * 31 + zzDk();
    }

    protected int zzB()
    {
        boolean flag = false;
        int l = super.zzB();
        int j;
        int k;
        if (zziu != null && zziu.length > 0)
        {
            int i = 0;
            k = 0;
            for (; i < zziu.length; i++)
            {
                k += zzrq.zzls(zziu[i]);
            }

            k = l + k + zziu.length * 1;
        } else
        {
            k = l;
        }
        j = k;
        if (zziv != null)
        {
            j = k;
            if (zziv.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zziv.length; j++)
                {
                    l += zzrq.zzls(zziv[j]);
                }

                j = k + l + zziv.length * 1;
            }
        }
        k = j;
        if (zziw != null)
        {
            k = j;
            if (zziw.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zziw.length; k++)
                {
                    l += zzrq.zzls(zziw[k]);
                }

                k = j + l + zziw.length * 1;
            }
        }
        j = k;
        if (zzix != null)
        {
            j = k;
            if (zzix.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zzix.length; j++)
                {
                    l += zzrq.zzls(zzix[j]);
                }

                j = k + l + zzix.length * 1;
            }
        }
        k = j;
        if (zziy != null)
        {
            k = j;
            if (zziy.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zziy.length; k++)
                {
                    l += zzrq.zzls(zziy[k]);
                }

                k = j + l + zziy.length * 1;
            }
        }
        j = k;
        if (zziz != null)
        {
            j = k;
            if (zziz.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zziz.length; j++)
                {
                    l += zzrq.zzls(zziz[j]);
                }

                j = k + l + zziz.length * 1;
            }
        }
        k = j;
        if (zziA != null)
        {
            k = j;
            if (zziA.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zziA.length; k++)
                {
                    l += zzrq.zzls(zziA[k]);
                }

                k = j + l + zziA.length * 1;
            }
        }
        j = k;
        if (zziB != null)
        {
            j = k;
            if (zziB.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zziB.length; j++)
                {
                    l += zzrq.zzls(zziB[j]);
                }

                j = k + l + zziB.length * 1;
            }
        }
        k = j;
        if (zziC != null)
        {
            k = j;
            if (zziC.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zziC.length; k++)
                {
                    l += zzrq.zzls(zziC[k]);
                }

                k = j + l + zziC.length * 1;
            }
        }
        j = k;
        if (zziD != null)
        {
            j = k;
            if (zziD.length > 0)
            {
                l = 0;
                for (j = ((flag) ? 1 : 0); j < zziD.length; j++)
                {
                    l += zzrq.zzls(zziD[j]);
                }

                j = k + l + zziD.length * 1;
            }
        }
        return j;
    }

    public zziD zzL()
    {
        zziu = zzsa.zzbcn;
        zziv = zzsa.zzbcn;
        zziw = zzsa.zzbcn;
        zzix = zzsa.zzbcn;
        zziy = zzsa.zzbcn;
        zziz = zzsa.zzbcn;
        zziA = zzsa.zzbcn;
        zziB = zzsa.zzbcn;
        zziC = zzsa.zzbcn;
        zziD = zzsa.zzbcn;
        zzbca = null;
        zzbcl = -1;
        return this;
    }

    public void zza(zzrq zzrq1)
        throws IOException
    {
        boolean flag = false;
        if (zziu != null && zziu.length > 0)
        {
            for (int i = 0; i < zziu.length; i++)
            {
                zzrq1.zzz(1, zziu[i]);
            }

        }
        if (zziv != null && zziv.length > 0)
        {
            for (int j = 0; j < zziv.length; j++)
            {
                zzrq1.zzz(2, zziv[j]);
            }

        }
        if (zziw != null && zziw.length > 0)
        {
            for (int k = 0; k < zziw.length; k++)
            {
                zzrq1.zzz(3, zziw[k]);
            }

        }
        if (zzix != null && zzix.length > 0)
        {
            for (int l = 0; l < zzix.length; l++)
            {
                zzrq1.zzz(4, zzix[l]);
            }

        }
        if (zziy != null && zziy.length > 0)
        {
            for (int i1 = 0; i1 < zziy.length; i1++)
            {
                zzrq1.zzz(5, zziy[i1]);
            }

        }
        if (zziz != null && zziz.length > 0)
        {
            for (int j1 = 0; j1 < zziz.length; j1++)
            {
                zzrq1.zzz(6, zziz[j1]);
            }

        }
        if (zziA != null && zziA.length > 0)
        {
            for (int k1 = 0; k1 < zziA.length; k1++)
            {
                zzrq1.zzz(7, zziA[k1]);
            }

        }
        if (zziB != null && zziB.length > 0)
        {
            for (int l1 = 0; l1 < zziB.length; l1++)
            {
                zzrq1.zzz(8, zziB[l1]);
            }

        }
        if (zziC != null && zziC.length > 0)
        {
            for (int i2 = 0; i2 < zziC.length; i2++)
            {
                zzrq1.zzz(9, zziC[i2]);
            }

        }
        if (zziD != null && zziD.length > 0)
        {
            for (int j2 = ((flag) ? 1 : 0); j2 < zziD.length; j2++)
            {
                zzrq1.zzz(10, zziD[j2]);
            }

        }
        super.zza(zzrq1);
    }

    public zzrx zzb(zzrp zzrp1)
        throws IOException
    {
        return zzh(zzrp1);
    }

    public zzh zzh(zzrp zzrp1)
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
                int j5 = zzsa.zzb(zzrp1, 8);
                int ai[];
                int j;
                if (zziu == null)
                {
                    j = 0;
                } else
                {
                    j = zziu.length;
                }
                ai = new int[j5 + j];
                j5 = j;
                if (j != 0)
                {
                    System.arraycopy(zziu, 0, ai, 0, j);
                    j5 = j;
                }
                for (; j5 < ai.length - 1; j5++)
                {
                    ai[j5] = zzrp1.zzCW();
                    zzrp1.zzCT();
                }

                ai[j5] = zzrp1.zzCW();
                zziu = ai;
                break;

            case 10: // '\n'
                int j10 = zzrp1.zzll(zzrp1.zzDa());
                int k = zzrp1.getPosition();
                int k5;
                for (k5 = 0; zzrp1.zzDf() > 0; k5++)
                {
                    zzrp1.zzCW();
                }

                zzrp1.zzln(k);
                int ai1[];
                if (zziu == null)
                {
                    k = 0;
                } else
                {
                    k = zziu.length;
                }
                ai1 = new int[k5 + k];
                k5 = k;
                if (k != 0)
                {
                    System.arraycopy(zziu, 0, ai1, 0, k);
                    k5 = k;
                }
                for (; k5 < ai1.length; k5++)
                {
                    ai1[k5] = zzrp1.zzCW();
                }

                zziu = ai1;
                zzrp1.zzlm(j10);
                break;

            case 16: // '\020'
                int l5 = zzsa.zzb(zzrp1, 16);
                int ai2[];
                int l;
                if (zziv == null)
                {
                    l = 0;
                } else
                {
                    l = zziv.length;
                }
                ai2 = new int[l5 + l];
                l5 = l;
                if (l != 0)
                {
                    System.arraycopy(zziv, 0, ai2, 0, l);
                    l5 = l;
                }
                for (; l5 < ai2.length - 1; l5++)
                {
                    ai2[l5] = zzrp1.zzCW();
                    zzrp1.zzCT();
                }

                ai2[l5] = zzrp1.zzCW();
                zziv = ai2;
                break;

            case 18: // '\022'
                int k10 = zzrp1.zzll(zzrp1.zzDa());
                int i1 = zzrp1.getPosition();
                int i6;
                for (i6 = 0; zzrp1.zzDf() > 0; i6++)
                {
                    zzrp1.zzCW();
                }

                zzrp1.zzln(i1);
                int ai3[];
                if (zziv == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = zziv.length;
                }
                ai3 = new int[i6 + i1];
                i6 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(zziv, 0, ai3, 0, i1);
                    i6 = i1;
                }
                for (; i6 < ai3.length; i6++)
                {
                    ai3[i6] = zzrp1.zzCW();
                }

                zziv = ai3;
                zzrp1.zzlm(k10);
                break;

            case 24: // '\030'
                int j6 = zzsa.zzb(zzrp1, 24);
                int ai4[];
                int j1;
                if (zziw == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = zziw.length;
                }
                ai4 = new int[j6 + j1];
                j6 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(zziw, 0, ai4, 0, j1);
                    j6 = j1;
                }
                for (; j6 < ai4.length - 1; j6++)
                {
                    ai4[j6] = zzrp1.zzCW();
                    zzrp1.zzCT();
                }

                ai4[j6] = zzrp1.zzCW();
                zziw = ai4;
                break;

            case 26: // '\032'
                int l10 = zzrp1.zzll(zzrp1.zzDa());
                int k1 = zzrp1.getPosition();
                int k6;
                for (k6 = 0; zzrp1.zzDf() > 0; k6++)
                {
                    zzrp1.zzCW();
                }

                zzrp1.zzln(k1);
                int ai5[];
                if (zziw == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = zziw.length;
                }
                ai5 = new int[k6 + k1];
                k6 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(zziw, 0, ai5, 0, k1);
                    k6 = k1;
                }
                for (; k6 < ai5.length; k6++)
                {
                    ai5[k6] = zzrp1.zzCW();
                }

                zziw = ai5;
                zzrp1.zzlm(l10);
                break;

            case 32: // ' '
                int l6 = zzsa.zzb(zzrp1, 32);
                int ai6[];
                int l1;
                if (zzix == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = zzix.length;
                }
                ai6 = new int[l6 + l1];
                l6 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(zzix, 0, ai6, 0, l1);
                    l6 = l1;
                }
                for (; l6 < ai6.length - 1; l6++)
                {
                    ai6[l6] = zzrp1.zzCW();
                    zzrp1.zzCT();
                }

                ai6[l6] = zzrp1.zzCW();
                zzix = ai6;
                break;

            case 34: // '"'
                int i11 = zzrp1.zzll(zzrp1.zzDa());
                int i2 = zzrp1.getPosition();
                int i7;
                for (i7 = 0; zzrp1.zzDf() > 0; i7++)
                {
                    zzrp1.zzCW();
                }

                zzrp1.zzln(i2);
                int ai7[];
                if (zzix == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = zzix.length;
                }
                ai7 = new int[i7 + i2];
                i7 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(zzix, 0, ai7, 0, i2);
                    i7 = i2;
                }
                for (; i7 < ai7.length; i7++)
                {
                    ai7[i7] = zzrp1.zzCW();
                }

                zzix = ai7;
                zzrp1.zzlm(i11);
                break;

            case 40: // '('
                int j7 = zzsa.zzb(zzrp1, 40);
                int ai8[];
                int j2;
                if (zziy == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = zziy.length;
                }
                ai8 = new int[j7 + j2];
                j7 = j2;
                if (j2 != 0)
                {
                    System.arraycopy(zziy, 0, ai8, 0, j2);
                    j7 = j2;
                }
                for (; j7 < ai8.length - 1; j7++)
                {
                    ai8[j7] = zzrp1.zzCW();
                    zzrp1.zzCT();
                }

                ai8[j7] = zzrp1.zzCW();
                zziy = ai8;
                break;

            case 42: // '*'
                int j11 = zzrp1.zzll(zzrp1.zzDa());
                int k2 = zzrp1.getPosition();
                int k7;
                for (k7 = 0; zzrp1.zzDf() > 0; k7++)
                {
                    zzrp1.zzCW();
                }

                zzrp1.zzln(k2);
                int ai9[];
                if (zziy == null)
                {
                    k2 = 0;
                } else
                {
                    k2 = zziy.length;
                }
                ai9 = new int[k7 + k2];
                k7 = k2;
                if (k2 != 0)
                {
                    System.arraycopy(zziy, 0, ai9, 0, k2);
                    k7 = k2;
                }
                for (; k7 < ai9.length; k7++)
                {
                    ai9[k7] = zzrp1.zzCW();
                }

                zziy = ai9;
                zzrp1.zzlm(j11);
                break;

            case 48: // '0'
                int l7 = zzsa.zzb(zzrp1, 48);
                int ai10[];
                int l2;
                if (zziz == null)
                {
                    l2 = 0;
                } else
                {
                    l2 = zziz.length;
                }
                ai10 = new int[l7 + l2];
                l7 = l2;
                if (l2 != 0)
                {
                    System.arraycopy(zziz, 0, ai10, 0, l2);
                    l7 = l2;
                }
                for (; l7 < ai10.length - 1; l7++)
                {
                    ai10[l7] = zzrp1.zzCW();
                    zzrp1.zzCT();
                }

                ai10[l7] = zzrp1.zzCW();
                zziz = ai10;
                break;

            case 50: // '2'
                int k11 = zzrp1.zzll(zzrp1.zzDa());
                int i3 = zzrp1.getPosition();
                int i8;
                for (i8 = 0; zzrp1.zzDf() > 0; i8++)
                {
                    zzrp1.zzCW();
                }

                zzrp1.zzln(i3);
                int ai11[];
                if (zziz == null)
                {
                    i3 = 0;
                } else
                {
                    i3 = zziz.length;
                }
                ai11 = new int[i8 + i3];
                i8 = i3;
                if (i3 != 0)
                {
                    System.arraycopy(zziz, 0, ai11, 0, i3);
                    i8 = i3;
                }
                for (; i8 < ai11.length; i8++)
                {
                    ai11[i8] = zzrp1.zzCW();
                }

                zziz = ai11;
                zzrp1.zzlm(k11);
                break;

            case 56: // '8'
                int j8 = zzsa.zzb(zzrp1, 56);
                int ai12[];
                int j3;
                if (zziA == null)
                {
                    j3 = 0;
                } else
                {
                    j3 = zziA.length;
                }
                ai12 = new int[j8 + j3];
                j8 = j3;
                if (j3 != 0)
                {
                    System.arraycopy(zziA, 0, ai12, 0, j3);
                    j8 = j3;
                }
                for (; j8 < ai12.length - 1; j8++)
                {
                    ai12[j8] = zzrp1.zzCW();
                    zzrp1.zzCT();
                }

                ai12[j8] = zzrp1.zzCW();
                zziA = ai12;
                break;

            case 58: // ':'
                int l11 = zzrp1.zzll(zzrp1.zzDa());
                int k3 = zzrp1.getPosition();
                int k8;
                for (k8 = 0; zzrp1.zzDf() > 0; k8++)
                {
                    zzrp1.zzCW();
                }

                zzrp1.zzln(k3);
                int ai13[];
                if (zziA == null)
                {
                    k3 = 0;
                } else
                {
                    k3 = zziA.length;
                }
                ai13 = new int[k8 + k3];
                k8 = k3;
                if (k3 != 0)
                {
                    System.arraycopy(zziA, 0, ai13, 0, k3);
                    k8 = k3;
                }
                for (; k8 < ai13.length; k8++)
                {
                    ai13[k8] = zzrp1.zzCW();
                }

                zziA = ai13;
                zzrp1.zzlm(l11);
                break;

            case 64: // '@'
                int l8 = zzsa.zzb(zzrp1, 64);
                int ai14[];
                int l3;
                if (zziB == null)
                {
                    l3 = 0;
                } else
                {
                    l3 = zziB.length;
                }
                ai14 = new int[l8 + l3];
                l8 = l3;
                if (l3 != 0)
                {
                    System.arraycopy(zziB, 0, ai14, 0, l3);
                    l8 = l3;
                }
                for (; l8 < ai14.length - 1; l8++)
                {
                    ai14[l8] = zzrp1.zzCW();
                    zzrp1.zzCT();
                }

                ai14[l8] = zzrp1.zzCW();
                zziB = ai14;
                break;

            case 66: // 'B'
                int i12 = zzrp1.zzll(zzrp1.zzDa());
                int i4 = zzrp1.getPosition();
                int i9;
                for (i9 = 0; zzrp1.zzDf() > 0; i9++)
                {
                    zzrp1.zzCW();
                }

                zzrp1.zzln(i4);
                int ai15[];
                if (zziB == null)
                {
                    i4 = 0;
                } else
                {
                    i4 = zziB.length;
                }
                ai15 = new int[i9 + i4];
                i9 = i4;
                if (i4 != 0)
                {
                    System.arraycopy(zziB, 0, ai15, 0, i4);
                    i9 = i4;
                }
                for (; i9 < ai15.length; i9++)
                {
                    ai15[i9] = zzrp1.zzCW();
                }

                zziB = ai15;
                zzrp1.zzlm(i12);
                break;

            case 72: // 'H'
                int j9 = zzsa.zzb(zzrp1, 72);
                int ai16[];
                int j4;
                if (zziC == null)
                {
                    j4 = 0;
                } else
                {
                    j4 = zziC.length;
                }
                ai16 = new int[j9 + j4];
                j9 = j4;
                if (j4 != 0)
                {
                    System.arraycopy(zziC, 0, ai16, 0, j4);
                    j9 = j4;
                }
                for (; j9 < ai16.length - 1; j9++)
                {
                    ai16[j9] = zzrp1.zzCW();
                    zzrp1.zzCT();
                }

                ai16[j9] = zzrp1.zzCW();
                zziC = ai16;
                break;

            case 74: // 'J'
                int j12 = zzrp1.zzll(zzrp1.zzDa());
                int k4 = zzrp1.getPosition();
                int k9;
                for (k9 = 0; zzrp1.zzDf() > 0; k9++)
                {
                    zzrp1.zzCW();
                }

                zzrp1.zzln(k4);
                int ai17[];
                if (zziC == null)
                {
                    k4 = 0;
                } else
                {
                    k4 = zziC.length;
                }
                ai17 = new int[k9 + k4];
                k9 = k4;
                if (k4 != 0)
                {
                    System.arraycopy(zziC, 0, ai17, 0, k4);
                    k9 = k4;
                }
                for (; k9 < ai17.length; k9++)
                {
                    ai17[k9] = zzrp1.zzCW();
                }

                zziC = ai17;
                zzrp1.zzlm(j12);
                break;

            case 80: // 'P'
                int l9 = zzsa.zzb(zzrp1, 80);
                int ai18[];
                int l4;
                if (zziD == null)
                {
                    l4 = 0;
                } else
                {
                    l4 = zziD.length;
                }
                ai18 = new int[l9 + l4];
                l9 = l4;
                if (l4 != 0)
                {
                    System.arraycopy(zziD, 0, ai18, 0, l4);
                    l9 = l4;
                }
                for (; l9 < ai18.length - 1; l9++)
                {
                    ai18[l9] = zzrp1.zzCW();
                    zzrp1.zzCT();
                }

                ai18[l9] = zzrp1.zzCW();
                zziD = ai18;
                break;

            case 82: // 'R'
                int k12 = zzrp1.zzll(zzrp1.zzDa());
                int i5 = zzrp1.getPosition();
                int i10;
                for (i10 = 0; zzrp1.zzDf() > 0; i10++)
                {
                    zzrp1.zzCW();
                }

                zzrp1.zzln(i5);
                int ai19[];
                if (zziD == null)
                {
                    i5 = 0;
                } else
                {
                    i5 = zziD.length;
                }
                ai19 = new int[i10 + i5];
                i10 = i5;
                if (i5 != 0)
                {
                    System.arraycopy(zziD, 0, ai19, 0, i5);
                    i10 = i5;
                }
                for (; i10 < ai19.length; i10++)
                {
                    ai19[i10] = zzrp1.zzCW();
                }

                zziD = ai19;
                zzrp1.zzlm(k12);
                break;
            }
        } while (true);
    }

    public ()
    {
        zzL();
    }
}
