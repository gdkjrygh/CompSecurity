// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zznw, zznr, zzob

public interface zzd
{
    public static final class zza extends zzns
    {

        private static volatile zza zzhj[];
        public int type;
        public String zzhk;
        public zza zzhl[];
        public zza zzhm[];
        public zza zzhn[];
        public String zzho;
        public String zzhp;
        public long zzhq;
        public boolean zzhr;
        public zza zzhs[];
        public int zzht[];
        public boolean zzhu;

        public static zza[] zzr()
        {
            if (zzhj == null)
            {
                synchronized (zznw.zzaOd)
                {
                    if (zzhj == null)
                    {
                        zzhj = new zza[0];
                    }
                }
            }
            return zzhj;
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
            if (zzhk != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((zza) (obj)).zzhk != null) goto _L4; else goto _L8
_L8:
            flag = flag1;
            if (!zznw.equals(zzhl, ((zza) (obj)).zzhl)) goto _L4; else goto _L9
_L9:
            flag = flag1;
            if (!zznw.equals(zzhm, ((zza) (obj)).zzhm)) goto _L4; else goto _L10
_L10:
            flag = flag1;
            if (!zznw.equals(zzhn, ((zza) (obj)).zzhn)) goto _L4; else goto _L11
_L11:
            if (zzho != null) goto _L13; else goto _L12
_L12:
            flag = flag1;
            if (((zza) (obj)).zzho != null) goto _L4; else goto _L14
_L14:
            if (zzhp != null)
            {
                break MISSING_BLOCK_LABEL_244;
            }
            flag = flag1;
            if (((zza) (obj)).zzhp != null) goto _L4; else goto _L15
_L15:
            flag = flag1;
            if (zzhq == ((zza) (obj)).zzhq)
            {
                flag = flag1;
                if (zzhr == ((zza) (obj)).zzhr)
                {
                    flag = flag1;
                    if (zznw.equals(zzhs, ((zza) (obj)).zzhs))
                    {
                        flag = flag1;
                        if (zznw.equals(zzht, ((zza) (obj)).zzht))
                        {
                            flag = flag1;
                            if (zzhu == ((zza) (obj)).zzhu)
                            {
                                return zza(((zzns) (obj)));
                            }
                        }
                    }
                }
            }
              goto _L4
_L7:
            if (!zzhk.equals(((zza) (obj)).zzhk))
            {
                return false;
            }
              goto _L8
_L13:
            if (!zzho.equals(((zza) (obj)).zzho))
            {
                return false;
            }
              goto _L14
            if (!zzhp.equals(((zza) (obj)).zzhp))
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
            if (zzhk == null)
            {
                i = 0;
            } else
            {
                i = zzhk.hashCode();
            }
            i1 = zznw.hashCode(zzhl);
            j1 = zznw.hashCode(zzhm);
            k1 = zznw.hashCode(zzhn);
            if (zzho == null)
            {
                j = 0;
            } else
            {
                j = zzho.hashCode();
            }
            if (zzhp != null)
            {
                k = zzhp.hashCode();
            }
            l1 = (int)(zzhq ^ zzhq >>> 32);
            if (zzhr)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            i2 = zznw.hashCode(zzhs);
            j2 = zznw.hashCode(zzht);
            if (!zzhu)
            {
                c1 = '\u04D5';
            }
            return ((((c + (((j + ((((i + (l + 527) * 31) * 31 + i1) * 31 + j1) * 31 + k1) * 31) * 31 + k) * 31 + l1) * 31) * 31 + i2) * 31 + j2) * 31 + c1) * 31 + zzzM();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            boolean flag = false;
            zznr1.zzx(1, type);
            if (!zzhk.equals(""))
            {
                zznr1.zzb(2, zzhk);
            }
            if (zzhl != null && zzhl.length > 0)
            {
                for (int i = 0; i < zzhl.length; i++)
                {
                    zza zza1 = zzhl[i];
                    if (zza1 != null)
                    {
                        zznr1.zza(3, zza1);
                    }
                }

            }
            if (zzhm != null && zzhm.length > 0)
            {
                for (int j = 0; j < zzhm.length; j++)
                {
                    zza zza2 = zzhm[j];
                    if (zza2 != null)
                    {
                        zznr1.zza(4, zza2);
                    }
                }

            }
            if (zzhn != null && zzhn.length > 0)
            {
                for (int k = 0; k < zzhn.length; k++)
                {
                    zza zza3 = zzhn[k];
                    if (zza3 != null)
                    {
                        zznr1.zza(5, zza3);
                    }
                }

            }
            if (!zzho.equals(""))
            {
                zznr1.zzb(6, zzho);
            }
            if (!zzhp.equals(""))
            {
                zznr1.zzb(7, zzhp);
            }
            if (zzhq != 0L)
            {
                zznr1.zzb(8, zzhq);
            }
            if (zzhu)
            {
                zznr1.zzb(9, zzhu);
            }
            if (zzht != null && zzht.length > 0)
            {
                for (int l = 0; l < zzht.length; l++)
                {
                    zznr1.zzx(10, zzht[l]);
                }

            }
            if (zzhs != null && zzhs.length > 0)
            {
                for (int i1 = ((flag) ? 1 : 0); i1 < zzhs.length; i1++)
                {
                    zza zza4 = zzhs[i1];
                    if (zza4 != null)
                    {
                        zznr1.zza(11, zza4);
                    }
                }

            }
            if (zzhr)
            {
                zznr1.zzb(12, zzhr);
            }
            super.zza(zznr1);
        }

        protected int zzc()
        {
            boolean flag = false;
            int j = super.zzc() + zznr.zzz(1, type);
            int i = j;
            if (!zzhk.equals(""))
            {
                i = j + zznr.zzj(2, zzhk);
            }
            j = i;
            if (zzhl != null)
            {
                j = i;
                if (zzhl.length > 0)
                {
                    for (j = 0; j < zzhl.length;)
                    {
                        zza zza1 = zzhl[j];
                        int k = i;
                        if (zza1 != null)
                        {
                            k = i + zznr.zzc(3, zza1);
                        }
                        j++;
                        i = k;
                    }

                    j = i;
                }
            }
            i = j;
            if (zzhm != null)
            {
                i = j;
                if (zzhm.length > 0)
                {
                    i = j;
                    for (j = 0; j < zzhm.length;)
                    {
                        zza zza2 = zzhm[j];
                        int l = i;
                        if (zza2 != null)
                        {
                            l = i + zznr.zzc(4, zza2);
                        }
                        j++;
                        i = l;
                    }

                }
            }
            j = i;
            if (zzhn != null)
            {
                j = i;
                if (zzhn.length > 0)
                {
                    for (j = 0; j < zzhn.length;)
                    {
                        zza zza3 = zzhn[j];
                        int i1 = i;
                        if (zza3 != null)
                        {
                            i1 = i + zznr.zzc(5, zza3);
                        }
                        j++;
                        i = i1;
                    }

                    j = i;
                }
            }
            i = j;
            if (!zzho.equals(""))
            {
                i = j + zznr.zzj(6, zzho);
            }
            j = i;
            if (!zzhp.equals(""))
            {
                j = i + zznr.zzj(7, zzhp);
            }
            i = j;
            if (zzhq != 0L)
            {
                i = j + zznr.zzd(8, zzhq);
            }
            j = i;
            if (zzhu)
            {
                j = i + zznr.zzc(9, zzhu);
            }
            i = j;
            if (zzht != null)
            {
                i = j;
                if (zzht.length > 0)
                {
                    i = 0;
                    int j1 = 0;
                    for (; i < zzht.length; i++)
                    {
                        j1 += zznr.zzjv(zzht[i]);
                    }

                    i = j + j1 + zzht.length * 1;
                }
            }
            j = i;
            if (zzhs != null)
            {
                j = i;
                if (zzhs.length > 0)
                {
                    int k1 = ((flag) ? 1 : 0);
                    do
                    {
                        j = i;
                        if (k1 >= zzhs.length)
                        {
                            break;
                        }
                        zza zza4 = zzhs[k1];
                        j = i;
                        if (zza4 != null)
                        {
                            j = i + zznr.zzc(11, zza4);
                        }
                        k1++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (zzhr)
            {
                i = j + zznr.zzc(12, zzhr);
            }
            return i;
        }

        public zza zzs()
        {
            type = 1;
            zzhk = "";
            zzhl = zzr();
            zzhm = zzr();
            zzhn = zzr();
            zzho = "";
            zzhp = "";
            zzhq = 0L;
            zzhr = false;
            zzhs = zzr();
            zzht = zzob.zzaOg;
            zzhu = false;
            zzaNT = null;
            zzaOe = -1;
            return this;
        }

        public zza()
        {
            zzs();
        }
    }

}
