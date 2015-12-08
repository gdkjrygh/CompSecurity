// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzaf, zzrl, zzrg, 
//            zzrq, zzrf, zzrn

public static final class zzL extends zzrh
{

    private static volatile  zziq[];
    public int zziA[];
    public int zzir[];
    public int zzis[];
    public int zzit[];
    public int zziu[];
    public int zziv[];
    public int zziw[];
    public int zzix[];
    public int zziy[];
    public int zziz[];

    public static zzL[] zzK()
    {
        if (zziq == null)
        {
            synchronized (zzrl.zzaWe)
            {
                if (zziq == null)
                {
                    zziq = new zziq[0];
                }
            }
        }
        return zziq;
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
            if (obj instanceof zziq)
            {
                obj = (zziq)obj;
                flag = flag1;
                if (zzrl.equals(zzir, ((zzir) (obj)).zzir))
                {
                    flag = flag1;
                    if (zzrl.equals(zzis, ((zzis) (obj)).zzis))
                    {
                        flag = flag1;
                        if (zzrl.equals(zzit, ((zzit) (obj)).zzit))
                        {
                            flag = flag1;
                            if (zzrl.equals(zziu, ((zziu) (obj)).zziu))
                            {
                                flag = flag1;
                                if (zzrl.equals(zziv, ((zziv) (obj)).zziv))
                                {
                                    flag = flag1;
                                    if (zzrl.equals(zziw, ((zziw) (obj)).zziw))
                                    {
                                        flag = flag1;
                                        if (zzrl.equals(zzix, ((zzix) (obj)).zzix))
                                        {
                                            flag = flag1;
                                            if (zzrl.equals(zziy, ((zziy) (obj)).zziy))
                                            {
                                                flag = flag1;
                                                if (zzrl.equals(zziz, ((zziz) (obj)).zziz))
                                                {
                                                    flag = flag1;
                                                    if (zzrl.equals(zziA, ((zziA) (obj)).zziA))
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
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return ((((((((((zzrl.hashCode(zzir) + 527) * 31 + zzrl.hashCode(zzis)) * 31 + zzrl.hashCode(zzit)) * 31 + zzrl.hashCode(zziu)) * 31 + zzrl.hashCode(zziv)) * 31 + zzrl.hashCode(zziw)) * 31 + zzrl.hashCode(zzix)) * 31 + zzrl.hashCode(zziy)) * 31 + zzrl.hashCode(zziz)) * 31 + zzrl.hashCode(zziA)) * 31 + zzBI();
    }

    protected int zzB()
    {
        boolean flag = false;
        int l = super.zzB();
        int j;
        int k;
        if (zzir != null && zzir.length > 0)
        {
            int i = 0;
            k = 0;
            for (; i < zzir.length; i++)
            {
                k += zzrg.zzkJ(zzir[i]);
            }

            k = l + k + zzir.length * 1;
        } else
        {
            k = l;
        }
        j = k;
        if (zzis != null)
        {
            j = k;
            if (zzis.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zzis.length; j++)
                {
                    l += zzrg.zzkJ(zzis[j]);
                }

                j = k + l + zzis.length * 1;
            }
        }
        k = j;
        if (zzit != null)
        {
            k = j;
            if (zzit.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zzit.length; k++)
                {
                    l += zzrg.zzkJ(zzit[k]);
                }

                k = j + l + zzit.length * 1;
            }
        }
        j = k;
        if (zziu != null)
        {
            j = k;
            if (zziu.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zziu.length; j++)
                {
                    l += zzrg.zzkJ(zziu[j]);
                }

                j = k + l + zziu.length * 1;
            }
        }
        k = j;
        if (zziv != null)
        {
            k = j;
            if (zziv.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zziv.length; k++)
                {
                    l += zzrg.zzkJ(zziv[k]);
                }

                k = j + l + zziv.length * 1;
            }
        }
        j = k;
        if (zziw != null)
        {
            j = k;
            if (zziw.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zziw.length; j++)
                {
                    l += zzrg.zzkJ(zziw[j]);
                }

                j = k + l + zziw.length * 1;
            }
        }
        k = j;
        if (zzix != null)
        {
            k = j;
            if (zzix.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zzix.length; k++)
                {
                    l += zzrg.zzkJ(zzix[k]);
                }

                k = j + l + zzix.length * 1;
            }
        }
        j = k;
        if (zziy != null)
        {
            j = k;
            if (zziy.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zziy.length; j++)
                {
                    l += zzrg.zzkJ(zziy[j]);
                }

                j = k + l + zziy.length * 1;
            }
        }
        k = j;
        if (zziz != null)
        {
            k = j;
            if (zziz.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zziz.length; k++)
                {
                    l += zzrg.zzkJ(zziz[k]);
                }

                k = j + l + zziz.length * 1;
            }
        }
        j = k;
        if (zziA != null)
        {
            j = k;
            if (zziA.length > 0)
            {
                l = 0;
                for (j = ((flag) ? 1 : 0); j < zziA.length; j++)
                {
                    l += zzrg.zzkJ(zziA[j]);
                }

                j = k + l + zziA.length * 1;
            }
        }
        return j;
    }

    public zziA zzL()
    {
        zzir = zzrq.zzaWh;
        zzis = zzrq.zzaWh;
        zzit = zzrq.zzaWh;
        zziu = zzrq.zzaWh;
        zziv = zzrq.zzaWh;
        zziw = zzrq.zzaWh;
        zzix = zzrq.zzaWh;
        zziy = zzrq.zzaWh;
        zziz = zzrq.zzaWh;
        zziA = zzrq.zzaWh;
        zzaVU = null;
        zzaWf = -1;
        return this;
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        boolean flag = false;
        if (zzir != null && zzir.length > 0)
        {
            for (int i = 0; i < zzir.length; i++)
            {
                zzrg1.zzy(1, zzir[i]);
            }

        }
        if (zzis != null && zzis.length > 0)
        {
            for (int j = 0; j < zzis.length; j++)
            {
                zzrg1.zzy(2, zzis[j]);
            }

        }
        if (zzit != null && zzit.length > 0)
        {
            for (int k = 0; k < zzit.length; k++)
            {
                zzrg1.zzy(3, zzit[k]);
            }

        }
        if (zziu != null && zziu.length > 0)
        {
            for (int l = 0; l < zziu.length; l++)
            {
                zzrg1.zzy(4, zziu[l]);
            }

        }
        if (zziv != null && zziv.length > 0)
        {
            for (int i1 = 0; i1 < zziv.length; i1++)
            {
                zzrg1.zzy(5, zziv[i1]);
            }

        }
        if (zziw != null && zziw.length > 0)
        {
            for (int j1 = 0; j1 < zziw.length; j1++)
            {
                zzrg1.zzy(6, zziw[j1]);
            }

        }
        if (zzix != null && zzix.length > 0)
        {
            for (int k1 = 0; k1 < zzix.length; k1++)
            {
                zzrg1.zzy(7, zzix[k1]);
            }

        }
        if (zziy != null && zziy.length > 0)
        {
            for (int l1 = 0; l1 < zziy.length; l1++)
            {
                zzrg1.zzy(8, zziy[l1]);
            }

        }
        if (zziz != null && zziz.length > 0)
        {
            for (int i2 = 0; i2 < zziz.length; i2++)
            {
                zzrg1.zzy(9, zziz[i2]);
            }

        }
        if (zziA != null && zziA.length > 0)
        {
            for (int j2 = ((flag) ? 1 : 0); j2 < zziA.length; j2++)
            {
                zzrg1.zzy(10, zziA[j2]);
            }

        }
        super.zza(zzrg1);
    }

    public zzrn zzb(zzrf zzrf1)
        throws IOException
    {
        return zzh(zzrf1);
    }

    public zzh zzh(zzrf zzrf1)
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
                int j5 = zzrq.zzb(zzrf1, 8);
                int ai[];
                int j;
                if (zzir == null)
                {
                    j = 0;
                } else
                {
                    j = zzir.length;
                }
                ai = new int[j5 + j];
                j5 = j;
                if (j != 0)
                {
                    System.arraycopy(zzir, 0, ai, 0, j);
                    j5 = j;
                }
                for (; j5 < ai.length - 1; j5++)
                {
                    ai[j5] = zzrf1.zzBu();
                    zzrf1.zzBr();
                }

                ai[j5] = zzrf1.zzBu();
                zzir = ai;
                break;

            case 10: // '\n'
                int j10 = zzrf1.zzkC(zzrf1.zzBy());
                int k = zzrf1.getPosition();
                int k5;
                for (k5 = 0; zzrf1.zzBD() > 0; k5++)
                {
                    zzrf1.zzBu();
                }

                zzrf1.zzkE(k);
                int ai1[];
                if (zzir == null)
                {
                    k = 0;
                } else
                {
                    k = zzir.length;
                }
                ai1 = new int[k5 + k];
                k5 = k;
                if (k != 0)
                {
                    System.arraycopy(zzir, 0, ai1, 0, k);
                    k5 = k;
                }
                for (; k5 < ai1.length; k5++)
                {
                    ai1[k5] = zzrf1.zzBu();
                }

                zzir = ai1;
                zzrf1.zzkD(j10);
                break;

            case 16: // '\020'
                int l5 = zzrq.zzb(zzrf1, 16);
                int ai2[];
                int l;
                if (zzis == null)
                {
                    l = 0;
                } else
                {
                    l = zzis.length;
                }
                ai2 = new int[l5 + l];
                l5 = l;
                if (l != 0)
                {
                    System.arraycopy(zzis, 0, ai2, 0, l);
                    l5 = l;
                }
                for (; l5 < ai2.length - 1; l5++)
                {
                    ai2[l5] = zzrf1.zzBu();
                    zzrf1.zzBr();
                }

                ai2[l5] = zzrf1.zzBu();
                zzis = ai2;
                break;

            case 18: // '\022'
                int k10 = zzrf1.zzkC(zzrf1.zzBy());
                int i1 = zzrf1.getPosition();
                int i6;
                for (i6 = 0; zzrf1.zzBD() > 0; i6++)
                {
                    zzrf1.zzBu();
                }

                zzrf1.zzkE(i1);
                int ai3[];
                if (zzis == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = zzis.length;
                }
                ai3 = new int[i6 + i1];
                i6 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(zzis, 0, ai3, 0, i1);
                    i6 = i1;
                }
                for (; i6 < ai3.length; i6++)
                {
                    ai3[i6] = zzrf1.zzBu();
                }

                zzis = ai3;
                zzrf1.zzkD(k10);
                break;

            case 24: // '\030'
                int j6 = zzrq.zzb(zzrf1, 24);
                int ai4[];
                int j1;
                if (zzit == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = zzit.length;
                }
                ai4 = new int[j6 + j1];
                j6 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(zzit, 0, ai4, 0, j1);
                    j6 = j1;
                }
                for (; j6 < ai4.length - 1; j6++)
                {
                    ai4[j6] = zzrf1.zzBu();
                    zzrf1.zzBr();
                }

                ai4[j6] = zzrf1.zzBu();
                zzit = ai4;
                break;

            case 26: // '\032'
                int l10 = zzrf1.zzkC(zzrf1.zzBy());
                int k1 = zzrf1.getPosition();
                int k6;
                for (k6 = 0; zzrf1.zzBD() > 0; k6++)
                {
                    zzrf1.zzBu();
                }

                zzrf1.zzkE(k1);
                int ai5[];
                if (zzit == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = zzit.length;
                }
                ai5 = new int[k6 + k1];
                k6 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(zzit, 0, ai5, 0, k1);
                    k6 = k1;
                }
                for (; k6 < ai5.length; k6++)
                {
                    ai5[k6] = zzrf1.zzBu();
                }

                zzit = ai5;
                zzrf1.zzkD(l10);
                break;

            case 32: // ' '
                int l6 = zzrq.zzb(zzrf1, 32);
                int ai6[];
                int l1;
                if (zziu == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = zziu.length;
                }
                ai6 = new int[l6 + l1];
                l6 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(zziu, 0, ai6, 0, l1);
                    l6 = l1;
                }
                for (; l6 < ai6.length - 1; l6++)
                {
                    ai6[l6] = zzrf1.zzBu();
                    zzrf1.zzBr();
                }

                ai6[l6] = zzrf1.zzBu();
                zziu = ai6;
                break;

            case 34: // '"'
                int i11 = zzrf1.zzkC(zzrf1.zzBy());
                int i2 = zzrf1.getPosition();
                int i7;
                for (i7 = 0; zzrf1.zzBD() > 0; i7++)
                {
                    zzrf1.zzBu();
                }

                zzrf1.zzkE(i2);
                int ai7[];
                if (zziu == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = zziu.length;
                }
                ai7 = new int[i7 + i2];
                i7 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(zziu, 0, ai7, 0, i2);
                    i7 = i2;
                }
                for (; i7 < ai7.length; i7++)
                {
                    ai7[i7] = zzrf1.zzBu();
                }

                zziu = ai7;
                zzrf1.zzkD(i11);
                break;

            case 40: // '('
                int j7 = zzrq.zzb(zzrf1, 40);
                int ai8[];
                int j2;
                if (zziv == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = zziv.length;
                }
                ai8 = new int[j7 + j2];
                j7 = j2;
                if (j2 != 0)
                {
                    System.arraycopy(zziv, 0, ai8, 0, j2);
                    j7 = j2;
                }
                for (; j7 < ai8.length - 1; j7++)
                {
                    ai8[j7] = zzrf1.zzBu();
                    zzrf1.zzBr();
                }

                ai8[j7] = zzrf1.zzBu();
                zziv = ai8;
                break;

            case 42: // '*'
                int j11 = zzrf1.zzkC(zzrf1.zzBy());
                int k2 = zzrf1.getPosition();
                int k7;
                for (k7 = 0; zzrf1.zzBD() > 0; k7++)
                {
                    zzrf1.zzBu();
                }

                zzrf1.zzkE(k2);
                int ai9[];
                if (zziv == null)
                {
                    k2 = 0;
                } else
                {
                    k2 = zziv.length;
                }
                ai9 = new int[k7 + k2];
                k7 = k2;
                if (k2 != 0)
                {
                    System.arraycopy(zziv, 0, ai9, 0, k2);
                    k7 = k2;
                }
                for (; k7 < ai9.length; k7++)
                {
                    ai9[k7] = zzrf1.zzBu();
                }

                zziv = ai9;
                zzrf1.zzkD(j11);
                break;

            case 48: // '0'
                int l7 = zzrq.zzb(zzrf1, 48);
                int ai10[];
                int l2;
                if (zziw == null)
                {
                    l2 = 0;
                } else
                {
                    l2 = zziw.length;
                }
                ai10 = new int[l7 + l2];
                l7 = l2;
                if (l2 != 0)
                {
                    System.arraycopy(zziw, 0, ai10, 0, l2);
                    l7 = l2;
                }
                for (; l7 < ai10.length - 1; l7++)
                {
                    ai10[l7] = zzrf1.zzBu();
                    zzrf1.zzBr();
                }

                ai10[l7] = zzrf1.zzBu();
                zziw = ai10;
                break;

            case 50: // '2'
                int k11 = zzrf1.zzkC(zzrf1.zzBy());
                int i3 = zzrf1.getPosition();
                int i8;
                for (i8 = 0; zzrf1.zzBD() > 0; i8++)
                {
                    zzrf1.zzBu();
                }

                zzrf1.zzkE(i3);
                int ai11[];
                if (zziw == null)
                {
                    i3 = 0;
                } else
                {
                    i3 = zziw.length;
                }
                ai11 = new int[i8 + i3];
                i8 = i3;
                if (i3 != 0)
                {
                    System.arraycopy(zziw, 0, ai11, 0, i3);
                    i8 = i3;
                }
                for (; i8 < ai11.length; i8++)
                {
                    ai11[i8] = zzrf1.zzBu();
                }

                zziw = ai11;
                zzrf1.zzkD(k11);
                break;

            case 56: // '8'
                int j8 = zzrq.zzb(zzrf1, 56);
                int ai12[];
                int j3;
                if (zzix == null)
                {
                    j3 = 0;
                } else
                {
                    j3 = zzix.length;
                }
                ai12 = new int[j8 + j3];
                j8 = j3;
                if (j3 != 0)
                {
                    System.arraycopy(zzix, 0, ai12, 0, j3);
                    j8 = j3;
                }
                for (; j8 < ai12.length - 1; j8++)
                {
                    ai12[j8] = zzrf1.zzBu();
                    zzrf1.zzBr();
                }

                ai12[j8] = zzrf1.zzBu();
                zzix = ai12;
                break;

            case 58: // ':'
                int l11 = zzrf1.zzkC(zzrf1.zzBy());
                int k3 = zzrf1.getPosition();
                int k8;
                for (k8 = 0; zzrf1.zzBD() > 0; k8++)
                {
                    zzrf1.zzBu();
                }

                zzrf1.zzkE(k3);
                int ai13[];
                if (zzix == null)
                {
                    k3 = 0;
                } else
                {
                    k3 = zzix.length;
                }
                ai13 = new int[k8 + k3];
                k8 = k3;
                if (k3 != 0)
                {
                    System.arraycopy(zzix, 0, ai13, 0, k3);
                    k8 = k3;
                }
                for (; k8 < ai13.length; k8++)
                {
                    ai13[k8] = zzrf1.zzBu();
                }

                zzix = ai13;
                zzrf1.zzkD(l11);
                break;

            case 64: // '@'
                int l8 = zzrq.zzb(zzrf1, 64);
                int ai14[];
                int l3;
                if (zziy == null)
                {
                    l3 = 0;
                } else
                {
                    l3 = zziy.length;
                }
                ai14 = new int[l8 + l3];
                l8 = l3;
                if (l3 != 0)
                {
                    System.arraycopy(zziy, 0, ai14, 0, l3);
                    l8 = l3;
                }
                for (; l8 < ai14.length - 1; l8++)
                {
                    ai14[l8] = zzrf1.zzBu();
                    zzrf1.zzBr();
                }

                ai14[l8] = zzrf1.zzBu();
                zziy = ai14;
                break;

            case 66: // 'B'
                int i12 = zzrf1.zzkC(zzrf1.zzBy());
                int i4 = zzrf1.getPosition();
                int i9;
                for (i9 = 0; zzrf1.zzBD() > 0; i9++)
                {
                    zzrf1.zzBu();
                }

                zzrf1.zzkE(i4);
                int ai15[];
                if (zziy == null)
                {
                    i4 = 0;
                } else
                {
                    i4 = zziy.length;
                }
                ai15 = new int[i9 + i4];
                i9 = i4;
                if (i4 != 0)
                {
                    System.arraycopy(zziy, 0, ai15, 0, i4);
                    i9 = i4;
                }
                for (; i9 < ai15.length; i9++)
                {
                    ai15[i9] = zzrf1.zzBu();
                }

                zziy = ai15;
                zzrf1.zzkD(i12);
                break;

            case 72: // 'H'
                int j9 = zzrq.zzb(zzrf1, 72);
                int ai16[];
                int j4;
                if (zziz == null)
                {
                    j4 = 0;
                } else
                {
                    j4 = zziz.length;
                }
                ai16 = new int[j9 + j4];
                j9 = j4;
                if (j4 != 0)
                {
                    System.arraycopy(zziz, 0, ai16, 0, j4);
                    j9 = j4;
                }
                for (; j9 < ai16.length - 1; j9++)
                {
                    ai16[j9] = zzrf1.zzBu();
                    zzrf1.zzBr();
                }

                ai16[j9] = zzrf1.zzBu();
                zziz = ai16;
                break;

            case 74: // 'J'
                int j12 = zzrf1.zzkC(zzrf1.zzBy());
                int k4 = zzrf1.getPosition();
                int k9;
                for (k9 = 0; zzrf1.zzBD() > 0; k9++)
                {
                    zzrf1.zzBu();
                }

                zzrf1.zzkE(k4);
                int ai17[];
                if (zziz == null)
                {
                    k4 = 0;
                } else
                {
                    k4 = zziz.length;
                }
                ai17 = new int[k9 + k4];
                k9 = k4;
                if (k4 != 0)
                {
                    System.arraycopy(zziz, 0, ai17, 0, k4);
                    k9 = k4;
                }
                for (; k9 < ai17.length; k9++)
                {
                    ai17[k9] = zzrf1.zzBu();
                }

                zziz = ai17;
                zzrf1.zzkD(j12);
                break;

            case 80: // 'P'
                int l9 = zzrq.zzb(zzrf1, 80);
                int ai18[];
                int l4;
                if (zziA == null)
                {
                    l4 = 0;
                } else
                {
                    l4 = zziA.length;
                }
                ai18 = new int[l9 + l4];
                l9 = l4;
                if (l4 != 0)
                {
                    System.arraycopy(zziA, 0, ai18, 0, l4);
                    l9 = l4;
                }
                for (; l9 < ai18.length - 1; l9++)
                {
                    ai18[l9] = zzrf1.zzBu();
                    zzrf1.zzBr();
                }

                ai18[l9] = zzrf1.zzBu();
                zziA = ai18;
                break;

            case 82: // 'R'
                int k12 = zzrf1.zzkC(zzrf1.zzBy());
                int i5 = zzrf1.getPosition();
                int i10;
                for (i10 = 0; zzrf1.zzBD() > 0; i10++)
                {
                    zzrf1.zzBu();
                }

                zzrf1.zzkE(i5);
                int ai19[];
                if (zziA == null)
                {
                    i5 = 0;
                } else
                {
                    i5 = zziA.length;
                }
                ai19 = new int[i10 + i5];
                i10 = i5;
                if (i5 != 0)
                {
                    System.arraycopy(zziA, 0, ai19, 0, i5);
                    i10 = i5;
                }
                for (; i10 < ai19.length; i10++)
                {
                    ai19[i10] = zzrf1.zzBu();
                }

                zziA = ai19;
                zzrf1.zzkD(k12);
                break;
            }
        } while (true);
    }

    public ()
    {
        zzL();
    }
}
