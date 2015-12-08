// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzkb, zznw, zznr

public static final class zzso extends zzns
{
    public static final class zza extends zzns
    {

        private static volatile zza zzaoZ[];
        public int viewId;
        public String zzapa;
        public String zzapb;

        public static zza[] zzsp()
        {
            if (zzaoZ == null)
            {
                synchronized (zznw.zzaOd)
                {
                    if (zzaoZ == null)
                    {
                        zzaoZ = new zza[0];
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
            if (!(obj instanceof zza)) goto _L4; else goto _L3
_L3:
            obj = (zza)obj;
            if (zzapa != null) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (((zza) (obj)).zzapa != null) goto _L4; else goto _L7
_L7:
            if (zzapb != null)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            flag = flag1;
            if (((zza) (obj)).zzapb != null) goto _L4; else goto _L8
_L8:
            flag = flag1;
            if (viewId == ((zza) (obj)).viewId)
            {
                return zza(((zzns) (obj)));
            }
              goto _L4
_L6:
            if (!zzapa.equals(((zza) (obj)).zzapa))
            {
                return false;
            }
              goto _L7
            if (!zzapb.equals(((zza) (obj)).zzapb))
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

        public zza zzsq()
        {
            zzapa = "";
            zzapb = "";
            viewId = 0;
            zzaNT = null;
            zzaOe = -1;
            return this;
        }

        public zza()
        {
            zzsq();
        }
    }


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
                if (zznw.equals(zzaoY, ((zzaoY) (obj)).zzaoY))
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

    public zzaoY zzso()
    {
        zzaoY = zza.zzsp();
        zzaNT = null;
        zzaOe = -1;
        return this;
    }

    public zza.zzsq()
    {
        zzso();
    }
}
