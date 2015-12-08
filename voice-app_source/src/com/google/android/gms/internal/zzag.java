// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzrl, zzrg, zzrq, 
//            zzrf, zzrn

public interface zzag
{
    public static final class zza extends zzrh
    {

        private static volatile zza zziQ[];
        public int type;
        public String zziR;
        public zza zziS[];
        public zza zziT[];
        public zza zziU[];
        public String zziV;
        public String zziW;
        public long zziX;
        public boolean zziY;
        public zza zziZ[];
        public int zzja[];
        public boolean zzjb;

        public static zza[] zzQ()
        {
            if (zziQ == null)
            {
                synchronized (zzrl.zzaWe)
                {
                    if (zziQ == null)
                    {
                        zziQ = new zza[0];
                    }
                }
            }
            return zziQ;
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
            flag = flag1;
            if (type != ((zza) (obj)).type) goto _L4; else goto _L5
_L5:
            if (zziR != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((zza) (obj)).zziR != null) goto _L4; else goto _L8
_L8:
            flag = flag1;
            if (!zzrl.equals(zziS, ((zza) (obj)).zziS)) goto _L4; else goto _L9
_L9:
            flag = flag1;
            if (!zzrl.equals(zziT, ((zza) (obj)).zziT)) goto _L4; else goto _L10
_L10:
            flag = flag1;
            if (!zzrl.equals(zziU, ((zza) (obj)).zziU)) goto _L4; else goto _L11
_L11:
            if (zziV != null) goto _L13; else goto _L12
_L12:
            flag = flag1;
            if (((zza) (obj)).zziV != null) goto _L4; else goto _L14
_L14:
            if (zziW != null)
            {
                break MISSING_BLOCK_LABEL_244;
            }
            flag = flag1;
            if (((zza) (obj)).zziW != null) goto _L4; else goto _L15
_L15:
            flag = flag1;
            if (zziX == ((zza) (obj)).zziX)
            {
                flag = flag1;
                if (zziY == ((zza) (obj)).zziY)
                {
                    flag = flag1;
                    if (zzrl.equals(zziZ, ((zza) (obj)).zziZ))
                    {
                        flag = flag1;
                        if (zzrl.equals(zzja, ((zza) (obj)).zzja))
                        {
                            flag = flag1;
                            if (zzjb == ((zza) (obj)).zzjb)
                            {
                                return zza(((zzrh) (obj)));
                            }
                        }
                    }
                }
            }
              goto _L4
_L7:
            if (!zziR.equals(((zza) (obj)).zziR))
            {
                return false;
            }
              goto _L8
_L13:
            if (!zziV.equals(((zza) (obj)).zziV))
            {
                return false;
            }
              goto _L14
            if (!zziW.equals(((zza) (obj)).zziW))
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
            if (zziR == null)
            {
                i = 0;
            } else
            {
                i = zziR.hashCode();
            }
            i1 = zzrl.hashCode(zziS);
            j1 = zzrl.hashCode(zziT);
            k1 = zzrl.hashCode(zziU);
            if (zziV == null)
            {
                j = 0;
            } else
            {
                j = zziV.hashCode();
            }
            if (zziW != null)
            {
                k = zziW.hashCode();
            }
            l1 = (int)(zziX ^ zziX >>> 32);
            if (zziY)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            i2 = zzrl.hashCode(zziZ);
            j2 = zzrl.hashCode(zzja);
            if (!zzjb)
            {
                c1 = '\u04D5';
            }
            return ((((c + (((j + ((((i + (l + 527) * 31) * 31 + i1) * 31 + j1) * 31 + k1) * 31) * 31 + k) * 31 + l1) * 31) * 31 + i2) * 31 + j2) * 31 + c1) * 31 + zzBI();
        }

        protected int zzB()
        {
            boolean flag = false;
            int j = super.zzB() + zzrg.zzA(1, type);
            int i = j;
            if (!zziR.equals(""))
            {
                i = j + zzrg.zzk(2, zziR);
            }
            j = i;
            if (zziS != null)
            {
                j = i;
                if (zziS.length > 0)
                {
                    for (j = 0; j < zziS.length;)
                    {
                        zza zza1 = zziS[j];
                        int k = i;
                        if (zza1 != null)
                        {
                            k = i + zzrg.zzc(3, zza1);
                        }
                        j++;
                        i = k;
                    }

                    j = i;
                }
            }
            i = j;
            if (zziT != null)
            {
                i = j;
                if (zziT.length > 0)
                {
                    i = j;
                    for (j = 0; j < zziT.length;)
                    {
                        zza zza2 = zziT[j];
                        int l = i;
                        if (zza2 != null)
                        {
                            l = i + zzrg.zzc(4, zza2);
                        }
                        j++;
                        i = l;
                    }

                }
            }
            j = i;
            if (zziU != null)
            {
                j = i;
                if (zziU.length > 0)
                {
                    for (j = 0; j < zziU.length;)
                    {
                        zza zza3 = zziU[j];
                        int i1 = i;
                        if (zza3 != null)
                        {
                            i1 = i + zzrg.zzc(5, zza3);
                        }
                        j++;
                        i = i1;
                    }

                    j = i;
                }
            }
            i = j;
            if (!zziV.equals(""))
            {
                i = j + zzrg.zzk(6, zziV);
            }
            j = i;
            if (!zziW.equals(""))
            {
                j = i + zzrg.zzk(7, zziW);
            }
            i = j;
            if (zziX != 0L)
            {
                i = j + zzrg.zzd(8, zziX);
            }
            j = i;
            if (zzjb)
            {
                j = i + zzrg.zzc(9, zzjb);
            }
            i = j;
            if (zzja != null)
            {
                i = j;
                if (zzja.length > 0)
                {
                    i = 0;
                    int j1 = 0;
                    for (; i < zzja.length; i++)
                    {
                        j1 += zzrg.zzkJ(zzja[i]);
                    }

                    i = j + j1 + zzja.length * 1;
                }
            }
            j = i;
            if (zziZ != null)
            {
                j = i;
                if (zziZ.length > 0)
                {
                    int k1 = ((flag) ? 1 : 0);
                    do
                    {
                        j = i;
                        if (k1 >= zziZ.length)
                        {
                            break;
                        }
                        zza zza4 = zziZ[k1];
                        j = i;
                        if (zza4 != null)
                        {
                            j = i + zzrg.zzc(11, zza4);
                        }
                        k1++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (zziY)
            {
                i = j + zzrg.zzc(12, zziY);
            }
            return i;
        }

        public zza zzR()
        {
            type = 1;
            zziR = "";
            zziS = zzQ();
            zziT = zzQ();
            zziU = zzQ();
            zziV = "";
            zziW = "";
            zziX = 0L;
            zziY = false;
            zziZ = zzQ();
            zzja = zzrq.zzaWh;
            zzjb = false;
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            boolean flag = false;
            zzrg1.zzy(1, type);
            if (!zziR.equals(""))
            {
                zzrg1.zzb(2, zziR);
            }
            if (zziS != null && zziS.length > 0)
            {
                for (int i = 0; i < zziS.length; i++)
                {
                    zza zza1 = zziS[i];
                    if (zza1 != null)
                    {
                        zzrg1.zza(3, zza1);
                    }
                }

            }
            if (zziT != null && zziT.length > 0)
            {
                for (int j = 0; j < zziT.length; j++)
                {
                    zza zza2 = zziT[j];
                    if (zza2 != null)
                    {
                        zzrg1.zza(4, zza2);
                    }
                }

            }
            if (zziU != null && zziU.length > 0)
            {
                for (int k = 0; k < zziU.length; k++)
                {
                    zza zza3 = zziU[k];
                    if (zza3 != null)
                    {
                        zzrg1.zza(5, zza3);
                    }
                }

            }
            if (!zziV.equals(""))
            {
                zzrg1.zzb(6, zziV);
            }
            if (!zziW.equals(""))
            {
                zzrg1.zzb(7, zziW);
            }
            if (zziX != 0L)
            {
                zzrg1.zzb(8, zziX);
            }
            if (zzjb)
            {
                zzrg1.zzb(9, zzjb);
            }
            if (zzja != null && zzja.length > 0)
            {
                for (int l = 0; l < zzja.length; l++)
                {
                    zzrg1.zzy(10, zzja[l]);
                }

            }
            if (zziZ != null && zziZ.length > 0)
            {
                for (int i1 = ((flag) ? 1 : 0); i1 < zziZ.length; i1++)
                {
                    zza zza4 = zziZ[i1];
                    if (zza4 != null)
                    {
                        zzrg1.zza(11, zza4);
                    }
                }

            }
            if (zziY)
            {
                zzrg1.zzb(12, zziY);
            }
            super.zza(zzrg1);
        }

        public zzrn zzb(zzrf zzrf1)
            throws IOException
        {
            return zzl(zzrf1);
        }

        public zza zzl(zzrf zzrf1)
            throws IOException
        {
_L16:
            int i = zzrf1.zzBr();
            i;
            JVM INSTR lookupswitch 14: default 132
        //                       0: 142
        //                       8: 144
        //                       18: 212
        //                       26: 223
        //                       34: 354
        //                       42: 485
        //                       50: 616
        //                       58: 627
        //                       64: 638
        //                       72: 649
        //                       80: 660
        //                       82: 904
        //                       90: 1222
        //                       96: 1353;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
            if (zza(zzrf1, i)) goto _L16; else goto _L2
_L2:
            return this;
_L3:
            i = zzrf1.zzBu();
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
            zziR = zzrf1.readString();
            continue; /* Loop/switch isn't completed */
_L5:
            int k = zzrq.zzb(zzrf1, 26);
            zza azza[];
            if (zziS == null)
            {
                i = 0;
            } else
            {
                i = zziS.length;
            }
            azza = new zza[k + i];
            k = i;
            if (i != 0)
            {
                System.arraycopy(zziS, 0, azza, 0, i);
                k = i;
            }
            for (; k < azza.length - 1; k++)
            {
                azza[k] = new zza();
                zzrf1.zza(azza[k]);
                zzrf1.zzBr();
            }

            azza[k] = new zza();
            zzrf1.zza(azza[k]);
            zziS = azza;
            continue; /* Loop/switch isn't completed */
_L6:
            int l = zzrq.zzb(zzrf1, 34);
            zza azza1[];
            if (zziT == null)
            {
                i = 0;
            } else
            {
                i = zziT.length;
            }
            azza1 = new zza[l + i];
            l = i;
            if (i != 0)
            {
                System.arraycopy(zziT, 0, azza1, 0, i);
                l = i;
            }
            for (; l < azza1.length - 1; l++)
            {
                azza1[l] = new zza();
                zzrf1.zza(azza1[l]);
                zzrf1.zzBr();
            }

            azza1[l] = new zza();
            zzrf1.zza(azza1[l]);
            zziT = azza1;
            continue; /* Loop/switch isn't completed */
_L7:
            int i1 = zzrq.zzb(zzrf1, 42);
            zza azza2[];
            if (zziU == null)
            {
                i = 0;
            } else
            {
                i = zziU.length;
            }
            azza2 = new zza[i1 + i];
            i1 = i;
            if (i != 0)
            {
                System.arraycopy(zziU, 0, azza2, 0, i);
                i1 = i;
            }
            for (; i1 < azza2.length - 1; i1++)
            {
                azza2[i1] = new zza();
                zzrf1.zza(azza2[i1]);
                zzrf1.zzBr();
            }

            azza2[i1] = new zza();
            zzrf1.zza(azza2[i1]);
            zziU = azza2;
            continue; /* Loop/switch isn't completed */
_L8:
            zziV = zzrf1.readString();
            continue; /* Loop/switch isn't completed */
_L9:
            zziW = zzrf1.readString();
            continue; /* Loop/switch isn't completed */
_L10:
            zziX = zzrf1.zzBt();
            continue; /* Loop/switch isn't completed */
_L11:
            zzjb = zzrf1.zzBv();
            continue; /* Loop/switch isn't completed */
_L12:
            int ai[];
            int j1;
            int j2;
            j2 = zzrq.zzb(zzrf1, 80);
            ai = new int[j2];
            j1 = 0;
            i = 0;
_L22:
            if (j1 >= j2) goto _L18; else goto _L17
_L17:
            int k2;
            if (j1 != 0)
            {
                zzrf1.zzBr();
            }
            k2 = zzrf1.zzBu();
            k2;
            JVM INSTR tableswitch 1 17: default 788
        //                       1 797
        //                       2 797
        //                       3 797
        //                       4 797
        //                       5 797
        //                       6 797
        //                       7 797
        //                       8 797
        //                       9 797
        //                       10 797
        //                       11 797
        //                       12 797
        //                       13 797
        //                       14 797
        //                       15 797
        //                       16 797
        //                       17 797;
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
                if (zzja == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = zzja.length;
                }
                if (j1 == 0 && i == ai.length)
                {
                    zzja = ai;
                } else
                {
                    int ai1[] = new int[j1 + i];
                    if (j1 != 0)
                    {
                        System.arraycopy(zzja, 0, ai1, 0, j1);
                    }
                    System.arraycopy(ai, 0, ai1, j1, i);
                    zzja = ai1;
                }
            }
            continue; /* Loop/switch isn't completed */
            if (true) goto _L22; else goto _L21
_L21:
_L13:
            int i2;
            i2 = zzrf1.zzkC(zzrf1.zzBy());
            i = zzrf1.getPosition();
            j1 = 0;
_L28:
            if (zzrf1.zzBD() > 0)
            {
                switch (zzrf1.zzBu())
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
            zzrf1.zzkE(i);
            if (zzja == null)
            {
                i = 0;
            } else
            {
                i = zzja.length;
            }
            ai = new int[j1 + i];
            j1 = i;
            if (i != 0)
            {
                System.arraycopy(zzja, 0, ai, 0, i);
                j1 = i;
            }
_L26:
            if (zzrf1.zzBD() > 0)
            {
                i = zzrf1.zzBu();
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
            zzja = ai;
_L24:
            zzrf1.zzkD(i2);
            continue; /* Loop/switch isn't completed */
            if (true) goto _L26; else goto _L25
_L25:
            if (true) goto _L28; else goto _L27
_L27:
_L14:
            int k1 = zzrq.zzb(zzrf1, 90);
            zza azza3[];
            int j;
            if (zziZ == null)
            {
                j = 0;
            } else
            {
                j = zziZ.length;
            }
            azza3 = new zza[k1 + j];
            k1 = j;
            if (j != 0)
            {
                System.arraycopy(zziZ, 0, azza3, 0, j);
                k1 = j;
            }
            for (; k1 < azza3.length - 1; k1++)
            {
                azza3[k1] = new zza();
                zzrf1.zza(azza3[k1]);
                zzrf1.zzBr();
            }

            azza3[k1] = new zza();
            zzrf1.zza(azza3[k1]);
            zziZ = azza3;
            continue; /* Loop/switch isn't completed */
_L15:
            zziY = zzrf1.zzBv();
            if (true) goto _L16; else goto _L29
_L29:
        }

        public zza()
        {
            zzR();
        }
    }

}
