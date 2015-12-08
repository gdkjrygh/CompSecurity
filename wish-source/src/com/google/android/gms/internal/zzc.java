// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zznr, zznw, zzob

public interface com.google.android.gms.internal.zzc
{
    public static final class zza extends zzns
    {

        public int level;
        public int zzgc;
        public int zzgd;

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
                        if (zzgc == ((zza) (obj)).zzgc)
                        {
                            flag = flag1;
                            if (zzgd == ((zza) (obj)).zzgd)
                            {
                                return zza(((zzns) (obj)));
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return (((level + 527) * 31 + zzgc) * 31 + zzgd) * 31 + zzzM();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            if (level != 1)
            {
                zznr1.zzx(1, level);
            }
            if (zzgc != 0)
            {
                zznr1.zzx(2, zzgc);
            }
            if (zzgd != 0)
            {
                zznr1.zzx(3, zzgd);
            }
            super.zza(zznr1);
        }

        public zza zzb()
        {
            level = 1;
            zzgc = 0;
            zzgd = 0;
            zzaNT = null;
            zzaOe = -1;
            return this;
        }

        protected int zzc()
        {
            int j = super.zzc();
            int i = j;
            if (level != 1)
            {
                i = j + zznr.zzz(1, level);
            }
            j = i;
            if (zzgc != 0)
            {
                j = i + zznr.zzz(2, zzgc);
            }
            i = j;
            if (zzgd != 0)
            {
                i = j + zznr.zzz(3, zzgd);
            }
            return i;
        }

        public zza()
        {
            zzb();
        }
    }

    public static final class zzb extends zzns
    {

        private static volatile zzb zzge[];
        public int name;
        public int zzgf[];
        public int zzgg;
        public boolean zzgh;
        public boolean zzgi;

        public static zzb[] zzd()
        {
            if (zzge == null)
            {
                synchronized (zznw.zzaOd)
                {
                    if (zzge == null)
                    {
                        zzge = new zzb[0];
                    }
                }
            }
            return zzge;
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
                    if (zznw.equals(zzgf, ((zzb) (obj)).zzgf))
                    {
                        flag = flag1;
                        if (zzgg == ((zzb) (obj)).zzgg)
                        {
                            flag = flag1;
                            if (name == ((zzb) (obj)).name)
                            {
                                flag = flag1;
                                if (zzgh == ((zzb) (obj)).zzgh)
                                {
                                    flag = flag1;
                                    if (zzgi == ((zzb) (obj)).zzgi)
                                    {
                                        return zza(((zzns) (obj)));
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
            int i = zznw.hashCode(zzgf);
            int j = zzgg;
            int k = name;
            char c;
            if (zzgh)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            if (!zzgi)
            {
                c1 = '\u04D5';
            }
            return ((c + (((i + 527) * 31 + j) * 31 + k) * 31) * 31 + c1) * 31 + zzzM();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            if (zzgi)
            {
                zznr1.zzb(1, zzgi);
            }
            zznr1.zzx(2, zzgg);
            if (zzgf != null && zzgf.length > 0)
            {
                for (int i = 0; i < zzgf.length; i++)
                {
                    zznr1.zzx(3, zzgf[i]);
                }

            }
            if (name != 0)
            {
                zznr1.zzx(4, name);
            }
            if (zzgh)
            {
                zznr1.zzb(6, zzgh);
            }
            super.zza(zznr1);
        }

        protected int zzc()
        {
            int j = 0;
            int k = super.zzc();
            int i = k;
            if (zzgi)
            {
                i = k + zznr.zzc(1, zzgi);
            }
            k = zznr.zzz(2, zzgg) + i;
            if (zzgf != null && zzgf.length > 0)
            {
                for (i = 0; i < zzgf.length; i++)
                {
                    j += zznr.zzjv(zzgf[i]);
                }

                j = k + j + zzgf.length * 1;
            } else
            {
                j = k;
            }
            i = j;
            if (name != 0)
            {
                i = j + zznr.zzz(4, name);
            }
            j = i;
            if (zzgh)
            {
                j = i + zznr.zzc(6, zzgh);
            }
            return j;
        }

        public zzb zze()
        {
            zzgf = zzob.zzaOg;
            zzgg = 0;
            name = 0;
            zzgh = false;
            zzgi = false;
            zzaNT = null;
            zzaOe = -1;
            return this;
        }

        public zzb()
        {
            zze();
        }
    }

    public static final class zzc extends zzns
    {

        private static volatile zzc zzgj[];
        public String zzgk;
        public long zzgl;
        public long zzgm;
        public boolean zzgn;
        public long zzgo;

        public static zzc[] zzf()
        {
            if (zzgj == null)
            {
                synchronized (zznw.zzaOd)
                {
                    if (zzgj == null)
                    {
                        zzgj = new zzc[0];
                    }
                }
            }
            return zzgj;
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
            if (zzgk != null)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (((zzc) (obj)).zzgk != null)
            {
                continue; /* Loop/switch isn't completed */
            }
_L5:
            flag = flag1;
            if (zzgl == ((zzc) (obj)).zzgl)
            {
                flag = flag1;
                if (zzgm == ((zzc) (obj)).zzgm)
                {
                    flag = flag1;
                    if (zzgn == ((zzc) (obj)).zzgn)
                    {
                        flag = flag1;
                        if (zzgo == ((zzc) (obj)).zzgo)
                        {
                            return zza(((zzns) (obj)));
                        }
                    }
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
            if (!zzgk.equals(((zzc) (obj)).zzgk))
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
            if (zzgk == null)
            {
                i = 0;
            } else
            {
                i = zzgk.hashCode();
            }
            j = (int)(zzgl ^ zzgl >>> 32);
            k = (int)(zzgm ^ zzgm >>> 32);
            if (zzgn)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            return ((c + (((i + 527) * 31 + j) * 31 + k) * 31) * 31 + (int)(zzgo ^ zzgo >>> 32)) * 31 + zzzM();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            if (!zzgk.equals(""))
            {
                zznr1.zzb(1, zzgk);
            }
            if (zzgl != 0L)
            {
                zznr1.zzb(2, zzgl);
            }
            if (zzgm != 0x7fffffffL)
            {
                zznr1.zzb(3, zzgm);
            }
            if (zzgn)
            {
                zznr1.zzb(4, zzgn);
            }
            if (zzgo != 0L)
            {
                zznr1.zzb(5, zzgo);
            }
            super.zza(zznr1);
        }

        protected int zzc()
        {
            int j = super.zzc();
            int i = j;
            if (!zzgk.equals(""))
            {
                i = j + zznr.zzj(1, zzgk);
            }
            j = i;
            if (zzgl != 0L)
            {
                j = i + zznr.zzd(2, zzgl);
            }
            i = j;
            if (zzgm != 0x7fffffffL)
            {
                i = j + zznr.zzd(3, zzgm);
            }
            j = i;
            if (zzgn)
            {
                j = i + zznr.zzc(4, zzgn);
            }
            i = j;
            if (zzgo != 0L)
            {
                i = j + zznr.zzd(5, zzgo);
            }
            return i;
        }

        public zzc zzg()
        {
            zzgk = "";
            zzgl = 0L;
            zzgm = 0x7fffffffL;
            zzgn = false;
            zzgo = 0L;
            zzaNT = null;
            zzaOe = -1;
            return this;
        }

        public zzc()
        {
            zzg();
        }
    }

    public static final class zzd extends zzns
    {

        public zzd.zza zzgp[];
        public zzd.zza zzgq[];
        public zzc zzgr[];

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
                    if (zznw.equals(zzgp, ((zzd) (obj)).zzgp))
                    {
                        flag = flag1;
                        if (zznw.equals(zzgq, ((zzd) (obj)).zzgq))
                        {
                            flag = flag1;
                            if (zznw.equals(zzgr, ((zzd) (obj)).zzgr))
                            {
                                return zza(((zzns) (obj)));
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return (((zznw.hashCode(zzgp) + 527) * 31 + zznw.hashCode(zzgq)) * 31 + zznw.hashCode(zzgr)) * 31 + zzzM();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            boolean flag = false;
            if (zzgp != null && zzgp.length > 0)
            {
                for (int i = 0; i < zzgp.length; i++)
                {
                    zzd.zza zza1 = zzgp[i];
                    if (zza1 != null)
                    {
                        zznr1.zza(1, zza1);
                    }
                }

            }
            if (zzgq != null && zzgq.length > 0)
            {
                for (int j = 0; j < zzgq.length; j++)
                {
                    zzd.zza zza2 = zzgq[j];
                    if (zza2 != null)
                    {
                        zznr1.zza(2, zza2);
                    }
                }

            }
            if (zzgr != null && zzgr.length > 0)
            {
                for (int k = ((flag) ? 1 : 0); k < zzgr.length; k++)
                {
                    zzc zzc1 = zzgr[k];
                    if (zzc1 != null)
                    {
                        zznr1.zza(3, zzc1);
                    }
                }

            }
            super.zza(zznr1);
        }

        protected int zzc()
        {
            boolean flag = false;
            int i = super.zzc();
            int j = i;
            if (zzgp != null)
            {
                j = i;
                if (zzgp.length > 0)
                {
                    for (j = 0; j < zzgp.length;)
                    {
                        zzd.zza zza1 = zzgp[j];
                        int i1 = i;
                        if (zza1 != null)
                        {
                            i1 = i + zznr.zzc(1, zza1);
                        }
                        j++;
                        i = i1;
                    }

                    j = i;
                }
            }
            i = j;
            if (zzgq != null)
            {
                i = j;
                if (zzgq.length > 0)
                {
                    i = j;
                    for (int k = 0; k < zzgq.length;)
                    {
                        zzd.zza zza2 = zzgq[k];
                        int j1 = i;
                        if (zza2 != null)
                        {
                            j1 = i + zznr.zzc(2, zza2);
                        }
                        k++;
                        i = j1;
                    }

                }
            }
            int k1 = i;
            if (zzgr != null)
            {
                k1 = i;
                if (zzgr.length > 0)
                {
                    int l = ((flag) ? 1 : 0);
                    do
                    {
                        k1 = i;
                        if (l >= zzgr.length)
                        {
                            break;
                        }
                        zzc zzc1 = zzgr[l];
                        k1 = i;
                        if (zzc1 != null)
                        {
                            k1 = i + zznr.zzc(3, zzc1);
                        }
                        l++;
                        i = k1;
                    } while (true);
                }
            }
            return k1;
        }

        public zzd zzh()
        {
            zzgp = com.google.android.gms.internal.zzd.zza.zzr();
            zzgq = com.google.android.gms.internal.zzd.zza.zzr();
            zzgr = zzc.zzf();
            zzaNT = null;
            zzaOe = -1;
            return this;
        }

        public zzd()
        {
            zzh();
        }
    }

    public static final class zze extends zzns
    {

        private static volatile zze zzgs[];
        public int key;
        public int value;

        public static zze[] zzi()
        {
            if (zzgs == null)
            {
                synchronized (zznw.zzaOd)
                {
                    if (zzgs == null)
                    {
                        zzgs = new zze[0];
                    }
                }
            }
            return zzgs;
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
                            return zza(((zzns) (obj)));
                        }
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return ((key + 527) * 31 + value) * 31 + zzzM();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            zznr1.zzx(1, key);
            zznr1.zzx(2, value);
            super.zza(zznr1);
        }

        protected int zzc()
        {
            return super.zzc() + zznr.zzz(1, key) + zznr.zzz(2, value);
        }

        public zze zzj()
        {
            key = 0;
            value = 0;
            zzaNT = null;
            zzaOe = -1;
            return this;
        }

        public zze()
        {
            zzj();
        }
    }

    public static final class zzf extends zzns
    {

        public String version;
        public zzg zzgA[];
        public String zzgB;
        public String zzgC;
        public String zzgD;
        public zza zzgE;
        public float zzgF;
        public boolean zzgG;
        public String zzgH[];
        public int zzgI;
        public String zzgt[];
        public String zzgu[];
        public zzd.zza zzgv[];
        public zze zzgw[];
        public zzb zzgx[];
        public zzb zzgy[];
        public zzb zzgz[];

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
            if (!zznw.equals(zzgt, ((zzf) (obj)).zzgt)) goto _L4; else goto _L5
_L5:
            flag = flag1;
            if (!zznw.equals(zzgu, ((zzf) (obj)).zzgu)) goto _L4; else goto _L6
_L6:
            flag = flag1;
            if (!zznw.equals(zzgv, ((zzf) (obj)).zzgv)) goto _L4; else goto _L7
_L7:
            flag = flag1;
            if (!zznw.equals(zzgw, ((zzf) (obj)).zzgw)) goto _L4; else goto _L8
_L8:
            flag = flag1;
            if (!zznw.equals(zzgx, ((zzf) (obj)).zzgx)) goto _L4; else goto _L9
_L9:
            flag = flag1;
            if (!zznw.equals(zzgy, ((zzf) (obj)).zzgy)) goto _L4; else goto _L10
_L10:
            flag = flag1;
            if (!zznw.equals(zzgz, ((zzf) (obj)).zzgz)) goto _L4; else goto _L11
_L11:
            flag = flag1;
            if (!zznw.equals(zzgA, ((zzf) (obj)).zzgA)) goto _L4; else goto _L12
_L12:
            if (zzgB != null) goto _L14; else goto _L13
_L13:
            flag = flag1;
            if (((zzf) (obj)).zzgB != null) goto _L4; else goto _L15
_L15:
            if (zzgC != null) goto _L17; else goto _L16
_L16:
            flag = flag1;
            if (((zzf) (obj)).zzgC != null) goto _L4; else goto _L18
_L18:
            if (zzgD != null) goto _L20; else goto _L19
_L19:
            flag = flag1;
            if (((zzf) (obj)).zzgD != null) goto _L4; else goto _L21
_L21:
            if (version != null) goto _L23; else goto _L22
_L22:
            flag = flag1;
            if (((zzf) (obj)).version != null) goto _L4; else goto _L24
_L24:
            if (zzgE != null)
            {
                break MISSING_BLOCK_LABEL_364;
            }
            flag = flag1;
            if (((zzf) (obj)).zzgE != null) goto _L4; else goto _L25
_L25:
            flag = flag1;
            if (Float.floatToIntBits(zzgF) == Float.floatToIntBits(((zzf) (obj)).zzgF))
            {
                flag = flag1;
                if (zzgG == ((zzf) (obj)).zzgG)
                {
                    flag = flag1;
                    if (zznw.equals(zzgH, ((zzf) (obj)).zzgH))
                    {
                        flag = flag1;
                        if (zzgI == ((zzf) (obj)).zzgI)
                        {
                            return zza(((zzns) (obj)));
                        }
                    }
                }
            }
              goto _L4
_L14:
            if (!zzgB.equals(((zzf) (obj)).zzgB))
            {
                return false;
            }
              goto _L15
_L17:
            if (!zzgC.equals(((zzf) (obj)).zzgC))
            {
                return false;
            }
              goto _L18
_L20:
            if (!zzgD.equals(((zzf) (obj)).zzgD))
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
            if (!zzgE.equals(((zzf) (obj)).zzgE))
            {
                return false;
            }
              goto _L25
        }

        public int hashCode()
        {
            int i1 = 0;
            int j1 = zznw.hashCode(zzgt);
            int k1 = zznw.hashCode(zzgu);
            int l1 = zznw.hashCode(zzgv);
            int i2 = zznw.hashCode(zzgw);
            int j2 = zznw.hashCode(zzgx);
            int k2 = zznw.hashCode(zzgy);
            int l2 = zznw.hashCode(zzgz);
            int i3 = zznw.hashCode(zzgA);
            int i;
            int j;
            int k;
            int l;
            char c;
            int j3;
            if (zzgB == null)
            {
                i = 0;
            } else
            {
                i = zzgB.hashCode();
            }
            if (zzgC == null)
            {
                j = 0;
            } else
            {
                j = zzgC.hashCode();
            }
            if (zzgD == null)
            {
                k = 0;
            } else
            {
                k = zzgD.hashCode();
            }
            if (version == null)
            {
                l = 0;
            } else
            {
                l = version.hashCode();
            }
            if (zzgE != null)
            {
                i1 = zzgE.hashCode();
            }
            j3 = Float.floatToIntBits(zzgF);
            if (zzgG)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            return (((c + (((l + (k + (j + (i + ((((((((j1 + 527) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31) * 31) * 31) * 31) * 31 + i1) * 31 + j3) * 31) * 31 + zznw.hashCode(zzgH)) * 31 + zzgI) * 31 + zzzM();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            boolean flag = false;
            if (zzgu != null && zzgu.length > 0)
            {
                for (int i = 0; i < zzgu.length; i++)
                {
                    String s = zzgu[i];
                    if (s != null)
                    {
                        zznr1.zzb(1, s);
                    }
                }

            }
            if (zzgv != null && zzgv.length > 0)
            {
                for (int j = 0; j < zzgv.length; j++)
                {
                    zzd.zza zza1 = zzgv[j];
                    if (zza1 != null)
                    {
                        zznr1.zza(2, zza1);
                    }
                }

            }
            if (zzgw != null && zzgw.length > 0)
            {
                for (int k = 0; k < zzgw.length; k++)
                {
                    zze zze1 = zzgw[k];
                    if (zze1 != null)
                    {
                        zznr1.zza(3, zze1);
                    }
                }

            }
            if (zzgx != null && zzgx.length > 0)
            {
                for (int l = 0; l < zzgx.length; l++)
                {
                    zzb zzb1 = zzgx[l];
                    if (zzb1 != null)
                    {
                        zznr1.zza(4, zzb1);
                    }
                }

            }
            if (zzgy != null && zzgy.length > 0)
            {
                for (int i1 = 0; i1 < zzgy.length; i1++)
                {
                    zzb zzb2 = zzgy[i1];
                    if (zzb2 != null)
                    {
                        zznr1.zza(5, zzb2);
                    }
                }

            }
            if (zzgz != null && zzgz.length > 0)
            {
                for (int j1 = 0; j1 < zzgz.length; j1++)
                {
                    zzb zzb3 = zzgz[j1];
                    if (zzb3 != null)
                    {
                        zznr1.zza(6, zzb3);
                    }
                }

            }
            if (zzgA != null && zzgA.length > 0)
            {
                for (int k1 = 0; k1 < zzgA.length; k1++)
                {
                    zzg zzg1 = zzgA[k1];
                    if (zzg1 != null)
                    {
                        zznr1.zza(7, zzg1);
                    }
                }

            }
            if (!zzgB.equals(""))
            {
                zznr1.zzb(9, zzgB);
            }
            if (!zzgC.equals(""))
            {
                zznr1.zzb(10, zzgC);
            }
            if (!zzgD.equals("0"))
            {
                zznr1.zzb(12, zzgD);
            }
            if (!version.equals(""))
            {
                zznr1.zzb(13, version);
            }
            if (zzgE != null)
            {
                zznr1.zza(14, zzgE);
            }
            if (Float.floatToIntBits(zzgF) != Float.floatToIntBits(0.0F))
            {
                zznr1.zzb(15, zzgF);
            }
            if (zzgH != null && zzgH.length > 0)
            {
                for (int l1 = 0; l1 < zzgH.length; l1++)
                {
                    String s1 = zzgH[l1];
                    if (s1 != null)
                    {
                        zznr1.zzb(16, s1);
                    }
                }

            }
            if (zzgI != 0)
            {
                zznr1.zzx(17, zzgI);
            }
            if (zzgG)
            {
                zznr1.zzb(18, zzgG);
            }
            if (zzgt != null && zzgt.length > 0)
            {
                for (int i2 = ((flag) ? 1 : 0); i2 < zzgt.length; i2++)
                {
                    String s2 = zzgt[i2];
                    if (s2 != null)
                    {
                        zznr1.zzb(19, s2);
                    }
                }

            }
            super.zza(zznr1);
        }

        protected int zzc()
        {
            boolean flag = false;
            int k4 = super.zzc();
            int j;
            int k;
            int k2;
            if (zzgu != null && zzgu.length > 0)
            {
                int i = 0;
                k = 0;
                int l;
                int i3;
                for (l = 0; i < zzgu.length; l = i3)
                {
                    String s = zzgu[i];
                    int l3 = k;
                    i3 = l;
                    if (s != null)
                    {
                        i3 = l + 1;
                        l3 = k + zznr.zzeK(s);
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
            if (zzgv != null)
            {
                j = k;
                if (zzgv.length > 0)
                {
                    j = k;
                    for (k = 0; k < zzgv.length;)
                    {
                        zzd.zza zza1 = zzgv[k];
                        int i1 = j;
                        if (zza1 != null)
                        {
                            i1 = j + zznr.zzc(2, zza1);
                        }
                        k++;
                        j = i1;
                    }

                }
            }
            k = j;
            if (zzgw != null)
            {
                k = j;
                if (zzgw.length > 0)
                {
                    for (k = 0; k < zzgw.length;)
                    {
                        zze zze1 = zzgw[k];
                        int j1 = j;
                        if (zze1 != null)
                        {
                            j1 = j + zznr.zzc(3, zze1);
                        }
                        k++;
                        j = j1;
                    }

                    k = j;
                }
            }
            j = k;
            if (zzgx != null)
            {
                j = k;
                if (zzgx.length > 0)
                {
                    j = k;
                    for (k = 0; k < zzgx.length;)
                    {
                        zzb zzb1 = zzgx[k];
                        int k1 = j;
                        if (zzb1 != null)
                        {
                            k1 = j + zznr.zzc(4, zzb1);
                        }
                        k++;
                        j = k1;
                    }

                }
            }
            k = j;
            if (zzgy != null)
            {
                k = j;
                if (zzgy.length > 0)
                {
                    for (k = 0; k < zzgy.length;)
                    {
                        zzb zzb2 = zzgy[k];
                        int l1 = j;
                        if (zzb2 != null)
                        {
                            l1 = j + zznr.zzc(5, zzb2);
                        }
                        k++;
                        j = l1;
                    }

                    k = j;
                }
            }
            j = k;
            if (zzgz != null)
            {
                j = k;
                if (zzgz.length > 0)
                {
                    j = k;
                    for (k = 0; k < zzgz.length;)
                    {
                        zzb zzb3 = zzgz[k];
                        int i2 = j;
                        if (zzb3 != null)
                        {
                            i2 = j + zznr.zzc(6, zzb3);
                        }
                        k++;
                        j = i2;
                    }

                }
            }
            k = j;
            if (zzgA != null)
            {
                k = j;
                if (zzgA.length > 0)
                {
                    for (k = 0; k < zzgA.length;)
                    {
                        zzg zzg1 = zzgA[k];
                        int j2 = j;
                        if (zzg1 != null)
                        {
                            j2 = j + zznr.zzc(7, zzg1);
                        }
                        k++;
                        j = j2;
                    }

                    k = j;
                }
            }
            j = k;
            if (!zzgB.equals(""))
            {
                j = k + zznr.zzj(9, zzgB);
            }
            k = j;
            if (!zzgC.equals(""))
            {
                k = j + zznr.zzj(10, zzgC);
            }
            j = k;
            if (!zzgD.equals("0"))
            {
                j = k + zznr.zzj(12, zzgD);
            }
            k = j;
            if (!version.equals(""))
            {
                k = j + zznr.zzj(13, version);
            }
            k2 = k;
            if (zzgE != null)
            {
                k2 = k + zznr.zzc(14, zzgE);
            }
            j = k2;
            if (Float.floatToIntBits(zzgF) != Float.floatToIntBits(0.0F))
            {
                j = k2 + zznr.zzc(15, zzgF);
            }
            k = j;
            if (zzgH != null)
            {
                k = j;
                if (zzgH.length > 0)
                {
                    k = 0;
                    k2 = 0;
                    int j3;
                    int i4;
                    for (j3 = 0; k < zzgH.length; j3 = i4)
                    {
                        String s1 = zzgH[k];
                        k4 = k2;
                        i4 = j3;
                        if (s1 != null)
                        {
                            i4 = j3 + 1;
                            k4 = k2 + zznr.zzeK(s1);
                        }
                        k++;
                        k2 = k4;
                    }

                    k = j + k2 + j3 * 2;
                }
            }
            k2 = k;
            if (zzgI != 0)
            {
                k2 = k + zznr.zzz(17, zzgI);
            }
            j = k2;
            if (zzgG)
            {
                j = k2 + zznr.zzc(18, zzgG);
            }
            k = j;
            if (zzgt != null)
            {
                k = j;
                if (zzgt.length > 0)
                {
                    int l2 = 0;
                    int k3 = 0;
                    for (k = ((flag) ? 1 : 0); k < zzgt.length;)
                    {
                        String s2 = zzgt[k];
                        k4 = l2;
                        int j4 = k3;
                        if (s2 != null)
                        {
                            j4 = k3 + 1;
                            k4 = l2 + zznr.zzeK(s2);
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

        public zzf zzk()
        {
            zzgt = zzob.zzaOl;
            zzgu = zzob.zzaOl;
            zzgv = com.google.android.gms.internal.zzd.zza.zzr();
            zzgw = zze.zzi();
            zzgx = zzb.zzd();
            zzgy = zzb.zzd();
            zzgz = zzb.zzd();
            zzgA = zzg.zzl();
            zzgB = "";
            zzgC = "";
            zzgD = "0";
            version = "";
            zzgE = null;
            zzgF = 0.0F;
            zzgG = false;
            zzgH = zzob.zzaOl;
            zzgI = 0;
            zzaNT = null;
            zzaOe = -1;
            return this;
        }

        public zzf()
        {
            zzk();
        }
    }

    public static final class zzg extends zzns
    {

        private static volatile zzg zzgJ[];
        public int zzgK[];
        public int zzgL[];
        public int zzgM[];
        public int zzgN[];
        public int zzgO[];
        public int zzgP[];
        public int zzgQ[];
        public int zzgR[];
        public int zzgS[];
        public int zzgT[];

        public static zzg[] zzl()
        {
            if (zzgJ == null)
            {
                synchronized (zznw.zzaOd)
                {
                    if (zzgJ == null)
                    {
                        zzgJ = new zzg[0];
                    }
                }
            }
            return zzgJ;
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
                    if (zznw.equals(zzgK, ((zzg) (obj)).zzgK))
                    {
                        flag = flag1;
                        if (zznw.equals(zzgL, ((zzg) (obj)).zzgL))
                        {
                            flag = flag1;
                            if (zznw.equals(zzgM, ((zzg) (obj)).zzgM))
                            {
                                flag = flag1;
                                if (zznw.equals(zzgN, ((zzg) (obj)).zzgN))
                                {
                                    flag = flag1;
                                    if (zznw.equals(zzgO, ((zzg) (obj)).zzgO))
                                    {
                                        flag = flag1;
                                        if (zznw.equals(zzgP, ((zzg) (obj)).zzgP))
                                        {
                                            flag = flag1;
                                            if (zznw.equals(zzgQ, ((zzg) (obj)).zzgQ))
                                            {
                                                flag = flag1;
                                                if (zznw.equals(zzgR, ((zzg) (obj)).zzgR))
                                                {
                                                    flag = flag1;
                                                    if (zznw.equals(zzgS, ((zzg) (obj)).zzgS))
                                                    {
                                                        flag = flag1;
                                                        if (zznw.equals(zzgT, ((zzg) (obj)).zzgT))
                                                        {
                                                            return zza(((zzns) (obj)));
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
            return ((((((((((zznw.hashCode(zzgK) + 527) * 31 + zznw.hashCode(zzgL)) * 31 + zznw.hashCode(zzgM)) * 31 + zznw.hashCode(zzgN)) * 31 + zznw.hashCode(zzgO)) * 31 + zznw.hashCode(zzgP)) * 31 + zznw.hashCode(zzgQ)) * 31 + zznw.hashCode(zzgR)) * 31 + zznw.hashCode(zzgS)) * 31 + zznw.hashCode(zzgT)) * 31 + zzzM();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            boolean flag = false;
            if (zzgK != null && zzgK.length > 0)
            {
                for (int i = 0; i < zzgK.length; i++)
                {
                    zznr1.zzx(1, zzgK[i]);
                }

            }
            if (zzgL != null && zzgL.length > 0)
            {
                for (int j = 0; j < zzgL.length; j++)
                {
                    zznr1.zzx(2, zzgL[j]);
                }

            }
            if (zzgM != null && zzgM.length > 0)
            {
                for (int k = 0; k < zzgM.length; k++)
                {
                    zznr1.zzx(3, zzgM[k]);
                }

            }
            if (zzgN != null && zzgN.length > 0)
            {
                for (int l = 0; l < zzgN.length; l++)
                {
                    zznr1.zzx(4, zzgN[l]);
                }

            }
            if (zzgO != null && zzgO.length > 0)
            {
                for (int i1 = 0; i1 < zzgO.length; i1++)
                {
                    zznr1.zzx(5, zzgO[i1]);
                }

            }
            if (zzgP != null && zzgP.length > 0)
            {
                for (int j1 = 0; j1 < zzgP.length; j1++)
                {
                    zznr1.zzx(6, zzgP[j1]);
                }

            }
            if (zzgQ != null && zzgQ.length > 0)
            {
                for (int k1 = 0; k1 < zzgQ.length; k1++)
                {
                    zznr1.zzx(7, zzgQ[k1]);
                }

            }
            if (zzgR != null && zzgR.length > 0)
            {
                for (int l1 = 0; l1 < zzgR.length; l1++)
                {
                    zznr1.zzx(8, zzgR[l1]);
                }

            }
            if (zzgS != null && zzgS.length > 0)
            {
                for (int i2 = 0; i2 < zzgS.length; i2++)
                {
                    zznr1.zzx(9, zzgS[i2]);
                }

            }
            if (zzgT != null && zzgT.length > 0)
            {
                for (int j2 = ((flag) ? 1 : 0); j2 < zzgT.length; j2++)
                {
                    zznr1.zzx(10, zzgT[j2]);
                }

            }
            super.zza(zznr1);
        }

        protected int zzc()
        {
            boolean flag = false;
            int l = super.zzc();
            int j;
            int k;
            if (zzgK != null && zzgK.length > 0)
            {
                int i = 0;
                k = 0;
                for (; i < zzgK.length; i++)
                {
                    k += zznr.zzjv(zzgK[i]);
                }

                k = l + k + zzgK.length * 1;
            } else
            {
                k = l;
            }
            j = k;
            if (zzgL != null)
            {
                j = k;
                if (zzgL.length > 0)
                {
                    j = 0;
                    l = 0;
                    for (; j < zzgL.length; j++)
                    {
                        l += zznr.zzjv(zzgL[j]);
                    }

                    j = k + l + zzgL.length * 1;
                }
            }
            k = j;
            if (zzgM != null)
            {
                k = j;
                if (zzgM.length > 0)
                {
                    k = 0;
                    l = 0;
                    for (; k < zzgM.length; k++)
                    {
                        l += zznr.zzjv(zzgM[k]);
                    }

                    k = j + l + zzgM.length * 1;
                }
            }
            j = k;
            if (zzgN != null)
            {
                j = k;
                if (zzgN.length > 0)
                {
                    j = 0;
                    l = 0;
                    for (; j < zzgN.length; j++)
                    {
                        l += zznr.zzjv(zzgN[j]);
                    }

                    j = k + l + zzgN.length * 1;
                }
            }
            k = j;
            if (zzgO != null)
            {
                k = j;
                if (zzgO.length > 0)
                {
                    k = 0;
                    l = 0;
                    for (; k < zzgO.length; k++)
                    {
                        l += zznr.zzjv(zzgO[k]);
                    }

                    k = j + l + zzgO.length * 1;
                }
            }
            j = k;
            if (zzgP != null)
            {
                j = k;
                if (zzgP.length > 0)
                {
                    j = 0;
                    l = 0;
                    for (; j < zzgP.length; j++)
                    {
                        l += zznr.zzjv(zzgP[j]);
                    }

                    j = k + l + zzgP.length * 1;
                }
            }
            k = j;
            if (zzgQ != null)
            {
                k = j;
                if (zzgQ.length > 0)
                {
                    k = 0;
                    l = 0;
                    for (; k < zzgQ.length; k++)
                    {
                        l += zznr.zzjv(zzgQ[k]);
                    }

                    k = j + l + zzgQ.length * 1;
                }
            }
            j = k;
            if (zzgR != null)
            {
                j = k;
                if (zzgR.length > 0)
                {
                    j = 0;
                    l = 0;
                    for (; j < zzgR.length; j++)
                    {
                        l += zznr.zzjv(zzgR[j]);
                    }

                    j = k + l + zzgR.length * 1;
                }
            }
            k = j;
            if (zzgS != null)
            {
                k = j;
                if (zzgS.length > 0)
                {
                    k = 0;
                    l = 0;
                    for (; k < zzgS.length; k++)
                    {
                        l += zznr.zzjv(zzgS[k]);
                    }

                    k = j + l + zzgS.length * 1;
                }
            }
            j = k;
            if (zzgT != null)
            {
                j = k;
                if (zzgT.length > 0)
                {
                    l = 0;
                    for (j = ((flag) ? 1 : 0); j < zzgT.length; j++)
                    {
                        l += zznr.zzjv(zzgT[j]);
                    }

                    j = k + l + zzgT.length * 1;
                }
            }
            return j;
        }

        public zzg zzm()
        {
            zzgK = zzob.zzaOg;
            zzgL = zzob.zzaOg;
            zzgM = zzob.zzaOg;
            zzgN = zzob.zzaOg;
            zzgO = zzob.zzaOg;
            zzgP = zzob.zzaOg;
            zzgQ = zzob.zzaOg;
            zzgR = zzob.zzaOg;
            zzgS = zzob.zzaOg;
            zzgT = zzob.zzaOg;
            zzaNT = null;
            zzaOe = -1;
            return this;
        }

        public zzg()
        {
            zzm();
        }
    }

    public static final class zzi extends zzns
    {

        private static volatile zzi zzhd[];
        public String name;
        public zzd.zza zzhe;
        public zzd zzhf;

        public static zzi[] zzo()
        {
            if (zzhd == null)
            {
                synchronized (zznw.zzaOd)
                {
                    if (zzhd == null)
                    {
                        zzhd = new zzi[0];
                    }
                }
            }
            return zzhd;
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
            if (zzhe != null) goto _L9; else goto _L8
_L8:
            flag = flag1;
            if (((zzi) (obj)).zzhe != null) goto _L4; else goto _L10
_L10:
            if (zzhf != null)
            {
                break MISSING_BLOCK_LABEL_111;
            }
            flag = flag1;
            if (((zzi) (obj)).zzhf != null) goto _L4; else goto _L11
_L11:
            return zza(((zzns) (obj)));
_L6:
            if (!name.equals(((zzi) (obj)).name))
            {
                return false;
            }
              goto _L7
_L9:
            if (!zzhe.equals(((zzi) (obj)).zzhe))
            {
                return false;
            }
              goto _L10
            if (!zzhf.equals(((zzi) (obj)).zzhf))
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
            if (zzhe == null)
            {
                j = 0;
            } else
            {
                j = zzhe.hashCode();
            }
            if (zzhf != null)
            {
                k = zzhf.hashCode();
            }
            return ((j + (i + 527) * 31) * 31 + k) * 31 + zzzM();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            if (!name.equals(""))
            {
                zznr1.zzb(1, name);
            }
            if (zzhe != null)
            {
                zznr1.zza(2, zzhe);
            }
            if (zzhf != null)
            {
                zznr1.zza(3, zzhf);
            }
            super.zza(zznr1);
        }

        protected int zzc()
        {
            int j = super.zzc();
            int i = j;
            if (!name.equals(""))
            {
                i = j + zznr.zzj(1, name);
            }
            j = i;
            if (zzhe != null)
            {
                j = i + zznr.zzc(2, zzhe);
            }
            i = j;
            if (zzhf != null)
            {
                i = j + zznr.zzc(3, zzhf);
            }
            return i;
        }

        public zzi zzp()
        {
            name = "";
            zzhe = null;
            zzhf = null;
            zzaNT = null;
            zzaOe = -1;
            return this;
        }

        public zzi()
        {
            zzp();
        }
    }

    public static final class zzj extends zzns
    {

        public zzi zzhg[];
        public zzf zzhh;
        public String zzhi;

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
            if (!zznw.equals(zzhg, ((zzj) (obj)).zzhg)) goto _L4; else goto _L5
_L5:
            if (zzhh != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((zzj) (obj)).zzhh != null) goto _L4; else goto _L8
_L8:
            if (zzhi != null)
            {
                break MISSING_BLOCK_LABEL_95;
            }
            flag = flag1;
            if (((zzj) (obj)).zzhi != null) goto _L4; else goto _L9
_L9:
            return zza(((zzns) (obj)));
_L7:
            if (!zzhh.equals(((zzj) (obj)).zzhh))
            {
                return false;
            }
              goto _L8
            if (!zzhi.equals(((zzj) (obj)).zzhi))
            {
                return false;
            }
              goto _L9
        }

        public int hashCode()
        {
            int j = 0;
            int k = zznw.hashCode(zzhg);
            int i;
            if (zzhh == null)
            {
                i = 0;
            } else
            {
                i = zzhh.hashCode();
            }
            if (zzhi != null)
            {
                j = zzhi.hashCode();
            }
            return ((i + (k + 527) * 31) * 31 + j) * 31 + zzzM();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            if (zzhg != null && zzhg.length > 0)
            {
                for (int i = 0; i < zzhg.length; i++)
                {
                    zzi zzi1 = zzhg[i];
                    if (zzi1 != null)
                    {
                        zznr1.zza(1, zzi1);
                    }
                }

            }
            if (zzhh != null)
            {
                zznr1.zza(2, zzhh);
            }
            if (!zzhi.equals(""))
            {
                zznr1.zzb(3, zzhi);
            }
            super.zza(zznr1);
        }

        protected int zzc()
        {
            int i = super.zzc();
            int j = i;
            if (zzhg != null)
            {
                j = i;
                if (zzhg.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= zzhg.length)
                        {
                            break;
                        }
                        zzi zzi1 = zzhg[k];
                        j = i;
                        if (zzi1 != null)
                        {
                            j = i + zznr.zzc(1, zzi1);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (zzhh != null)
            {
                i = j + zznr.zzc(2, zzhh);
            }
            j = i;
            if (!zzhi.equals(""))
            {
                j = i + zznr.zzj(3, zzhi);
            }
            return j;
        }

        public zzj zzq()
        {
            zzhg = zzi.zzo();
            zzhh = null;
            zzhi = "";
            zzaNT = null;
            zzaOe = -1;
            return this;
        }

        public zzj()
        {
            zzq();
        }
    }

}
