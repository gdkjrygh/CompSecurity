// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzrl, zzrg, zzrf, 
//            zzrq, zzrn

public interface zzrr
{
    public static final class zza extends zzrh
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
                if (obj instanceof zza)
                {
                    obj = (zza)obj;
                    flag = flag1;
                    if (zzrl.equals(zzaWp, ((zza) (obj)).zzaWp))
                    {
                        flag = flag1;
                        if (zzrl.equals(zzaWq, ((zza) (obj)).zzaWq))
                        {
                            flag = flag1;
                            if (zzrl.equals(zzaWr, ((zza) (obj)).zzaWr))
                            {
                                flag = flag1;
                                if (zzrl.equals(zzaWs, ((zza) (obj)).zzaWs))
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

        public zza zzB(zzrf zzrf1)
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

        public zza zzBW()
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

        public zza()
        {
            zzBW();
        }
    }

    public static final class zzb extends zzrh
    {

        public String version;
        public int zzaWt;
        public String zzaWu;

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
            if (!(obj instanceof zzb)) goto _L4; else goto _L3
_L3:
            obj = (zzb)obj;
            flag = flag1;
            if (zzaWt != ((zzb) (obj)).zzaWt) goto _L4; else goto _L5
_L5:
            if (zzaWu != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((zzb) (obj)).zzaWu != null) goto _L4; else goto _L8
_L8:
            if (version != null)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            flag = flag1;
            if (((zzb) (obj)).version != null) goto _L4; else goto _L9
_L9:
            return zza(((zzrh) (obj)));
_L7:
            if (!zzaWu.equals(((zzb) (obj)).zzaWu))
            {
                return false;
            }
              goto _L8
            if (!version.equals(((zzb) (obj)).version))
            {
                return false;
            }
              goto _L9
        }

        public int hashCode()
        {
            int j = 0;
            int k = zzaWt;
            int i;
            if (zzaWu == null)
            {
                i = 0;
            } else
            {
                i = zzaWu.hashCode();
            }
            if (version != null)
            {
                j = version.hashCode();
            }
            return ((i + (k + 527) * 31) * 31 + j) * 31 + zzBI();
        }

        protected int zzB()
        {
            int j = super.zzB();
            int i = j;
            if (zzaWt != 0)
            {
                i = j + zzrg.zzA(1, zzaWt);
            }
            j = i;
            if (!zzaWu.equals(""))
            {
                j = i + zzrg.zzk(2, zzaWu);
            }
            i = j;
            if (!version.equals(""))
            {
                i = j + zzrg.zzk(3, version);
            }
            return i;
        }

        public zzb zzBX()
        {
            zzaWt = 0;
            zzaWu = "";
            version = "";
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public zzb zzC(zzrf zzrf1)
            throws IOException
        {
_L6:
            int i = zzrf1.zzBr();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       8: 59
        //                       18: 199
        //                       26: 210;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (zza(zzrf1, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            int j = zzrf1.zzBu();
            switch (j)
            {
            case 0: // '\0'
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
            case 18: // '\022'
            case 19: // '\023'
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
            case 23: // '\027'
            case 24: // '\030'
            case 25: // '\031'
            case 26: // '\032'
                zzaWt = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            zzaWu = zzrf1.readString();
            continue; /* Loop/switch isn't completed */
_L5:
            version = zzrf1.readString();
            if (true) goto _L6; else goto _L7
_L7:
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            if (zzaWt != 0)
            {
                zzrg1.zzy(1, zzaWt);
            }
            if (!zzaWu.equals(""))
            {
                zzrg1.zzb(2, zzaWu);
            }
            if (!version.equals(""))
            {
                zzrg1.zzb(3, version);
            }
            super.zza(zzrg1);
        }

        public zzrn zzb(zzrf zzrf1)
            throws IOException
        {
            return zzC(zzrf1);
        }

        public zzb()
        {
            zzBX();
        }
    }

    public static final class zzc extends zzrh
    {

        public byte zzaWv[];
        public byte zzaWw[][];
        public boolean zzaWx;

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
                if (obj instanceof zzc)
                {
                    obj = (zzc)obj;
                    flag = flag1;
                    if (Arrays.equals(zzaWv, ((zzc) (obj)).zzaWv))
                    {
                        flag = flag1;
                        if (zzrl.zza(zzaWw, ((zzc) (obj)).zzaWw))
                        {
                            flag = flag1;
                            if (zzaWx == ((zzc) (obj)).zzaWx)
                            {
                                return zza(((zzrh) (obj)));
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            int i = Arrays.hashCode(zzaWv);
            int j = zzrl.zza(zzaWw);
            char c;
            if (zzaWx)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            return (c + ((i + 527) * 31 + j) * 31) * 31 + zzBI();
        }

        protected int zzB()
        {
            boolean flag = false;
            int j = super.zzB();
            int i = j;
            if (!Arrays.equals(zzaWv, zzrq.zzaWo))
            {
                i = j + zzrg.zzb(1, zzaWv);
            }
            j = i;
            if (zzaWw != null)
            {
                j = i;
                if (zzaWw.length > 0)
                {
                    int k = 0;
                    int l = 0;
                    for (j = ((flag) ? 1 : 0); j < zzaWw.length;)
                    {
                        byte abyte0[] = zzaWw[j];
                        int j1 = k;
                        int i1 = l;
                        if (abyte0 != null)
                        {
                            i1 = l + 1;
                            j1 = k + zzrg.zzC(abyte0);
                        }
                        j++;
                        k = j1;
                        l = i1;
                    }

                    j = i + k + l * 1;
                }
            }
            i = j;
            if (zzaWx)
            {
                i = j + zzrg.zzc(3, zzaWx);
            }
            return i;
        }

        public zzc zzBY()
        {
            zzaWv = zzrq.zzaWo;
            zzaWw = zzrq.zzaWn;
            zzaWx = false;
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public zzc zzD(zzrf zzrf1)
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
                    zzaWv = zzrf1.readBytes();
                    break;

                case 18: // '\022'
                    int k = zzrq.zzb(zzrf1, 18);
                    byte abyte0[][];
                    int j;
                    if (zzaWw == null)
                    {
                        j = 0;
                    } else
                    {
                        j = zzaWw.length;
                    }
                    abyte0 = new byte[k + j][];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(zzaWw, 0, abyte0, 0, j);
                        k = j;
                    }
                    for (; k < abyte0.length - 1; k++)
                    {
                        abyte0[k] = zzrf1.readBytes();
                        zzrf1.zzBr();
                    }

                    abyte0[k] = zzrf1.readBytes();
                    zzaWw = abyte0;
                    break;

                case 24: // '\030'
                    zzaWx = zzrf1.zzBv();
                    break;
                }
            } while (true);
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            if (!Arrays.equals(zzaWv, zzrq.zzaWo))
            {
                zzrg1.zza(1, zzaWv);
            }
            if (zzaWw != null && zzaWw.length > 0)
            {
                for (int i = 0; i < zzaWw.length; i++)
                {
                    byte abyte0[] = zzaWw[i];
                    if (abyte0 != null)
                    {
                        zzrg1.zza(2, abyte0);
                    }
                }

            }
            if (zzaWx)
            {
                zzrg1.zzb(3, zzaWx);
            }
            super.zza(zzrg1);
        }

        public zzrn zzb(zzrf zzrf1)
            throws IOException
        {
            return zzD(zzrf1);
        }

        public zzc()
        {
            zzBY();
        }
    }

    public static final class zzd extends zzrh
    {

        public String tag;
        public int zzaWA;
        public int zzaWB;
        public boolean zzaWC;
        public zze zzaWD[];
        public zzb zzaWE;
        public byte zzaWF[];
        public byte zzaWG[];
        public byte zzaWH[];
        public zza zzaWI;
        public String zzaWJ;
        public long zzaWK;
        public zzc zzaWL;
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
            if (!(obj instanceof zzd)) goto _L4; else goto _L3
_L3:
            obj = (zzd)obj;
            flag = flag1;
            if (zzaWy != ((zzd) (obj)).zzaWy) goto _L4; else goto _L5
_L5:
            flag = flag1;
            if (zzaWz != ((zzd) (obj)).zzaWz) goto _L4; else goto _L6
_L6:
            if (tag != null) goto _L8; else goto _L7
_L7:
            flag = flag1;
            if (((zzd) (obj)).tag != null) goto _L4; else goto _L9
_L9:
            flag = flag1;
            if (zzaWA != ((zzd) (obj)).zzaWA) goto _L4; else goto _L10
_L10:
            flag = flag1;
            if (zzaWB != ((zzd) (obj)).zzaWB) goto _L4; else goto _L11
_L11:
            flag = flag1;
            if (zzaWC != ((zzd) (obj)).zzaWC) goto _L4; else goto _L12
_L12:
            flag = flag1;
            if (!zzrl.equals(zzaWD, ((zzd) (obj)).zzaWD)) goto _L4; else goto _L13
_L13:
            if (zzaWE != null) goto _L15; else goto _L14
_L14:
            flag = flag1;
            if (((zzd) (obj)).zzaWE != null) goto _L4; else goto _L16
_L16:
            flag = flag1;
            if (!Arrays.equals(zzaWF, ((zzd) (obj)).zzaWF)) goto _L4; else goto _L17
_L17:
            flag = flag1;
            if (!Arrays.equals(zzaWG, ((zzd) (obj)).zzaWG)) goto _L4; else goto _L18
_L18:
            flag = flag1;
            if (!Arrays.equals(zzaWH, ((zzd) (obj)).zzaWH)) goto _L4; else goto _L19
_L19:
            if (zzaWI != null) goto _L21; else goto _L20
_L20:
            flag = flag1;
            if (((zzd) (obj)).zzaWI != null) goto _L4; else goto _L22
_L22:
            if (zzaWJ != null) goto _L24; else goto _L23
_L23:
            flag = flag1;
            if (((zzd) (obj)).zzaWJ != null) goto _L4; else goto _L25
_L25:
            flag = flag1;
            if (zzaWK != ((zzd) (obj)).zzaWK) goto _L4; else goto _L26
_L26:
            if (zzaWL != null)
            {
                break MISSING_BLOCK_LABEL_336;
            }
            flag = flag1;
            if (((zzd) (obj)).zzaWL != null) goto _L4; else goto _L27
_L27:
            flag = flag1;
            if (Arrays.equals(zzaWM, ((zzd) (obj)).zzaWM))
            {
                return zza(((zzrh) (obj)));
            }
              goto _L4
_L8:
            if (!tag.equals(((zzd) (obj)).tag))
            {
                return false;
            }
              goto _L9
_L15:
            if (!zzaWE.equals(((zzd) (obj)).zzaWE))
            {
                return false;
            }
              goto _L16
_L21:
            if (!zzaWI.equals(((zzd) (obj)).zzaWI))
            {
                return false;
            }
              goto _L22
_L24:
            if (!zzaWJ.equals(((zzd) (obj)).zzaWJ))
            {
                return false;
            }
              goto _L25
            if (!zzaWL.equals(((zzd) (obj)).zzaWL))
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
                        zze zze1 = zzaWD[j];
                        int k = i;
                        if (zze1 != null)
                        {
                            k = i + zzrg.zzc(3, zze1);
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

        public zzd zzBZ()
        {
            zzaWy = 0L;
            zzaWz = 0L;
            tag = "";
            zzaWA = 0;
            zzaWB = 0;
            zzaWC = false;
            zzaWD = zze.zzCa();
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

        public zzd zzE(zzrf zzrf1)
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
                    zze azze[];
                    int j;
                    if (zzaWD == null)
                    {
                        j = 0;
                    } else
                    {
                        j = zzaWD.length;
                    }
                    azze = new zze[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(zzaWD, 0, azze, 0, j);
                        k = j;
                    }
                    for (; k < azze.length - 1; k++)
                    {
                        azze[k] = new zze();
                        zzrf1.zza(azze[k]);
                        zzrf1.zzBr();
                    }

                    azze[k] = new zze();
                    zzrf1.zza(azze[k]);
                    zzaWD = azze;
                    break;

                case 50: // '2'
                    zzaWF = zzrf1.readBytes();
                    break;

                case 58: // ':'
                    if (zzaWI == null)
                    {
                        zzaWI = new zza();
                    }
                    zzrf1.zza(zzaWI);
                    break;

                case 66: // 'B'
                    zzaWG = zzrf1.readBytes();
                    break;

                case 74: // 'J'
                    if (zzaWE == null)
                    {
                        zzaWE = new zzb();
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
                        zzaWL = new zzc();
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
                    zze zze1 = zzaWD[i];
                    if (zze1 != null)
                    {
                        zzrg1.zza(3, zze1);
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

        public zzd()
        {
            zzBZ();
        }
    }

    public static final class zze extends zzrh
    {

        private static volatile zze zzaWN[];
        public String value;
        public String zzaC;

        public static zze[] zzCa()
        {
            if (zzaWN == null)
            {
                synchronized (zzrl.zzaWe)
                {
                    if (zzaWN == null)
                    {
                        zzaWN = new zze[0];
                    }
                }
            }
            return zzaWN;
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
            if (!(obj instanceof zze)) goto _L4; else goto _L3
_L3:
            obj = (zze)obj;
            if (zzaC != null) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (((zze) (obj)).zzaC != null) goto _L4; else goto _L7
_L7:
            if (value != null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            flag = flag1;
            if (((zze) (obj)).value != null) goto _L4; else goto _L8
_L8:
            return zza(((zzrh) (obj)));
_L6:
            if (!zzaC.equals(((zze) (obj)).zzaC))
            {
                return false;
            }
              goto _L7
            if (!value.equals(((zze) (obj)).value))
            {
                return false;
            }
              goto _L8
        }

        public int hashCode()
        {
            int j = 0;
            int i;
            if (zzaC == null)
            {
                i = 0;
            } else
            {
                i = zzaC.hashCode();
            }
            if (value != null)
            {
                j = value.hashCode();
            }
            return ((i + 527) * 31 + j) * 31 + zzBI();
        }

        protected int zzB()
        {
            int j = super.zzB();
            int i = j;
            if (!zzaC.equals(""))
            {
                i = j + zzrg.zzk(1, zzaC);
            }
            j = i;
            if (!value.equals(""))
            {
                j = i + zzrg.zzk(2, value);
            }
            return j;
        }

        public zze zzCb()
        {
            zzaC = "";
            value = "";
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public zze zzF(zzrf zzrf1)
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
                    zzaC = zzrf1.readString();
                    break;

                case 18: // '\022'
                    value = zzrf1.readString();
                    break;
                }
            } while (true);
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            if (!zzaC.equals(""))
            {
                zzrg1.zzb(1, zzaC);
            }
            if (!value.equals(""))
            {
                zzrg1.zzb(2, value);
            }
            super.zza(zzrg1);
        }

        public zzrn zzb(zzrf zzrf1)
            throws IOException
        {
            return zzF(zzrf1);
        }

        public zze()
        {
            zzCb();
        }
    }

}
