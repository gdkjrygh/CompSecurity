// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzrl, zzrg, zzrf, 
//            zzrq, zzrn

public interface zznj
{
    public static final class zza extends zzrh
    {

        public zza zzawk[];

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
                    if (zzrl.equals(zzawk, ((zza) (obj)).zzawk))
                    {
                        return zza(((zzrh) (obj)));
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return (zzrl.hashCode(zzawk) + 527) * 31 + zzBI();
        }

        protected int zzB()
        {
            int i = super.zzB();
            int k = i;
            if (zzawk != null)
            {
                k = i;
                if (zzawk.length > 0)
                {
                    int j = 0;
                    do
                    {
                        k = i;
                        if (j >= zzawk.length)
                        {
                            break;
                        }
                        zza zza1 = zzawk[j];
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

        public void zza(zzrg zzrg1)
            throws IOException
        {
            if (zzawk != null && zzawk.length > 0)
            {
                for (int i = 0; i < zzawk.length; i++)
                {
                    zza zza1 = zzawk[i];
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
            return zzp(zzrf1);
        }

        public zza zzp(zzrf zzrf1)
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
                    if (zzawk == null)
                    {
                        j = 0;
                    } else
                    {
                        j = zzawk.length;
                    }
                    azza = new zza[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(zzawk, 0, azza, 0, j);
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
                    zzawk = azza;
                    break;
                }
            } while (true);
        }

        public zza zztU()
        {
            zzawk = zza.zztV();
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public zza()
        {
            zztU();
        }
    }

    public static final class zza.zza extends zzrh
    {

        private static volatile zza.zza zzawl[];
        public int viewId;
        public String zzawm;
        public String zzawn;

        public static zza.zza[] zztV()
        {
            if (zzawl == null)
            {
                synchronized (zzrl.zzaWe)
                {
                    if (zzawl == null)
                    {
                        zzawl = new zza.zza[0];
                    }
                }
            }
            return zzawl;
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
            if (zzawm != null) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (((zza.zza) (obj)).zzawm != null) goto _L4; else goto _L7
_L7:
            if (zzawn != null)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            flag = flag1;
            if (((zza.zza) (obj)).zzawn != null) goto _L4; else goto _L8
_L8:
            flag = flag1;
            if (viewId == ((zza.zza) (obj)).viewId)
            {
                return zza(((zzrh) (obj)));
            }
              goto _L4
_L6:
            if (!zzawm.equals(((zza.zza) (obj)).zzawm))
            {
                return false;
            }
              goto _L7
            if (!zzawn.equals(((zza.zza) (obj)).zzawn))
            {
                return false;
            }
              goto _L8
        }

        public int hashCode()
        {
            int j = 0;
            int i;
            if (zzawm == null)
            {
                i = 0;
            } else
            {
                i = zzawm.hashCode();
            }
            if (zzawn != null)
            {
                j = zzawn.hashCode();
            }
            return (((i + 527) * 31 + j) * 31 + viewId) * 31 + zzBI();
        }

        protected int zzB()
        {
            int j = super.zzB();
            int i = j;
            if (!zzawm.equals(""))
            {
                i = j + zzrg.zzk(1, zzawm);
            }
            j = i;
            if (!zzawn.equals(""))
            {
                j = i + zzrg.zzk(2, zzawn);
            }
            i = j;
            if (viewId != 0)
            {
                i = j + zzrg.zzA(3, viewId);
            }
            return i;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            if (!zzawm.equals(""))
            {
                zzrg1.zzb(1, zzawm);
            }
            if (!zzawn.equals(""))
            {
                zzrg1.zzb(2, zzawn);
            }
            if (viewId != 0)
            {
                zzrg1.zzy(3, viewId);
            }
            super.zza(zzrg1);
        }

        public zzrn zzb(zzrf zzrf1)
            throws IOException
        {
            return zzq(zzrf1);
        }

        public zza.zza zzq(zzrf zzrf1)
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
                    zzawm = zzrf1.readString();
                    break;

                case 18: // '\022'
                    zzawn = zzrf1.readString();
                    break;

                case 24: // '\030'
                    viewId = zzrf1.zzBu();
                    break;
                }
            } while (true);
        }

        public zza.zza zztW()
        {
            zzawm = "";
            zzawn = "";
            viewId = 0;
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public zza.zza()
        {
            zztW();
        }
    }

    public static final class zzb extends zzrh
    {

        private static volatile zzb zzawo[];
        public String name;
        public zzd zzawp;

        public static zzb[] zztX()
        {
            if (zzawo == null)
            {
                synchronized (zzrl.zzaWe)
                {
                    if (zzawo == null)
                    {
                        zzawo = new zzb[0];
                    }
                }
            }
            return zzawo;
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
            if (!(obj instanceof zzb)) goto _L4; else goto _L3
_L3:
            obj = (zzb)obj;
            if (name != null) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (((zzb) (obj)).name != null) goto _L4; else goto _L7
_L7:
            if (zzawp != null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            flag = flag1;
            if (((zzb) (obj)).zzawp != null) goto _L4; else goto _L8
_L8:
            return zza(((zzrh) (obj)));
_L6:
            if (!name.equals(((zzb) (obj)).name))
            {
                return false;
            }
              goto _L7
            if (!zzawp.equals(((zzb) (obj)).zzawp))
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
            if (zzawp != null)
            {
                j = zzawp.hashCode();
            }
            return ((i + 527) * 31 + j) * 31 + zzBI();
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
            if (zzawp != null)
            {
                j = i + zzrg.zzc(2, zzawp);
            }
            return j;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            if (!name.equals(""))
            {
                zzrg1.zzb(1, name);
            }
            if (zzawp != null)
            {
                zzrg1.zza(2, zzawp);
            }
            super.zza(zzrg1);
        }

        public zzrn zzb(zzrf zzrf1)
            throws IOException
        {
            return zzr(zzrf1);
        }

        public zzb zzr(zzrf zzrf1)
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
                    if (zzawp == null)
                    {
                        zzawp = new zzd();
                    }
                    zzrf1.zza(zzawp);
                    break;
                }
            } while (true);
        }

        public zzb zztY()
        {
            name = "";
            zzawp = null;
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public zzb()
        {
            zztY();
        }
    }

    public static final class zzc extends zzrh
    {

        public String type;
        public zzb zzawq[];

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
            if (type != null)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (((zzc) (obj)).type != null)
            {
                continue; /* Loop/switch isn't completed */
            }
_L5:
            flag = flag1;
            if (zzrl.equals(zzawq, ((zzc) (obj)).zzawq))
            {
                return zza(((zzrh) (obj)));
            }
            if (true) goto _L4; else goto _L3
_L3:
            if (!type.equals(((zzc) (obj)).type))
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
            if (type == null)
            {
                i = 0;
            } else
            {
                i = type.hashCode();
            }
            return ((i + 527) * 31 + zzrl.hashCode(zzawq)) * 31 + zzBI();
        }

        protected int zzB()
        {
            int j = super.zzB();
            int i = j;
            if (!type.equals(""))
            {
                i = j + zzrg.zzk(1, type);
            }
            j = i;
            if (zzawq != null)
            {
                j = i;
                if (zzawq.length > 0)
                {
                    for (j = 0; j < zzawq.length;)
                    {
                        zzb zzb1 = zzawq[j];
                        int k = i;
                        if (zzb1 != null)
                        {
                            k = i + zzrg.zzc(2, zzb1);
                        }
                        j++;
                        i = k;
                    }

                    j = i;
                }
            }
            return j;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            if (!type.equals(""))
            {
                zzrg1.zzb(1, type);
            }
            if (zzawq != null && zzawq.length > 0)
            {
                for (int i = 0; i < zzawq.length; i++)
                {
                    zzb zzb1 = zzawq[i];
                    if (zzb1 != null)
                    {
                        zzrg1.zza(2, zzb1);
                    }
                }

            }
            super.zza(zzrg1);
        }

        public zzrn zzb(zzrf zzrf1)
            throws IOException
        {
            return zzs(zzrf1);
        }

        public zzc zzs(zzrf zzrf1)
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
                    type = zzrf1.readString();
                    break;

                case 18: // '\022'
                    int k = zzrq.zzb(zzrf1, 18);
                    zzb azzb[];
                    int j;
                    if (zzawq == null)
                    {
                        j = 0;
                    } else
                    {
                        j = zzawq.length;
                    }
                    azzb = new zzb[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(zzawq, 0, azzb, 0, j);
                        k = j;
                    }
                    for (; k < azzb.length - 1; k++)
                    {
                        azzb[k] = new zzb();
                        zzrf1.zza(azzb[k]);
                        zzrf1.zzBr();
                    }

                    azzb[k] = new zzb();
                    zzrf1.zza(azzb[k]);
                    zzawq = azzb;
                    break;
                }
            } while (true);
        }

        public zzc zztZ()
        {
            type = "";
            zzawq = zzb.zztX();
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public zzc()
        {
            zztZ();
        }
    }

    public static final class zzd extends zzrh
    {

        public String zzabE;
        public boolean zzawr;
        public long zzaws;
        public double zzawt;
        public zzc zzawu;

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
            if (zzawr != ((zzd) (obj)).zzawr) goto _L4; else goto _L5
_L5:
            if (zzabE != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((zzd) (obj)).zzabE != null) goto _L4; else goto _L8
_L8:
            flag = flag1;
            if (zzaws != ((zzd) (obj)).zzaws) goto _L4; else goto _L9
_L9:
            flag = flag1;
            if (Double.doubleToLongBits(zzawt) != Double.doubleToLongBits(((zzd) (obj)).zzawt)) goto _L4; else goto _L10
_L10:
            if (zzawu != null)
            {
                break MISSING_BLOCK_LABEL_126;
            }
            flag = flag1;
            if (((zzd) (obj)).zzawu != null) goto _L4; else goto _L11
_L11:
            return zza(((zzrh) (obj)));
_L7:
            if (!zzabE.equals(((zzd) (obj)).zzabE))
            {
                return false;
            }
              goto _L8
            if (!zzawu.equals(((zzd) (obj)).zzawu))
            {
                return false;
            }
              goto _L11
        }

        public int hashCode()
        {
            int j = 0;
            char c;
            int i;
            int k;
            int l;
            long l1;
            if (zzawr)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            if (zzabE == null)
            {
                i = 0;
            } else
            {
                i = zzabE.hashCode();
            }
            k = (int)(zzaws ^ zzaws >>> 32);
            l1 = Double.doubleToLongBits(zzawt);
            l = (int)(l1 ^ l1 >>> 32);
            if (zzawu != null)
            {
                j = zzawu.hashCode();
            }
            return ((((i + (c + 527) * 31) * 31 + k) * 31 + l) * 31 + j) * 31 + zzBI();
        }

        protected int zzB()
        {
            int j = super.zzB();
            int i = j;
            if (zzawr)
            {
                i = j + zzrg.zzc(1, zzawr);
            }
            j = i;
            if (!zzabE.equals(""))
            {
                j = i + zzrg.zzk(2, zzabE);
            }
            i = j;
            if (zzaws != 0L)
            {
                i = j + zzrg.zzd(3, zzaws);
            }
            j = i;
            if (Double.doubleToLongBits(zzawt) != Double.doubleToLongBits(0.0D))
            {
                j = i + zzrg.zzb(4, zzawt);
            }
            i = j;
            if (zzawu != null)
            {
                i = j + zzrg.zzc(5, zzawu);
            }
            return i;
        }

        public void zza(zzrg zzrg1)
            throws IOException
        {
            if (zzawr)
            {
                zzrg1.zzb(1, zzawr);
            }
            if (!zzabE.equals(""))
            {
                zzrg1.zzb(2, zzabE);
            }
            if (zzaws != 0L)
            {
                zzrg1.zzb(3, zzaws);
            }
            if (Double.doubleToLongBits(zzawt) != Double.doubleToLongBits(0.0D))
            {
                zzrg1.zza(4, zzawt);
            }
            if (zzawu != null)
            {
                zzrg1.zza(5, zzawu);
            }
            super.zza(zzrg1);
        }

        public zzrn zzb(zzrf zzrf1)
            throws IOException
        {
            return zzt(zzrf1);
        }

        public zzd zzt(zzrf zzrf1)
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
                    zzawr = zzrf1.zzBv();
                    break;

                case 18: // '\022'
                    zzabE = zzrf1.readString();
                    break;

                case 24: // '\030'
                    zzaws = zzrf1.zzBt();
                    break;

                case 33: // '!'
                    zzawt = zzrf1.readDouble();
                    break;

                case 42: // '*'
                    if (zzawu == null)
                    {
                        zzawu = new zzc();
                    }
                    zzrf1.zza(zzawu);
                    break;
                }
            } while (true);
        }

        public zzd zzua()
        {
            zzawr = false;
            zzabE = "";
            zzaws = 0L;
            zzawt = 0.0D;
            zzawu = null;
            zzaVU = null;
            zzaWf = -1;
            return this;
        }

        public zzd()
        {
            zzua();
        }
    }

}
