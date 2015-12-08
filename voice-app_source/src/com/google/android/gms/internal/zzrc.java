// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzrm, zzrn, zzrl, 
//            zzrg, zzrf, zzrq

public final class zzrc extends zzrh
{
    public static final class zza extends zzrh
    {

        private static volatile zza zzaVm[];
        public String name;
        public zza zzaVn;

        public static zza[] zzBl()
        {
            if (zzaVm == null)
            {
                synchronized (zzrl.zzaWe)
                {
                    if (zzaVm == null)
                    {
                        zzaVm = new zza[0];
                    }
                }
            }
            return zzaVm;
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
            if (!(obj instanceof zza)) goto _L4; else goto _L3
_L3:
            obj = (zza)obj;
            if (name != null) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (((zza) (obj)).name != null) goto _L4; else goto _L7
_L7:
            if (zzaVn != null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            flag = flag1;
            if (((zza) (obj)).zzaVn != null) goto _L4; else goto _L8
_L8:
            return zza(((zzrh) (obj)));
_L6:
            if (!name.equals(((zza) (obj)).name))
            {
                return false;
            }
              goto _L7
            if (!zzaVn.equals(((zza) (obj)).zzaVn))
            {
                return false;
            }
              goto _L8
        }

        public int hashCode()
        {
            int j = 0;
            int i;
            if (name == null)
            {
                i = 0;
            } else
            {
                i = name.hashCode();
            }
            if (zzaVn != null)
            {
                j = zzaVn.hashCode();
            }
            return ((i + 527) * 31 + j) * 31 + zzBI();
        }

        protected int zzB()
        {
            int j = super.zzB() + zzrg.zzk(1, name);
            int i = j;
            if (zzaVn != null)
            {
                i = j + zzrg.zzc(2, zzaVn);
            }
            return i;
        }

        public zza zzBm()
        {
            name = "";
            zzaVn = null;
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            zzrg1.zzb(1, name);
            if (zzaVn != null)
            {
                zzrg1.zza(2, zzaVn);
            }
            super.zza(zzrg1);
        }

        public zzrn zzb(zzrf zzrf1)
            throws IOException
        {
            return zzw(zzrf1);
        }

        public zza zzw(zzrf zzrf1)
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
                    name = zzrf1.readString();
                    break;

                case 18: // '\022'
                    if (zzaVn == null)
                    {
                        zzaVn = new zza();
                    }
                    zzrf1.zza(zzaVn);
                    break;
                }
            } while (true);
        }

        public zza()
        {
            zzBm();
        }
    }

    public static final class zza.zza extends zzrh
    {

        private static volatile zza.zza zzaVo[];
        public int type;
        public zza zzaVp;

        public static zza.zza[] zzBn()
        {
            if (zzaVo == null)
            {
                synchronized (zzrl.zzaWe)
                {
                    if (zzaVo == null)
                    {
                        zzaVo = new zza.zza[0];
                    }
                }
            }
            return zzaVo;
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
            if (!(obj instanceof zza.zza)) goto _L4; else goto _L3
_L3:
            obj = (zza.zza)obj;
            flag = flag1;
            if (type != ((zza.zza) (obj)).type) goto _L4; else goto _L5
_L5:
            if (zzaVp != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((zza.zza) (obj)).zzaVp != null) goto _L4; else goto _L8
_L8:
            return zza(((zzrh) (obj)));
_L7:
            if (!zzaVp.equals(((zza.zza) (obj)).zzaVp))
            {
                return false;
            }
            if (true) goto _L8; else goto _L9
_L9:
        }

        public int hashCode()
        {
            int j = type;
            int i;
            if (zzaVp == null)
            {
                i = 0;
            } else
            {
                i = zzaVp.hashCode();
            }
            return (i + (j + 527) * 31) * 31 + zzBI();
        }

        protected int zzB()
        {
            int j = super.zzB() + zzrg.zzA(1, type);
            int i = j;
            if (zzaVp != null)
            {
                i = j + zzrg.zzc(2, zzaVp);
            }
            return i;
        }

        public zza.zza zzBo()
        {
            type = 1;
            zzaVp = null;
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            zzrg1.zzy(1, type);
            if (zzaVp != null)
            {
                zzrg1.zza(2, zzaVp);
            }
            super.zza(zzrg1);
        }

        public zzrn zzb(zzrf zzrf1)
            throws IOException
        {
            return zzx(zzrf1);
        }

        public zza.zza zzx(zzrf zzrf1)
            throws IOException
        {
_L5:
            int i = zzrf1.zzBr();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 49
        //                       8: 51
        //                       18: 143;
               goto _L1 _L2 _L3 _L4
_L1:
            if (zza(zzrf1, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            int j = zzrf1.zzBu();
            switch (j)
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
                type = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (zzaVp == null)
            {
                zzaVp = new zza();
            }
            zzrf1.zza(zzaVp);
            if (true) goto _L5; else goto _L6
_L6:
        }

        public zza.zza()
        {
            zzBo();
        }
    }

    public static final class zza.zza.zza extends zzrh
    {

        public String zzaVA[];
        public long zzaVB[];
        public float zzaVC[];
        public long zzaVD;
        public byte zzaVq[];
        public String zzaVr;
        public double zzaVs;
        public float zzaVt;
        public long zzaVu;
        public int zzaVv;
        public int zzaVw;
        public boolean zzaVx;
        public zza zzaVy[];
        public zza.zza zzaVz[];

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
            if (!(obj instanceof zza.zza.zza))
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = (zza.zza.zza)obj;
            flag = flag1;
            if (!Arrays.equals(zzaVq, ((zza.zza.zza) (obj)).zzaVq))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (zzaVr != null)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (((zza.zza.zza) (obj)).zzaVr != null)
            {
                continue; /* Loop/switch isn't completed */
            }
_L5:
            flag = flag1;
            if (Double.doubleToLongBits(zzaVs) == Double.doubleToLongBits(((zza.zza.zza) (obj)).zzaVs))
            {
                flag = flag1;
                if (Float.floatToIntBits(zzaVt) == Float.floatToIntBits(((zza.zza.zza) (obj)).zzaVt))
                {
                    flag = flag1;
                    if (zzaVu == ((zza.zza.zza) (obj)).zzaVu)
                    {
                        flag = flag1;
                        if (zzaVv == ((zza.zza.zza) (obj)).zzaVv)
                        {
                            flag = flag1;
                            if (zzaVw == ((zza.zza.zza) (obj)).zzaVw)
                            {
                                flag = flag1;
                                if (zzaVx == ((zza.zza.zza) (obj)).zzaVx)
                                {
                                    flag = flag1;
                                    if (zzrl.equals(zzaVy, ((zza.zza.zza) (obj)).zzaVy))
                                    {
                                        flag = flag1;
                                        if (zzrl.equals(zzaVz, ((zza.zza.zza) (obj)).zzaVz))
                                        {
                                            flag = flag1;
                                            if (zzrl.equals(zzaVA, ((zza.zza.zza) (obj)).zzaVA))
                                            {
                                                flag = flag1;
                                                if (zzrl.equals(zzaVB, ((zza.zza.zza) (obj)).zzaVB))
                                                {
                                                    flag = flag1;
                                                    if (zzrl.equals(zzaVC, ((zza.zza.zza) (obj)).zzaVC))
                                                    {
                                                        flag = flag1;
                                                        if (zzaVD == ((zza.zza.zza) (obj)).zzaVD)
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
            if (true) goto _L4; else goto _L3
_L3:
            if (!zzaVr.equals(((zza.zza.zza) (obj)).zzaVr))
            {
                return false;
            }
              goto _L5
            if (true) goto _L4; else goto _L6
_L6:
        }

        public int hashCode()
        {
            int j = Arrays.hashCode(zzaVq);
            int i;
            char c;
            int k;
            int l;
            int i1;
            int j1;
            int k1;
            long l1;
            if (zzaVr == null)
            {
                i = 0;
            } else
            {
                i = zzaVr.hashCode();
            }
            l1 = Double.doubleToLongBits(zzaVs);
            k = (int)(l1 ^ l1 >>> 32);
            l = Float.floatToIntBits(zzaVt);
            i1 = (int)(zzaVu ^ zzaVu >>> 32);
            j1 = zzaVv;
            k1 = zzaVw;
            if (zzaVx)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            return (((((((c + ((((((i + (j + 527) * 31) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31) * 31 + zzrl.hashCode(zzaVy)) * 31 + zzrl.hashCode(zzaVz)) * 31 + zzrl.hashCode(zzaVA)) * 31 + zzrl.hashCode(zzaVB)) * 31 + zzrl.hashCode(zzaVC)) * 31 + (int)(zzaVD ^ zzaVD >>> 32)) * 31 + zzBI();
        }

        protected int zzB()
        {
            boolean flag = false;
            int j = super.zzB();
            int i = j;
            if (!Arrays.equals(zzaVq, zzrq.zzaWo))
            {
                i = j + zzrg.zzb(1, zzaVq);
            }
            j = i;
            if (!zzaVr.equals(""))
            {
                j = i + zzrg.zzk(2, zzaVr);
            }
            i = j;
            if (Double.doubleToLongBits(zzaVs) != Double.doubleToLongBits(0.0D))
            {
                i = j + zzrg.zzb(3, zzaVs);
            }
            j = i;
            if (Float.floatToIntBits(zzaVt) != Float.floatToIntBits(0.0F))
            {
                j = i + zzrg.zzc(4, zzaVt);
            }
            i = j;
            if (zzaVu != 0L)
            {
                i = j + zzrg.zzd(5, zzaVu);
            }
            j = i;
            if (zzaVv != 0)
            {
                j = i + zzrg.zzA(6, zzaVv);
            }
            int k = j;
            if (zzaVw != 0)
            {
                k = j + zzrg.zzB(7, zzaVw);
            }
            i = k;
            if (zzaVx)
            {
                i = k + zzrg.zzc(8, zzaVx);
            }
            j = i;
            if (zzaVy != null)
            {
                j = i;
                if (zzaVy.length > 0)
                {
                    for (j = 0; j < zzaVy.length;)
                    {
                        zza zza1 = zzaVy[j];
                        int l = i;
                        if (zza1 != null)
                        {
                            l = i + zzrg.zzc(9, zza1);
                        }
                        j++;
                        i = l;
                    }

                    j = i;
                }
            }
            i = j;
            if (zzaVz != null)
            {
                i = j;
                if (zzaVz.length > 0)
                {
                    i = j;
                    for (j = 0; j < zzaVz.length;)
                    {
                        zza.zza zza2 = zzaVz[j];
                        int i1 = i;
                        if (zza2 != null)
                        {
                            i1 = i + zzrg.zzc(10, zza2);
                        }
                        j++;
                        i = i1;
                    }

                }
            }
            j = i;
            if (zzaVA != null)
            {
                j = i;
                if (zzaVA.length > 0)
                {
                    j = 0;
                    int j1 = 0;
                    int l1;
                    int i2;
                    for (l1 = 0; j < zzaVA.length; l1 = i2)
                    {
                        String s = zzaVA[j];
                        int j2 = j1;
                        i2 = l1;
                        if (s != null)
                        {
                            i2 = l1 + 1;
                            j2 = j1 + zzrg.zzfj(s);
                        }
                        j++;
                        j1 = j2;
                    }

                    j = i + j1 + l1 * 1;
                }
            }
            i = j;
            if (zzaVB != null)
            {
                i = j;
                if (zzaVB.length > 0)
                {
                    int k1 = 0;
                    for (i = ((flag) ? 1 : 0); i < zzaVB.length; i++)
                    {
                        k1 += zzrg.zzY(zzaVB[i]);
                    }

                    i = j + k1 + zzaVB.length * 1;
                }
            }
            j = i;
            if (zzaVD != 0L)
            {
                j = i + zzrg.zzd(13, zzaVD);
            }
            i = j;
            if (zzaVC != null)
            {
                i = j;
                if (zzaVC.length > 0)
                {
                    i = j + zzaVC.length * 4 + zzaVC.length * 1;
                }
            }
            return i;
        }

        public zza.zza.zza zzBp()
        {
            zzaVq = zzrq.zzaWo;
            zzaVr = "";
            zzaVs = 0.0D;
            zzaVt = 0.0F;
            zzaVu = 0L;
            zzaVv = 0;
            zzaVw = 0;
            zzaVx = false;
            zzaVy = zza.zzBl();
            zzaVz = zza.zza.zzBn();
            zzaVA = zzrq.zzaWm;
            zzaVB = zzrq.zzaWi;
            zzaVC = zzrq.zzaWj;
            zzaVD = 0L;
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            boolean flag = false;
            if (!Arrays.equals(zzaVq, zzrq.zzaWo))
            {
                zzrg1.zza(1, zzaVq);
            }
            if (!zzaVr.equals(""))
            {
                zzrg1.zzb(2, zzaVr);
            }
            if (Double.doubleToLongBits(zzaVs) != Double.doubleToLongBits(0.0D))
            {
                zzrg1.zza(3, zzaVs);
            }
            if (Float.floatToIntBits(zzaVt) != Float.floatToIntBits(0.0F))
            {
                zzrg1.zzb(4, zzaVt);
            }
            if (zzaVu != 0L)
            {
                zzrg1.zzb(5, zzaVu);
            }
            if (zzaVv != 0)
            {
                zzrg1.zzy(6, zzaVv);
            }
            if (zzaVw != 0)
            {
                zzrg1.zzz(7, zzaVw);
            }
            if (zzaVx)
            {
                zzrg1.zzb(8, zzaVx);
            }
            if (zzaVy != null && zzaVy.length > 0)
            {
                for (int i = 0; i < zzaVy.length; i++)
                {
                    zza zza1 = zzaVy[i];
                    if (zza1 != null)
                    {
                        zzrg1.zza(9, zza1);
                    }
                }

            }
            if (zzaVz != null && zzaVz.length > 0)
            {
                for (int j = 0; j < zzaVz.length; j++)
                {
                    zza.zza zza2 = zzaVz[j];
                    if (zza2 != null)
                    {
                        zzrg1.zza(10, zza2);
                    }
                }

            }
            if (zzaVA != null && zzaVA.length > 0)
            {
                for (int k = 0; k < zzaVA.length; k++)
                {
                    String s = zzaVA[k];
                    if (s != null)
                    {
                        zzrg1.zzb(11, s);
                    }
                }

            }
            if (zzaVB != null && zzaVB.length > 0)
            {
                for (int l = 0; l < zzaVB.length; l++)
                {
                    zzrg1.zzb(12, zzaVB[l]);
                }

            }
            if (zzaVD != 0L)
            {
                zzrg1.zzb(13, zzaVD);
            }
            if (zzaVC != null && zzaVC.length > 0)
            {
                for (int i1 = ((flag) ? 1 : 0); i1 < zzaVC.length; i1++)
                {
                    zzrg1.zzb(14, zzaVC[i1]);
                }

            }
            super.zza(zzrg1);
        }

        public zzrn zzb(zzrf zzrf1)
            throws IOException
        {
            return zzy(zzrf1);
        }

        public zza.zza.zza zzy(zzrf zzrf1)
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
                    zzaVq = zzrf1.readBytes();
                    break;

                case 18: // '\022'
                    zzaVr = zzrf1.readString();
                    break;

                case 25: // '\031'
                    zzaVs = zzrf1.readDouble();
                    break;

                case 37: // '%'
                    zzaVt = zzrf1.readFloat();
                    break;

                case 40: // '('
                    zzaVu = zzrf1.zzBt();
                    break;

                case 48: // '0'
                    zzaVv = zzrf1.zzBu();
                    break;

                case 56: // '8'
                    zzaVw = zzrf1.zzBw();
                    break;

                case 64: // '@'
                    zzaVx = zzrf1.zzBv();
                    break;

                case 74: // 'J'
                    int i2 = zzrq.zzb(zzrf1, 74);
                    zza azza[];
                    int j;
                    if (zzaVy == null)
                    {
                        j = 0;
                    } else
                    {
                        j = zzaVy.length;
                    }
                    azza = new zza[i2 + j];
                    i2 = j;
                    if (j != 0)
                    {
                        System.arraycopy(zzaVy, 0, azza, 0, j);
                        i2 = j;
                    }
                    for (; i2 < azza.length - 1; i2++)
                    {
                        azza[i2] = new zza();
                        zzrf1.zza(azza[i2]);
                        zzrf1.zzBr();
                    }

                    azza[i2] = new zza();
                    zzrf1.zza(azza[i2]);
                    zzaVy = azza;
                    break;

                case 82: // 'R'
                    int j2 = zzrq.zzb(zzrf1, 82);
                    zza.zza azza1[];
                    int k;
                    if (zzaVz == null)
                    {
                        k = 0;
                    } else
                    {
                        k = zzaVz.length;
                    }
                    azza1 = new zza.zza[j2 + k];
                    j2 = k;
                    if (k != 0)
                    {
                        System.arraycopy(zzaVz, 0, azza1, 0, k);
                        j2 = k;
                    }
                    for (; j2 < azza1.length - 1; j2++)
                    {
                        azza1[j2] = new zza.zza();
                        zzrf1.zza(azza1[j2]);
                        zzrf1.zzBr();
                    }

                    azza1[j2] = new zza.zza();
                    zzrf1.zza(azza1[j2]);
                    zzaVz = azza1;
                    break;

                case 90: // 'Z'
                    int k2 = zzrq.zzb(zzrf1, 90);
                    String as[];
                    int l;
                    if (zzaVA == null)
                    {
                        l = 0;
                    } else
                    {
                        l = zzaVA.length;
                    }
                    as = new String[k2 + l];
                    k2 = l;
                    if (l != 0)
                    {
                        System.arraycopy(zzaVA, 0, as, 0, l);
                        k2 = l;
                    }
                    for (; k2 < as.length - 1; k2++)
                    {
                        as[k2] = zzrf1.readString();
                        zzrf1.zzBr();
                    }

                    as[k2] = zzrf1.readString();
                    zzaVA = as;
                    break;

                case 96: // '`'
                    int l2 = zzrq.zzb(zzrf1, 96);
                    long al[];
                    int i1;
                    if (zzaVB == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = zzaVB.length;
                    }
                    al = new long[l2 + i1];
                    l2 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(zzaVB, 0, al, 0, i1);
                        l2 = i1;
                    }
                    for (; l2 < al.length - 1; l2++)
                    {
                        al[l2] = zzrf1.zzBt();
                        zzrf1.zzBr();
                    }

                    al[l2] = zzrf1.zzBt();
                    zzaVB = al;
                    break;

                case 98: // 'b'
                    int l3 = zzrf1.zzkC(zzrf1.zzBy());
                    int j1 = zzrf1.getPosition();
                    int i3;
                    for (i3 = 0; zzrf1.zzBD() > 0; i3++)
                    {
                        zzrf1.zzBt();
                    }

                    zzrf1.zzkE(j1);
                    long al1[];
                    if (zzaVB == null)
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = zzaVB.length;
                    }
                    al1 = new long[i3 + j1];
                    i3 = j1;
                    if (j1 != 0)
                    {
                        System.arraycopy(zzaVB, 0, al1, 0, j1);
                        i3 = j1;
                    }
                    for (; i3 < al1.length; i3++)
                    {
                        al1[i3] = zzrf1.zzBt();
                    }

                    zzaVB = al1;
                    zzrf1.zzkD(l3);
                    break;

                case 104: // 'h'
                    zzaVD = zzrf1.zzBt();
                    break;

                case 117: // 'u'
                    int j3 = zzrq.zzb(zzrf1, 117);
                    float af[];
                    int k1;
                    if (zzaVC == null)
                    {
                        k1 = 0;
                    } else
                    {
                        k1 = zzaVC.length;
                    }
                    af = new float[j3 + k1];
                    j3 = k1;
                    if (k1 != 0)
                    {
                        System.arraycopy(zzaVC, 0, af, 0, k1);
                        j3 = k1;
                    }
                    for (; j3 < af.length - 1; j3++)
                    {
                        af[j3] = zzrf1.readFloat();
                        zzrf1.zzBr();
                    }

                    af[j3] = zzrf1.readFloat();
                    zzaVC = af;
                    break;

                case 114: // 'r'
                    int l1 = zzrf1.zzBy();
                    int i4 = zzrf1.zzkC(l1);
                    int k3 = l1 / 4;
                    float af1[];
                    if (zzaVC == null)
                    {
                        l1 = 0;
                    } else
                    {
                        l1 = zzaVC.length;
                    }
                    af1 = new float[k3 + l1];
                    k3 = l1;
                    if (l1 != 0)
                    {
                        System.arraycopy(zzaVC, 0, af1, 0, l1);
                        k3 = l1;
                    }
                    for (; k3 < af1.length; k3++)
                    {
                        af1[k3] = zzrf1.readFloat();
                    }

                    zzaVC = af1;
                    zzrf1.zzkD(i4);
                    break;
                }
            } while (true);
        }

        public zza.zza.zza()
        {
            zzBp();
        }
    }


    public zza zzaVl[];

    public zzrc()
    {
        zzBk();
    }

    public static zzrc zzw(byte abyte0[])
        throws zzrm
    {
        return (zzrc)zzrn.zza(new zzrc(), abyte0);
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
            if (obj instanceof zzrc)
            {
                obj = (zzrc)obj;
                flag = flag1;
                if (zzrl.equals(zzaVl, ((zzrc) (obj)).zzaVl))
                {
                    return zza(((zzrh) (obj)));
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (zzrl.hashCode(zzaVl) + 527) * 31 + zzBI();
    }

    protected int zzB()
    {
        int i = super.zzB();
        int k = i;
        if (zzaVl != null)
        {
            k = i;
            if (zzaVl.length > 0)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= zzaVl.length)
                    {
                        break;
                    }
                    zza zza1 = zzaVl[j];
                    k = i;
                    if (zza1 != null)
                    {
                        k = i + zzrg.zzc(1, zza1);
                    }
                    j++;
                    i = k;
                } while (true);
            }
        }
        return k;
    }

    public zzrc zzBk()
    {
        zzaVl = zza.zzBl();
        zzaVU = null;
        zzaWf = -1;
        return this;
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        if (zzaVl != null && zzaVl.length > 0)
        {
            for (int i = 0; i < zzaVl.length; i++)
            {
                zza zza1 = zzaVl[i];
                if (zza1 != null)
                {
                    zzrg1.zza(1, zza1);
                }
            }

        }
        super.zza(zzrg1);
    }

    public zzrn zzb(zzrf zzrf1)
        throws IOException
    {
        return zzv(zzrf1);
    }

    public zzrc zzv(zzrf zzrf1)
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
                int k = zzrq.zzb(zzrf1, 10);
                zza azza[];
                int j;
                if (zzaVl == null)
                {
                    j = 0;
                } else
                {
                    j = zzaVl.length;
                }
                azza = new zza[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(zzaVl, 0, azza, 0, j);
                    k = j;
                }
                for (; k < azza.length - 1; k++)
                {
                    azza[k] = new zza();
                    zzrf1.zza(azza[k]);
                    zzrf1.zzBr();
                }

                azza[k] = new zza();
                zzrf1.zza(azza[k]);
                zzaVl = azza;
                break;
            }
        } while (true);
    }
}
