// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzrg, zzrf, zzrn, 
//            zzrl, zzrq, zzrm, zzri

public interface zzaf
{
    public static final class zza extends zzrh
    {

        public int level;
        public int zzhK;
        public int zzhL;

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
                    if (level == ((zza) (obj)).level)
                    {
                        flag = flag1;
                        if (zzhK == ((zza) (obj)).zzhK)
                        {
                            flag = flag1;
                            if (zzhL == ((zza) (obj)).zzhL)
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
            return (((level + 527) * 31 + zzhK) * 31 + zzhL) * 31 + zzBI();
        }

        public zza zzA()
        {
            level = 1;
            zzhK = 0;
            zzhL = 0;
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        protected int zzB()
        {
            int j = super.zzB();
            int i = j;
            if (level != 1)
            {
                i = j + zzrg.zzA(1, level);
            }
            j = i;
            if (zzhK != 0)
            {
                j = i + zzrg.zzA(2, zzhK);
            }
            i = j;
            if (zzhL != 0)
            {
                i = j + zzrg.zzA(3, zzhL);
            }
            return i;
        }

        public zza zza(zzrf zzrf1)
            throws IOException
        {
_L6:
            int i = zzrf1.zzBr();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       8: 59
        //                       16: 103
        //                       24: 114;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (zza(zzrf1, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            int j = zzrf1.zzBu();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                level = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            zzhK = zzrf1.zzBu();
            continue; /* Loop/switch isn't completed */
_L5:
            zzhL = zzrf1.zzBu();
            if (true) goto _L6; else goto _L7
_L7:
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            if (level != 1)
            {
                zzrg1.zzy(1, level);
            }
            if (zzhK != 0)
            {
                zzrg1.zzy(2, zzhK);
            }
            if (zzhL != 0)
            {
                zzrg1.zzy(3, zzhL);
            }
            super.zza(zzrg1);
        }

        public zzrn zzb(zzrf zzrf1)
            throws IOException
        {
            return zza(zzrf1);
        }

        public zza()
        {
            zzA();
        }
    }

    public static final class zzb extends zzrh
    {

        private static volatile zzb zzhM[];
        public int name;
        public int zzhN[];
        public int zzhO;
        public boolean zzhP;
        public boolean zzhQ;

        public static zzb[] zzC()
        {
            if (zzhM == null)
            {
                synchronized (zzrl.zzaWe)
                {
                    if (zzhM == null)
                    {
                        zzhM = new zzb[0];
                    }
                }
            }
            return zzhM;
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
                if (obj instanceof zzb)
                {
                    obj = (zzb)obj;
                    flag = flag1;
                    if (zzrl.equals(zzhN, ((zzb) (obj)).zzhN))
                    {
                        flag = flag1;
                        if (zzhO == ((zzb) (obj)).zzhO)
                        {
                            flag = flag1;
                            if (name == ((zzb) (obj)).name)
                            {
                                flag = flag1;
                                if (zzhP == ((zzb) (obj)).zzhP)
                                {
                                    flag = flag1;
                                    if (zzhQ == ((zzb) (obj)).zzhQ)
                                    {
                                        return zza(((zzrh) (obj)));
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
            char c1 = '\u04CF';
            int i = zzrl.hashCode(zzhN);
            int j = zzhO;
            int k = name;
            char c;
            if (zzhP)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            if (!zzhQ)
            {
                c1 = '\u04D5';
            }
            return ((c + (((i + 527) * 31 + j) * 31 + k) * 31) * 31 + c1) * 31 + zzBI();
        }

        protected int zzB()
        {
            int j = 0;
            int k = super.zzB();
            int i = k;
            if (zzhQ)
            {
                i = k + zzrg.zzc(1, zzhQ);
            }
            k = zzrg.zzA(2, zzhO) + i;
            if (zzhN != null && zzhN.length > 0)
            {
                for (i = 0; i < zzhN.length; i++)
                {
                    j += zzrg.zzkJ(zzhN[i]);
                }

                j = k + j + zzhN.length * 1;
            } else
            {
                j = k;
            }
            i = j;
            if (name != 0)
            {
                i = j + zzrg.zzA(4, name);
            }
            j = i;
            if (zzhP)
            {
                j = i + zzrg.zzc(6, zzhP);
            }
            return j;
        }

        public zzb zzD()
        {
            zzhN = zzrq.zzaWh;
            zzhO = 0;
            name = 0;
            zzhP = false;
            zzhQ = false;
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            if (zzhQ)
            {
                zzrg1.zzb(1, zzhQ);
            }
            zzrg1.zzy(2, zzhO);
            if (zzhN != null && zzhN.length > 0)
            {
                for (int i = 0; i < zzhN.length; i++)
                {
                    zzrg1.zzy(3, zzhN[i]);
                }

            }
            if (name != 0)
            {
                zzrg1.zzy(4, name);
            }
            if (zzhP)
            {
                zzrg1.zzb(6, zzhP);
            }
            super.zza(zzrg1);
        }

        public zzrn zzb(zzrf zzrf1)
            throws IOException
        {
            return zzc(zzrf1);
        }

        public zzb zzc(zzrf zzrf1)
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
                    zzhQ = zzrf1.zzBv();
                    break;

                case 16: // '\020'
                    zzhO = zzrf1.zzBu();
                    break;

                case 24: // '\030'
                    int l = zzrq.zzb(zzrf1, 24);
                    int ai[];
                    int j;
                    if (zzhN == null)
                    {
                        j = 0;
                    } else
                    {
                        j = zzhN.length;
                    }
                    ai = new int[l + j];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(zzhN, 0, ai, 0, j);
                        l = j;
                    }
                    for (; l < ai.length - 1; l++)
                    {
                        ai[l] = zzrf1.zzBu();
                        zzrf1.zzBr();
                    }

                    ai[l] = zzrf1.zzBu();
                    zzhN = ai;
                    break;

                case 26: // '\032'
                    int j1 = zzrf1.zzkC(zzrf1.zzBy());
                    int k = zzrf1.getPosition();
                    int i1;
                    for (i1 = 0; zzrf1.zzBD() > 0; i1++)
                    {
                        zzrf1.zzBu();
                    }

                    zzrf1.zzkE(k);
                    int ai1[];
                    if (zzhN == null)
                    {
                        k = 0;
                    } else
                    {
                        k = zzhN.length;
                    }
                    ai1 = new int[i1 + k];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(zzhN, 0, ai1, 0, k);
                        i1 = k;
                    }
                    for (; i1 < ai1.length; i1++)
                    {
                        ai1[i1] = zzrf1.zzBu();
                    }

                    zzhN = ai1;
                    zzrf1.zzkD(j1);
                    break;

                case 32: // ' '
                    name = zzrf1.zzBu();
                    break;

                case 48: // '0'
                    zzhP = zzrf1.zzBv();
                    break;
                }
            } while (true);
        }

        public zzb()
        {
            zzD();
        }
    }

    public static final class zzc extends zzrh
    {

        private static volatile zzc zzhR[];
        public String zzaC;
        public long zzhS;
        public long zzhT;
        public boolean zzhU;
        public long zzhV;

        public static zzc[] zzE()
        {
            if (zzhR == null)
            {
                synchronized (zzrl.zzaWe)
                {
                    if (zzhR == null)
                    {
                        zzhR = new zzc[0];
                    }
                }
            }
            return zzhR;
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
            if (!(obj instanceof zzc))
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = (zzc)obj;
            if (zzaC != null)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (((zzc) (obj)).zzaC != null)
            {
                continue; /* Loop/switch isn't completed */
            }
_L5:
            flag = flag1;
            if (zzhS == ((zzc) (obj)).zzhS)
            {
                flag = flag1;
                if (zzhT == ((zzc) (obj)).zzhT)
                {
                    flag = flag1;
                    if (zzhU == ((zzc) (obj)).zzhU)
                    {
                        flag = flag1;
                        if (zzhV == ((zzc) (obj)).zzhV)
                        {
                            return zza(((zzrh) (obj)));
                        }
                    }
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
            if (!zzaC.equals(((zzc) (obj)).zzaC))
            {
                return false;
            }
              goto _L5
            if (true) goto _L4; else goto _L6
_L6:
        }

        public int hashCode()
        {
            int i;
            char c;
            int j;
            int k;
            if (zzaC == null)
            {
                i = 0;
            } else
            {
                i = zzaC.hashCode();
            }
            j = (int)(zzhS ^ zzhS >>> 32);
            k = (int)(zzhT ^ zzhT >>> 32);
            if (zzhU)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            return ((c + (((i + 527) * 31 + j) * 31 + k) * 31) * 31 + (int)(zzhV ^ zzhV >>> 32)) * 31 + zzBI();
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
            if (zzhS != 0L)
            {
                j = i + zzrg.zzd(2, zzhS);
            }
            i = j;
            if (zzhT != 0x7fffffffL)
            {
                i = j + zzrg.zzd(3, zzhT);
            }
            j = i;
            if (zzhU)
            {
                j = i + zzrg.zzc(4, zzhU);
            }
            i = j;
            if (zzhV != 0L)
            {
                i = j + zzrg.zzd(5, zzhV);
            }
            return i;
        }

        public zzc zzF()
        {
            zzaC = "";
            zzhS = 0L;
            zzhT = 0x7fffffffL;
            zzhU = false;
            zzhV = 0L;
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            if (!zzaC.equals(""))
            {
                zzrg1.zzb(1, zzaC);
            }
            if (zzhS != 0L)
            {
                zzrg1.zzb(2, zzhS);
            }
            if (zzhT != 0x7fffffffL)
            {
                zzrg1.zzb(3, zzhT);
            }
            if (zzhU)
            {
                zzrg1.zzb(4, zzhU);
            }
            if (zzhV != 0L)
            {
                zzrg1.zzb(5, zzhV);
            }
            super.zza(zzrg1);
        }

        public zzrn zzb(zzrf zzrf1)
            throws IOException
        {
            return zzd(zzrf1);
        }

        public zzc zzd(zzrf zzrf1)
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

                case 16: // '\020'
                    zzhS = zzrf1.zzBt();
                    break;

                case 24: // '\030'
                    zzhT = zzrf1.zzBt();
                    break;

                case 32: // ' '
                    zzhU = zzrf1.zzBv();
                    break;

                case 40: // '('
                    zzhV = zzrf1.zzBt();
                    break;
                }
            } while (true);
        }

        public zzc()
        {
            zzF();
        }
    }

    public static final class zzd extends zzrh
    {

        public zzag.zza zzhW[];
        public zzag.zza zzhX[];
        public zzc zzhY[];

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
                if (obj instanceof zzd)
                {
                    obj = (zzd)obj;
                    flag = flag1;
                    if (zzrl.equals(zzhW, ((zzd) (obj)).zzhW))
                    {
                        flag = flag1;
                        if (zzrl.equals(zzhX, ((zzd) (obj)).zzhX))
                        {
                            flag = flag1;
                            if (zzrl.equals(zzhY, ((zzd) (obj)).zzhY))
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
            return (((zzrl.hashCode(zzhW) + 527) * 31 + zzrl.hashCode(zzhX)) * 31 + zzrl.hashCode(zzhY)) * 31 + zzBI();
        }

        protected int zzB()
        {
            boolean flag = false;
            int i = super.zzB();
            int j = i;
            if (zzhW != null)
            {
                j = i;
                if (zzhW.length > 0)
                {
                    for (j = 0; j < zzhW.length;)
                    {
                        zzag.zza zza1 = zzhW[j];
                        int i1 = i;
                        if (zza1 != null)
                        {
                            i1 = i + zzrg.zzc(1, zza1);
                        }
                        j++;
                        i = i1;
                    }

                    j = i;
                }
            }
            i = j;
            if (zzhX != null)
            {
                i = j;
                if (zzhX.length > 0)
                {
                    i = j;
                    for (int k = 0; k < zzhX.length;)
                    {
                        zzag.zza zza2 = zzhX[k];
                        int j1 = i;
                        if (zza2 != null)
                        {
                            j1 = i + zzrg.zzc(2, zza2);
                        }
                        k++;
                        i = j1;
                    }

                }
            }
            int k1 = i;
            if (zzhY != null)
            {
                k1 = i;
                if (zzhY.length > 0)
                {
                    int l = ((flag) ? 1 : 0);
                    do
                    {
                        k1 = i;
                        if (l >= zzhY.length)
                        {
                            break;
                        }
                        zzc zzc1 = zzhY[l];
                        k1 = i;
                        if (zzc1 != null)
                        {
                            k1 = i + zzrg.zzc(3, zzc1);
                        }
                        l++;
                        i = k1;
                    } while (true);
                }
            }
            return k1;
        }

        public zzd zzG()
        {
            zzhW = zzag.zza.zzQ();
            zzhX = zzag.zza.zzQ();
            zzhY = zzc.zzE();
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            boolean flag = false;
            if (zzhW != null && zzhW.length > 0)
            {
                for (int i = 0; i < zzhW.length; i++)
                {
                    zzag.zza zza1 = zzhW[i];
                    if (zza1 != null)
                    {
                        zzrg1.zza(1, zza1);
                    }
                }

            }
            if (zzhX != null && zzhX.length > 0)
            {
                for (int j = 0; j < zzhX.length; j++)
                {
                    zzag.zza zza2 = zzhX[j];
                    if (zza2 != null)
                    {
                        zzrg1.zza(2, zza2);
                    }
                }

            }
            if (zzhY != null && zzhY.length > 0)
            {
                for (int k = ((flag) ? 1 : 0); k < zzhY.length; k++)
                {
                    zzc zzc1 = zzhY[k];
                    if (zzc1 != null)
                    {
                        zzrg1.zza(3, zzc1);
                    }
                }

            }
            super.zza(zzrg1);
        }

        public zzrn zzb(zzrf zzrf1)
            throws IOException
        {
            return zze(zzrf1);
        }

        public zzd zze(zzrf zzrf1)
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
                    int i1 = zzrq.zzb(zzrf1, 10);
                    zzag.zza azza[];
                    int j;
                    if (zzhW == null)
                    {
                        j = 0;
                    } else
                    {
                        j = zzhW.length;
                    }
                    azza = new zzag.zza[i1 + j];
                    i1 = j;
                    if (j != 0)
                    {
                        System.arraycopy(zzhW, 0, azza, 0, j);
                        i1 = j;
                    }
                    for (; i1 < azza.length - 1; i1++)
                    {
                        azza[i1] = new zzag.zza();
                        zzrf1.zza(azza[i1]);
                        zzrf1.zzBr();
                    }

                    azza[i1] = new zzag.zza();
                    zzrf1.zza(azza[i1]);
                    zzhW = azza;
                    break;

                case 18: // '\022'
                    int j1 = zzrq.zzb(zzrf1, 18);
                    zzag.zza azza1[];
                    int k;
                    if (zzhX == null)
                    {
                        k = 0;
                    } else
                    {
                        k = zzhX.length;
                    }
                    azza1 = new zzag.zza[j1 + k];
                    j1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(zzhX, 0, azza1, 0, k);
                        j1 = k;
                    }
                    for (; j1 < azza1.length - 1; j1++)
                    {
                        azza1[j1] = new zzag.zza();
                        zzrf1.zza(azza1[j1]);
                        zzrf1.zzBr();
                    }

                    azza1[j1] = new zzag.zza();
                    zzrf1.zza(azza1[j1]);
                    zzhX = azza1;
                    break;

                case 26: // '\032'
                    int k1 = zzrq.zzb(zzrf1, 26);
                    zzc azzc[];
                    int l;
                    if (zzhY == null)
                    {
                        l = 0;
                    } else
                    {
                        l = zzhY.length;
                    }
                    azzc = new zzc[k1 + l];
                    k1 = l;
                    if (l != 0)
                    {
                        System.arraycopy(zzhY, 0, azzc, 0, l);
                        k1 = l;
                    }
                    for (; k1 < azzc.length - 1; k1++)
                    {
                        azzc[k1] = new zzc();
                        zzrf1.zza(azzc[k1]);
                        zzrf1.zzBr();
                    }

                    azzc[k1] = new zzc();
                    zzrf1.zza(azzc[k1]);
                    zzhY = azzc;
                    break;
                }
            } while (true);
        }

        public zzd()
        {
            zzG();
        }
    }

    public static final class zze extends zzrh
    {

        private static volatile zze zzhZ[];
        public int key;
        public int value;

        public static zze[] zzH()
        {
            if (zzhZ == null)
            {
                synchronized (zzrl.zzaWe)
                {
                    if (zzhZ == null)
                    {
                        zzhZ = new zze[0];
                    }
                }
            }
            return zzhZ;
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
                if (obj instanceof zze)
                {
                    obj = (zze)obj;
                    flag = flag1;
                    if (key == ((zze) (obj)).key)
                    {
                        flag = flag1;
                        if (value == ((zze) (obj)).value)
                        {
                            return zza(((zzrh) (obj)));
                        }
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return ((key + 527) * 31 + value) * 31 + zzBI();
        }

        protected int zzB()
        {
            return super.zzB() + zzrg.zzA(1, key) + zzrg.zzA(2, value);
        }

        public zze zzI()
        {
            key = 0;
            value = 0;
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            zzrg1.zzy(1, key);
            zzrg1.zzy(2, value);
            super.zza(zzrg1);
        }

        public zzrn zzb(zzrf zzrf1)
            throws IOException
        {
            return zzf(zzrf1);
        }

        public zze zzf(zzrf zzrf1)
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
                    key = zzrf1.zzBu();
                    break;

                case 16: // '\020'
                    value = zzrf1.zzBu();
                    break;
                }
            } while (true);
        }

        public zze()
        {
            zzI();
        }
    }

    public static final class zzf extends zzrh
    {

        public String version;
        public String zzia[];
        public String zzib[];
        public zzag.zza zzic[];
        public zze zzid[];
        public zzb zzie[];
        public zzb zzif[];
        public zzb zzig[];
        public zzg zzih[];
        public String zzii;
        public String zzij;
        public String zzik;
        public zza zzil;
        public float zzim;
        public boolean zzin;
        public String zzio[];
        public int zzip;

        public static zzf zzc(byte abyte0[])
            throws zzrm
        {
            return (zzf)zzrn.zza(new zzf(), abyte0);
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
            if (!(obj instanceof zzf)) goto _L4; else goto _L3
_L3:
            obj = (zzf)obj;
            flag = flag1;
            if (!zzrl.equals(zzia, ((zzf) (obj)).zzia)) goto _L4; else goto _L5
_L5:
            flag = flag1;
            if (!zzrl.equals(zzib, ((zzf) (obj)).zzib)) goto _L4; else goto _L6
_L6:
            flag = flag1;
            if (!zzrl.equals(zzic, ((zzf) (obj)).zzic)) goto _L4; else goto _L7
_L7:
            flag = flag1;
            if (!zzrl.equals(zzid, ((zzf) (obj)).zzid)) goto _L4; else goto _L8
_L8:
            flag = flag1;
            if (!zzrl.equals(zzie, ((zzf) (obj)).zzie)) goto _L4; else goto _L9
_L9:
            flag = flag1;
            if (!zzrl.equals(zzif, ((zzf) (obj)).zzif)) goto _L4; else goto _L10
_L10:
            flag = flag1;
            if (!zzrl.equals(zzig, ((zzf) (obj)).zzig)) goto _L4; else goto _L11
_L11:
            flag = flag1;
            if (!zzrl.equals(zzih, ((zzf) (obj)).zzih)) goto _L4; else goto _L12
_L12:
            if (zzii != null) goto _L14; else goto _L13
_L13:
            flag = flag1;
            if (((zzf) (obj)).zzii != null) goto _L4; else goto _L15
_L15:
            if (zzij != null) goto _L17; else goto _L16
_L16:
            flag = flag1;
            if (((zzf) (obj)).zzij != null) goto _L4; else goto _L18
_L18:
            if (zzik != null) goto _L20; else goto _L19
_L19:
            flag = flag1;
            if (((zzf) (obj)).zzik != null) goto _L4; else goto _L21
_L21:
            if (version != null) goto _L23; else goto _L22
_L22:
            flag = flag1;
            if (((zzf) (obj)).version != null) goto _L4; else goto _L24
_L24:
            if (zzil != null)
            {
                break MISSING_BLOCK_LABEL_364;
            }
            flag = flag1;
            if (((zzf) (obj)).zzil != null) goto _L4; else goto _L25
_L25:
            flag = flag1;
            if (Float.floatToIntBits(zzim) == Float.floatToIntBits(((zzf) (obj)).zzim))
            {
                flag = flag1;
                if (zzin == ((zzf) (obj)).zzin)
                {
                    flag = flag1;
                    if (zzrl.equals(zzio, ((zzf) (obj)).zzio))
                    {
                        flag = flag1;
                        if (zzip == ((zzf) (obj)).zzip)
                        {
                            return zza(((zzrh) (obj)));
                        }
                    }
                }
            }
              goto _L4
_L14:
            if (!zzii.equals(((zzf) (obj)).zzii))
            {
                return false;
            }
              goto _L15
_L17:
            if (!zzij.equals(((zzf) (obj)).zzij))
            {
                return false;
            }
              goto _L18
_L20:
            if (!zzik.equals(((zzf) (obj)).zzik))
            {
                return false;
            }
              goto _L21
_L23:
            if (!version.equals(((zzf) (obj)).version))
            {
                return false;
            }
              goto _L24
            if (!zzil.equals(((zzf) (obj)).zzil))
            {
                return false;
            }
              goto _L25
        }

        public int hashCode()
        {
            int i1 = 0;
            int j1 = zzrl.hashCode(zzia);
            int k1 = zzrl.hashCode(zzib);
            int l1 = zzrl.hashCode(zzic);
            int i2 = zzrl.hashCode(zzid);
            int j2 = zzrl.hashCode(zzie);
            int k2 = zzrl.hashCode(zzif);
            int l2 = zzrl.hashCode(zzig);
            int i3 = zzrl.hashCode(zzih);
            int i;
            int j;
            int k;
            int l;
            char c;
            int j3;
            if (zzii == null)
            {
                i = 0;
            } else
            {
                i = zzii.hashCode();
            }
            if (zzij == null)
            {
                j = 0;
            } else
            {
                j = zzij.hashCode();
            }
            if (zzik == null)
            {
                k = 0;
            } else
            {
                k = zzik.hashCode();
            }
            if (version == null)
            {
                l = 0;
            } else
            {
                l = version.hashCode();
            }
            if (zzil != null)
            {
                i1 = zzil.hashCode();
            }
            j3 = Float.floatToIntBits(zzim);
            if (zzin)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            return (((c + (((l + (k + (j + (i + ((((((((j1 + 527) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31) * 31) * 31) * 31) * 31 + i1) * 31 + j3) * 31) * 31 + zzrl.hashCode(zzio)) * 31 + zzip) * 31 + zzBI();
        }

        protected int zzB()
        {
            boolean flag = false;
            int k4 = super.zzB();
            int j;
            int k;
            int k2;
            if (zzib != null && zzib.length > 0)
            {
                int i = 0;
                k = 0;
                int l;
                int i3;
                for (l = 0; i < zzib.length; l = i3)
                {
                    String s = zzib[i];
                    int l3 = k;
                    i3 = l;
                    if (s != null)
                    {
                        i3 = l + 1;
                        l3 = k + zzrg.zzfj(s);
                    }
                    i++;
                    k = l3;
                }

                k = k4 + k + l * 1;
            } else
            {
                k = k4;
            }
            j = k;
            if (zzic != null)
            {
                j = k;
                if (zzic.length > 0)
                {
                    j = k;
                    for (k = 0; k < zzic.length;)
                    {
                        zzag.zza zza1 = zzic[k];
                        int i1 = j;
                        if (zza1 != null)
                        {
                            i1 = j + zzrg.zzc(2, zza1);
                        }
                        k++;
                        j = i1;
                    }

                }
            }
            k = j;
            if (zzid != null)
            {
                k = j;
                if (zzid.length > 0)
                {
                    for (k = 0; k < zzid.length;)
                    {
                        zze zze1 = zzid[k];
                        int j1 = j;
                        if (zze1 != null)
                        {
                            j1 = j + zzrg.zzc(3, zze1);
                        }
                        k++;
                        j = j1;
                    }

                    k = j;
                }
            }
            j = k;
            if (zzie != null)
            {
                j = k;
                if (zzie.length > 0)
                {
                    j = k;
                    for (k = 0; k < zzie.length;)
                    {
                        zzb zzb1 = zzie[k];
                        int k1 = j;
                        if (zzb1 != null)
                        {
                            k1 = j + zzrg.zzc(4, zzb1);
                        }
                        k++;
                        j = k1;
                    }

                }
            }
            k = j;
            if (zzif != null)
            {
                k = j;
                if (zzif.length > 0)
                {
                    for (k = 0; k < zzif.length;)
                    {
                        zzb zzb2 = zzif[k];
                        int l1 = j;
                        if (zzb2 != null)
                        {
                            l1 = j + zzrg.zzc(5, zzb2);
                        }
                        k++;
                        j = l1;
                    }

                    k = j;
                }
            }
            j = k;
            if (zzig != null)
            {
                j = k;
                if (zzig.length > 0)
                {
                    j = k;
                    for (k = 0; k < zzig.length;)
                    {
                        zzb zzb3 = zzig[k];
                        int i2 = j;
                        if (zzb3 != null)
                        {
                            i2 = j + zzrg.zzc(6, zzb3);
                        }
                        k++;
                        j = i2;
                    }

                }
            }
            k = j;
            if (zzih != null)
            {
                k = j;
                if (zzih.length > 0)
                {
                    for (k = 0; k < zzih.length;)
                    {
                        zzg zzg1 = zzih[k];
                        int j2 = j;
                        if (zzg1 != null)
                        {
                            j2 = j + zzrg.zzc(7, zzg1);
                        }
                        k++;
                        j = j2;
                    }

                    k = j;
                }
            }
            j = k;
            if (!zzii.equals(""))
            {
                j = k + zzrg.zzk(9, zzii);
            }
            k = j;
            if (!zzij.equals(""))
            {
                k = j + zzrg.zzk(10, zzij);
            }
            j = k;
            if (!zzik.equals("0"))
            {
                j = k + zzrg.zzk(12, zzik);
            }
            k = j;
            if (!version.equals(""))
            {
                k = j + zzrg.zzk(13, version);
            }
            k2 = k;
            if (zzil != null)
            {
                k2 = k + zzrg.zzc(14, zzil);
            }
            j = k2;
            if (Float.floatToIntBits(zzim) != Float.floatToIntBits(0.0F))
            {
                j = k2 + zzrg.zzc(15, zzim);
            }
            k = j;
            if (zzio != null)
            {
                k = j;
                if (zzio.length > 0)
                {
                    k = 0;
                    k2 = 0;
                    int j3;
                    int i4;
                    for (j3 = 0; k < zzio.length; j3 = i4)
                    {
                        String s1 = zzio[k];
                        k4 = k2;
                        i4 = j3;
                        if (s1 != null)
                        {
                            i4 = j3 + 1;
                            k4 = k2 + zzrg.zzfj(s1);
                        }
                        k++;
                        k2 = k4;
                    }

                    k = j + k2 + j3 * 2;
                }
            }
            k2 = k;
            if (zzip != 0)
            {
                k2 = k + zzrg.zzA(17, zzip);
            }
            j = k2;
            if (zzin)
            {
                j = k2 + zzrg.zzc(18, zzin);
            }
            k = j;
            if (zzia != null)
            {
                k = j;
                if (zzia.length > 0)
                {
                    int l2 = 0;
                    int k3 = 0;
                    for (k = ((flag) ? 1 : 0); k < zzia.length;)
                    {
                        String s2 = zzia[k];
                        k4 = l2;
                        int j4 = k3;
                        if (s2 != null)
                        {
                            j4 = k3 + 1;
                            k4 = l2 + zzrg.zzfj(s2);
                        }
                        k++;
                        l2 = k4;
                        k3 = j4;
                    }

                    k = j + l2 + k3 * 2;
                }
            }
            return k;
        }

        public zzf zzJ()
        {
            zzia = zzrq.zzaWm;
            zzib = zzrq.zzaWm;
            zzic = zzag.zza.zzQ();
            zzid = zze.zzH();
            zzie = zzb.zzC();
            zzif = zzb.zzC();
            zzig = zzb.zzC();
            zzih = zzg.zzK();
            zzii = "";
            zzij = "";
            zzik = "0";
            version = "";
            zzil = null;
            zzim = 0.0F;
            zzin = false;
            zzio = zzrq.zzaWm;
            zzip = 0;
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            boolean flag = false;
            if (zzib != null && zzib.length > 0)
            {
                for (int i = 0; i < zzib.length; i++)
                {
                    String s = zzib[i];
                    if (s != null)
                    {
                        zzrg1.zzb(1, s);
                    }
                }

            }
            if (zzic != null && zzic.length > 0)
            {
                for (int j = 0; j < zzic.length; j++)
                {
                    zzag.zza zza1 = zzic[j];
                    if (zza1 != null)
                    {
                        zzrg1.zza(2, zza1);
                    }
                }

            }
            if (zzid != null && zzid.length > 0)
            {
                for (int k = 0; k < zzid.length; k++)
                {
                    zze zze1 = zzid[k];
                    if (zze1 != null)
                    {
                        zzrg1.zza(3, zze1);
                    }
                }

            }
            if (zzie != null && zzie.length > 0)
            {
                for (int l = 0; l < zzie.length; l++)
                {
                    zzb zzb1 = zzie[l];
                    if (zzb1 != null)
                    {
                        zzrg1.zza(4, zzb1);
                    }
                }

            }
            if (zzif != null && zzif.length > 0)
            {
                for (int i1 = 0; i1 < zzif.length; i1++)
                {
                    zzb zzb2 = zzif[i1];
                    if (zzb2 != null)
                    {
                        zzrg1.zza(5, zzb2);
                    }
                }

            }
            if (zzig != null && zzig.length > 0)
            {
                for (int j1 = 0; j1 < zzig.length; j1++)
                {
                    zzb zzb3 = zzig[j1];
                    if (zzb3 != null)
                    {
                        zzrg1.zza(6, zzb3);
                    }
                }

            }
            if (zzih != null && zzih.length > 0)
            {
                for (int k1 = 0; k1 < zzih.length; k1++)
                {
                    zzg zzg1 = zzih[k1];
                    if (zzg1 != null)
                    {
                        zzrg1.zza(7, zzg1);
                    }
                }

            }
            if (!zzii.equals(""))
            {
                zzrg1.zzb(9, zzii);
            }
            if (!zzij.equals(""))
            {
                zzrg1.zzb(10, zzij);
            }
            if (!zzik.equals("0"))
            {
                zzrg1.zzb(12, zzik);
            }
            if (!version.equals(""))
            {
                zzrg1.zzb(13, version);
            }
            if (zzil != null)
            {
                zzrg1.zza(14, zzil);
            }
            if (Float.floatToIntBits(zzim) != Float.floatToIntBits(0.0F))
            {
                zzrg1.zzb(15, zzim);
            }
            if (zzio != null && zzio.length > 0)
            {
                for (int l1 = 0; l1 < zzio.length; l1++)
                {
                    String s1 = zzio[l1];
                    if (s1 != null)
                    {
                        zzrg1.zzb(16, s1);
                    }
                }

            }
            if (zzip != 0)
            {
                zzrg1.zzy(17, zzip);
            }
            if (zzin)
            {
                zzrg1.zzb(18, zzin);
            }
            if (zzia != null && zzia.length > 0)
            {
                for (int i2 = ((flag) ? 1 : 0); i2 < zzia.length; i2++)
                {
                    String s2 = zzia[i2];
                    if (s2 != null)
                    {
                        zzrg1.zzb(19, s2);
                    }
                }

            }
            super.zza(zzrg1);
        }

        public zzrn zzb(zzrf zzrf1)
            throws IOException
        {
            return zzg(zzrf1);
        }

        public zzf zzg(zzrf zzrf1)
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
                    int k2 = zzrq.zzb(zzrf1, 10);
                    String as[];
                    int j;
                    if (zzib == null)
                    {
                        j = 0;
                    } else
                    {
                        j = zzib.length;
                    }
                    as = new String[k2 + j];
                    k2 = j;
                    if (j != 0)
                    {
                        System.arraycopy(zzib, 0, as, 0, j);
                        k2 = j;
                    }
                    for (; k2 < as.length - 1; k2++)
                    {
                        as[k2] = zzrf1.readString();
                        zzrf1.zzBr();
                    }

                    as[k2] = zzrf1.readString();
                    zzib = as;
                    break;

                case 18: // '\022'
                    int l2 = zzrq.zzb(zzrf1, 18);
                    zzag.zza azza[];
                    int k;
                    if (zzic == null)
                    {
                        k = 0;
                    } else
                    {
                        k = zzic.length;
                    }
                    azza = new zzag.zza[l2 + k];
                    l2 = k;
                    if (k != 0)
                    {
                        System.arraycopy(zzic, 0, azza, 0, k);
                        l2 = k;
                    }
                    for (; l2 < azza.length - 1; l2++)
                    {
                        azza[l2] = new zzag.zza();
                        zzrf1.zza(azza[l2]);
                        zzrf1.zzBr();
                    }

                    azza[l2] = new zzag.zza();
                    zzrf1.zza(azza[l2]);
                    zzic = azza;
                    break;

                case 26: // '\032'
                    int i3 = zzrq.zzb(zzrf1, 26);
                    zze azze[];
                    int l;
                    if (zzid == null)
                    {
                        l = 0;
                    } else
                    {
                        l = zzid.length;
                    }
                    azze = new zze[i3 + l];
                    i3 = l;
                    if (l != 0)
                    {
                        System.arraycopy(zzid, 0, azze, 0, l);
                        i3 = l;
                    }
                    for (; i3 < azze.length - 1; i3++)
                    {
                        azze[i3] = new zze();
                        zzrf1.zza(azze[i3]);
                        zzrf1.zzBr();
                    }

                    azze[i3] = new zze();
                    zzrf1.zza(azze[i3]);
                    zzid = azze;
                    break;

                case 34: // '"'
                    int j3 = zzrq.zzb(zzrf1, 34);
                    zzb azzb[];
                    int i1;
                    if (zzie == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = zzie.length;
                    }
                    azzb = new zzb[j3 + i1];
                    j3 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(zzie, 0, azzb, 0, i1);
                        j3 = i1;
                    }
                    for (; j3 < azzb.length - 1; j3++)
                    {
                        azzb[j3] = new zzb();
                        zzrf1.zza(azzb[j3]);
                        zzrf1.zzBr();
                    }

                    azzb[j3] = new zzb();
                    zzrf1.zza(azzb[j3]);
                    zzie = azzb;
                    break;

                case 42: // '*'
                    int k3 = zzrq.zzb(zzrf1, 42);
                    zzb azzb1[];
                    int j1;
                    if (zzif == null)
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = zzif.length;
                    }
                    azzb1 = new zzb[k3 + j1];
                    k3 = j1;
                    if (j1 != 0)
                    {
                        System.arraycopy(zzif, 0, azzb1, 0, j1);
                        k3 = j1;
                    }
                    for (; k3 < azzb1.length - 1; k3++)
                    {
                        azzb1[k3] = new zzb();
                        zzrf1.zza(azzb1[k3]);
                        zzrf1.zzBr();
                    }

                    azzb1[k3] = new zzb();
                    zzrf1.zza(azzb1[k3]);
                    zzif = azzb1;
                    break;

                case 50: // '2'
                    int l3 = zzrq.zzb(zzrf1, 50);
                    zzb azzb2[];
                    int k1;
                    if (zzig == null)
                    {
                        k1 = 0;
                    } else
                    {
                        k1 = zzig.length;
                    }
                    azzb2 = new zzb[l3 + k1];
                    l3 = k1;
                    if (k1 != 0)
                    {
                        System.arraycopy(zzig, 0, azzb2, 0, k1);
                        l3 = k1;
                    }
                    for (; l3 < azzb2.length - 1; l3++)
                    {
                        azzb2[l3] = new zzb();
                        zzrf1.zza(azzb2[l3]);
                        zzrf1.zzBr();
                    }

                    azzb2[l3] = new zzb();
                    zzrf1.zza(azzb2[l3]);
                    zzig = azzb2;
                    break;

                case 58: // ':'
                    int i4 = zzrq.zzb(zzrf1, 58);
                    zzg azzg[];
                    int l1;
                    if (zzih == null)
                    {
                        l1 = 0;
                    } else
                    {
                        l1 = zzih.length;
                    }
                    azzg = new zzg[i4 + l1];
                    i4 = l1;
                    if (l1 != 0)
                    {
                        System.arraycopy(zzih, 0, azzg, 0, l1);
                        i4 = l1;
                    }
                    for (; i4 < azzg.length - 1; i4++)
                    {
                        azzg[i4] = new zzg();
                        zzrf1.zza(azzg[i4]);
                        zzrf1.zzBr();
                    }

                    azzg[i4] = new zzg();
                    zzrf1.zza(azzg[i4]);
                    zzih = azzg;
                    break;

                case 74: // 'J'
                    zzii = zzrf1.readString();
                    break;

                case 82: // 'R'
                    zzij = zzrf1.readString();
                    break;

                case 98: // 'b'
                    zzik = zzrf1.readString();
                    break;

                case 106: // 'j'
                    version = zzrf1.readString();
                    break;

                case 114: // 'r'
                    if (zzil == null)
                    {
                        zzil = new zza();
                    }
                    zzrf1.zza(zzil);
                    break;

                case 125: // '}'
                    zzim = zzrf1.readFloat();
                    break;

                case 130: 
                    int j4 = zzrq.zzb(zzrf1, 130);
                    String as1[];
                    int i2;
                    if (zzio == null)
                    {
                        i2 = 0;
                    } else
                    {
                        i2 = zzio.length;
                    }
                    as1 = new String[j4 + i2];
                    j4 = i2;
                    if (i2 != 0)
                    {
                        System.arraycopy(zzio, 0, as1, 0, i2);
                        j4 = i2;
                    }
                    for (; j4 < as1.length - 1; j4++)
                    {
                        as1[j4] = zzrf1.readString();
                        zzrf1.zzBr();
                    }

                    as1[j4] = zzrf1.readString();
                    zzio = as1;
                    break;

                case 136: 
                    zzip = zzrf1.zzBu();
                    break;

                case 144: 
                    zzin = zzrf1.zzBv();
                    break;

                case 154: 
                    int k4 = zzrq.zzb(zzrf1, 154);
                    String as2[];
                    int j2;
                    if (zzia == null)
                    {
                        j2 = 0;
                    } else
                    {
                        j2 = zzia.length;
                    }
                    as2 = new String[k4 + j2];
                    k4 = j2;
                    if (j2 != 0)
                    {
                        System.arraycopy(zzia, 0, as2, 0, j2);
                        k4 = j2;
                    }
                    for (; k4 < as2.length - 1; k4++)
                    {
                        as2[k4] = zzrf1.readString();
                        zzrf1.zzBr();
                    }

                    as2[k4] = zzrf1.readString();
                    zzia = as2;
                    break;
                }
            } while (true);
        }

        public zzf()
        {
            zzJ();
        }
    }

    public static final class zzg extends zzrh
    {

        private static volatile zzg zziq[];
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

        public static zzg[] zzK()
        {
            if (zziq == null)
            {
                synchronized (zzrl.zzaWe)
                {
                    if (zziq == null)
                    {
                        zziq = new zzg[0];
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
                if (obj instanceof zzg)
                {
                    obj = (zzg)obj;
                    flag = flag1;
                    if (zzrl.equals(zzir, ((zzg) (obj)).zzir))
                    {
                        flag = flag1;
                        if (zzrl.equals(zzis, ((zzg) (obj)).zzis))
                        {
                            flag = flag1;
                            if (zzrl.equals(zzit, ((zzg) (obj)).zzit))
                            {
                                flag = flag1;
                                if (zzrl.equals(zziu, ((zzg) (obj)).zziu))
                                {
                                    flag = flag1;
                                    if (zzrl.equals(zziv, ((zzg) (obj)).zziv))
                                    {
                                        flag = flag1;
                                        if (zzrl.equals(zziw, ((zzg) (obj)).zziw))
                                        {
                                            flag = flag1;
                                            if (zzrl.equals(zzix, ((zzg) (obj)).zzix))
                                            {
                                                flag = flag1;
                                                if (zzrl.equals(zziy, ((zzg) (obj)).zziy))
                                                {
                                                    flag = flag1;
                                                    if (zzrl.equals(zziz, ((zzg) (obj)).zziz))
                                                    {
                                                        flag = flag1;
                                                        if (zzrl.equals(zziA, ((zzg) (obj)).zziA))
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

        public zzg zzL()
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

        public zzg zzh(zzrf zzrf1)
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

        public zzg()
        {
            zzL();
        }
    }

    public static final class zzh extends zzrh
    {

        public static final zzri zziB = zzri.zza(11, com/google/android/gms/internal/zzaf$zzh, 810);
        private static final zzh zziC[] = new zzh[0];
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
                if (obj instanceof zzh)
                {
                    obj = (zzh)obj;
                    flag = flag1;
                    if (zzrl.equals(zziD, ((zzh) (obj)).zziD))
                    {
                        flag = flag1;
                        if (zzrl.equals(zziE, ((zzh) (obj)).zziE))
                        {
                            flag = flag1;
                            if (zzrl.equals(zziF, ((zzh) (obj)).zziF))
                            {
                                flag = flag1;
                                if (zziG == ((zzh) (obj)).zziG)
                                {
                                    flag = flag1;
                                    if (zzrl.equals(zziH, ((zzh) (obj)).zziH))
                                    {
                                        flag = flag1;
                                        if (zziI == ((zzh) (obj)).zziI)
                                        {
                                            flag = flag1;
                                            if (zziJ == ((zzh) (obj)).zziJ)
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

        public zzh zzM()
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

        public zzh zzi(zzrf zzrf1)
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


        public zzh()
        {
            zzM();
        }
    }

    public static final class zzi extends zzrh
    {

        private static volatile zzi zziK[];
        public String name;
        public zzag.zza zziL;
        public zzd zziM;

        public static zzi[] zzN()
        {
            if (zziK == null)
            {
                synchronized (zzrl.zzaWe)
                {
                    if (zziK == null)
                    {
                        zziK = new zzi[0];
                    }
                }
            }
            return zziK;
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
            if (!(obj instanceof zzi)) goto _L4; else goto _L3
_L3:
            obj = (zzi)obj;
            if (name != null) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (((zzi) (obj)).name != null) goto _L4; else goto _L7
_L7:
            if (zziL != null) goto _L9; else goto _L8
_L8:
            flag = flag1;
            if (((zzi) (obj)).zziL != null) goto _L4; else goto _L10
_L10:
            if (zziM != null)
            {
                break MISSING_BLOCK_LABEL_111;
            }
            flag = flag1;
            if (((zzi) (obj)).zziM != null) goto _L4; else goto _L11
_L11:
            return zza(((zzrh) (obj)));
_L6:
            if (!name.equals(((zzi) (obj)).name))
            {
                return false;
            }
              goto _L7
_L9:
            if (!zziL.equals(((zzi) (obj)).zziL))
            {
                return false;
            }
              goto _L10
            if (!zziM.equals(((zzi) (obj)).zziM))
            {
                return false;
            }
              goto _L11
        }

        public int hashCode()
        {
            int k = 0;
            int i;
            int j;
            if (name == null)
            {
                i = 0;
            } else
            {
                i = name.hashCode();
            }
            if (zziL == null)
            {
                j = 0;
            } else
            {
                j = zziL.hashCode();
            }
            if (zziM != null)
            {
                k = zziM.hashCode();
            }
            return ((j + (i + 527) * 31) * 31 + k) * 31 + zzBI();
        }

        protected int zzB()
        {
            int j = super.zzB();
            int i = j;
            if (!name.equals(""))
            {
                i = j + zzrg.zzk(1, name);
            }
            j = i;
            if (zziL != null)
            {
                j = i + zzrg.zzc(2, zziL);
            }
            i = j;
            if (zziM != null)
            {
                i = j + zzrg.zzc(3, zziM);
            }
            return i;
        }

        public zzi zzO()
        {
            name = "";
            zziL = null;
            zziM = null;
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            if (!name.equals(""))
            {
                zzrg1.zzb(1, name);
            }
            if (zziL != null)
            {
                zzrg1.zza(2, zziL);
            }
            if (zziM != null)
            {
                zzrg1.zza(3, zziM);
            }
            super.zza(zzrg1);
        }

        public zzrn zzb(zzrf zzrf1)
            throws IOException
        {
            return zzj(zzrf1);
        }

        public zzi zzj(zzrf zzrf1)
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
                    if (zziL == null)
                    {
                        zziL = new zzag.zza();
                    }
                    zzrf1.zza(zziL);
                    break;

                case 26: // '\032'
                    if (zziM == null)
                    {
                        zziM = new zzd();
                    }
                    zzrf1.zza(zziM);
                    break;
                }
            } while (true);
        }

        public zzi()
        {
            zzO();
        }
    }

    public static final class zzj extends zzrh
    {

        public zzi zziN[];
        public zzf zziO;
        public String zziP;

        public static zzj zzd(byte abyte0[])
            throws zzrm
        {
            return (zzj)zzrn.zza(new zzj(), abyte0);
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
            if (!(obj instanceof zzj)) goto _L4; else goto _L3
_L3:
            obj = (zzj)obj;
            flag = flag1;
            if (!zzrl.equals(zziN, ((zzj) (obj)).zziN)) goto _L4; else goto _L5
_L5:
            if (zziO != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((zzj) (obj)).zziO != null) goto _L4; else goto _L8
_L8:
            if (zziP != null)
            {
                break MISSING_BLOCK_LABEL_95;
            }
            flag = flag1;
            if (((zzj) (obj)).zziP != null) goto _L4; else goto _L9
_L9:
            return zza(((zzrh) (obj)));
_L7:
            if (!zziO.equals(((zzj) (obj)).zziO))
            {
                return false;
            }
              goto _L8
            if (!zziP.equals(((zzj) (obj)).zziP))
            {
                return false;
            }
              goto _L9
        }

        public int hashCode()
        {
            int j = 0;
            int k = zzrl.hashCode(zziN);
            int i;
            if (zziO == null)
            {
                i = 0;
            } else
            {
                i = zziO.hashCode();
            }
            if (zziP != null)
            {
                j = zziP.hashCode();
            }
            return ((i + (k + 527) * 31) * 31 + j) * 31 + zzBI();
        }

        protected int zzB()
        {
            int i = super.zzB();
            int j = i;
            if (zziN != null)
            {
                j = i;
                if (zziN.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= zziN.length)
                        {
                            break;
                        }
                        zzi zzi1 = zziN[k];
                        j = i;
                        if (zzi1 != null)
                        {
                            j = i + zzrg.zzc(1, zzi1);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (zziO != null)
            {
                i = j + zzrg.zzc(2, zziO);
            }
            j = i;
            if (!zziP.equals(""))
            {
                j = i + zzrg.zzk(3, zziP);
            }
            return j;
        }

        public zzj zzP()
        {
            zziN = zzi.zzN();
            zziO = null;
            zziP = "";
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            if (zziN != null && zziN.length > 0)
            {
                for (int i = 0; i < zziN.length; i++)
                {
                    zzi zzi1 = zziN[i];
                    if (zzi1 != null)
                    {
                        zzrg1.zza(1, zzi1);
                    }
                }

            }
            if (zziO != null)
            {
                zzrg1.zza(2, zziO);
            }
            if (!zziP.equals(""))
            {
                zzrg1.zzb(3, zziP);
            }
            super.zza(zzrg1);
        }

        public zzrn zzb(zzrf zzrf1)
            throws IOException
        {
            return zzk(zzrf1);
        }

        public zzj zzk(zzrf zzrf1)
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
                    zzi azzi[];
                    int j;
                    if (zziN == null)
                    {
                        j = 0;
                    } else
                    {
                        j = zziN.length;
                    }
                    azzi = new zzi[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(zziN, 0, azzi, 0, j);
                        k = j;
                    }
                    for (; k < azzi.length - 1; k++)
                    {
                        azzi[k] = new zzi();
                        zzrf1.zza(azzi[k]);
                        zzrf1.zzBr();
                    }

                    azzi[k] = new zzi();
                    zzrf1.zza(azzi[k]);
                    zziN = azzi;
                    break;

                case 18: // '\022'
                    if (zziO == null)
                    {
                        zziO = new zzf();
                    }
                    zzrf1.zza(zziO);
                    break;

                case 26: // '\032'
                    zziP = zzrf1.readString();
                    break;
                }
            } while (true);
        }

        public zzj()
        {
            zzP();
        }
    }

}
