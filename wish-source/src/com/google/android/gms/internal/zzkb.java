// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zznw, zznr

public interface zzkb
{
    public static final class zza extends zzns
    {

        public zza zzaoY[];

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
                    if (zznw.equals(zzaoY, ((zza) (obj)).zzaoY))
                    {
                        return zza(((zzns) (obj)));
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return (zznw.hashCode(zzaoY) + 527) * 31 + zzzM();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            if (zzaoY != null && zzaoY.length > 0)
            {
                for (int i = 0; i < zzaoY.length; i++)
                {
                    zza zza1 = zzaoY[i];
                    if (zza1 != null)
                    {
                        zznr1.zza(1, zza1);
                    }
                }

            }
            super.zza(zznr1);
        }

        protected int zzc()
        {
            int i = super.zzc();
            int k = i;
            if (zzaoY != null)
            {
                k = i;
                if (zzaoY.length > 0)
                {
                    int j = 0;
                    do
                    {
                        k = i;
                        if (j >= zzaoY.length)
                        {
                            break;
                        }
                        zza zza1 = zzaoY[j];
                        k = i;
                        if (zza1 != null)
                        {
                            k = i + zznr.zzc(1, zza1);
                        }
                        j++;
                        i = k;
                    } while (true);
                }
            }
            return k;
        }

        public zza zzso()
        {
            zzaoY = zza.zzsp();
            zzaNT = null;
            zzaOe = -1;
            return this;
        }

        public zza()
        {
            zzso();
        }
    }

    public static final class zza.zza extends zzns
    {

        private static volatile zza.zza zzaoZ[];
        public int viewId;
        public String zzapa;
        public String zzapb;

        public static zza.zza[] zzsp()
        {
            if (zzaoZ == null)
            {
                synchronized (zznw.zzaOd)
                {
                    if (zzaoZ == null)
                    {
                        zzaoZ = new zza.zza[0];
                    }
                }
            }
            return zzaoZ;
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
            if (zzapa != null) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (((zza.zza) (obj)).zzapa != null) goto _L4; else goto _L7
_L7:
            if (zzapb != null)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            flag = flag1;
            if (((zza.zza) (obj)).zzapb != null) goto _L4; else goto _L8
_L8:
            flag = flag1;
            if (viewId == ((zza.zza) (obj)).viewId)
            {
                return zza(((zzns) (obj)));
            }
              goto _L4
_L6:
            if (!zzapa.equals(((zza.zza) (obj)).zzapa))
            {
                return false;
            }
              goto _L7
            if (!zzapb.equals(((zza.zza) (obj)).zzapb))
            {
                return false;
            }
              goto _L8
        }

        public int hashCode()
        {
            int j = 0;
            int i;
            if (zzapa == null)
            {
                i = 0;
            } else
            {
                i = zzapa.hashCode();
            }
            if (zzapb != null)
            {
                j = zzapb.hashCode();
            }
            return (((i + 527) * 31 + j) * 31 + viewId) * 31 + zzzM();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            if (!zzapa.equals(""))
            {
                zznr1.zzb(1, zzapa);
            }
            if (!zzapb.equals(""))
            {
                zznr1.zzb(2, zzapb);
            }
            if (viewId != 0)
            {
                zznr1.zzx(3, viewId);
            }
            super.zza(zznr1);
        }

        protected int zzc()
        {
            int j = super.zzc();
            int i = j;
            if (!zzapa.equals(""))
            {
                i = j + zznr.zzj(1, zzapa);
            }
            j = i;
            if (!zzapb.equals(""))
            {
                j = i + zznr.zzj(2, zzapb);
            }
            i = j;
            if (viewId != 0)
            {
                i = j + zznr.zzz(3, viewId);
            }
            return i;
        }

        public zza.zza zzsq()
        {
            zzapa = "";
            zzapb = "";
            viewId = 0;
            zzaNT = null;
            zzaOe = -1;
            return this;
        }

        public zza.zza()
        {
            zzsq();
        }
    }

    public static final class zzb extends zzns
    {

        private static volatile zzb zzapc[];
        public String name;
        public zzd zzapd;

        public static zzb[] zzsr()
        {
            if (zzapc == null)
            {
                synchronized (zznw.zzaOd)
                {
                    if (zzapc == null)
                    {
                        zzapc = new zzb[0];
                    }
                }
            }
            return zzapc;
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
            if (zzapd != null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            flag = flag1;
            if (((zzb) (obj)).zzapd != null) goto _L4; else goto _L8
_L8:
            return zza(((zzns) (obj)));
_L6:
            if (!name.equals(((zzb) (obj)).name))
            {
                return false;
            }
              goto _L7
            if (!zzapd.equals(((zzb) (obj)).zzapd))
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
            if (zzapd != null)
            {
                j = zzapd.hashCode();
            }
            return ((i + 527) * 31 + j) * 31 + zzzM();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            if (!name.equals(""))
            {
                zznr1.zzb(1, name);
            }
            if (zzapd != null)
            {
                zznr1.zza(2, zzapd);
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
            if (zzapd != null)
            {
                j = i + zznr.zzc(2, zzapd);
            }
            return j;
        }

        public zzb zzss()
        {
            name = "";
            zzapd = null;
            zzaNT = null;
            zzaOe = -1;
            return this;
        }

        public zzb()
        {
            zzss();
        }
    }

    public static final class zzc extends zzns
    {

        public String type;
        public zzb zzape[];

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
            if (zznw.equals(zzape, ((zzc) (obj)).zzape))
            {
                return zza(((zzns) (obj)));
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
            return ((i + 527) * 31 + zznw.hashCode(zzape)) * 31 + zzzM();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            if (!type.equals(""))
            {
                zznr1.zzb(1, type);
            }
            if (zzape != null && zzape.length > 0)
            {
                for (int i = 0; i < zzape.length; i++)
                {
                    zzb zzb1 = zzape[i];
                    if (zzb1 != null)
                    {
                        zznr1.zza(2, zzb1);
                    }
                }

            }
            super.zza(zznr1);
        }

        protected int zzc()
        {
            int j = super.zzc();
            int i = j;
            if (!type.equals(""))
            {
                i = j + zznr.zzj(1, type);
            }
            j = i;
            if (zzape != null)
            {
                j = i;
                if (zzape.length > 0)
                {
                    for (j = 0; j < zzape.length;)
                    {
                        zzb zzb1 = zzape[j];
                        int k = i;
                        if (zzb1 != null)
                        {
                            k = i + zznr.zzc(2, zzb1);
                        }
                        j++;
                        i = k;
                    }

                    j = i;
                }
            }
            return j;
        }

        public zzc zzst()
        {
            type = "";
            zzape = zzb.zzsr();
            zzaNT = null;
            zzaOe = -1;
            return this;
        }

        public zzc()
        {
            zzst();
        }
    }

    public static final class zzd extends zzns
    {

        public String zzUw;
        public boolean zzapf;
        public long zzapg;
        public double zzaph;
        public zzc zzapi;

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
            if (zzapf != ((zzd) (obj)).zzapf) goto _L4; else goto _L5
_L5:
            if (zzUw != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((zzd) (obj)).zzUw != null) goto _L4; else goto _L8
_L8:
            flag = flag1;
            if (zzapg != ((zzd) (obj)).zzapg) goto _L4; else goto _L9
_L9:
            flag = flag1;
            if (Double.doubleToLongBits(zzaph) != Double.doubleToLongBits(((zzd) (obj)).zzaph)) goto _L4; else goto _L10
_L10:
            if (zzapi != null)
            {
                break MISSING_BLOCK_LABEL_126;
            }
            flag = flag1;
            if (((zzd) (obj)).zzapi != null) goto _L4; else goto _L11
_L11:
            return zza(((zzns) (obj)));
_L7:
            if (!zzUw.equals(((zzd) (obj)).zzUw))
            {
                return false;
            }
              goto _L8
            if (!zzapi.equals(((zzd) (obj)).zzapi))
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
            if (zzapf)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            if (zzUw == null)
            {
                i = 0;
            } else
            {
                i = zzUw.hashCode();
            }
            k = (int)(zzapg ^ zzapg >>> 32);
            l1 = Double.doubleToLongBits(zzaph);
            l = (int)(l1 ^ l1 >>> 32);
            if (zzapi != null)
            {
                j = zzapi.hashCode();
            }
            return ((((i + (c + 527) * 31) * 31 + k) * 31 + l) * 31 + j) * 31 + zzzM();
        }

        public void zza(zznr zznr1)
            throws IOException
        {
            if (zzapf)
            {
                zznr1.zzb(1, zzapf);
            }
            if (!zzUw.equals(""))
            {
                zznr1.zzb(2, zzUw);
            }
            if (zzapg != 0L)
            {
                zznr1.zzb(3, zzapg);
            }
            if (Double.doubleToLongBits(zzaph) != Double.doubleToLongBits(0.0D))
            {
                zznr1.zza(4, zzaph);
            }
            if (zzapi != null)
            {
                zznr1.zza(5, zzapi);
            }
            super.zza(zznr1);
        }

        protected int zzc()
        {
            int j = super.zzc();
            int i = j;
            if (zzapf)
            {
                i = j + zznr.zzc(1, zzapf);
            }
            j = i;
            if (!zzUw.equals(""))
            {
                j = i + zznr.zzj(2, zzUw);
            }
            i = j;
            if (zzapg != 0L)
            {
                i = j + zznr.zzd(3, zzapg);
            }
            j = i;
            if (Double.doubleToLongBits(zzaph) != Double.doubleToLongBits(0.0D))
            {
                j = i + zznr.zzb(4, zzaph);
            }
            i = j;
            if (zzapi != null)
            {
                i = j + zznr.zzc(5, zzapi);
            }
            return i;
        }

        public zzd zzsu()
        {
            zzapf = false;
            zzUw = "";
            zzapg = 0L;
            zzaph = 0.0D;
            zzapi = null;
            zzaNT = null;
            zzaOe = -1;
            return this;
        }

        public zzd()
        {
            zzsu();
        }
    }

}
