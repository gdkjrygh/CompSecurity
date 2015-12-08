// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            zzrr, zzsb, zzrv, zzrq, 
//            zzsa, zzrp, zzrx

public static final class zzDB extends zzrr
{

    public String tag;
    public long zzbcE;
    public long zzbcF;
    public int zzbcG;
    public int zzbcH;
    public boolean zzbcI;
    public zzE zzbcJ[];
    public zzE zzbcK;
    public byte zzbcL[];
    public byte zzbcM[];
    public byte zzbcN[];
    public zzE zzbcO;
    public String zzbcP;
    public long zzbcQ;
    public zzE zzbcR;
    public byte zzbcS[];
    public int zzbcT;
    public int zzbcU[];

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
        if (!(obj instanceof zzDB)) goto _L4; else goto _L3
_L3:
        obj = (zzDB)obj;
        flag = flag1;
        if (zzbcE != ((zzbcE) (obj)).zzbcE) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (zzbcF != ((zzbcF) (obj)).zzbcF) goto _L4; else goto _L6
_L6:
        if (tag != null) goto _L8; else goto _L7
_L7:
        flag = flag1;
        if (((tag) (obj)).tag != null) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (zzbcG != ((zzbcG) (obj)).zzbcG) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (zzbcH != ((zzbcH) (obj)).zzbcH) goto _L4; else goto _L11
_L11:
        flag = flag1;
        if (zzbcI != ((zzbcI) (obj)).zzbcI) goto _L4; else goto _L12
_L12:
        flag = flag1;
        if (!zzrv.equals(zzbcJ, ((zzbcJ) (obj)).zzbcJ)) goto _L4; else goto _L13
_L13:
        if (zzbcK != null) goto _L15; else goto _L14
_L14:
        flag = flag1;
        if (((zzbcK) (obj)).zzbcK != null) goto _L4; else goto _L16
_L16:
        flag = flag1;
        if (!Arrays.equals(zzbcL, ((zzbcL) (obj)).zzbcL)) goto _L4; else goto _L17
_L17:
        flag = flag1;
        if (!Arrays.equals(zzbcM, ((zzbcM) (obj)).zzbcM)) goto _L4; else goto _L18
_L18:
        flag = flag1;
        if (!Arrays.equals(zzbcN, ((zzbcN) (obj)).zzbcN)) goto _L4; else goto _L19
_L19:
        if (zzbcO != null) goto _L21; else goto _L20
_L20:
        flag = flag1;
        if (((zzbcO) (obj)).zzbcO != null) goto _L4; else goto _L22
_L22:
        if (zzbcP != null) goto _L24; else goto _L23
_L23:
        flag = flag1;
        if (((zzbcP) (obj)).zzbcP != null) goto _L4; else goto _L25
_L25:
        flag = flag1;
        if (zzbcQ != ((zzbcQ) (obj)).zzbcQ) goto _L4; else goto _L26
_L26:
        if (zzbcR != null)
        {
            break MISSING_BLOCK_LABEL_365;
        }
        flag = flag1;
        if (((zzbcR) (obj)).zzbcR != null) goto _L4; else goto _L27
_L27:
        flag = flag1;
        if (Arrays.equals(zzbcS, ((zzbcS) (obj)).zzbcS))
        {
            flag = flag1;
            if (zzbcT == ((zzbcT) (obj)).zzbcT)
            {
                flag = flag1;
                if (zzrv.equals(zzbcU, ((zzbcU) (obj)).zzbcU))
                {
                    return zza(((zzrr) (obj)));
                }
            }
        }
          goto _L4
_L8:
        if (!tag.equals(((tag) (obj)).tag))
        {
            return false;
        }
          goto _L9
_L15:
        if (!zzbcK.equals(((equals) (obj)).zzbcK))
        {
            return false;
        }
          goto _L16
_L21:
        if (!zzbcO.equals(((equals) (obj)).zzbcO))
        {
            return false;
        }
          goto _L22
_L24:
        if (!zzbcP.equals(((zzbcP) (obj)).zzbcP))
        {
            return false;
        }
          goto _L25
        if (!zzbcR.equals(((equals) (obj)).zzbcR))
        {
            return false;
        }
          goto _L27
    }

    public int hashCode()
    {
        int i1 = 0;
        int j1 = (int)(zzbcE ^ zzbcE >>> 32);
        int k1 = (int)(zzbcF ^ zzbcF >>> 32);
        int i;
        char c;
        int j;
        int k;
        int l;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        if (tag == null)
        {
            i = 0;
        } else
        {
            i = tag.hashCode();
        }
        l1 = zzbcG;
        i2 = zzbcH;
        if (zzbcI)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        j2 = zzrv.hashCode(zzbcJ);
        if (zzbcK == null)
        {
            j = 0;
        } else
        {
            j = zzbcK.hashCode();
        }
        k2 = Arrays.hashCode(zzbcL);
        l2 = Arrays.hashCode(zzbcM);
        i3 = Arrays.hashCode(zzbcN);
        if (zzbcO == null)
        {
            k = 0;
        } else
        {
            k = zzbcO.hashCode();
        }
        if (zzbcP == null)
        {
            l = 0;
        } else
        {
            l = zzbcP.hashCode();
        }
        j3 = (int)(zzbcQ ^ zzbcQ >>> 32);
        if (zzbcR != null)
        {
            i1 = zzbcR.hashCode();
        }
        return ((((((l + (k + ((((j + ((c + (((i + ((j1 + 527) * 31 + k1) * 31) * 31 + l1) * 31 + i2) * 31) * 31 + j2) * 31) * 31 + k2) * 31 + l2) * 31 + i3) * 31) * 31) * 31 + j3) * 31 + i1) * 31 + Arrays.hashCode(zzbcS)) * 31 + zzbcT) * 31 + zzrv.hashCode(zzbcU)) * 31 + zzDk();
    }

    protected int zzB()
    {
        boolean flag = false;
        int i = super.zzB();
        int j = i;
        if (zzbcE != 0L)
        {
            j = i + zzrq.zzd(1, zzbcE);
        }
        i = j;
        if (!tag.equals(""))
        {
            i = j + zzrq.zzl(2, tag);
        }
        j = i;
        if (zzbcJ != null)
        {
            j = i;
            if (zzbcJ.length > 0)
            {
                for (j = 0; j < zzbcJ.length;)
                {
                    zzDk zzdk = zzbcJ[j];
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
        if (!Arrays.equals(zzbcL, zzsa.zzbcu))
        {
            i = j + zzrq.zzb(6, zzbcL);
        }
        j = i;
        if (zzbcO != null)
        {
            j = i + zzrq.zzc(7, zzbcO);
        }
        i = j;
        if (!Arrays.equals(zzbcM, zzsa.zzbcu))
        {
            i = j + zzrq.zzb(8, zzbcM);
        }
        j = i;
        if (zzbcK != null)
        {
            j = i + zzrq.zzc(9, zzbcK);
        }
        i = j;
        if (zzbcI)
        {
            i = j + zzrq.zzc(10, zzbcI);
        }
        j = i;
        if (zzbcG != 0)
        {
            j = i + zzrq.zzB(11, zzbcG);
        }
        i = j;
        if (zzbcH != 0)
        {
            i = j + zzrq.zzB(12, zzbcH);
        }
        j = i;
        if (!Arrays.equals(zzbcN, zzsa.zzbcu))
        {
            j = i + zzrq.zzb(13, zzbcN);
        }
        i = j;
        if (!zzbcP.equals(""))
        {
            i = j + zzrq.zzl(14, zzbcP);
        }
        j = i;
        if (zzbcQ != 0x2bf20L)
        {
            j = i + zzrq.zze(15, zzbcQ);
        }
        i = j;
        if (zzbcR != null)
        {
            i = j + zzrq.zzc(16, zzbcR);
        }
        j = i;
        if (zzbcF != 0L)
        {
            j = i + zzrq.zzd(17, zzbcF);
        }
        int l = j;
        if (!Arrays.equals(zzbcS, zzsa.zzbcu))
        {
            l = j + zzrq.zzb(18, zzbcS);
        }
        i = l;
        if (zzbcT != 0)
        {
            i = l + zzrq.zzB(19, zzbcT);
        }
        j = i;
        if (zzbcU != null)
        {
            j = i;
            if (zzbcU.length > 0)
            {
                int i1 = 0;
                for (j = ((flag) ? 1 : 0); j < zzbcU.length; j++)
                {
                    i1 += zzrq.zzls(zzbcU[j]);
                }

                j = i + i1 + zzbcU.length * 2;
            }
        }
        return j;
    }

    public zzbcU zzDB()
    {
        zzbcE = 0L;
        zzbcF = 0L;
        tag = "";
        zzbcG = 0;
        zzbcH = 0;
        zzbcI = false;
        zzbcJ = zzDC();
        zzbcK = null;
        zzbcL = zzsa.zzbcu;
        zzbcM = zzsa.zzbcu;
        zzbcN = zzsa.zzbcu;
        zzbcO = null;
        zzbcP = "";
        zzbcQ = 0x2bf20L;
        zzbcR = null;
        zzbcS = zzsa.zzbcu;
        zzbcT = 0;
        zzbcU = zzsa.zzbcn;
        zzbca = null;
        zzbcl = -1;
        return this;
    }

    public zzbcl zzE(zzrp zzrp1)
        throws IOException
    {
_L22:
        int i = zzrp1.zzCT();
        i;
        JVM INSTR lookupswitch 20: default 176
    //                   0: 185
    //                   8: 187
    //                   18: 198
    //                   26: 209
    //                   50: 333
    //                   58: 344
    //                   66: 373
    //                   74: 384
    //                   80: 413
    //                   88: 424
    //                   96: 435
    //                   106: 446
    //                   114: 457
    //                   120: 468
    //                   130: 479
    //                   136: 508
    //                   146: 519
    //                   152: 530
    //                   160: 575
    //                   162: 677;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21
_L1:
        if (zza(zzrp1, i)) goto _L22; else goto _L2
_L2:
        return this;
_L3:
        zzbcE = zzrp1.zzCV();
          goto _L22
_L4:
        tag = zzrp1.readString();
          goto _L22
_L5:
        int j1 = zzsa.zzb(zzrp1, 26);
        zzbcl azzbcl[];
        int j;
        if (zzbcJ == null)
        {
            j = 0;
        } else
        {
            j = zzbcJ.length;
        }
        azzbcl = new zzbcJ[j1 + j];
        j1 = j;
        if (j != 0)
        {
            System.arraycopy(zzbcJ, 0, azzbcl, 0, j);
            j1 = j;
        }
        for (; j1 < azzbcl.length - 1; j1++)
        {
            azzbcl[j1] = new <init>();
            zzrp1.zza(azzbcl[j1]);
            zzrp1.zzCT();
        }

        azzbcl[j1] = new <init>();
        zzrp1.zza(azzbcl[j1]);
        zzbcJ = azzbcl;
          goto _L22
_L6:
        zzbcL = zzrp1.readBytes();
          goto _L22
_L7:
        if (zzbcO == null)
        {
            zzbcO = new <init>();
        }
        zzrp1.zza(zzbcO);
          goto _L22
_L8:
        zzbcM = zzrp1.readBytes();
          goto _L22
_L9:
        if (zzbcK == null)
        {
            zzbcK = new <init>();
        }
        zzrp1.zza(zzbcK);
          goto _L22
_L10:
        zzbcI = zzrp1.zzCX();
          goto _L22
_L11:
        zzbcG = zzrp1.zzCW();
          goto _L22
_L12:
        zzbcH = zzrp1.zzCW();
          goto _L22
_L13:
        zzbcN = zzrp1.readBytes();
          goto _L22
_L14:
        zzbcP = zzrp1.readString();
          goto _L22
_L15:
        zzbcQ = zzrp1.zzCZ();
          goto _L22
_L16:
        if (zzbcR == null)
        {
            zzbcR = new <init>();
        }
        zzrp1.zza(zzbcR);
          goto _L22
_L17:
        zzbcF = zzrp1.zzCV();
          goto _L22
_L18:
        zzbcS = zzrp1.readBytes();
          goto _L22
_L19:
        int k = zzrp1.zzCW();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            zzbcT = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L20:
        int k1 = zzsa.zzb(zzrp1, 160);
        int ai[];
        int l;
        if (zzbcU == null)
        {
            l = 0;
        } else
        {
            l = zzbcU.length;
        }
        ai = new int[k1 + l];
        k1 = l;
        if (l != 0)
        {
            System.arraycopy(zzbcU, 0, ai, 0, l);
            k1 = l;
        }
        for (; k1 < ai.length - 1; k1++)
        {
            ai[k1] = zzrp1.zzCW();
            zzrp1.zzCT();
        }

        ai[k1] = zzrp1.zzCW();
        zzbcU = ai;
        continue; /* Loop/switch isn't completed */
_L21:
        int i2 = zzrp1.zzll(zzrp1.zzDa());
        int i1 = zzrp1.getPosition();
        int l1;
        for (l1 = 0; zzrp1.zzDf() > 0; l1++)
        {
            zzrp1.zzCW();
        }

        zzrp1.zzln(i1);
        int ai1[];
        if (zzbcU == null)
        {
            i1 = 0;
        } else
        {
            i1 = zzbcU.length;
        }
        ai1 = new int[l1 + i1];
        l1 = i1;
        if (i1 != 0)
        {
            System.arraycopy(zzbcU, 0, ai1, 0, i1);
            l1 = i1;
        }
        for (; l1 < ai1.length; l1++)
        {
            ai1[l1] = zzrp1.zzCW();
        }

        zzbcU = ai1;
        zzrp1.zzlm(i2);
        if (true) goto _L22; else goto _L23
_L23:
    }

    public void zza(zzrq zzrq1)
        throws IOException
    {
        boolean flag = false;
        if (zzbcE != 0L)
        {
            zzrq1.zzb(1, zzbcE);
        }
        if (!tag.equals(""))
        {
            zzrq1.zzb(2, tag);
        }
        if (zzbcJ != null && zzbcJ.length > 0)
        {
            for (int i = 0; i < zzbcJ.length; i++)
            {
                  = zzbcJ[i];
                if ( != null)
                {
                    zzrq1.zza(3, );
                }
            }

        }
        if (!Arrays.equals(zzbcL, zzsa.zzbcu))
        {
            zzrq1.zza(6, zzbcL);
        }
        if (zzbcO != null)
        {
            zzrq1.zza(7, zzbcO);
        }
        if (!Arrays.equals(zzbcM, zzsa.zzbcu))
        {
            zzrq1.zza(8, zzbcM);
        }
        if (zzbcK != null)
        {
            zzrq1.zza(9, zzbcK);
        }
        if (zzbcI)
        {
            zzrq1.zzb(10, zzbcI);
        }
        if (zzbcG != 0)
        {
            zzrq1.zzz(11, zzbcG);
        }
        if (zzbcH != 0)
        {
            zzrq1.zzz(12, zzbcH);
        }
        if (!Arrays.equals(zzbcN, zzsa.zzbcu))
        {
            zzrq1.zza(13, zzbcN);
        }
        if (!zzbcP.equals(""))
        {
            zzrq1.zzb(14, zzbcP);
        }
        if (zzbcQ != 0x2bf20L)
        {
            zzrq1.zzc(15, zzbcQ);
        }
        if (zzbcR != null)
        {
            zzrq1.zza(16, zzbcR);
        }
        if (zzbcF != 0L)
        {
            zzrq1.zzb(17, zzbcF);
        }
        if (!Arrays.equals(zzbcS, zzsa.zzbcu))
        {
            zzrq1.zza(18, zzbcS);
        }
        if (zzbcT != 0)
        {
            zzrq1.zzz(19, zzbcT);
        }
        if (zzbcU != null && zzbcU.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < zzbcU.length; j++)
            {
                zzrq1.zzz(20, zzbcU[j]);
            }

        }
        super.zza(zzrq1);
    }

    public zzrx zzb(zzrp zzrp1)
        throws IOException
    {
        return zzE(zzrp1);
    }

    public ()
    {
        zzDB();
    }
}
