// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            zzrr, zzrm, zzrv, zzsa, 
//            zzrq, zzrp, zzrx

public static final class zzCR extends zzrr
{

    public long zzbbA;
    public int zzbbB;
    public int zzbbC;
    public boolean zzbbD;
    public zzbbI zzbbE[];
    public zzbbI zzbbF[];
    public String zzbbG[];
    public long zzbbH[];
    public float zzbbI[];
    public long zzbbJ;
    public byte zzbbw[];
    public String zzbbx;
    public double zzbby;
    public float zzbbz;

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
        if (!(obj instanceof zzCR))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (zzCR)obj;
        flag = flag1;
        if (!Arrays.equals(zzbbw, ((zzbbw) (obj)).zzbbw))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (zzbbx != null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((zzbbx) (obj)).zzbbx != null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (Double.doubleToLongBits(zzbby) == Double.doubleToLongBits(((zzbby) (obj)).zzbby))
        {
            flag = flag1;
            if (Float.floatToIntBits(zzbbz) == Float.floatToIntBits(((zzbbz) (obj)).zzbbz))
            {
                flag = flag1;
                if (zzbbA == ((zzbbA) (obj)).zzbbA)
                {
                    flag = flag1;
                    if (zzbbB == ((zzbbB) (obj)).zzbbB)
                    {
                        flag = flag1;
                        if (zzbbC == ((zzbbC) (obj)).zzbbC)
                        {
                            flag = flag1;
                            if (zzbbD == ((zzbbD) (obj)).zzbbD)
                            {
                                flag = flag1;
                                if (zzrv.equals(zzbbE, ((zzbbE) (obj)).zzbbE))
                                {
                                    flag = flag1;
                                    if (zzrv.equals(zzbbF, ((zzbbF) (obj)).zzbbF))
                                    {
                                        flag = flag1;
                                        if (zzrv.equals(zzbbG, ((zzbbG) (obj)).zzbbG))
                                        {
                                            flag = flag1;
                                            if (zzrv.equals(zzbbH, ((zzbbH) (obj)).zzbbH))
                                            {
                                                flag = flag1;
                                                if (zzrv.equals(zzbbI, ((zzbbI) (obj)).zzbbI))
                                                {
                                                    flag = flag1;
                                                    if (zzbbJ == ((zzbbJ) (obj)).zzbbJ)
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
        if (true) goto _L4; else goto _L3
_L3:
        if (!zzbbx.equals(((zzbbx) (obj)).zzbbx))
        {
            return false;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public int hashCode()
    {
        int j = Arrays.hashCode(zzbbw);
        int i;
        char c;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        long l1;
        if (zzbbx == null)
        {
            i = 0;
        } else
        {
            i = zzbbx.hashCode();
        }
        l1 = Double.doubleToLongBits(zzbby);
        k = (int)(l1 ^ l1 >>> 32);
        l = Float.floatToIntBits(zzbbz);
        i1 = (int)(zzbbA ^ zzbbA >>> 32);
        j1 = zzbbB;
        k1 = zzbbC;
        if (zzbbD)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        return (((((((c + ((((((i + (j + 527) * 31) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31) * 31 + zzrv.hashCode(zzbbE)) * 31 + zzrv.hashCode(zzbbF)) * 31 + zzrv.hashCode(zzbbG)) * 31 + zzrv.hashCode(zzbbH)) * 31 + zzrv.hashCode(zzbbI)) * 31 + (int)(zzbbJ ^ zzbbJ >>> 32)) * 31 + zzDk();
    }

    protected int zzB()
    {
        boolean flag = false;
        int j = super.zzB();
        int i = j;
        if (!Arrays.equals(zzbbw, zzsa.zzbcu))
        {
            i = j + zzrq.zzb(1, zzbbw);
        }
        j = i;
        if (!zzbbx.equals(""))
        {
            j = i + zzrq.zzl(2, zzbbx);
        }
        i = j;
        if (Double.doubleToLongBits(zzbby) != Double.doubleToLongBits(0.0D))
        {
            i = j + zzrq.zzb(3, zzbby);
        }
        j = i;
        if (Float.floatToIntBits(zzbbz) != Float.floatToIntBits(0.0F))
        {
            j = i + zzrq.zzc(4, zzbbz);
        }
        i = j;
        if (zzbbA != 0L)
        {
            i = j + zzrq.zzd(5, zzbbA);
        }
        j = i;
        if (zzbbB != 0)
        {
            j = i + zzrq.zzB(6, zzbbB);
        }
        int k = j;
        if (zzbbC != 0)
        {
            k = j + zzrq.zzC(7, zzbbC);
        }
        i = k;
        if (zzbbD)
        {
            i = k + zzrq.zzc(8, zzbbD);
        }
        j = i;
        if (zzbbE != null)
        {
            j = i;
            if (zzbbE.length > 0)
            {
                for (j = 0; j < zzbbE.length;)
                {
                    zzDk zzdk = zzbbE[j];
                    int l = i;
                    if (zzdk != null)
                    {
                        l = i + zzrq.zzc(9, zzdk);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (zzbbF != null)
        {
            i = j;
            if (zzbbF.length > 0)
            {
                i = j;
                for (j = 0; j < zzbbF.length;)
                {
                    zzDk zzdk1 = zzbbF[j];
                    int i1 = i;
                    if (zzdk1 != null)
                    {
                        i1 = i + zzrq.zzc(10, zzdk1);
                    }
                    j++;
                    i = i1;
                }

            }
        }
        j = i;
        if (zzbbG != null)
        {
            j = i;
            if (zzbbG.length > 0)
            {
                j = 0;
                int j1 = 0;
                int l1;
                int i2;
                for (l1 = 0; j < zzbbG.length; l1 = i2)
                {
                    String s = zzbbG[j];
                    int j2 = j1;
                    i2 = l1;
                    if (s != null)
                    {
                        i2 = l1 + 1;
                        j2 = j1 + zzrq.zzfy(s);
                    }
                    j++;
                    j1 = j2;
                }

                j = i + j1 + l1 * 1;
            }
        }
        i = j;
        if (zzbbH != null)
        {
            i = j;
            if (zzbbH.length > 0)
            {
                int k1 = 0;
                for (i = ((flag) ? 1 : 0); i < zzbbH.length; i++)
                {
                    k1 += zzrq.zzY(zzbbH[i]);
                }

                i = j + k1 + zzbbH.length * 1;
            }
        }
        j = i;
        if (zzbbJ != 0L)
        {
            j = i + zzrq.zzd(13, zzbbJ);
        }
        i = j;
        if (zzbbI != null)
        {
            i = j;
            if (zzbbI.length > 0)
            {
                i = j + zzbbI.length * 4 + zzbbI.length * 1;
            }
        }
        return i;
    }

    public zzbbI zzCR()
    {
        zzbbw = zzsa.zzbcu;
        zzbbx = "";
        zzbby = 0.0D;
        zzbbz = 0.0F;
        zzbbA = 0L;
        zzbbB = 0;
        zzbbC = 0;
        zzbbD = false;
        zzbbE = zzbbE();
        zzbbF = ();
        zzbbG = zzsa.zzbcs;
        zzbbH = zzsa.zzbco;
        zzbbI = zzsa.zzbcp;
        zzbbJ = 0L;
        zzbca = null;
        zzbcl = -1;
        return this;
    }

    public void zza(zzrq zzrq1)
        throws IOException
    {
        boolean flag = false;
        if (!Arrays.equals(zzbbw, zzsa.zzbcu))
        {
            zzrq1.zza(1, zzbbw);
        }
        if (!zzbbx.equals(""))
        {
            zzrq1.zzb(2, zzbbx);
        }
        if (Double.doubleToLongBits(zzbby) != Double.doubleToLongBits(0.0D))
        {
            zzrq1.zza(3, zzbby);
        }
        if (Float.floatToIntBits(zzbbz) != Float.floatToIntBits(0.0F))
        {
            zzrq1.zzb(4, zzbbz);
        }
        if (zzbbA != 0L)
        {
            zzrq1.zzb(5, zzbbA);
        }
        if (zzbbB != 0)
        {
            zzrq1.zzz(6, zzbbB);
        }
        if (zzbbC != 0)
        {
            zzrq1.zzA(7, zzbbC);
        }
        if (zzbbD)
        {
            zzrq1.zzb(8, zzbbD);
        }
        if (zzbbE != null && zzbbE.length > 0)
        {
            for (int i = 0; i < zzbbE.length; i++)
            {
                zzbcl zzbcl = zzbbE[i];
                if (zzbcl != null)
                {
                    zzrq1.zza(9, zzbcl);
                }
            }

        }
        if (zzbbF != null && zzbbF.length > 0)
        {
            for (int j = 0; j < zzbbF.length; j++)
            {
                zzbcl zzbcl1 = zzbbF[j];
                if (zzbcl1 != null)
                {
                    zzrq1.zza(10, zzbcl1);
                }
            }

        }
        if (zzbbG != null && zzbbG.length > 0)
        {
            for (int k = 0; k < zzbbG.length; k++)
            {
                String s = zzbbG[k];
                if (s != null)
                {
                    zzrq1.zzb(11, s);
                }
            }

        }
        if (zzbbH != null && zzbbH.length > 0)
        {
            for (int l = 0; l < zzbbH.length; l++)
            {
                zzrq1.zzb(12, zzbbH[l]);
            }

        }
        if (zzbbJ != 0L)
        {
            zzrq1.zzb(13, zzbbJ);
        }
        if (zzbbI != null && zzbbI.length > 0)
        {
            for (int i1 = ((flag) ? 1 : 0); i1 < zzbbI.length; i1++)
            {
                zzrq1.zzb(14, zzbbI[i1]);
            }

        }
        super.zza(zzrq1);
    }

    public zzrx zzb(zzrp zzrp1)
        throws IOException
    {
        return zzy(zzrp1);
    }

    public zzy zzy(zzrp zzrp1)
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
                zzbbw = zzrp1.readBytes();
                break;

            case 18: // '\022'
                zzbbx = zzrp1.readString();
                break;

            case 25: // '\031'
                zzbby = zzrp1.readDouble();
                break;

            case 37: // '%'
                zzbbz = zzrp1.readFloat();
                break;

            case 40: // '('
                zzbbA = zzrp1.zzCV();
                break;

            case 48: // '0'
                zzbbB = zzrp1.zzCW();
                break;

            case 56: // '8'
                zzbbC = zzrp1.zzCY();
                break;

            case 64: // '@'
                zzbbD = zzrp1.zzCX();
                break;

            case 74: // 'J'
                int i2 = zzsa.zzb(zzrp1, 74);
                zzy azzy[];
                int j;
                if (zzbbE == null)
                {
                    j = 0;
                } else
                {
                    j = zzbbE.length;
                }
                azzy = new zzbbE[i2 + j];
                i2 = j;
                if (j != 0)
                {
                    System.arraycopy(zzbbE, 0, azzy, 0, j);
                    i2 = j;
                }
                for (; i2 < azzy.length - 1; i2++)
                {
                    azzy[i2] = new zzbbE();
                    zzrp1.zza(azzy[i2]);
                    zzrp1.zzCT();
                }

                azzy[i2] = new zzbbE();
                zzrp1.zza(azzy[i2]);
                zzbbE = azzy;
                break;

            case 82: // 'R'
                int j2 = zzsa.zzb(zzrp1, 82);
                zzy azzy1[];
                int k;
                if (zzbbF == null)
                {
                    k = 0;
                } else
                {
                    k = zzbbF.length;
                }
                azzy1 = new zzbbF[j2 + k];
                j2 = k;
                if (k != 0)
                {
                    System.arraycopy(zzbbF, 0, azzy1, 0, k);
                    j2 = k;
                }
                for (; j2 < azzy1.length - 1; j2++)
                {
                    azzy1[j2] = new t>();
                    zzrp1.zza(azzy1[j2]);
                    zzrp1.zzCT();
                }

                azzy1[j2] = new t>();
                zzrp1.zza(azzy1[j2]);
                zzbbF = azzy1;
                break;

            case 90: // 'Z'
                int k2 = zzsa.zzb(zzrp1, 90);
                String as[];
                int l;
                if (zzbbG == null)
                {
                    l = 0;
                } else
                {
                    l = zzbbG.length;
                }
                as = new String[k2 + l];
                k2 = l;
                if (l != 0)
                {
                    System.arraycopy(zzbbG, 0, as, 0, l);
                    k2 = l;
                }
                for (; k2 < as.length - 1; k2++)
                {
                    as[k2] = zzrp1.readString();
                    zzrp1.zzCT();
                }

                as[k2] = zzrp1.readString();
                zzbbG = as;
                break;

            case 96: // '`'
                int l2 = zzsa.zzb(zzrp1, 96);
                long al[];
                int i1;
                if (zzbbH == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = zzbbH.length;
                }
                al = new long[l2 + i1];
                l2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(zzbbH, 0, al, 0, i1);
                    l2 = i1;
                }
                for (; l2 < al.length - 1; l2++)
                {
                    al[l2] = zzrp1.zzCV();
                    zzrp1.zzCT();
                }

                al[l2] = zzrp1.zzCV();
                zzbbH = al;
                break;

            case 98: // 'b'
                int l3 = zzrp1.zzll(zzrp1.zzDa());
                int j1 = zzrp1.getPosition();
                int i3;
                for (i3 = 0; zzrp1.zzDf() > 0; i3++)
                {
                    zzrp1.zzCV();
                }

                zzrp1.zzln(j1);
                long al1[];
                if (zzbbH == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = zzbbH.length;
                }
                al1 = new long[i3 + j1];
                i3 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(zzbbH, 0, al1, 0, j1);
                    i3 = j1;
                }
                for (; i3 < al1.length; i3++)
                {
                    al1[i3] = zzrp1.zzCV();
                }

                zzbbH = al1;
                zzrp1.zzlm(l3);
                break;

            case 104: // 'h'
                zzbbJ = zzrp1.zzCV();
                break;

            case 117: // 'u'
                int j3 = zzsa.zzb(zzrp1, 117);
                float af[];
                int k1;
                if (zzbbI == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = zzbbI.length;
                }
                af = new float[j3 + k1];
                j3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(zzbbI, 0, af, 0, k1);
                    j3 = k1;
                }
                for (; j3 < af.length - 1; j3++)
                {
                    af[j3] = zzrp1.readFloat();
                    zzrp1.zzCT();
                }

                af[j3] = zzrp1.readFloat();
                zzbbI = af;
                break;

            case 114: // 'r'
                int l1 = zzrp1.zzDa();
                int i4 = zzrp1.zzll(l1);
                int k3 = l1 / 4;
                float af1[];
                if (zzbbI == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = zzbbI.length;
                }
                af1 = new float[k3 + l1];
                k3 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(zzbbI, 0, af1, 0, l1);
                    k3 = l1;
                }
                for (; k3 < af1.length; k3++)
                {
                    af1[k3] = zzrp1.readFloat();
                }

                zzbbI = af1;
                zzrp1.zzlm(i4);
                break;
            }
        } while (true);
    }

    public ()
    {
        zzCR();
    }
}
