// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            zzrr, zzrv, zzrq, zzrp, 
//            zzsa, zzrx

public interface zzsb
{
    public static final class zza extends zzrr
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
                if (obj instanceof zza)
                {
                    obj = (zza)obj;
                    flag = flag1;
                    if (zzrv.equals(zzbcv, ((zza) (obj)).zzbcv))
                    {
                        flag = flag1;
                        if (zzrv.equals(zzbcw, ((zza) (obj)).zzbcw))
                        {
                            flag = flag1;
                            if (zzrv.equals(zzbcx, ((zza) (obj)).zzbcx))
                            {
                                flag = flag1;
                                if (zzrv.equals(zzbcy, ((zza) (obj)).zzbcy))
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

        public zza zzB(zzrp zzrp1)
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

        public zza zzDy()
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

        public zza()
        {
            zzDy();
        }
    }

    public static final class zzb extends zzrr
    {

        public String version;
        public String zzbcA;
        public int zzbcz;

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
            if (zzbcz != ((zzb) (obj)).zzbcz) goto _L4; else goto _L5
_L5:
            if (zzbcA != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((zzb) (obj)).zzbcA != null) goto _L4; else goto _L8
_L8:
            if (version != null)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            flag = flag1;
            if (((zzb) (obj)).version != null) goto _L4; else goto _L9
_L9:
            return zza(((zzrr) (obj)));
_L7:
            if (!zzbcA.equals(((zzb) (obj)).zzbcA))
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
            int k = zzbcz;
            int i;
            if (zzbcA == null)
            {
                i = 0;
            } else
            {
                i = zzbcA.hashCode();
            }
            if (version != null)
            {
                j = version.hashCode();
            }
            return ((i + (k + 527) * 31) * 31 + j) * 31 + zzDk();
        }

        protected int zzB()
        {
            int j = super.zzB();
            int i = j;
            if (zzbcz != 0)
            {
                i = j + zzrq.zzB(1, zzbcz);
            }
            j = i;
            if (!zzbcA.equals(""))
            {
                j = i + zzrq.zzl(2, zzbcA);
            }
            i = j;
            if (!version.equals(""))
            {
                i = j + zzrq.zzl(3, version);
            }
            return i;
        }

        public zzb zzC(zzrp zzrp1)
            throws IOException
        {
_L6:
            int i = zzrp1.zzCT();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       8: 59
        //                       18: 199
        //                       26: 210;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (zza(zzrp1, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            int j = zzrp1.zzCW();
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
                zzbcz = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            zzbcA = zzrp1.readString();
            continue; /* Loop/switch isn't completed */
_L5:
            version = zzrp1.readString();
            if (true) goto _L6; else goto _L7
_L7:
        }

        public zzb zzDz()
        {
            zzbcz = 0;
            zzbcA = "";
            version = "";
            zzbca = null;
            zzbcl = -1;
            return this;
        }

        public void zza(zzrq zzrq1)
            throws IOException
        {
            if (zzbcz != 0)
            {
                zzrq1.zzz(1, zzbcz);
            }
            if (!zzbcA.equals(""))
            {
                zzrq1.zzb(2, zzbcA);
            }
            if (!version.equals(""))
            {
                zzrq1.zzb(3, version);
            }
            super.zza(zzrq1);
        }

        public zzrx zzb(zzrp zzrp1)
            throws IOException
        {
            return zzC(zzrp1);
        }

        public zzb()
        {
            zzDz();
        }
    }

    public static final class zzc extends zzrr
    {

        public byte zzbcB[];
        public byte zzbcC[][];
        public boolean zzbcD;

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
                    if (Arrays.equals(zzbcB, ((zzc) (obj)).zzbcB))
                    {
                        flag = flag1;
                        if (zzrv.zza(zzbcC, ((zzc) (obj)).zzbcC))
                        {
                            flag = flag1;
                            if (zzbcD == ((zzc) (obj)).zzbcD)
                            {
                                return zza(((zzrr) (obj)));
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            int i = Arrays.hashCode(zzbcB);
            int j = zzrv.zza(zzbcC);
            char c;
            if (zzbcD)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            return (c + ((i + 527) * 31 + j) * 31) * 31 + zzDk();
        }

        protected int zzB()
        {
            boolean flag = false;
            int j = super.zzB();
            int i = j;
            if (!Arrays.equals(zzbcB, zzsa.zzbcu))
            {
                i = j + zzrq.zzb(1, zzbcB);
            }
            j = i;
            if (zzbcC != null)
            {
                j = i;
                if (zzbcC.length > 0)
                {
                    int k = 0;
                    int l = 0;
                    for (j = ((flag) ? 1 : 0); j < zzbcC.length;)
                    {
                        byte abyte0[] = zzbcC[j];
                        int j1 = k;
                        int i1 = l;
                        if (abyte0 != null)
                        {
                            i1 = l + 1;
                            j1 = k + zzrq.zzC(abyte0);
                        }
                        j++;
                        k = j1;
                        l = i1;
                    }

                    j = i + k + l * 1;
                }
            }
            i = j;
            if (zzbcD)
            {
                i = j + zzrq.zzc(3, zzbcD);
            }
            return i;
        }

        public zzc zzD(zzrp zzrp1)
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
                    zzbcB = zzrp1.readBytes();
                    break;

                case 18: // '\022'
                    int k = zzsa.zzb(zzrp1, 18);
                    byte abyte0[][];
                    int j;
                    if (zzbcC == null)
                    {
                        j = 0;
                    } else
                    {
                        j = zzbcC.length;
                    }
                    abyte0 = new byte[k + j][];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(zzbcC, 0, abyte0, 0, j);
                        k = j;
                    }
                    for (; k < abyte0.length - 1; k++)
                    {
                        abyte0[k] = zzrp1.readBytes();
                        zzrp1.zzCT();
                    }

                    abyte0[k] = zzrp1.readBytes();
                    zzbcC = abyte0;
                    break;

                case 24: // '\030'
                    zzbcD = zzrp1.zzCX();
                    break;
                }
            } while (true);
        }

        public zzc zzDA()
        {
            zzbcB = zzsa.zzbcu;
            zzbcC = zzsa.zzbct;
            zzbcD = false;
            zzbca = null;
            zzbcl = -1;
            return this;
        }

        public void zza(zzrq zzrq1)
            throws IOException
        {
            if (!Arrays.equals(zzbcB, zzsa.zzbcu))
            {
                zzrq1.zza(1, zzbcB);
            }
            if (zzbcC != null && zzbcC.length > 0)
            {
                for (int i = 0; i < zzbcC.length; i++)
                {
                    byte abyte0[] = zzbcC[i];
                    if (abyte0 != null)
                    {
                        zzrq1.zza(2, abyte0);
                    }
                }

            }
            if (zzbcD)
            {
                zzrq1.zzb(3, zzbcD);
            }
            super.zza(zzrq1);
        }

        public zzrx zzb(zzrp zzrp1)
            throws IOException
        {
            return zzD(zzrp1);
        }

        public zzc()
        {
            zzDA();
        }
    }

    public static final class zzd extends zzrr
    {

        public String tag;
        public long zzbcE;
        public long zzbcF;
        public int zzbcG;
        public int zzbcH;
        public boolean zzbcI;
        public zze zzbcJ[];
        public zzb zzbcK;
        public byte zzbcL[];
        public byte zzbcM[];
        public byte zzbcN[];
        public zza zzbcO;
        public String zzbcP;
        public long zzbcQ;
        public zzc zzbcR;
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
            if (!(obj instanceof zzd)) goto _L4; else goto _L3
_L3:
            obj = (zzd)obj;
            flag = flag1;
            if (zzbcE != ((zzd) (obj)).zzbcE) goto _L4; else goto _L5
_L5:
            flag = flag1;
            if (zzbcF != ((zzd) (obj)).zzbcF) goto _L4; else goto _L6
_L6:
            if (tag != null) goto _L8; else goto _L7
_L7:
            flag = flag1;
            if (((zzd) (obj)).tag != null) goto _L4; else goto _L9
_L9:
            flag = flag1;
            if (zzbcG != ((zzd) (obj)).zzbcG) goto _L4; else goto _L10
_L10:
            flag = flag1;
            if (zzbcH != ((zzd) (obj)).zzbcH) goto _L4; else goto _L11
_L11:
            flag = flag1;
            if (zzbcI != ((zzd) (obj)).zzbcI) goto _L4; else goto _L12
_L12:
            flag = flag1;
            if (!zzrv.equals(zzbcJ, ((zzd) (obj)).zzbcJ)) goto _L4; else goto _L13
_L13:
            if (zzbcK != null) goto _L15; else goto _L14
_L14:
            flag = flag1;
            if (((zzd) (obj)).zzbcK != null) goto _L4; else goto _L16
_L16:
            flag = flag1;
            if (!Arrays.equals(zzbcL, ((zzd) (obj)).zzbcL)) goto _L4; else goto _L17
_L17:
            flag = flag1;
            if (!Arrays.equals(zzbcM, ((zzd) (obj)).zzbcM)) goto _L4; else goto _L18
_L18:
            flag = flag1;
            if (!Arrays.equals(zzbcN, ((zzd) (obj)).zzbcN)) goto _L4; else goto _L19
_L19:
            if (zzbcO != null) goto _L21; else goto _L20
_L20:
            flag = flag1;
            if (((zzd) (obj)).zzbcO != null) goto _L4; else goto _L22
_L22:
            if (zzbcP != null) goto _L24; else goto _L23
_L23:
            flag = flag1;
            if (((zzd) (obj)).zzbcP != null) goto _L4; else goto _L25
_L25:
            flag = flag1;
            if (zzbcQ != ((zzd) (obj)).zzbcQ) goto _L4; else goto _L26
_L26:
            if (zzbcR != null)
            {
                break MISSING_BLOCK_LABEL_365;
            }
            flag = flag1;
            if (((zzd) (obj)).zzbcR != null) goto _L4; else goto _L27
_L27:
            flag = flag1;
            if (Arrays.equals(zzbcS, ((zzd) (obj)).zzbcS))
            {
                flag = flag1;
                if (zzbcT == ((zzd) (obj)).zzbcT)
                {
                    flag = flag1;
                    if (zzrv.equals(zzbcU, ((zzd) (obj)).zzbcU))
                    {
                        return zza(((zzrr) (obj)));
                    }
                }
            }
              goto _L4
_L8:
            if (!tag.equals(((zzd) (obj)).tag))
            {
                return false;
            }
              goto _L9
_L15:
            if (!zzbcK.equals(((zzd) (obj)).zzbcK))
            {
                return false;
            }
              goto _L16
_L21:
            if (!zzbcO.equals(((zzd) (obj)).zzbcO))
            {
                return false;
            }
              goto _L22
_L24:
            if (!zzbcP.equals(((zzd) (obj)).zzbcP))
            {
                return false;
            }
              goto _L25
            if (!zzbcR.equals(((zzd) (obj)).zzbcR))
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
                        zze zze1 = zzbcJ[j];
                        int k = i;
                        if (zze1 != null)
                        {
                            k = i + zzrq.zzc(3, zze1);
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

        public zzd zzDB()
        {
            zzbcE = 0L;
            zzbcF = 0L;
            tag = "";
            zzbcG = 0;
            zzbcH = 0;
            zzbcI = false;
            zzbcJ = zze.zzDC();
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

        public zzd zzE(zzrp zzrp1)
            throws IOException
        {
_L22:
            int i = zzrp1.zzCT();
            i;
            JVM INSTR lookupswitch 20: default 176
        //                       0: 185
        //                       8: 187
        //                       18: 198
        //                       26: 209
        //                       50: 333
        //                       58: 344
        //                       66: 373
        //                       74: 384
        //                       80: 413
        //                       88: 424
        //                       96: 435
        //                       106: 446
        //                       114: 457
        //                       120: 468
        //                       130: 479
        //                       136: 508
        //                       146: 519
        //                       152: 530
        //                       160: 575
        //                       162: 677;
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
            zze azze[];
            int j;
            if (zzbcJ == null)
            {
                j = 0;
            } else
            {
                j = zzbcJ.length;
            }
            azze = new zze[j1 + j];
            j1 = j;
            if (j != 0)
            {
                System.arraycopy(zzbcJ, 0, azze, 0, j);
                j1 = j;
            }
            for (; j1 < azze.length - 1; j1++)
            {
                azze[j1] = new zze();
                zzrp1.zza(azze[j1]);
                zzrp1.zzCT();
            }

            azze[j1] = new zze();
            zzrp1.zza(azze[j1]);
            zzbcJ = azze;
              goto _L22
_L6:
            zzbcL = zzrp1.readBytes();
              goto _L22
_L7:
            if (zzbcO == null)
            {
                zzbcO = new zza();
            }
            zzrp1.zza(zzbcO);
              goto _L22
_L8:
            zzbcM = zzrp1.readBytes();
              goto _L22
_L9:
            if (zzbcK == null)
            {
                zzbcK = new zzb();
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
                zzbcR = new zzc();
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
                    zze zze1 = zzbcJ[i];
                    if (zze1 != null)
                    {
                        zzrq1.zza(3, zze1);
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

        public zzd()
        {
            zzDB();
        }
    }

    public static final class zze extends zzrr
    {

        private static volatile zze zzbcV[];
        public String key;
        public String value;

        public static zze[] zzDC()
        {
            if (zzbcV == null)
            {
                synchronized (zzrv.zzbck)
                {
                    if (zzbcV == null)
                    {
                        zzbcV = new zze[0];
                    }
                }
            }
            return zzbcV;
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
            if (key != null) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (((zze) (obj)).key != null) goto _L4; else goto _L7
_L7:
            if (value != null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            flag = flag1;
            if (((zze) (obj)).value != null) goto _L4; else goto _L8
_L8:
            return zza(((zzrr) (obj)));
_L6:
            if (!key.equals(((zze) (obj)).key))
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
            if (key == null)
            {
                i = 0;
            } else
            {
                i = key.hashCode();
            }
            if (value != null)
            {
                j = value.hashCode();
            }
            return ((i + 527) * 31 + j) * 31 + zzDk();
        }

        protected int zzB()
        {
            int j = super.zzB();
            int i = j;
            if (!key.equals(""))
            {
                i = j + zzrq.zzl(1, key);
            }
            j = i;
            if (!value.equals(""))
            {
                j = i + zzrq.zzl(2, value);
            }
            return j;
        }

        public zze zzDD()
        {
            key = "";
            value = "";
            zzbca = null;
            zzbcl = -1;
            return this;
        }

        public zze zzF(zzrp zzrp1)
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
                    key = zzrp1.readString();
                    break;

                case 18: // '\022'
                    value = zzrp1.readString();
                    break;
                }
            } while (true);
        }

        public void zza(zzrq zzrq1)
            throws IOException
        {
            if (!key.equals(""))
            {
                zzrq1.zzb(1, key);
            }
            if (!value.equals(""))
            {
                zzrq1.zzb(2, value);
            }
            super.zza(zzrq1);
        }

        public zzrx zzb(zzrp zzrp1)
            throws IOException
        {
            return zzF(zzrp1);
        }

        public zze()
        {
            zzDD();
        }
    }

}
