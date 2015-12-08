// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrr, zzag, zzrv, zzrq, 
//            zzsa, zzrp, zzrx

public static final class zzR extends zzrr
{

    private static volatile  zziT[];
    public int type;
    public String zziU;
    public  zziV[];
    public  zziW[];
    public  zziX[];
    public String zziY;
    public String zziZ;
    public long zzja;
    public boolean zzjb;
    public  zzjc[];
    public int zzjd[];
    public boolean zzje;

    public static zzR[] zzQ()
    {
        if (zziT == null)
        {
            synchronized (zzrv.zzbck)
            {
                if (zziT == null)
                {
                    zziT = new zziT[0];
                }
            }
        }
        return zziT;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

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
        if (!(obj instanceof zziT)) goto _L4; else goto _L3
_L3:
        obj = (zziT)obj;
        flag = flag1;
        if (type != ((type) (obj)).type) goto _L4; else goto _L5
_L5:
        if (zziU != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((zziU) (obj)).zziU != null) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (!zzrv.equals(zziV, ((zziV) (obj)).zziV)) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (!zzrv.equals(zziW, ((zziW) (obj)).zziW)) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (!zzrv.equals(zziX, ((zziX) (obj)).zziX)) goto _L4; else goto _L11
_L11:
        if (zziY != null) goto _L13; else goto _L12
_L12:
        flag = flag1;
        if (((zziY) (obj)).zziY != null) goto _L4; else goto _L14
_L14:
        if (zziZ != null)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        flag = flag1;
        if (((zziZ) (obj)).zziZ != null) goto _L4; else goto _L15
_L15:
        flag = flag1;
        if (zzja == ((zzja) (obj)).zzja)
        {
            flag = flag1;
            if (zzjb == ((zzjb) (obj)).zzjb)
            {
                flag = flag1;
                if (zzrv.equals(zzjc, ((zzjc) (obj)).zzjc))
                {
                    flag = flag1;
                    if (zzrv.equals(zzjd, ((zzjd) (obj)).zzjd))
                    {
                        flag = flag1;
                        if (zzje == ((zzje) (obj)).zzje)
                        {
                            return zza(((zzrr) (obj)));
                        }
                    }
                }
            }
        }
          goto _L4
_L7:
        if (!zziU.equals(((zziU) (obj)).zziU))
        {
            return false;
        }
          goto _L8
_L13:
        if (!zziY.equals(((zziY) (obj)).zziY))
        {
            return false;
        }
          goto _L14
        if (!zziZ.equals(((zziZ) (obj)).zziZ))
        {
            return false;
        }
          goto _L15
    }

    public int hashCode()
    {
        char c1 = '\u04CF';
        int k = 0;
        int l = type;
        int i;
        int j;
        char c;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        if (zziU == null)
        {
            i = 0;
        } else
        {
            i = zziU.hashCode();
        }
        i1 = zzrv.hashCode(zziV);
        j1 = zzrv.hashCode(zziW);
        k1 = zzrv.hashCode(zziX);
        if (zziY == null)
        {
            j = 0;
        } else
        {
            j = zziY.hashCode();
        }
        if (zziZ != null)
        {
            k = zziZ.hashCode();
        }
        l1 = (int)(zzja ^ zzja >>> 32);
        if (zzjb)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        i2 = zzrv.hashCode(zzjc);
        j2 = zzrv.hashCode(zzjd);
        if (!zzje)
        {
            c1 = '\u04D5';
        }
        return ((((c + (((j + ((((i + (l + 527) * 31) * 31 + i1) * 31 + j1) * 31 + k1) * 31) * 31 + k) * 31 + l1) * 31) * 31 + i2) * 31 + j2) * 31 + c1) * 31 + zzDk();
    }

    protected int zzB()
    {
        boolean flag = false;
        int j = super.zzB() + zzrq.zzB(1, type);
        int i = j;
        if (!zziU.equals(""))
        {
            i = j + zzrq.zzl(2, zziU);
        }
        j = i;
        if (zziV != null)
        {
            j = i;
            if (zziV.length > 0)
            {
                for (j = 0; j < zziV.length;)
                {
                    zzDk zzdk = zziV[j];
                    int k = i;
                    if (zzdk != null)
                    {
                        k = i + zzrq.zzc(3, zzdk);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (zziW != null)
        {
            i = j;
            if (zziW.length > 0)
            {
                i = j;
                for (j = 0; j < zziW.length;)
                {
                    zzDk zzdk1 = zziW[j];
                    int l = i;
                    if (zzdk1 != null)
                    {
                        l = i + zzrq.zzc(4, zzdk1);
                    }
                    j++;
                    i = l;
                }

            }
        }
        j = i;
        if (zziX != null)
        {
            j = i;
            if (zziX.length > 0)
            {
                for (j = 0; j < zziX.length;)
                {
                    zzDk zzdk2 = zziX[j];
                    int i1 = i;
                    if (zzdk2 != null)
                    {
                        i1 = i + zzrq.zzc(5, zzdk2);
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
        }
        i = j;
        if (!zziY.equals(""))
        {
            i = j + zzrq.zzl(6, zziY);
        }
        j = i;
        if (!zziZ.equals(""))
        {
            j = i + zzrq.zzl(7, zziZ);
        }
        i = j;
        if (zzja != 0L)
        {
            i = j + zzrq.zzd(8, zzja);
        }
        j = i;
        if (zzje)
        {
            j = i + zzrq.zzc(9, zzje);
        }
        i = j;
        if (zzjd != null)
        {
            i = j;
            if (zzjd.length > 0)
            {
                i = 0;
                int j1 = 0;
                for (; i < zzjd.length; i++)
                {
                    j1 += zzrq.zzls(zzjd[i]);
                }

                i = j + j1 + zzjd.length * 1;
            }
        }
        j = i;
        if (zzjc != null)
        {
            j = i;
            if (zzjc.length > 0)
            {
                int k1 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (k1 >= zzjc.length)
                    {
                        break;
                    }
                    zzDk zzdk3 = zzjc[k1];
                    j = i;
                    if (zzdk3 != null)
                    {
                        j = i + zzrq.zzc(11, zzdk3);
                    }
                    k1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (zzjb)
        {
            i = j + zzrq.zzc(12, zzjb);
        }
        return i;
    }

    public zzjb zzR()
    {
        type = 1;
        zziU = "";
        zziV = zzQ();
        zziW = zzQ();
        zziX = zzQ();
        zziY = "";
        zziZ = "";
        zzja = 0L;
        zzjb = false;
        zzjc = zzQ();
        zzjd = zzsa.zzbcn;
        zzje = false;
        zzbca = null;
        zzbcl = -1;
        return this;
    }

    public void zza(zzrq zzrq1)
        throws IOException
    {
        boolean flag = false;
        zzrq1.zzz(1, type);
        if (!zziU.equals(""))
        {
            zzrq1.zzb(2, zziU);
        }
        if (zziV != null && zziV.length > 0)
        {
            for (int i = 0; i < zziV.length; i++)
            {
                zzbcl zzbcl = zziV[i];
                if (zzbcl != null)
                {
                    zzrq1.zza(3, zzbcl);
                }
            }

        }
        if (zziW != null && zziW.length > 0)
        {
            for (int j = 0; j < zziW.length; j++)
            {
                zzbcl zzbcl1 = zziW[j];
                if (zzbcl1 != null)
                {
                    zzrq1.zza(4, zzbcl1);
                }
            }

        }
        if (zziX != null && zziX.length > 0)
        {
            for (int k = 0; k < zziX.length; k++)
            {
                zzbcl zzbcl2 = zziX[k];
                if (zzbcl2 != null)
                {
                    zzrq1.zza(5, zzbcl2);
                }
            }

        }
        if (!zziY.equals(""))
        {
            zzrq1.zzb(6, zziY);
        }
        if (!zziZ.equals(""))
        {
            zzrq1.zzb(7, zziZ);
        }
        if (zzja != 0L)
        {
            zzrq1.zzb(8, zzja);
        }
        if (zzje)
        {
            zzrq1.zzb(9, zzje);
        }
        if (zzjd != null && zzjd.length > 0)
        {
            for (int l = 0; l < zzjd.length; l++)
            {
                zzrq1.zzz(10, zzjd[l]);
            }

        }
        if (zzjc != null && zzjc.length > 0)
        {
            for (int i1 = ((flag) ? 1 : 0); i1 < zzjc.length; i1++)
            {
                zzbcl zzbcl3 = zzjc[i1];
                if (zzbcl3 != null)
                {
                    zzrq1.zza(11, zzbcl3);
                }
            }

        }
        if (zzjb)
        {
            zzrq1.zzb(12, zzjb);
        }
        super.zza(zzrq1);
    }

    public zzrx zzb(zzrp zzrp1)
        throws IOException
    {
        return zzl(zzrp1);
    }

    public zzl zzl(zzrp zzrp1)
        throws IOException
    {
_L16:
        int i = zzrp1.zzCT();
        i;
        JVM INSTR lookupswitch 14: default 132
    //                   0: 142
    //                   8: 144
    //                   18: 212
    //                   26: 223
    //                   34: 354
    //                   42: 485
    //                   50: 616
    //                   58: 627
    //                   64: 638
    //                   72: 649
    //                   80: 660
    //                   82: 904
    //                   90: 1222
    //                   96: 1353;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        if (zza(zzrp1, i)) goto _L16; else goto _L2
_L2:
        return this;
_L3:
        i = zzrp1.zzCW();
        switch (i)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            type = i;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        zziU = zzrp1.readString();
        continue; /* Loop/switch isn't completed */
_L5:
        int k = zzsa.zzb(zzrp1, 26);
        zzl azzl[];
        if (zziV == null)
        {
            i = 0;
        } else
        {
            i = zziV.length;
        }
        azzl = new zziV[k + i];
        k = i;
        if (i != 0)
        {
            System.arraycopy(zziV, 0, azzl, 0, i);
            k = i;
        }
        for (; k < azzl.length - 1; k++)
        {
            azzl[k] = new <init>();
            zzrp1.zza(azzl[k]);
            zzrp1.zzCT();
        }

        azzl[k] = new <init>();
        zzrp1.zza(azzl[k]);
        zziV = azzl;
        continue; /* Loop/switch isn't completed */
_L6:
        int l = zzsa.zzb(zzrp1, 34);
        zzl azzl1[];
        if (zziW == null)
        {
            i = 0;
        } else
        {
            i = zziW.length;
        }
        azzl1 = new zziW[l + i];
        l = i;
        if (i != 0)
        {
            System.arraycopy(zziW, 0, azzl1, 0, i);
            l = i;
        }
        for (; l < azzl1.length - 1; l++)
        {
            azzl1[l] = new <init>();
            zzrp1.zza(azzl1[l]);
            zzrp1.zzCT();
        }

        azzl1[l] = new <init>();
        zzrp1.zza(azzl1[l]);
        zziW = azzl1;
        continue; /* Loop/switch isn't completed */
_L7:
        int i1 = zzsa.zzb(zzrp1, 42);
        zzl azzl2[];
        if (zziX == null)
        {
            i = 0;
        } else
        {
            i = zziX.length;
        }
        azzl2 = new zziX[i1 + i];
        i1 = i;
        if (i != 0)
        {
            System.arraycopy(zziX, 0, azzl2, 0, i);
            i1 = i;
        }
        for (; i1 < azzl2.length - 1; i1++)
        {
            azzl2[i1] = new <init>();
            zzrp1.zza(azzl2[i1]);
            zzrp1.zzCT();
        }

        azzl2[i1] = new <init>();
        zzrp1.zza(azzl2[i1]);
        zziX = azzl2;
        continue; /* Loop/switch isn't completed */
_L8:
        zziY = zzrp1.readString();
        continue; /* Loop/switch isn't completed */
_L9:
        zziZ = zzrp1.readString();
        continue; /* Loop/switch isn't completed */
_L10:
        zzja = zzrp1.zzCV();
        continue; /* Loop/switch isn't completed */
_L11:
        zzje = zzrp1.zzCX();
        continue; /* Loop/switch isn't completed */
_L12:
        int ai[];
        int j1;
        int j2;
        j2 = zzsa.zzb(zzrp1, 80);
        ai = new int[j2];
        j1 = 0;
        i = 0;
_L22:
        if (j1 >= j2) goto _L18; else goto _L17
_L17:
        int k2;
        if (j1 != 0)
        {
            zzrp1.zzCT();
        }
        k2 = zzrp1.zzCW();
        k2;
        JVM INSTR tableswitch 1 17: default 788
    //                   1 797
    //                   2 797
    //                   3 797
    //                   4 797
    //                   5 797
    //                   6 797
    //                   7 797
    //                   8 797
    //                   9 797
    //                   10 797
    //                   11 797
    //                   12 797
    //                   13 797
    //                   14 797
    //                   15 797
    //                   16 797
    //                   17 797;
           goto _L19 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20
_L19:
        j1++;
        continue; /* Loop/switch isn't completed */
_L20:
        int l1 = i + 1;
        ai[i] = k2;
        i = l1;
        if (true) goto _L19; else goto _L18
_L18:
        if (i != 0)
        {
            if (zzjd == null)
            {
                j1 = 0;
            } else
            {
                j1 = zzjd.length;
            }
            if (j1 == 0 && i == ai.length)
            {
                zzjd = ai;
            } else
            {
                int ai1[] = new int[j1 + i];
                if (j1 != 0)
                {
                    System.arraycopy(zzjd, 0, ai1, 0, j1);
                }
                System.arraycopy(ai, 0, ai1, j1, i);
                zzjd = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L22; else goto _L21
_L21:
_L13:
        int i2;
        i2 = zzrp1.zzll(zzrp1.zzDa());
        i = zzrp1.getPosition();
        j1 = 0;
_L28:
        if (zzrp1.zzDf() > 0)
        {
            switch (zzrp1.zzCW())
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
            case 17: // '\021'
                j1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j1 == 0) goto _L24; else goto _L23
_L23:
        zzrp1.zzln(i);
        if (zzjd == null)
        {
            i = 0;
        } else
        {
            i = zzjd.length;
        }
        ai = new int[j1 + i];
        j1 = i;
        if (i != 0)
        {
            System.arraycopy(zzjd, 0, ai, 0, i);
            j1 = i;
        }
_L26:
        if (zzrp1.zzDf() > 0)
        {
            i = zzrp1.zzCW();
            switch (i)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
            case 17: // '\021'
                ai[j1] = i;
                j1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        zzjd = ai;
_L24:
        zzrp1.zzlm(i2);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L26; else goto _L25
_L25:
        if (true) goto _L28; else goto _L27
_L27:
_L14:
        int k1 = zzsa.zzb(zzrp1, 90);
        zzl azzl3[];
        int j;
        if (zzjc == null)
        {
            j = 0;
        } else
        {
            j = zzjc.length;
        }
        azzl3 = new zzjc[k1 + j];
        k1 = j;
        if (j != 0)
        {
            System.arraycopy(zzjc, 0, azzl3, 0, j);
            k1 = j;
        }
        for (; k1 < azzl3.length - 1; k1++)
        {
            azzl3[k1] = new <init>();
            zzrp1.zza(azzl3[k1]);
            zzrp1.zzCT();
        }

        azzl3[k1] = new <init>();
        zzrp1.zza(azzl3[k1]);
        zzjc = azzl3;
        continue; /* Loop/switch isn't completed */
_L15:
        zzjb = zzrp1.zzCX();
        if (true) goto _L16; else goto _L29
_L29:
    }

    public ()
    {
        zzR();
    }
}
