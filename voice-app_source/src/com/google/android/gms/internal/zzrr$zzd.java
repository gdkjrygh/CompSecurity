// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzrr, zzrl, zzrg, 
//            zzrq, zzrf, zzrn

public static final class zzBZ extends zzrh
{

    public String tag;
    public int zzaWA;
    public int zzaWB;
    public boolean zzaWC;
    public zzE zzaWD[];
    public zzE zzaWE;
    public byte zzaWF[];
    public byte zzaWG[];
    public byte zzaWH[];
    public zzE zzaWI;
    public String zzaWJ;
    public long zzaWK;
    public zzE zzaWL;
    public byte zzaWM[];
    public long zzaWy;
    public long zzaWz;

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
        if (!(obj instanceof zzBZ)) goto _L4; else goto _L3
_L3:
        obj = (zzBZ)obj;
        flag = flag1;
        if (zzaWy != ((zzaWy) (obj)).zzaWy) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (zzaWz != ((zzaWz) (obj)).zzaWz) goto _L4; else goto _L6
_L6:
        if (tag != null) goto _L8; else goto _L7
_L7:
        flag = flag1;
        if (((tag) (obj)).tag != null) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (zzaWA != ((zzaWA) (obj)).zzaWA) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (zzaWB != ((zzaWB) (obj)).zzaWB) goto _L4; else goto _L11
_L11:
        flag = flag1;
        if (zzaWC != ((zzaWC) (obj)).zzaWC) goto _L4; else goto _L12
_L12:
        flag = flag1;
        if (!zzrl.equals(zzaWD, ((zzaWD) (obj)).zzaWD)) goto _L4; else goto _L13
_L13:
        if (zzaWE != null) goto _L15; else goto _L14
_L14:
        flag = flag1;
        if (((zzaWE) (obj)).zzaWE != null) goto _L4; else goto _L16
_L16:
        flag = flag1;
        if (!Arrays.equals(zzaWF, ((zzaWF) (obj)).zzaWF)) goto _L4; else goto _L17
_L17:
        flag = flag1;
        if (!Arrays.equals(zzaWG, ((zzaWG) (obj)).zzaWG)) goto _L4; else goto _L18
_L18:
        flag = flag1;
        if (!Arrays.equals(zzaWH, ((zzaWH) (obj)).zzaWH)) goto _L4; else goto _L19
_L19:
        if (zzaWI != null) goto _L21; else goto _L20
_L20:
        flag = flag1;
        if (((zzaWI) (obj)).zzaWI != null) goto _L4; else goto _L22
_L22:
        if (zzaWJ != null) goto _L24; else goto _L23
_L23:
        flag = flag1;
        if (((zzaWJ) (obj)).zzaWJ != null) goto _L4; else goto _L25
_L25:
        flag = flag1;
        if (zzaWK != ((zzaWK) (obj)).zzaWK) goto _L4; else goto _L26
_L26:
        if (zzaWL != null)
        {
            break MISSING_BLOCK_LABEL_336;
        }
        flag = flag1;
        if (((zzaWL) (obj)).zzaWL != null) goto _L4; else goto _L27
_L27:
        flag = flag1;
        if (Arrays.equals(zzaWM, ((zzaWM) (obj)).zzaWM))
        {
            return zza(((zzrh) (obj)));
        }
          goto _L4
_L8:
        if (!tag.equals(((tag) (obj)).tag))
        {
            return false;
        }
          goto _L9
_L15:
        if (!zzaWE.equals(((equals) (obj)).zzaWE))
        {
            return false;
        }
          goto _L16
_L21:
        if (!zzaWI.equals(((equals) (obj)).zzaWI))
        {
            return false;
        }
          goto _L22
_L24:
        if (!zzaWJ.equals(((zzaWJ) (obj)).zzaWJ))
        {
            return false;
        }
          goto _L25
        if (!zzaWL.equals(((equals) (obj)).zzaWL))
        {
            return false;
        }
          goto _L27
    }

    public int hashCode()
    {
        int i1 = 0;
        int j1 = (int)(zzaWy ^ zzaWy >>> 32);
        int k1 = (int)(zzaWz ^ zzaWz >>> 32);
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
        l1 = zzaWA;
        i2 = zzaWB;
        if (zzaWC)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        j2 = zzrl.hashCode(zzaWD);
        if (zzaWE == null)
        {
            j = 0;
        } else
        {
            j = zzaWE.hashCode();
        }
        k2 = Arrays.hashCode(zzaWF);
        l2 = Arrays.hashCode(zzaWG);
        i3 = Arrays.hashCode(zzaWH);
        if (zzaWI == null)
        {
            k = 0;
        } else
        {
            k = zzaWI.hashCode();
        }
        if (zzaWJ == null)
        {
            l = 0;
        } else
        {
            l = zzaWJ.hashCode();
        }
        j3 = (int)(zzaWK ^ zzaWK >>> 32);
        if (zzaWL != null)
        {
            i1 = zzaWL.hashCode();
        }
        return ((((l + (k + ((((j + ((c + (((i + ((j1 + 527) * 31 + k1) * 31) * 31 + l1) * 31 + i2) * 31) * 31 + j2) * 31) * 31 + k2) * 31 + l2) * 31 + i3) * 31) * 31) * 31 + j3) * 31 + i1) * 31 + Arrays.hashCode(zzaWM)) * 31 + zzBI();
    }

    protected int zzB()
    {
        int i = super.zzB();
        int j = i;
        if (zzaWy != 0L)
        {
            j = i + zzrg.zzd(1, zzaWy);
        }
        i = j;
        if (!tag.equals(""))
        {
            i = j + zzrg.zzk(2, tag);
        }
        j = i;
        if (zzaWD != null)
        {
            j = i;
            if (zzaWD.length > 0)
            {
                for (j = 0; j < zzaWD.length;)
                {
                    zzBI zzbi = zzaWD[j];
                    int k = i;
                    if (zzbi != null)
                    {
                        k = i + zzrg.zzc(3, zzbi);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (!Arrays.equals(zzaWF, zzrq.zzaWo))
        {
            i = j + zzrg.zzb(6, zzaWF);
        }
        j = i;
        if (zzaWI != null)
        {
            j = i + zzrg.zzc(7, zzaWI);
        }
        i = j;
        if (!Arrays.equals(zzaWG, zzrq.zzaWo))
        {
            i = j + zzrg.zzb(8, zzaWG);
        }
        j = i;
        if (zzaWE != null)
        {
            j = i + zzrg.zzc(9, zzaWE);
        }
        i = j;
        if (zzaWC)
        {
            i = j + zzrg.zzc(10, zzaWC);
        }
        j = i;
        if (zzaWA != 0)
        {
            j = i + zzrg.zzA(11, zzaWA);
        }
        i = j;
        if (zzaWB != 0)
        {
            i = j + zzrg.zzA(12, zzaWB);
        }
        j = i;
        if (!Arrays.equals(zzaWH, zzrq.zzaWo))
        {
            j = i + zzrg.zzb(13, zzaWH);
        }
        i = j;
        if (!zzaWJ.equals(""))
        {
            i = j + zzrg.zzk(14, zzaWJ);
        }
        j = i;
        if (zzaWK != 0x2bf20L)
        {
            j = i + zzrg.zze(15, zzaWK);
        }
        i = j;
        if (zzaWL != null)
        {
            i = j + zzrg.zzc(16, zzaWL);
        }
        j = i;
        if (zzaWz != 0L)
        {
            j = i + zzrg.zzd(17, zzaWz);
        }
        i = j;
        if (!Arrays.equals(zzaWM, zzrq.zzaWo))
        {
            i = j + zzrg.zzb(18, zzaWM);
        }
        return i;
    }

    public zzaWM zzBZ()
    {
        zzaWy = 0L;
        zzaWz = 0L;
        tag = "";
        zzaWA = 0;
        zzaWB = 0;
        zzaWC = false;
        zzaWD = zzCa();
        zzaWE = null;
        zzaWF = zzrq.zzaWo;
        zzaWG = zzrq.zzaWo;
        zzaWH = zzrq.zzaWo;
        zzaWI = null;
        zzaWJ = "";
        zzaWK = 0x2bf20L;
        zzaWL = null;
        zzaWM = zzrq.zzaWo;
        zzaVU = null;
        zzaWf = -1;
        return this;
    }

    public zzaWf zzE(zzrf zzrf1)
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
                zzaWy = zzrf1.zzBt();
                break;

            case 18: // '\022'
                tag = zzrf1.readString();
                break;

            case 26: // '\032'
                int k = zzrq.zzb(zzrf1, 26);
                zzaWf azzawf[];
                int j;
                if (zzaWD == null)
                {
                    j = 0;
                } else
                {
                    j = zzaWD.length;
                }
                azzawf = new zzaWD[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(zzaWD, 0, azzawf, 0, j);
                    k = j;
                }
                for (; k < azzawf.length - 1; k++)
                {
                    azzawf[k] = new <init>();
                    zzrf1.zza(azzawf[k]);
                    zzrf1.zzBr();
                }

                azzawf[k] = new <init>();
                zzrf1.zza(azzawf[k]);
                zzaWD = azzawf;
                break;

            case 50: // '2'
                zzaWF = zzrf1.readBytes();
                break;

            case 58: // ':'
                if (zzaWI == null)
                {
                    zzaWI = new <init>();
                }
                zzrf1.zza(zzaWI);
                break;

            case 66: // 'B'
                zzaWG = zzrf1.readBytes();
                break;

            case 74: // 'J'
                if (zzaWE == null)
                {
                    zzaWE = new <init>();
                }
                zzrf1.zza(zzaWE);
                break;

            case 80: // 'P'
                zzaWC = zzrf1.zzBv();
                break;

            case 88: // 'X'
                zzaWA = zzrf1.zzBu();
                break;

            case 96: // '`'
                zzaWB = zzrf1.zzBu();
                break;

            case 106: // 'j'
                zzaWH = zzrf1.readBytes();
                break;

            case 114: // 'r'
                zzaWJ = zzrf1.readString();
                break;

            case 120: // 'x'
                zzaWK = zzrf1.zzBx();
                break;

            case 130: 
                if (zzaWL == null)
                {
                    zzaWL = new <init>();
                }
                zzrf1.zza(zzaWL);
                break;

            case 136: 
                zzaWz = zzrf1.zzBt();
                break;

            case 146: 
                zzaWM = zzrf1.readBytes();
                break;
            }
        } while (true);
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        if (zzaWy != 0L)
        {
            zzrg1.zzb(1, zzaWy);
        }
        if (!tag.equals(""))
        {
            zzrg1.zzb(2, tag);
        }
        if (zzaWD != null && zzaWD.length > 0)
        {
            for (int i = 0; i < zzaWD.length; i++)
            {
                Bytes bytes = zzaWD[i];
                if (bytes != null)
                {
                    zzrg1.zza(3, bytes);
                }
            }

        }
        if (!Arrays.equals(zzaWF, zzrq.zzaWo))
        {
            zzrg1.zza(6, zzaWF);
        }
        if (zzaWI != null)
        {
            zzrg1.zza(7, zzaWI);
        }
        if (!Arrays.equals(zzaWG, zzrq.zzaWo))
        {
            zzrg1.zza(8, zzaWG);
        }
        if (zzaWE != null)
        {
            zzrg1.zza(9, zzaWE);
        }
        if (zzaWC)
        {
            zzrg1.zzb(10, zzaWC);
        }
        if (zzaWA != 0)
        {
            zzrg1.zzy(11, zzaWA);
        }
        if (zzaWB != 0)
        {
            zzrg1.zzy(12, zzaWB);
        }
        if (!Arrays.equals(zzaWH, zzrq.zzaWo))
        {
            zzrg1.zza(13, zzaWH);
        }
        if (!zzaWJ.equals(""))
        {
            zzrg1.zzb(14, zzaWJ);
        }
        if (zzaWK != 0x2bf20L)
        {
            zzrg1.zzc(15, zzaWK);
        }
        if (zzaWL != null)
        {
            zzrg1.zza(16, zzaWL);
        }
        if (zzaWz != 0L)
        {
            zzrg1.zzb(17, zzaWz);
        }
        if (!Arrays.equals(zzaWM, zzrq.zzaWo))
        {
            zzrg1.zza(18, zzaWM);
        }
        super.zza(zzrg1);
    }

    public zzrn zzb(zzrf zzrf1)
        throws IOException
    {
        return zzE(zzrf1);
    }

    public ()
    {
        zzBZ();
    }
}
